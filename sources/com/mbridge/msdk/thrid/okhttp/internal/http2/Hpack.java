package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Okio;
import com.mbridge.msdk.thrid.okio.Source;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Hpack {
    static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final Header[] STATIC_HEADER_TABLE;

    /* loaded from: classes4.dex */
    static final class Reader {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final BufferedSource source;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Reader(int i8, Source source) {
            this(i8, i8, source);
        }

        private void adjustDynamicTableByteCount() {
            int i8 = this.maxDynamicTableByteCount;
            int i9 = this.dynamicTableByteCount;
            if (i8 < i9) {
                if (i8 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i9 - i8);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int dynamicTableIndex(int i8) {
            return this.nextHeaderIndex + 1 + i8;
        }

        private int evictToRecoverBytes(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i9 = this.nextHeaderIndex;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.dynamicTable[length].hpackSize;
                    i8 -= i11;
                    this.dynamicTableByteCount -= i11;
                    this.headerCount--;
                    i10++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i9 + 1, headerArr, i9 + 1 + i10, this.headerCount);
                this.nextHeaderIndex += i10;
            }
            return i10;
        }

        private ByteString getName(int i8) throws IOException {
            if (isStaticHeader(i8)) {
                return Hpack.STATIC_HEADER_TABLE[i8].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i8 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void insertIntoDynamicTable(int i8, Header header) {
            this.headerList.add(header);
            int i9 = header.hpackSize;
            if (i8 != -1) {
                i9 -= this.dynamicTable[dynamicTableIndex(i8)].hpackSize;
            }
            int i10 = this.maxDynamicTableByteCount;
            if (i9 > i10) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i9) - i10);
            if (i8 == -1) {
                int i11 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i11 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i12 = this.nextHeaderIndex;
                this.nextHeaderIndex = i12 - 1;
                this.dynamicTable[i12] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i8 + dynamicTableIndex(i8) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i9;
        }

        private boolean isStaticHeader(int i8) {
            if (i8 >= 0 && i8 <= Hpack.STATIC_HEADER_TABLE.length - 1) {
                return true;
            }
            return false;
        }

        private int readByte() throws IOException {
            return this.source.readByte() & 255;
        }

        private void readIndexedHeader(int i8) throws IOException {
            if (isStaticHeader(i8)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i8]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i8 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i8) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i8), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i8) throws IOException {
            this.headerList.add(new Header(getName(i8), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        public List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        ByteString readByteString() throws IOException {
            boolean z8;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z8 = true;
            } else {
                z8 = false;
            }
            int readInt = readInt(readByte, 127);
            if (z8) {
                return ByteString.of(Huffman.get().decode(this.source.readByteArray(readInt)));
            }
            return this.source.readByteString(readInt);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                byte readByte = this.source.readByte();
                int i8 = readByte & 255;
                if (i8 != 128) {
                    if ((readByte & 128) == 128) {
                        readIndexedHeader(readInt(i8, 127) - 1);
                    } else if (i8 == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((readByte & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(i8, 63) - 1);
                    } else if ((readByte & 32) == 32) {
                        int readInt = readInt(i8, 31);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                        }
                    } else if (i8 != 16 && i8 != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(i8, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        int readInt(int i8, int i9) throws IOException {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) != 0) {
                    i9 += (readByte & 127) << i11;
                    i11 += 7;
                } else {
                    return i9 + (readByte << i11);
                }
            }
        }

        Reader(int i8, int i9, Source source) {
            this.headerList = new ArrayList();
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i8;
            this.maxDynamicTableByteCount = i9;
            this.source = Okio.buffer(source);
        }
    }

    /* loaded from: classes4.dex */
    static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
        Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Writer(Buffer buffer) {
            this(4096, true, buffer);
        }

        private void adjustDynamicTableByteCount() {
            int i8 = this.maxDynamicTableByteCount;
            int i9 = this.dynamicTableByteCount;
            if (i8 < i9) {
                if (i8 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i9 - i8);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i9 = this.nextHeaderIndex;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.dynamicTable[length].hpackSize;
                    i8 -= i11;
                    this.dynamicTableByteCount -= i11;
                    this.headerCount--;
                    i10++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i9 + 1, headerArr, i9 + 1 + i10, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i12 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i12 + 1, i12 + 1 + i10, (Object) null);
                this.nextHeaderIndex += i10;
            }
            return i10;
        }

        private void insertIntoDynamicTable(Header header) {
            int i8 = header.hpackSize;
            int i9 = this.maxDynamicTableByteCount;
            if (i8 > i9) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i8) - i9);
            int i10 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i10 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i11 = this.nextHeaderIndex;
            this.nextHeaderIndex = i11 - 1;
            this.dynamicTable[i11] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void setHeaderTableSizeSetting(int i8) {
            this.headerTableSizeSetting = i8;
            int min = Math.min(i8, 16384);
            int i9 = this.maxDynamicTableByteCount;
            if (i9 == min) {
                return;
            }
            if (min < i9) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        void writeByteString(ByteString byteString) throws IOException {
            if (this.useCompression && Huffman.get().encodedLength(byteString) < byteString.size()) {
                Buffer buffer = new Buffer();
                Huffman.get().encode(byteString, buffer);
                ByteString readByteString = buffer.readByteString();
                writeInt(readByteString.size(), 127, 128);
                this.out.write(readByteString);
                return;
            }
            writeInt(byteString.size(), 127, 0);
            this.out.write(byteString);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void writeHeaders(java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.Header> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        void writeInt(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.out.writeByte(i8 | i10);
                return;
            }
            this.out.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.out.writeByte(128 | (i11 & 127));
                i11 >>>= 7;
            }
            this.out.writeByte(i11);
        }

        Writer(int i8, boolean z8, Buffer buffer) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i8;
            this.maxDynamicTableByteCount = i8;
            this.useCompression = z8;
            this.out = buffer;
        }
    }

    static {
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        ByteString byteString = Header.TARGET_METHOD;
        Header header2 = new Header(byteString, ShareTarget.METHOD_GET);
        Header header3 = new Header(byteString, ShareTarget.METHOD_POST);
        ByteString byteString2 = Header.TARGET_PATH;
        Header header4 = new Header(byteString2, "/");
        Header header5 = new Header(byteString2, "/index.html");
        ByteString byteString3 = Header.TARGET_SCHEME;
        Header header6 = new Header(byteString3, "http");
        Header header7 = new Header(byteString3, "https");
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header(DownloadModel.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header(TypedValues.TransitionType.S_FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header(ToolBar.REFRESH, ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = nameToFirstIndex();
    }

    private Hpack() {
    }

    static ByteString checkLowercase(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i8 = 0; i8 < size; i8++) {
            byte b9 = byteString.getByte(i8);
            if (b9 >= 65 && b9 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i8 = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i8 < headerArr.length) {
                if (!linkedHashMap.containsKey(headerArr[i8].name)) {
                    linkedHashMap.put(headerArr[i8].name, Integer.valueOf(i8));
                }
                i8++;
            } else {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
