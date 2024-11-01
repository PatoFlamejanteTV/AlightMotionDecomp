package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.util.DesugarCollections;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.emptyMap());
    private static final int MAX_VALUE_LENGTH = 10485760;
    private int hashCode;
    private final Map<String, byte[]> metadata;

    private DefaultContentMetadata(Map<String, byte[]> map) {
        this.metadata = DesugarCollections.unmodifiableMap(map);
    }

    private static void addValues(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            byte[] bytes = getBytes(map.get(str));
            if (bytes.length <= MAX_VALUE_LENGTH) {
                hashMap.put(str, bytes);
            } else {
                throw new IllegalArgumentException(String.format("The size of %s (%d) is greater than maximum allowed: %d", str, Integer.valueOf(bytes.length), Integer.valueOf(MAX_VALUE_LENGTH)));
            }
        }
    }

    private static Map<String, byte[]> applyMutations(Map<String, byte[]> map, ContentMetadataMutations contentMetadataMutations) {
        HashMap hashMap = new HashMap(map);
        removeValues(hashMap, contentMetadataMutations.getRemovedValues());
        addValues(hashMap, contentMetadataMutations.getEditedValues());
        return hashMap;
    }

    private static byte[] getBytes(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(C.UTF8_NAME));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private boolean isMetadataEqual(Map<String, byte[]> map) {
        if (this.metadata.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.metadata.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static DefaultContentMetadata readFromStream(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < readInt; i8++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0 && readInt2 <= MAX_VALUE_LENGTH) {
                byte[] bArr = new byte[readInt2];
                dataInputStream.readFully(bArr);
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new DefaultContentMetadata(hashMap);
    }

    private static void removeValues(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            hashMap.remove(list.get(i8));
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(String str) {
        return this.metadata.containsKey(str);
    }

    public final DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations contentMetadataMutations) {
        Map<String, byte[]> applyMutations = applyMutations(this.metadata, contentMetadataMutations);
        if (isMetadataEqual(applyMutations)) {
            return this;
        }
        return new DefaultContentMetadata(applyMutations);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DefaultContentMetadata.class == obj.getClass()) {
            return isMetadataEqual(((DefaultContentMetadata) obj).metadata);
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final byte[] get(String str, byte[] bArr) {
        if (!this.metadata.containsKey(str)) {
            return bArr;
        }
        byte[] bArr2 = this.metadata.get(str);
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            int i8 = 0;
            for (Map.Entry<String, byte[]> entry : this.metadata.entrySet()) {
                i8 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.hashCode = i8;
        }
        return this.hashCode;
    }

    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.metadata.size());
        for (Map.Entry<String, byte[]> entry : this.metadata.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final String get(String str, String str2) {
        return this.metadata.containsKey(str) ? new String(this.metadata.get(str), Charset.forName(C.UTF8_NAME)) : str2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.ContentMetadata
    public final long get(String str, long j8) {
        return this.metadata.containsKey(str) ? ByteBuffer.wrap(this.metadata.get(str)).getLong() : j8;
    }
}
