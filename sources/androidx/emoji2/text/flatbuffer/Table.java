package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class Table {
    protected ByteBuffer bb;
    protected int bb_pos;
    Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    protected static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i8 = 0; i8 < 4; i8++) {
                if (str.charAt(i8) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i8))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    protected static int compareStrings(int i8, int i9, ByteBuffer byteBuffer) {
        int i10 = i8 + byteBuffer.getInt(i8);
        int i11 = i9 + byteBuffer.getInt(i9);
        int i12 = byteBuffer.getInt(i10);
        int i13 = byteBuffer.getInt(i11);
        int i14 = i10 + 4;
        int i15 = i11 + 4;
        int min = Math.min(i12, i13);
        for (int i16 = 0; i16 < min; i16++) {
            int i17 = i16 + i14;
            int i18 = i16 + i15;
            if (byteBuffer.get(i17) != byteBuffer.get(i18)) {
                return byteBuffer.get(i17) - byteBuffer.get(i18);
            }
        }
        return i12 - i13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int __indirect(int i8) {
        return i8 + this.bb.getInt(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int __offset(int i8) {
        if (i8 < this.vtable_size) {
            return this.bb.getShort(this.vtable_start + i8);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void __reset(int i8, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i8;
            int i9 = i8 - byteBuffer.getInt(i8);
            this.vtable_start = i9;
            this.vtable_size = this.bb.getShort(i9);
            return;
        }
        this.bb_pos = 0;
        this.vtable_start = 0;
        this.vtable_size = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String __string(int i8) {
        return __string(i8, this.bb, this.utf8);
    }

    protected Table __union(Table table, int i8) {
        return __union(table, i8, this.bb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int __vector(int i8) {
        int i9 = i8 + this.bb_pos;
        return i9 + this.bb.getInt(i9) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ByteBuffer __vector_as_bytebuffer(int i8, int i9) {
        int __offset = __offset(i8);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit(__vector + (__vector_len(__offset) * i9));
        return order;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i8, int i9) {
        int __offset = __offset(i8);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i9) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int __vector_len(int i8) {
        int i9 = i8 + this.bb_pos;
        return this.bb.getInt(i9 + this.bb.getInt(i9));
    }

    public ByteBuffer getByteBuffer() {
        return this.bb;
    }

    protected int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sortTables(int[] iArr, final ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            numArr[i8] = Integer.valueOf(iArr[i8]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: androidx.emoji2.text.flatbuffer.Table.1
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i9 = 0; i9 < iArr.length; i9++) {
            iArr[i9] = numArr[i9].intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int __indirect(int i8, ByteBuffer byteBuffer) {
        return i8 + byteBuffer.getInt(i8);
    }

    protected static int __offset(int i8, int i9, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i9;
        return byteBuffer.getShort((i8 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String __string(int i8, ByteBuffer byteBuffer, Utf8 utf8) {
        int i9 = i8 + byteBuffer.getInt(i8);
        return utf8.decodeUtf8(byteBuffer, i9 + 4, byteBuffer.getInt(i9));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Table __union(Table table, int i8, ByteBuffer byteBuffer) {
        table.__reset(__indirect(i8, byteBuffer), byteBuffer);
        return table;
    }

    protected static int compareStrings(int i8, byte[] bArr, ByteBuffer byteBuffer) {
        int i9 = i8 + byteBuffer.getInt(i8);
        int i10 = byteBuffer.getInt(i9);
        int length = bArr.length;
        int i11 = i9 + 4;
        int min = Math.min(i10, length);
        for (int i12 = 0; i12 < min; i12++) {
            int i13 = i12 + i11;
            if (byteBuffer.get(i13) != bArr[i12]) {
                return byteBuffer.get(i13) - bArr[i12];
            }
        }
        return i10 - length;
    }

    public void __reset() {
        __reset(0, null);
    }
}
