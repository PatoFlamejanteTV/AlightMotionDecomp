package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class BaseVector {
    protected ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    /* JADX INFO: Access modifiers changed from: protected */
    public int __element(int i8) {
        return this.vector + (i8 * this.element_size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void __reset(int i8, int i9, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i8;
            this.length = byteBuffer.getInt(i8 - 4);
            this.element_size = i9;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    protected int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
