package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class MetadataList extends Table {

    /* loaded from: classes3.dex */
    public static final class Vector extends BaseVector {
        public Vector __assign(int i8, int i9, ByteBuffer byteBuffer) {
            __reset(i8, i9, byteBuffer);
            return this;
        }

        public MetadataList get(int i8) {
            return get(new MetadataList(), i8);
        }

        public MetadataList get(MetadataList metadataList, int i8) {
            return metadataList.__assign(Table.__indirect(__element(i8), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addList(FlatBufferBuilder flatBufferBuilder, int i8) {
        flatBufferBuilder.addOffset(1, i8, 0);
    }

    public static void addSourceSha(FlatBufferBuilder flatBufferBuilder, int i8) {
        flatBufferBuilder.addOffset(2, i8, 0);
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, int i8) {
        flatBufferBuilder.addInt(0, i8, 0);
    }

    public static int createListVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataList(FlatBufferBuilder flatBufferBuilder, int i8, int i9, int i10) {
        flatBufferBuilder.startTable(3);
        addSourceSha(flatBufferBuilder, i10);
        addList(flatBufferBuilder, i9);
        addVersion(flatBufferBuilder, i8);
        return endMetadataList(flatBufferBuilder);
    }

    public static int endMetadataList(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static void finishMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i8) {
        flatBufferBuilder.finish(i8);
    }

    public static void finishSizePrefixedMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i8) {
        flatBufferBuilder.finishSizePrefixed(i8);
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer) {
        return getRootAsMetadataList(byteBuffer, new MetadataList());
    }

    public static void startListVector(FlatBufferBuilder flatBufferBuilder, int i8) {
        flatBufferBuilder.startVector(4, i8, 4);
    }

    public static void startMetadataList(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public MetadataList __assign(int i8, ByteBuffer byteBuffer) {
        __init(i8, byteBuffer);
        return this;
    }

    public void __init(int i8, ByteBuffer byteBuffer) {
        __reset(i8, byteBuffer);
    }

    public MetadataItem list(int i8) {
        return list(new MetadataItem(), i8);
    }

    public int listLength() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public MetadataItem.Vector listVector() {
        return listVector(new MetadataItem.Vector());
    }

    public String sourceSha() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public int version() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer, MetadataList metadataList) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataList.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public MetadataItem list(MetadataItem metadataItem, int i8) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return metadataItem.__assign(__indirect(__vector(__offset) + (i8 * 4)), this.bb);
        }
        return null;
    }

    public MetadataItem.Vector listVector(MetadataItem.Vector vector) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }
}
