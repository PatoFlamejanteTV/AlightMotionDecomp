package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i8, ByteBuffer byteBuffer) {
        __reset(i8, 2, byteBuffer);
        return this;
    }

    public short get(int i8) {
        return this.bb.getShort(__element(i8));
    }

    public int getAsUnsigned(int i8) {
        return get(i8) & 65535;
    }
}
