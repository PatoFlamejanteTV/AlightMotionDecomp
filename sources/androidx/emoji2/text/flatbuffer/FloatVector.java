package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i8, ByteBuffer byteBuffer) {
        __reset(i8, 4, byteBuffer);
        return this;
    }

    public float get(int i8) {
        return this.bb.getFloat(__element(i8));
    }
}
