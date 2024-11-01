package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class ByteBufferReadWriteBuf implements ReadWriteBuf {
    private final ByteBuffer buffer;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i8) {
        return this.buffer.get(i8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i8) {
        if (get(i8) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i8) {
        return this.buffer.getDouble(i8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i8) {
        return this.buffer.getFloat(i8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i8) {
        return this.buffer.getInt(i8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i8) {
        return this.buffer.getLong(i8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i8) {
        return this.buffer.getShort(i8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i8, int i9) {
        return Utf8Safe.decodeUtf8Buffer(this.buffer, i8, i9);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.buffer.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i8, int i9) {
        this.buffer.put(bArr, i8, i9);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z8) {
        this.buffer.put(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d8) {
        this.buffer.putDouble(d8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f8) {
        this.buffer.putFloat(f8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i8) {
        this.buffer.putInt(i8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j8) {
        this.buffer.putLong(j8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s8) {
        this.buffer.putShort(s8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i8) {
        if (i8 <= this.buffer.limit()) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i8, byte b9) {
        requestCapacity(i8 + 1);
        this.buffer.put(i8, b9);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i8, boolean z8) {
        set(i8, z8 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i8, double d8) {
        requestCapacity(i8 + 8);
        this.buffer.putDouble(i8, d8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i8, float f8) {
        requestCapacity(i8 + 4);
        this.buffer.putFloat(i8, f8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i8, int i9) {
        requestCapacity(i8 + 4);
        this.buffer.putInt(i8, i9);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i8, long j8) {
        requestCapacity(i8 + 8);
        this.buffer.putLong(i8, j8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i8, short s8) {
        requestCapacity(i8 + 2);
        this.buffer.putShort(i8, s8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.buffer.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b9) {
        this.buffer.put(b9);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i8, byte[] bArr, int i9, int i10) {
        requestCapacity((i10 - i9) + i8);
        int position = this.buffer.position();
        this.buffer.position(i8);
        this.buffer.put(bArr, i9, i10);
        this.buffer.position(position);
    }
}
