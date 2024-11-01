package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i8, ByteBuffer byteBuffer) {
        __reset(i8, 8, byteBuffer);
        return this;
    }

    public double get(int i8) {
        return this.bb.getDouble(__element(i8));
    }
}
