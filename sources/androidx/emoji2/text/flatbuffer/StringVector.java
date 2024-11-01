package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class StringVector extends BaseVector {
    private Utf8 utf8 = Utf8.getDefault();

    public StringVector __assign(int i8, int i9, ByteBuffer byteBuffer) {
        __reset(i8, i9, byteBuffer);
        return this;
    }

    public String get(int i8) {
        return Table.__string(__element(i8), this.bb, this.utf8);
    }
}
