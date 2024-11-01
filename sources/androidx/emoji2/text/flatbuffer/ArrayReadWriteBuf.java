package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i8) {
        return this.buffer[i8];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i8) {
        if (this.buffer[i8] != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i8) {
        return Double.longBitsToDouble(getLong(i8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i8) {
        return Float.intBitsToFloat(getInt(i8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i8) {
        byte[] bArr = this.buffer;
        return (bArr[i8] & 255) | (bArr[i8 + 3] << 24) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i8) {
        byte[] bArr = this.buffer;
        int i9 = i8 + 6;
        return (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i9] & 255) << 48) | (bArr[i8 + 7] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i8) {
        byte[] bArr = this.buffer;
        return (short) ((bArr[i8] & 255) | (bArr[i8 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i8, int i9) {
        return Utf8Safe.decodeUtf8Array(this.buffer, i8, i9);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.writePos;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i8, int i9) {
        set(this.writePos, bArr, i8, i9);
        this.writePos += i9;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z8) {
        setBoolean(this.writePos, z8);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d8) {
        setDouble(this.writePos, d8);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f8) {
        setFloat(this.writePos, f8);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i8) {
        setInt(this.writePos, i8);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j8) {
        setLong(this.writePos, j8);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s8) {
        setShort(this.writePos, s8);
        this.writePos += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i8) {
        byte[] bArr = this.buffer;
        if (bArr.length > i8) {
            return true;
        }
        int length = bArr.length;
        this.buffer = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i8, byte b9) {
        requestCapacity(i8 + 1);
        this.buffer[i8] = b9;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i8, boolean z8) {
        set(i8, z8 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i8, double d8) {
        requestCapacity(i8 + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8);
        int i9 = (int) doubleToRawLongBits;
        byte[] bArr = this.buffer;
        bArr[i8] = (byte) (i9 & 255);
        bArr[i8 + 1] = (byte) ((i9 >> 8) & 255);
        bArr[i8 + 2] = (byte) ((i9 >> 16) & 255);
        bArr[i8 + 3] = (byte) ((i9 >> 24) & 255);
        int i10 = (int) (doubleToRawLongBits >> 32);
        bArr[i8 + 4] = (byte) (i10 & 255);
        bArr[i8 + 5] = (byte) ((i10 >> 8) & 255);
        bArr[i8 + 6] = (byte) ((i10 >> 16) & 255);
        bArr[i8 + 7] = (byte) ((i10 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i8, float f8) {
        requestCapacity(i8 + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f8);
        byte[] bArr = this.buffer;
        bArr[i8] = (byte) (floatToRawIntBits & 255);
        bArr[i8 + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i8 + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i8 + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i8, int i9) {
        requestCapacity(i8 + 4);
        byte[] bArr = this.buffer;
        bArr[i8] = (byte) (i9 & 255);
        bArr[i8 + 1] = (byte) ((i9 >> 8) & 255);
        bArr[i8 + 2] = (byte) ((i9 >> 16) & 255);
        bArr[i8 + 3] = (byte) ((i9 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i8, long j8) {
        requestCapacity(i8 + 8);
        int i9 = (int) j8;
        byte[] bArr = this.buffer;
        bArr[i8] = (byte) (i9 & 255);
        bArr[i8 + 1] = (byte) ((i9 >> 8) & 255);
        bArr[i8 + 2] = (byte) ((i9 >> 16) & 255);
        bArr[i8 + 3] = (byte) ((i9 >> 24) & 255);
        int i10 = (int) (j8 >> 32);
        bArr[i8 + 4] = (byte) (i10 & 255);
        bArr[i8 + 5] = (byte) ((i10 >> 8) & 255);
        bArr[i8 + 6] = (byte) ((i10 >> 16) & 255);
        bArr[i8 + 7] = (byte) ((i10 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i8, short s8) {
        requestCapacity(i8 + 2);
        byte[] bArr = this.buffer;
        bArr[i8] = (byte) (s8 & 255);
        bArr[i8 + 1] = (byte) ((s8 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.writePos;
    }

    public ArrayReadWriteBuf(int i8) {
        this(new byte[i8]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.buffer = bArr;
        this.writePos = 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b9) {
        set(this.writePos, b9);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i8, byte[] bArr, int i9, int i10) {
        requestCapacity((i10 - i9) + i8);
        System.arraycopy(bArr, i9, this.buffer, i8, i10);
    }

    public ArrayReadWriteBuf(byte[] bArr, int i8) {
        this.buffer = bArr;
        this.writePos = i8;
    }
}
