package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.f;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class FastKV {
    static final int ASYNC_BLOCKING = 1;
    private static final String A_SUFFIX = ".kva";
    private static final int BASE_GC_BYTES_THRESHOLD = 4096;
    private static final int BASE_GC_KEYS_THRESHOLD = 80;
    private static final String BOTH_FILES_ERROR = "both files error";
    private static final String B_SUFFIX = ".kvb";
    private static final String C_SUFFIX = ".kvc";
    private static final int DATA_SIZE_LIMIT = 536870912;
    private static final int DATA_START = 12;
    private static final int DOUBLE_LIMIT;
    private static final byte[] EMPTY_ARRAY = new byte[0];
    static final String GC_FINISH = "gc finish";
    private static final int INTERNAL_LIMIT = 2048;
    private static final String MAP_FAILED = "map failed";
    static final int NON_BLOCKING = 0;
    private static final String OPEN_FILE_FAILED = "open file failed";
    private static final int PAGE_SIZE;
    private static final String PARSE_DATA_FAILED = "parse dara failed";
    static final int SYNC_BLOCKING = 2;
    private static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    private static final int TRUNCATE_THRESHOLD;
    private static final int[] TYPE_SIZE;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private long checksum;
    private int dataEnd;
    private final Map<String, a> encoderMap;
    private p fastBuffer;
    private int invalidBytes;
    private final String name;
    private final String path;
    private int removeStart;
    private boolean sizeChanged;
    private String tempExternalName;
    private int updateSize;
    private int updateStart;
    private int writingMode;
    private final Map<String, f.b> data = new HashMap();
    private final Executor executor = new s();
    private final ArrayList<c> invalids = new ArrayList<>();
    private final b logger = q.f21335b;
    private boolean autoCommit = true;

    /* loaded from: classes4.dex */
    public static class Builder {
        private static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private a[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(String str, String str2) {
            if (str != null && !str.isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    if (!str.endsWith("/")) {
                        str = str + '/';
                    }
                    this.path = str;
                    this.name = str2;
                    return;
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new IllegalArgumentException("path is empty");
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public FastKV build() {
            String str = this.path + this.name;
            Map<String, FastKV> map = INSTANCE_MAP;
            FastKV fastKV = map.get(str);
            if (fastKV == null) {
                synchronized (Builder.class) {
                    try {
                        fastKV = map.get(str);
                        if (fastKV == null) {
                            fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                            map.put(str, fastKV);
                        }
                    } finally {
                    }
                }
            }
            return fastKV;
        }

        public Builder encoder(a[] aVarArr) {
            this.encoders = aVarArr;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface a<T> {
        T a(byte[] bArr, int i8, int i9);

        String a();

        byte[] a(T t8);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str, Exception exc);

        void a(String str, String str2);

        void b(String str, Exception exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        int f21176a;

        /* renamed from: b, reason: collision with root package name */
        int f21177b;

        c(int i8, int i9) {
            this.f21177b = i8;
            this.f21176a = i9;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
            return this.f21177b - cVar.f21177b;
        }
    }

    static {
        int a9 = ap.a();
        PAGE_SIZE = a9;
        int max = Math.max(a9 << 1, 16384);
        DOUBLE_LIMIT = max;
        TRUNCATE_THRESHOLD = max << 1;
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
    }

    FastKV(String str, String str2, a[] aVarArr, int i8) {
        this.path = str;
        this.name = str2;
        this.writingMode = i8;
        HashMap hashMap = new HashMap();
        hashMap.put("StringSet", am.f21266a);
        if (aVarArr != null && aVarArr.length > 0) {
            for (a aVar : aVarArr) {
                String a9 = aVar.a();
                if (hashMap.containsKey(a9)) {
                    error("duplicate encoder tag:" + a9);
                } else {
                    hashMap.put(a9, aVar);
                }
            }
        }
        this.encoderMap = hashMap;
        loadData();
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b9) {
        boolean z8;
        Object obj2;
        int length;
        f.b hVar;
        int saveArray = saveArray(str, bArr, b9);
        if (saveArray != 0) {
            String str2 = this.tempExternalName;
            if (str2 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                this.tempExternalName = null;
                obj2 = str2;
                length = 32;
            } else {
                obj2 = obj;
                length = bArr.length;
            }
            if (b9 == 6) {
                hVar = new f.i(this.updateStart, saveArray, (String) obj2, length, z8);
            } else if (b9 == 7) {
                hVar = new f.a(this.updateStart, saveArray, obj2, length, z8);
            } else {
                hVar = new f.h(this.updateStart, saveArray, obj2, length, z8);
            }
            this.data.put(str, hVar);
            updateChange();
        }
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, f.j jVar, byte b9) {
        if (jVar == null) {
            addObject(str, obj, bArr, b9);
        } else if (!jVar.f21314b && jVar.f21317e == bArr.length) {
            updateBytes(jVar.f21308a, bArr);
            jVar.f21316d = obj;
        } else {
            updateObject(str, obj, bArr, jVar);
        }
        checkIfCommit();
    }

    private int bytesThreshold() {
        int i8 = this.dataEnd;
        if (i8 <= 16384) {
            return 4096;
        }
        if (i8 > 65536) {
            return 16384;
        }
        return 8192;
    }

    private void checkGC() {
        int i8;
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            int size = this.invalids.size();
            if (this.dataEnd < 16384) {
                i8 = 80;
            } else {
                i8 = 160;
            }
            if (size < i8) {
                return;
            }
        }
        gc(0);
    }

    private void checkIfCommit() {
        if (this.writingMode != 0 && this.autoCommit) {
            commitToCFile();
        }
    }

    private void checkKey(String str) {
        if (str != null && !str.isEmpty()) {
        } else {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void checkKeySize(int i8) {
        if (i8 <= 255) {
        } else {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void checkValueSize(int i8, boolean z8) {
        if (z8) {
            if (i8 != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i8 >= 0 && i8 < 2048) {
        } else {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private void clearData() {
        this.dataEnd = 12;
        this.checksum = 0L;
        clearInvalid();
        this.data.clear();
        p pVar = this.fastBuffer;
        if (pVar != null && pVar.f21331a.length == PAGE_SIZE) {
            pVar.b(0, 0);
            this.fastBuffer.a(4, 0L);
        } else {
            this.fastBuffer = new p(PAGE_SIZE);
        }
    }

    private void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    private boolean commitToCFile() {
        int i8 = this.writingMode;
        if (i8 == 1) {
            this.executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.FastKV.1
                @Override // java.lang.Runnable
                public final void run() {
                    FastKV.this.writeToCFile();
                }
            });
        } else if (i8 == 2) {
            return writeToCFile();
        }
        return true;
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i8) {
        FileChannel fileChannel;
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                if (mappedByteBuffer2 == this.bBuffer) {
                    fileChannel = this.bChannel;
                } else {
                    fileChannel = this.aChannel;
                }
                MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e8) {
                error(e8);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i8);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void countInvalid(int i8, int i9) {
        this.invalidBytes += i9 - i8;
        this.invalids.add(new c(i8, i9));
    }

    private void deleteCFiles() {
        try {
            ap.a(new File(this.path, this.name + C_SUFFIX));
            ap.a(new File(this.path, this.name + TEMP_SUFFIX));
        } catch (Exception e8) {
            error(e8);
        }
    }

    private void ensureSize(int i8) {
        int length = this.fastBuffer.f21331a.length;
        int i9 = this.dataEnd + i8;
        if (i9 >= length) {
            int i10 = this.invalidBytes;
            if (i10 > i8 && i10 > bytesThreshold()) {
                gc(i8);
                return;
            }
            int newCapacity = getNewCapacity(length, i9);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f21331a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f21331a = bArr;
            if (this.writingMode == 0) {
                try {
                    FileChannel fileChannel = this.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j8 = newCapacity;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j8);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j8);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                } catch (IOException e8) {
                    error(new Exception(MAP_FAILED, e8));
                    this.fastBuffer.b(0, this.dataEnd - 12);
                    this.fastBuffer.a(4, this.checksum);
                    toBlockingMode();
                }
            }
        }
    }

    private void error(Exception exc) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, exc);
        }
    }

    private void fastPutString(String str, String str2, f.i iVar) {
        int a9 = p.a(str2);
        if (iVar == null) {
            int a10 = p.a(str);
            checkKeySize(a10);
            int i8 = a10 + 4;
            this.updateSize = i8 + a9;
            preparePutBytes();
            this.fastBuffer.a((byte) 6);
            putKey(str, a10);
            putStringValue(str2, a9);
            Map<String, f.b> map = this.data;
            int i9 = this.updateStart;
            map.put(str, new f.i(i9, i9 + i8, str2, a9, false));
            updateChange();
        } else {
            int i10 = iVar.f21308a;
            int i11 = i10 - iVar.f21315c;
            int i12 = iVar.f21317e;
            boolean z8 = false;
            String str3 = null;
            if (i12 == a9) {
                this.checksum ^= this.fastBuffer.a(i10, i12);
                if (a9 == str2.length()) {
                    str2.getBytes(0, a9, this.fastBuffer.f21331a, iVar.f21308a);
                } else {
                    p pVar = this.fastBuffer;
                    pVar.f21332b = iVar.f21308a;
                    pVar.b(str2);
                }
                this.updateStart = iVar.f21308a;
                this.updateSize = a9;
            } else {
                this.updateSize = i11 + a9;
                preparePutBytes();
                this.fastBuffer.a((byte) 6);
                int i13 = i11 - 3;
                p pVar2 = this.fastBuffer;
                byte[] bArr = pVar2.f21331a;
                System.arraycopy(bArr, iVar.f21315c + 1, bArr, pVar2.f21332b, i13);
                this.fastBuffer.f21332b += i13;
                putStringValue(str2, a9);
                remove((byte) 6, iVar.f21315c, iVar.f21308a + iVar.f21317e);
                if (iVar.f21314b) {
                    str3 = (String) iVar.f21316d;
                }
                iVar.f21314b = false;
                int i14 = this.updateStart;
                iVar.f21315c = i14;
                iVar.f21308a = i14 + i11;
                iVar.f21317e = a9;
                z8 = true;
            }
            iVar.f21316d = str2;
            updateChange();
            if (z8) {
                checkGC();
            }
            if (str3 != null) {
                ap.a(new File(this.path + this.name, str3));
            }
        }
        checkIfCommit();
    }

    private byte[] getArrayFromFile(f.a aVar) {
        try {
            byte[] b9 = ap.b(new File(this.path + this.name, (String) aVar.f21316d));
            if (b9 == null) {
                return EMPTY_ARRAY;
            }
            return b9;
        } catch (Exception e8) {
            error(e8);
            return EMPTY_ARRAY;
        }
    }

    private int getNewCapacity(int i8, int i9) {
        if (i9 <= DATA_SIZE_LIMIT) {
            int i10 = PAGE_SIZE;
            if (i9 <= i10) {
                return i10;
            }
            while (i8 < i9) {
                int i11 = DOUBLE_LIMIT;
                if (i8 <= i11) {
                    i8 <<= 1;
                } else {
                    i8 += i11;
                }
            }
            return i8;
        }
        throw new IllegalStateException("data size out of limit");
    }

    private Object getObjectFromFile(f.h hVar) {
        try {
            byte[] b9 = ap.b(new File(this.path + this.name, (String) hVar.f21316d));
            if (b9 != null) {
                int i8 = b9[0] & 255;
                String str = new String(b9, 1, i8, StandardCharsets.UTF_8);
                a aVar = this.encoderMap.get(str);
                if (aVar != null) {
                    int i9 = i8 + 1;
                    return aVar.a(b9, i9, b9.length - i9);
                }
                warning(new Exception("No encoder for tag:" + str));
                return null;
            }
            warning(new Exception("Read object data failed"));
            return null;
        } catch (Exception e8) {
            error(e8);
            return null;
        }
    }

    private String getStringFromFile(f.i iVar) {
        try {
            byte[] b9 = ap.b(new File(this.path + this.name, (String) iVar.f21316d));
            if (b9 != null && b9.length != 0) {
                return new String(b9, StandardCharsets.UTF_8);
            }
            return "";
        } catch (Exception e8) {
            error(e8);
        }
        return "";
    }

    private void info(String str) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, str);
        }
    }

    private boolean isABFileEqual() {
        p pVar = new p(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(pVar.f21331a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f21331a;
        byte[] bArr2 = pVar.f21331a;
        for (int i8 = 0; i8 < this.dataEnd; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void loadData() {
        try {
            long nanoTime = System.nanoTime();
            if (!loadFromCFile() && this.writingMode == 0) {
                loadFromABFile();
            }
            if (this.fastBuffer == null) {
                this.fastBuffer = new p(PAGE_SIZE);
            }
            if (this.logger != null) {
                info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void loadFromABFile() {
        long j8;
        long j9;
        FastKV fastKV = this;
        File file = new File(fastKV.path, fastKV.name + A_SUFFIX);
        File file2 = new File(fastKV.path, fastKV.name + B_SUFFIX);
        try {
            if (ap.c(file) && ap.c(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                fastKV.aChannel = randomAccessFile.getChannel();
                fastKV.bChannel = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = fastKV.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    if (length > 0) {
                        j8 = length;
                    } else {
                        j8 = PAGE_SIZE;
                    }
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j8);
                    fastKV.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = fastKV.bChannel;
                    if (length2 > 0) {
                        j9 = length2;
                    } else {
                        j9 = PAGE_SIZE;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j9);
                    fastKV.bBuffer = map2;
                    map2.order(byteOrder);
                    fastKV.fastBuffer = new p(fastKV.aBuffer.capacity());
                    if (length == 0 && length2 == 0) {
                        fastKV.dataEnd = 12;
                        return;
                    }
                    int i8 = fastKV.aBuffer.getInt();
                    long j10 = fastKV.aBuffer.getLong();
                    int i9 = fastKV.bBuffer.getInt();
                    long j11 = fastKV.bBuffer.getLong();
                    if (i8 >= 0) {
                        if (i8 <= length - 12) {
                            fastKV = this;
                            fastKV.dataEnd = i8 + 12;
                            fastKV.aBuffer.rewind();
                            fastKV.aBuffer.get(fastKV.fastBuffer.f21331a, 0, fastKV.dataEnd);
                            if (j10 == fastKV.fastBuffer.a(12, i8) && parseData() == 0) {
                                fastKV.checksum = j10;
                                if (length != length2 || !isABFileEqual()) {
                                    fastKV.warning(new Exception("B file error"));
                                    fastKV.copyBuffer(fastKV.aBuffer, fastKV.bBuffer, fastKV.dataEnd);
                                    return;
                                }
                                return;
                            }
                        } else {
                            fastKV = this;
                        }
                    }
                    if (i9 >= 0 && i9 <= length2 - 12) {
                        fastKV.data.clear();
                        clearInvalid();
                        fastKV.dataEnd = i9 + 12;
                        if (fastKV.fastBuffer.f21331a.length != fastKV.bBuffer.capacity()) {
                            fastKV.fastBuffer = new p(fastKV.bBuffer.capacity());
                        }
                        fastKV.bBuffer.rewind();
                        fastKV.bBuffer.get(fastKV.fastBuffer.f21331a, 0, fastKV.dataEnd);
                        if (j11 == fastKV.fastBuffer.a(12, i9) && parseData() == 0) {
                            fastKV.warning(new Exception("A file error"));
                            fastKV.copyBuffer(fastKV.bBuffer, fastKV.aBuffer, fastKV.dataEnd);
                            fastKV.checksum = j11;
                            return;
                        }
                    }
                    fastKV.error(BOTH_FILES_ERROR);
                    resetData();
                    return;
                } catch (IOException e8) {
                    fastKV.error(e8);
                    toBlockingMode();
                    fastKV.tryBlockingIO(file, file2);
                    return;
                }
            }
            fastKV.error(new Exception(OPEN_FILE_FAILED));
            toBlockingMode();
        } catch (Exception e9) {
            fastKV.error(e9);
            clearData();
            toBlockingMode();
        }
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, this.name + C_SUFFIX);
        File file2 = new File(this.path, this.name + TEMP_SUFFIX);
        boolean z8 = false;
        try {
            if (!file.exists()) {
                if (file2.exists()) {
                    file = file2;
                } else {
                    file = null;
                }
            }
            if (file != null) {
                if (loadWithBlockingIO(file)) {
                    if (this.writingMode != 0) {
                        return false;
                    }
                    if (writeToABFile(this.fastBuffer)) {
                        info("recover from c file");
                        try {
                            deleteCFiles();
                            return true;
                        } catch (Exception e8) {
                            e = e8;
                            z8 = true;
                            error(e);
                            return z8;
                        }
                    }
                    this.writingMode = 1;
                    return false;
                }
                clearData();
                deleteCFiles();
                return false;
            }
            if (this.writingMode == 0) {
                return false;
            }
            File file3 = new File(this.path, this.name + A_SUFFIX);
            File file4 = new File(this.path, this.name + B_SUFFIX);
            if (!file3.exists() || !file4.exists()) {
                return false;
            }
            tryBlockingIO(file3, file4);
            return false;
        } catch (Exception e9) {
            e = e9;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i8 = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i8);
            p pVar = this.fastBuffer;
            if (pVar != null && pVar.f21331a.length == newCapacity) {
                pVar.f21332b = 0;
            } else {
                pVar = new p(new byte[newCapacity]);
                this.fastBuffer = pVar;
            }
            ap.a(file, pVar.f21331a, i8);
            int c8 = pVar.c();
            long b9 = pVar.b();
            this.dataEnd = c8 + 12;
            if (c8 >= 0 && c8 <= i8 - 12 && b9 == pVar.a(12, c8) && parseData() == 0) {
                this.checksum = b9;
                return true;
            }
        }
        return false;
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        c cVar = this.invalids.get(size);
        while (size > 0) {
            int i8 = size - 1;
            c cVar2 = this.invalids.get(i8);
            if (cVar.f21177b == cVar2.f21176a) {
                cVar2.f21176a = cVar.f21176a;
                this.invalids.remove(size);
            }
            cVar = cVar2;
            size = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x017f, code lost:            throw new java.lang.Exception(com.mbridge.msdk.foundation.tools.FastKV.PARSE_DATA_FAILED);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseData() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.parseData():int");
    }

    private void preparePutBytes() {
        ensureSize(this.updateSize);
        int i8 = this.dataEnd;
        this.updateStart = i8;
        this.dataEnd = this.updateSize + i8;
        this.fastBuffer.f21332b = i8;
        this.sizeChanged = true;
    }

    private void putKey(String str, int i8) {
        this.fastBuffer.a((byte) i8);
        if (i8 == str.length()) {
            p pVar = this.fastBuffer;
            str.getBytes(0, i8, pVar.f21331a, pVar.f21332b);
            this.fastBuffer.f21332b += i8;
            return;
        }
        this.fastBuffer.b(str);
    }

    private void putStringValue(String str, int i8) {
        this.fastBuffer.a((short) i8);
        if (i8 == str.length()) {
            p pVar = this.fastBuffer;
            str.getBytes(0, i8, pVar.f21331a, pVar.f21332b);
        } else {
            this.fastBuffer.b(str);
        }
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        FileChannel fileChannel;
        int capacity = mappedByteBuffer.capacity();
        int i8 = PAGE_SIZE;
        if (capacity != i8) {
            if (mappedByteBuffer == this.aBuffer) {
                fileChannel = this.aChannel;
            } else {
                fileChannel = this.bChannel;
            }
            FileChannel fileChannel2 = fileChannel;
            fileChannel2.truncate(i8);
            MappedByteBuffer map = fileChannel2.map(FileChannel.MapMode.READ_WRITE, 0L, i8);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void resetData() {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (IOException unused) {
                toBlockingMode();
            }
        }
        clearData();
        ap.a(new File(this.path + this.name));
    }

    private int saveArray(String str, byte[] bArr, byte b9) {
        this.tempExternalName = null;
        if (bArr.length < 2048) {
            return wrapArray(str, bArr, b9);
        }
        info("large value, key: " + str + ", size: " + bArr.length);
        String b10 = ap.b();
        if (ap.a(new File(this.path + this.name, b10), bArr)) {
            this.tempExternalName = b10;
            byte[] bArr2 = new byte[32];
            b10.getBytes(0, 32, bArr2, 0);
            return wrapArray(str, bArr2, (byte) (b9 | 64));
        }
        error("save large value failed");
        return 0;
    }

    private long shiftCheckSum(long j8, int i8) {
        int i9 = (i8 & 7) << 3;
        return (j8 >>> (64 - i9)) | (j8 << i9);
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i8 = this.removeStart;
        if (i8 != 0) {
            mappedByteBuffer.put(i8, this.fastBuffer.f21331a[i8]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f21331a, this.updateStart, this.updateSize);
        }
    }

    private void toBlockingMode() {
        this.writingMode = 1;
        ap.a(this.aChannel);
        ap.a(this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void truncate(int i8) {
        int i9 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i9, i8 + i9);
        byte[] bArr = this.fastBuffer.f21331a;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.f21331a = bArr2;
        if (this.writingMode == 0) {
            try {
                long j8 = newCapacity;
                this.aChannel.truncate(j8);
                FileChannel fileChannel = this.aChannel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j8);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.bChannel.truncate(j8);
                MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j8);
                this.bBuffer = map2;
                map2.order(byteOrder);
            } catch (IOException e8) {
                error(new Exception(MAP_FAILED, e8));
                toBlockingMode();
            }
        }
        info(TRUNCATE_FINISH);
    }

    private void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e8) {
            warning(e8);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e9) {
            warning(e9);
        }
        clearData();
    }

    private void updateBoolean(byte b9, int i8) {
        long shiftCheckSum = this.checksum ^ shiftCheckSum(1L, i8);
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.put(i8, b9);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i8, b9);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.f21331a[i8] = b9;
    }

    private void updateBytes(int i8, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.a(i8, length);
        p pVar = this.fastBuffer;
        pVar.f21332b = i8;
        pVar.a(bArr);
        long a9 = this.checksum ^ this.fastBuffer.a(i8, length);
        this.checksum = a9;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i8);
            this.aBuffer.put(bArr);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i8);
            this.bBuffer.put(bArr);
            return;
        }
        this.fastBuffer.a(4, a9);
    }

    private void updateChange() {
        this.checksum ^= this.fastBuffer.a(this.updateStart, this.updateSize);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            syncABBuffer(this.bBuffer);
        } else {
            if (this.sizeChanged) {
                this.fastBuffer.b(0, this.dataEnd - 12);
            }
            this.fastBuffer.a(4, this.checksum);
        }
        this.sizeChanged = false;
        this.removeStart = 0;
        this.updateSize = 0;
    }

    private void updateInt32(int i8, long j8, int i9) {
        long shiftCheckSum = shiftCheckSum(j8, i9) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putInt(i9, i8);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i9, i8);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.b(i9, i8);
    }

    private void updateInt64(long j8, long j9, int i8) {
        long shiftCheckSum = shiftCheckSum(j9, i8) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putLong(i8, j8);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i8, j8);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.a(i8, j8);
    }

    private void updateObject(String str, Object obj, byte[] bArr, f.j jVar) {
        String str2;
        boolean z8;
        int saveArray = saveArray(str, bArr, jVar.a());
        if (saveArray != 0) {
            if (jVar.f21314b) {
                str2 = (String) jVar.f21316d;
            } else {
                str2 = null;
            }
            remove(jVar.a(), jVar.f21315c, jVar.f21308a + jVar.f21317e);
            String str3 = this.tempExternalName;
            if (str3 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            jVar.f21315c = this.updateStart;
            jVar.f21308a = saveArray;
            jVar.f21314b = z8;
            if (z8) {
                jVar.f21316d = str3;
                jVar.f21317e = 32;
                this.tempExternalName = null;
            } else {
                jVar.f21316d = obj;
                jVar.f21317e = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                ap.a(new File(this.path + this.name, str2));
            }
        }
    }

    private void updateOffset(int i8, int[] iArr) {
        for (f.b bVar : this.data.values()) {
            int i9 = bVar.f21308a;
            if (i9 > i8) {
                int length = (iArr.length >> 1) - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > length) {
                        break;
                    }
                    int i11 = (i10 + length) >>> 1;
                    int i12 = iArr[i11 << 1];
                    if (i12 < i9) {
                        i10 = i11 + 1;
                    } else {
                        if (i12 <= i9) {
                            length = i11;
                            break;
                        }
                        length = i11 - 1;
                    }
                }
                int i13 = iArr[(length << 1) + 1];
                bVar.f21308a -= i13;
                if (bVar.a() >= 6) {
                    ((f.j) bVar).f21315c -= i13;
                }
            }
        }
    }

    private void warning(Exception exc) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.b(this.name, exc);
        }
    }

    private int wrapArray(String str, byte[] bArr, byte b9) {
        wrapHeader(str, b9, bArr.length + 2);
        this.fastBuffer.a((short) bArr.length);
        p pVar = this.fastBuffer;
        int i8 = pVar.f21332b;
        pVar.a(bArr);
        return i8;
    }

    private void wrapHeader(String str, byte b9) {
        wrapHeader(str, b9, TYPE_SIZE[b9]);
    }

    private boolean writeToABFile(p pVar) {
        int length = pVar.f21331a.length;
        File file = new File(this.path, this.name + A_SUFFIX);
        File file2 = new File(this.path, this.name + B_SUFFIX);
        try {
            if (ap.c(file) && ap.c(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long j8 = length;
                randomAccessFile.setLength(j8);
                randomAccessFile2.setLength(j8);
                this.aChannel = randomAccessFile.getChannel();
                this.bChannel = randomAccessFile2.getChannel();
                FileChannel fileChannel = this.aChannel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j8);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j8);
                this.bBuffer = map2;
                map2.order(byteOrder);
                this.aBuffer.put(pVar.f21331a, 0, this.dataEnd);
                this.bBuffer.put(pVar.f21331a, 0, this.dataEnd);
                return true;
            }
            throw new Exception(OPEN_FILE_FAILED);
        } catch (Exception e8) {
            error(e8);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            try {
                File file = new File(this.path, this.name + TEMP_SUFFIX);
                if (ap.c(file)) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.setLength(this.dataEnd);
                    randomAccessFile.write(this.fastBuffer.f21331a, 0, this.dataEnd);
                    randomAccessFile.close();
                    File file2 = new File(this.path, this.name + C_SUFFIX);
                    if (file2.exists()) {
                        if (file2.delete()) {
                        }
                    }
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    warning(new Exception("rename failed"));
                }
            } catch (Exception e8) {
                error(e8);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        resetData();
        if (this.writingMode != 0) {
            deleteCFiles();
        }
    }

    public synchronized boolean commit() {
        this.autoCommit = true;
        return commitToCFile();
    }

    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    public synchronized void force() {
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
        }
    }

    void gc(int i8) {
        boolean z8;
        int i9;
        Collections.sort(this.invalids);
        mergeInvalids();
        c cVar = this.invalids.get(0);
        int i10 = cVar.f21177b;
        int i11 = this.dataEnd;
        int i12 = i11 - this.invalidBytes;
        int i13 = i12 - 12;
        int i14 = i12 - i10;
        int i15 = i11 - i10;
        if (i13 < i15 + i14) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            this.checksum ^= this.fastBuffer.a(i10, i15);
        }
        int size = this.invalids.size();
        int i16 = size - 1;
        int i17 = this.dataEnd - this.invalids.get(i16).f21176a;
        if (i17 > 0) {
            i9 = size;
        } else {
            i9 = i16;
        }
        int[] iArr = new int[i9 << 1];
        int i18 = cVar.f21177b;
        int i19 = cVar.f21176a;
        for (int i20 = 1; i20 < size; i20++) {
            c cVar2 = this.invalids.get(i20);
            int i21 = cVar2.f21177b - i19;
            byte[] bArr = this.fastBuffer.f21331a;
            System.arraycopy(bArr, i19, bArr, i18, i21);
            int i22 = (i20 - 1) << 1;
            iArr[i22] = i19;
            iArr[i22 + 1] = i19 - i18;
            i18 += i21;
            i19 = cVar2.f21176a;
        }
        if (i17 > 0) {
            byte[] bArr2 = this.fastBuffer.f21331a;
            System.arraycopy(bArr2, i19, bArr2, i18, i17);
            int i23 = i16 << 1;
            iArr[i23] = i19;
            iArr[i23 + 1] = i19 - i18;
        }
        clearInvalid();
        if (z8) {
            this.checksum = this.fastBuffer.a(12, i13);
        } else {
            this.checksum ^= this.fastBuffer.a(i10, i14);
        }
        this.dataEnd = i12;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i10);
            this.aBuffer.put(this.fastBuffer.f21331a, i10, i14);
            this.aBuffer.putInt(0, i13);
            this.bBuffer.putInt(0, i13);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i10);
            this.bBuffer.put(this.fastBuffer.f21331a, i10, i14);
        } else {
            this.fastBuffer.b(0, i13);
            this.fastBuffer.a(4, this.checksum);
        }
        updateOffset(i10, iArr);
        int i24 = i12 + i8;
        if (this.fastBuffer.f21331a.length - i24 > TRUNCATE_THRESHOLD) {
            truncate(i24);
        }
        info(GC_FINISH);
    }

    public synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, f.b> entry : this.data.entrySet()) {
            String key = entry.getKey();
            f.b value = entry.getValue();
            switch (value.a()) {
                case 1:
                    valueOf = Boolean.valueOf(((f.c) value).f21309b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((f.C0407f) value).f21312b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((f.e) value).f21311b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((f.g) value).f21313b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((f.d) value).f21310b);
                    break;
                case 6:
                    f.i iVar = (f.i) value;
                    if (iVar.f21314b) {
                        valueOf = getStringFromFile(iVar);
                        break;
                    } else {
                        valueOf = iVar.f21316d;
                        break;
                    }
                case 7:
                    f.a aVar = (f.a) value;
                    if (aVar.f21314b) {
                        valueOf = getArrayFromFile(aVar);
                        break;
                    } else {
                        valueOf = aVar.f21316d;
                        break;
                    }
                case 8:
                    f.h hVar = (f.h) value;
                    if (hVar.f21314b) {
                        valueOf = getObjectFromFile(hVar);
                        break;
                    } else {
                        valueOf = ((f.h) value).f21316d;
                        break;
                    }
                default:
                    valueOf = null;
                    break;
            }
            hashMap.put(key, valueOf);
        }
        return hashMap;
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized long getLong(String str) {
        f.g gVar;
        gVar = (f.g) this.data.get(str);
        return gVar == null ? 0L : gVar.f21313b;
    }

    public synchronized <T> T getObject(String str) {
        T t8;
        try {
            f.h hVar = (f.h) this.data.get(str);
            if (hVar != null) {
                if (hVar.f21314b) {
                    t8 = (T) getObjectFromFile(hVar);
                } else {
                    t8 = (T) hVar.f21316d;
                }
                return t8;
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, null);
    }

    public synchronized void putArray(String str, byte[] bArr) {
        try {
            checkKey(str);
            if (bArr == null) {
                remove(str);
            } else {
                addOrUpdate(str, bArr, bArr, (f.a) this.data.get(str), (byte) 7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putBoolean(String str, boolean z8) {
        try {
            checkKey(str);
            f.c cVar = (f.c) this.data.get(str);
            if (cVar == null) {
                wrapHeader(str, (byte) 1);
                p pVar = this.fastBuffer;
                int i8 = pVar.f21332b;
                pVar.a(z8 ? (byte) 1 : (byte) 0);
                updateChange();
                this.data.put(str, new f.c(i8, z8));
                checkIfCommit();
            } else if (cVar.f21309b != z8) {
                cVar.f21309b = z8;
                updateBoolean(z8 ? (byte) 1 : (byte) 0, cVar.f21308a);
                checkIfCommit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putDouble(String str, double d8) {
        try {
            checkKey(str);
            f.d dVar = (f.d) this.data.get(str);
            if (dVar == null) {
                wrapHeader(str, (byte) 5);
                p pVar = this.fastBuffer;
                int i8 = pVar.f21332b;
                pVar.a(Double.doubleToRawLongBits(d8));
                updateChange();
                this.data.put(str, new f.d(i8, d8));
                checkIfCommit();
            } else if (dVar.f21310b != d8) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(d8);
                long doubleToRawLongBits2 = Double.doubleToRawLongBits(dVar.f21310b) ^ doubleToRawLongBits;
                dVar.f21310b = d8;
                updateInt64(doubleToRawLongBits, doubleToRawLongBits2, dVar.f21308a);
                checkIfCommit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putFloat(String str, float f8) {
        try {
            checkKey(str);
            f.e eVar = (f.e) this.data.get(str);
            if (eVar == null) {
                wrapHeader(str, (byte) 3);
                p pVar = this.fastBuffer;
                int i8 = pVar.f21332b;
                pVar.b(Float.floatToRawIntBits(f8));
                updateChange();
                this.data.put(str, new f.e(i8, f8));
                checkIfCommit();
            } else if (eVar.f21311b != f8) {
                eVar.f21311b = f8;
                updateInt32(Float.floatToRawIntBits(f8), (Float.floatToRawIntBits(eVar.f21311b) ^ r6) & 4294967295L, eVar.f21308a);
                checkIfCommit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putInt(String str, int i8) {
        try {
            checkKey(str);
            f.C0407f c0407f = (f.C0407f) this.data.get(str);
            if (c0407f == null) {
                wrapHeader(str, (byte) 2);
                p pVar = this.fastBuffer;
                int i9 = pVar.f21332b;
                pVar.b(i8);
                updateChange();
                this.data.put(str, new f.C0407f(i9, i8));
                checkIfCommit();
            } else {
                if (c0407f.f21312b != i8) {
                    c0407f.f21312b = i8;
                    updateInt32(i8, (r6 ^ i8) & 4294967295L, c0407f.f21308a);
                    checkIfCommit();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putLong(String str, long j8) {
        try {
            checkKey(str);
            f.g gVar = (f.g) this.data.get(str);
            if (gVar == null) {
                wrapHeader(str, (byte) 4);
                p pVar = this.fastBuffer;
                int i8 = pVar.f21332b;
                pVar.a(j8);
                updateChange();
                this.data.put(str, new f.g(i8, j8));
                checkIfCommit();
            } else {
                long j9 = gVar.f21313b;
                if (j9 != j8) {
                    gVar.f21313b = j8;
                    updateInt64(j8, j8 ^ j9, gVar.f21308a);
                    checkIfCommit();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized <T> void putObject(String str, T t8, a<T> aVar) {
        byte[] bArr;
        checkKey(str);
        if (aVar != null) {
            String a9 = aVar.a();
            if (a9 != null && !a9.isEmpty() && a9.length() <= 50) {
                if (this.encoderMap.containsKey(a9)) {
                    if (t8 == null) {
                        remove(str);
                        return;
                    }
                    try {
                        bArr = aVar.a(t8);
                    } catch (Exception e8) {
                        error(e8);
                        bArr = null;
                    }
                    if (bArr == null) {
                        remove(str);
                        return;
                    }
                    int a10 = p.a(a9);
                    p pVar = new p(a10 + 1 + bArr.length);
                    pVar.a((byte) a10);
                    pVar.b(a9);
                    pVar.a(bArr);
                    addOrUpdate(str, t8, pVar.f21331a, (f.h) this.data.get(str), (byte) 8);
                    return;
                }
                throw new IllegalArgumentException("Encoder hasn't been registered");
            }
            throw new IllegalArgumentException("Invalid encoder tag:" + a9);
        }
        throw new IllegalArgumentException("Encoder is null");
    }

    public synchronized void putString(String str, String str2) {
        byte[] bytes;
        try {
            checkKey(str);
            if (str2 == null) {
                remove(str);
            } else {
                f.i iVar = (f.i) this.data.get(str);
                if (str2.length() * 3 < 2048) {
                    fastPutString(str, str2, iVar);
                } else {
                    if (str2.isEmpty()) {
                        bytes = EMPTY_ARRAY;
                    } else {
                        bytes = str2.getBytes(StandardCharsets.UTF_8);
                    }
                    addOrUpdate(str, str2, bytes, iVar, (byte) 6);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                putObject(str, set, am.f21266a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(String str) {
        try {
            f.b bVar = this.data.get(str);
            if (bVar != null) {
                this.data.remove(str);
                byte a9 = bVar.a();
                String str2 = null;
                if (a9 <= 5) {
                    int a10 = p.a(str);
                    int i8 = bVar.f21308a;
                    remove(a9, i8 - (a10 + 2), i8 + TYPE_SIZE[a9]);
                } else {
                    f.j jVar = (f.j) bVar;
                    remove(a9, jVar.f21315c, jVar.f21308a + jVar.f21317e);
                    if (jVar.f21314b) {
                        str2 = (String) jVar.f21316d;
                    }
                }
                byte b9 = (byte) (a9 | Byte.MIN_VALUE);
                if (this.writingMode == 0) {
                    this.aBuffer.putLong(4, this.checksum);
                    this.aBuffer.put(this.removeStart, b9);
                    this.bBuffer.putLong(4, this.checksum);
                    this.bBuffer.put(this.removeStart, b9);
                } else {
                    this.fastBuffer.a(4, this.checksum);
                }
                this.removeStart = 0;
                if (str2 != null) {
                    ap.a(new File(this.path + this.name, str2));
                }
                checkGC();
                checkIfCommit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    private void wrapHeader(String str, byte b9, int i8) {
        int a9 = p.a(str);
        checkKeySize(a9);
        this.updateSize = a9 + 2 + i8;
        preparePutBytes();
        this.fastBuffer.a(b9);
        putKey(str, a9);
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        try {
            f.a aVar = (f.a) this.data.get(str);
            if (aVar != null) {
                return aVar.f21314b ? getArrayFromFile(aVar) : (byte[]) aVar.f21316d;
            }
            return bArr;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean getBoolean(String str, boolean z8) {
        f.c cVar = (f.c) this.data.get(str);
        if (cVar != null) {
            z8 = cVar.f21309b;
        }
        return z8;
    }

    public synchronized double getDouble(String str, double d8) {
        f.d dVar = (f.d) this.data.get(str);
        if (dVar != null) {
            d8 = dVar.f21310b;
        }
        return d8;
    }

    public synchronized float getFloat(String str, float f8) {
        f.e eVar = (f.e) this.data.get(str);
        if (eVar != null) {
            f8 = eVar.f21311b;
        }
        return f8;
    }

    public synchronized int getInt(String str, int i8) {
        f.C0407f c0407f = (f.C0407f) this.data.get(str);
        if (c0407f != null) {
            i8 = c0407f.f21312b;
        }
        return i8;
    }

    public synchronized String getString(String str, String str2) {
        try {
            f.i iVar = (f.i) this.data.get(str);
            if (iVar != null) {
                return iVar.f21314b ? getStringFromFile(iVar) : (String) iVar.f21316d;
            }
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, a> map2) {
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && !key.isEmpty()) {
                    if (value instanceof String) {
                        putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        putFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        putDouble(key, ((Double) value).doubleValue());
                    } else if (value instanceof Set) {
                        Set set = (Set) value;
                        if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                            putStringSet(key, (Set) value);
                        }
                    } else if (value instanceof byte[]) {
                        putArray(key, (byte[]) value);
                    } else if (map2 != null) {
                        a aVar = map2.get(value.getClass());
                        if (aVar != null) {
                            putObject(key, value, aVar);
                        } else {
                            warning(new Exception("missing encoder for type:" + value.getClass()));
                        }
                    } else {
                        warning(new Exception("missing encoders"));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void error(String str) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, new Exception(str));
        }
    }

    public synchronized long getLong(String str, long j8) {
        f.g gVar = (f.g) this.data.get(str);
        if (gVar != null) {
            j8 = gVar.f21313b;
        }
        return j8;
    }

    private void remove(byte b9, int i8, int i9) {
        countInvalid(i8, i9);
        byte[] bArr = this.fastBuffer.f21331a;
        this.checksum = (((bArr[i8] ^ r9) & 255) << ((i8 & 7) << 3)) ^ this.checksum;
        bArr[i8] = (byte) (b9 | Byte.MIN_VALUE);
        this.removeStart = i8;
    }
}
