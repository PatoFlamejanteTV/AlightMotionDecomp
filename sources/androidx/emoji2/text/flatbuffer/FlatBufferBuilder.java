package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    ByteBuffer bb;
    ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    /* loaded from: classes3.dex */
    static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.buf.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i8);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: classes3.dex */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i8) {
            return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i8, ByteBufferFactory byteBufferFactory) {
        this(i8, byteBufferFactory, null, Utf8.getDefault());
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int i8;
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            if (capacity == 0) {
                i8 = 1;
            } else {
                i8 = capacity << 1;
            }
            byteBuffer.position(0);
            ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i8);
            newByteBuffer.position(newByteBuffer.clear().capacity() - capacity);
            newByteBuffer.put(byteBuffer);
            return newByteBuffer;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean isFieldPresent(Table table, int i8) {
        if (table.__offset(i8) != 0) {
            return true;
        }
        return false;
    }

    public void Nested(int i8) {
        if (i8 == offset()) {
        } else {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z8) {
        prep(1, 0);
        putBoolean(z8);
    }

    public void addByte(byte b9) {
        prep(1, 0);
        putByte(b9);
    }

    public void addDouble(double d8) {
        prep(8, 0);
        putDouble(d8);
    }

    public void addFloat(float f8) {
        prep(4, 0);
        putFloat(f8);
    }

    public void addInt(int i8) {
        prep(4, 0);
        putInt(i8);
    }

    public void addLong(long j8) {
        prep(8, 0);
        putLong(j8);
    }

    public void addOffset(int i8) {
        prep(4, 0);
        putInt((offset() - i8) + 4);
    }

    public void addShort(short s8) {
        prep(2, 0);
        putShort(s8);
    }

    public void addStruct(int i8, int i9, int i10) {
        if (i9 != i10) {
            Nested(i9);
            slot(i8);
        }
    }

    public void clear() {
        this.space = this.bb.capacity();
        this.bb.clear();
        this.minalign = 1;
        while (true) {
            int i8 = this.vtable_in_use;
            if (i8 > 0) {
                int[] iArr = this.vtable;
                int i9 = i8 - 1;
                this.vtable_in_use = i9;
                iArr[i9] = 0;
            } else {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - length;
        this.space = i8;
        byteBuffer.position(i8);
        this.bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t8, int[] iArr) {
        t8.sortTables(iArr, this.bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int encodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - encodedLength;
        this.space = i8;
        byteBuffer.position(i8);
        this.utf8.encodeUtf8(charSequence, this.bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i8, int i9, int i10) {
        int i11 = i8 * i9;
        startVector(i8, i9, i10);
        ByteBuffer byteBuffer = this.bb;
        int i12 = this.space - i11;
        this.space = i12;
        byteBuffer.position(i12);
        ByteBuffer order = this.bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i11);
        return order;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.bb;
    }

    public int endTable() {
        int i8;
        int i9;
        if (this.vtable != null && this.nested) {
            addInt(0);
            int offset = offset();
            int i10 = this.vtable_in_use - 1;
            while (i10 >= 0 && this.vtable[i10] == 0) {
                i10--;
            }
            for (int i11 = i10; i11 >= 0; i11--) {
                int i12 = this.vtable[i11];
                if (i12 != 0) {
                    i9 = offset - i12;
                } else {
                    i9 = 0;
                }
                addShort((short) i9);
            }
            addShort((short) (offset - this.object_start));
            addShort((short) ((i10 + 3) * 2));
            int i13 = 0;
            loop2: while (true) {
                if (i13 < this.num_vtables) {
                    int capacity = this.bb.capacity() - this.vtables[i13];
                    int i14 = this.space;
                    short s8 = this.bb.getShort(capacity);
                    if (s8 == this.bb.getShort(i14)) {
                        for (int i15 = 2; i15 < s8; i15 += 2) {
                            if (this.bb.getShort(capacity + i15) != this.bb.getShort(i14 + i15)) {
                                break;
                            }
                        }
                        i8 = this.vtables[i13];
                        break loop2;
                    }
                    i13++;
                } else {
                    i8 = 0;
                    break;
                }
            }
            if (i8 != 0) {
                int capacity2 = this.bb.capacity() - offset;
                this.space = capacity2;
                this.bb.putInt(capacity2, i8 - offset);
            } else {
                int i16 = this.num_vtables;
                int[] iArr = this.vtables;
                if (i16 == iArr.length) {
                    this.vtables = Arrays.copyOf(iArr, i16 * 2);
                }
                int[] iArr2 = this.vtables;
                int i17 = this.num_vtables;
                this.num_vtables = i17 + 1;
                iArr2[i17] = offset();
                ByteBuffer byteBuffer = this.bb;
                byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
            }
            this.nested = false;
            return offset;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public int endVector() {
        if (this.nested) {
            this.nested = false;
            putInt(this.vector_num_elems);
            return offset();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    protected void finish(int i8, boolean z8) {
        prep(this.minalign, (z8 ? 4 : 0) + 4);
        addOffset(i8);
        if (z8) {
            addInt(this.bb.capacity() - this.space);
        }
        this.bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i8) {
        finish(i8, true);
    }

    public void finished() {
        if (this.finished) {
        } else {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z8) {
        this.force_defaults = z8;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.bb = byteBuffer;
        byteBuffer.clear();
        this.bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public void notNested() {
        if (!this.nested) {
        } else {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.bb.capacity() - this.space;
    }

    public void pad(int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            ByteBuffer byteBuffer = this.bb;
            int i10 = this.space - 1;
            this.space = i10;
            byteBuffer.put(i10, (byte) 0);
        }
    }

    public void prep(int i8, int i9) {
        if (i8 > this.minalign) {
            this.minalign = i8;
        }
        int i10 = ((~((this.bb.capacity() - this.space) + i9)) + 1) & (i8 - 1);
        while (this.space < i10 + i8 + i9) {
            int capacity = this.bb.capacity();
            ByteBuffer byteBuffer = this.bb;
            ByteBuffer growByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.bb = growByteBuffer;
            if (byteBuffer != growByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.bb.capacity() - capacity;
        }
        pad(i10);
    }

    public void putBoolean(boolean z8) {
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - 1;
        this.space = i8;
        byteBuffer.put(i8, z8 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b9) {
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - 1;
        this.space = i8;
        byteBuffer.put(i8, b9);
    }

    public void putDouble(double d8) {
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - 8;
        this.space = i8;
        byteBuffer.putDouble(i8, d8);
    }

    public void putFloat(float f8) {
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - 4;
        this.space = i8;
        byteBuffer.putFloat(i8, f8);
    }

    public void putInt(int i8) {
        ByteBuffer byteBuffer = this.bb;
        int i9 = this.space - 4;
        this.space = i9;
        byteBuffer.putInt(i9, i8);
    }

    public void putLong(long j8) {
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - 8;
        this.space = i8;
        byteBuffer.putLong(i8, j8);
    }

    public void putShort(short s8) {
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - 2;
        this.space = i8;
        byteBuffer.putShort(i8, s8);
    }

    public void required(int i8, int i9) {
        int capacity = this.bb.capacity() - i8;
        if (this.bb.getShort((capacity - this.bb.getInt(capacity)) + i9) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i9 + " must be set");
    }

    public byte[] sizedByteArray(int i8, int i9) {
        finished();
        byte[] bArr = new byte[i9];
        this.bb.position(i8);
        this.bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer duplicate = this.bb.duplicate();
        duplicate.position(this.space);
        duplicate.limit(this.bb.capacity());
        return new ByteBufferBackedInputStream(duplicate);
    }

    public void slot(int i8) {
        this.vtable[i8] = offset();
    }

    public void startTable(int i8) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i8) {
            this.vtable = new int[i8];
        }
        this.vtable_in_use = i8;
        Arrays.fill(this.vtable, 0, i8, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i8, int i9, int i10) {
        notNested();
        this.vector_num_elems = i9;
        int i11 = i8 * i9;
        prep(4, i11);
        prep(i10, i11);
        this.nested = true;
    }

    public FlatBufferBuilder(int i8, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i8 = i8 <= 0 ? 1 : i8;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.bb = byteBuffer;
            byteBuffer.clear();
            this.bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.bb = byteBufferFactory.newByteBuffer(i8);
        }
        this.utf8 = utf8;
        this.space = this.bb.capacity();
    }

    public void addBoolean(int i8, boolean z8, boolean z9) {
        if (this.force_defaults || z8 != z9) {
            addBoolean(z8);
            slot(i8);
        }
    }

    public void addByte(int i8, byte b9, int i9) {
        if (this.force_defaults || b9 != i9) {
            addByte(b9);
            slot(i8);
        }
    }

    public void addDouble(int i8, double d8, double d9) {
        if (this.force_defaults || d8 != d9) {
            addDouble(d8);
            slot(i8);
        }
    }

    public void addFloat(int i8, float f8, double d8) {
        if (this.force_defaults || f8 != d8) {
            addFloat(f8);
            slot(i8);
        }
    }

    public void addInt(int i8, int i9, int i10) {
        if (this.force_defaults || i9 != i10) {
            addInt(i9);
            slot(i8);
        }
    }

    public void addLong(int i8, long j8, long j9) {
        if (this.force_defaults || j8 != j9) {
            addLong(j8);
            slot(i8);
        }
    }

    public void addShort(int i8, short s8, int i9) {
        if (this.force_defaults || s8 != i9) {
            addShort(s8);
            slot(i8);
        }
    }

    public void finishSizePrefixed(int i8, String str) {
        finish(i8, str, true);
    }

    public void addOffset(int i8, int i9, int i10) {
        if (this.force_defaults || i9 != i10) {
            addOffset(i9);
            slot(i8);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i8, int i9) {
        startVector(1, i9, 1);
        ByteBuffer byteBuffer = this.bb;
        int i10 = this.space - i9;
        this.space = i10;
        byteBuffer.position(i10);
        this.bb.put(bArr, i8, i9);
        return endVector();
    }

    public void finish(int i8) {
        finish(i8, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i8 = this.space - remaining;
        this.space = i8;
        byteBuffer2.position(i8);
        this.bb.put(byteBuffer);
        return endVector();
    }

    protected void finish(int i8, String str, boolean z8) {
        prep(this.minalign, (z8 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i9 = 3; i9 >= 0; i9--) {
                addByte((byte) str.charAt(i9));
            }
            finish(i8, z8);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i8 = this.space - remaining;
        this.space = i8;
        byteBuffer2.position(i8);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i8, String str) {
        finish(i8, str, false);
    }

    public FlatBufferBuilder(int i8) {
        this(i8, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }
}
