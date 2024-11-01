package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class UnionVector extends BaseVector {
    public UnionVector __assign(int i8, int i9, ByteBuffer byteBuffer) {
        __reset(i8, i9, byteBuffer);
        return this;
    }

    public Table get(Table table, int i8) {
        return Table.__union(table, __element(i8), this.bb);
    }
}
