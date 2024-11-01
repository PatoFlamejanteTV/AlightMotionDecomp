package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i8, ByteBuffer byteBuffer) {
        __reset(i8, 1, byteBuffer);
        return this;
    }

    public byte get(int i8) {
        return this.bb.get(__element(i8));
    }

    public int getAsUnsigned(int i8) {
        return get(i8) & 255;
    }
}
