package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i8, ByteBuffer byteBuffer) {
        __reset(i8, 1, byteBuffer);
        return this;
    }

    public boolean get(int i8) {
        if (this.bb.get(__element(i8)) != 0) {
            return true;
        }
        return false;
    }
}
