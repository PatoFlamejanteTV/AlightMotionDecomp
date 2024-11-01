package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class ParsableByteArray {
    public byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
    }

    public final int bytesLeft() {
        return this.limit - this.position;
    }

    public final int capacity() {
        byte[] bArr = this.data;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int limit() {
        return this.limit;
    }

    public final char peekChar() {
        byte[] bArr = this.data;
        int i8 = this.position;
        return (char) ((bArr[i8 + 1] & 255) | ((bArr[i8] & 255) << 8));
    }

    public final int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public final void readBytes(ParsableBitArray parsableBitArray, int i8) {
        readBytes(parsableBitArray.data, 0, i8);
        parsableBitArray.setPosition(0);
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final int readInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = (bArr[i8] & 255) << 24;
        int i11 = i8 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 16) | i10;
        int i13 = i8 + 3;
        this.position = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.position = i8 + 4;
        return (bArr[i13] & 255) | i14;
    }

    public final int readInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = ((bArr[i8] & 255) << 24) >> 8;
        int i11 = i8 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i8 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public final String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i8 = this.position;
        while (i8 < this.limit && !Util.isLinebreak(this.data[i8])) {
            i8++;
        }
        int i9 = this.position;
        if (i8 - i9 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i9] == -17 && bArr[i9 + 1] == -69 && bArr[i9 + 2] == -65) {
                this.position = i9 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i10 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i10, i8 - i10);
        this.position = i8;
        int i11 = this.limit;
        if (i8 == i11) {
            return fromUtf8Bytes;
        }
        byte[] bArr3 = this.data;
        if (bArr3[i8] == 13) {
            int i12 = i8 + 1;
            this.position = i12;
            if (i12 == i11) {
                return fromUtf8Bytes;
            }
        }
        int i13 = this.position;
        if (bArr3[i13] == 10) {
            this.position = i13 + 1;
        }
        return fromUtf8Bytes;
    }

    public final int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        int i13 = i8 + 3;
        this.position = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        this.position = i8 + 4;
        return ((bArr[i13] & 255) << 24) | i14;
    }

    public final int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i8 + 3;
        return ((bArr[i11] & 255) << 16) | i12;
    }

    public final long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i8 = this.position;
        this.position = i8 + 1;
        this.position = i8 + 2;
        this.position = i8 + 3;
        long j8 = (bArr[i8] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i8 + 4;
        long j9 = j8 | ((bArr[r8] & 255) << 24);
        this.position = i8 + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 32);
        this.position = i8 + 6;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.position = i8 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 48);
        this.position = i8 + 8;
        return ((bArr[r8] & 255) << 56) | j12;
    }

    public final short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = bArr[i8] & 255;
        this.position = i8 + 2;
        return (short) (((bArr[i9] & 255) << 8) | i10);
    }

    public final long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        this.position = i8 + 1;
        this.position = i8 + 2;
        this.position = i8 + 3;
        long j8 = (bArr[i8] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i8 + 4;
        return ((bArr[r4] & 255) << 24) | j8;
    }

    public final int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i8 + 3;
        return ((bArr[i11] & 255) << 16) | i12;
    }

    public final int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readLittleEndianInt);
    }

    public final int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = bArr[i8] & 255;
        this.position = i8 + 2;
        return ((bArr[i9] & 255) << 8) | i10;
    }

    public final long readLong() {
        byte[] bArr = this.data;
        int i8 = this.position;
        this.position = i8 + 1;
        this.position = i8 + 2;
        this.position = i8 + 3;
        long j8 = ((bArr[i8] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.position = i8 + 4;
        long j9 = j8 | ((bArr[r4] & 255) << 32);
        this.position = i8 + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 24);
        this.position = i8 + 6;
        long j11 = j10 | ((bArr[r4] & 255) << 16);
        this.position = i8 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.position = i8 + 8;
        return (bArr[r4] & 255) | j12;
    }

    public final String readNullTerminatedString(int i8) {
        if (i8 == 0) {
            return "";
        }
        int i9 = this.position;
        int i10 = (i9 + i8) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i9, (i10 >= this.limit || this.data[i10] != 0) ? i8 : i8 - 1);
        this.position += i8;
        return fromUtf8Bytes;
    }

    public final short readShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = (bArr[i8] & 255) << 8;
        this.position = i8 + 2;
        return (short) ((bArr[i9] & 255) | i10);
    }

    public final String readString(int i8) {
        return readString(i8, Charset.forName(C.UTF8_NAME));
    }

    public final int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public final int readUnsignedByte() {
        byte[] bArr = this.data;
        int i8 = this.position;
        this.position = i8 + 1;
        return bArr[i8] & 255;
    }

    public final int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = (bArr[i8] & 255) << 8;
        this.position = i8 + 2;
        int i11 = (bArr[i9] & 255) | i10;
        this.position = i8 + 4;
        return i11;
    }

    public final long readUnsignedInt() {
        byte[] bArr = this.data;
        int i8 = this.position;
        this.position = i8 + 1;
        this.position = i8 + 2;
        this.position = i8 + 3;
        long j8 = ((bArr[i8] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.position = i8 + 4;
        return (bArr[r4] & 255) | j8;
    }

    public final int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = (bArr[i8] & 255) << 16;
        int i11 = i8 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i8 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public final int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readInt);
    }

    public final long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException("Top bit not zero: " + readLong);
    }

    public final int readUnsignedShort() {
        byte[] bArr = this.data;
        int i8 = this.position;
        int i9 = i8 + 1;
        this.position = i9;
        int i10 = (bArr[i8] & 255) << 8;
        this.position = i8 + 2;
        return (bArr[i9] & 255) | i10;
    }

    public final long readUtf8EncodedLong() {
        int i8;
        int i9;
        long j8 = this.data[this.position];
        int i10 = 7;
        while (true) {
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j8) != 0) {
                i10--;
            } else if (i10 < 6) {
                j8 &= r6 - 1;
                i9 = 7 - i10;
            } else if (i10 == 7) {
                i9 = 1;
            }
        }
        i9 = 0;
        if (i9 != 0) {
            for (i8 = 1; i8 < i9; i8++) {
                if ((this.data[this.position + i8] & 192) == 128) {
                    j8 = (j8 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j8);
                }
            }
            this.position += i9;
            return j8;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j8);
    }

    public final void reset(int i8) {
        reset(capacity() < i8 ? new byte[i8] : this.data, i8);
    }

    public final void setLimit(int i8) {
        boolean z8;
        if (i8 >= 0 && i8 <= this.data.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.limit = i8;
    }

    public final void setPosition(int i8) {
        boolean z8;
        if (i8 >= 0 && i8 <= this.limit) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.position = i8;
    }

    public final void skipBytes(int i8) {
        setPosition(this.position + i8);
    }

    public ParsableByteArray(int i8) {
        this.data = new byte[i8];
        this.limit = i8;
    }

    public final String readString(int i8, Charset charset) {
        String str = new String(this.data, this.position, i8, charset);
        this.position += i8;
        return str;
    }

    public final void reset(byte[] bArr, int i8) {
        this.data = bArr;
        this.limit = i8;
        this.position = 0;
    }

    public final void readBytes(byte[] bArr, int i8, int i9) {
        System.arraycopy(this.data, this.position, bArr, i8, i9);
        this.position += i9;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public final void readBytes(ByteBuffer byteBuffer, int i8) {
        byteBuffer.put(this.data, this.position, i8);
        this.position += i8;
    }

    public final void reset() {
        this.position = 0;
        this.limit = 0;
    }

    public final String readNullTerminatedString() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i8 = this.position;
        while (i8 < this.limit && this.data[i8] != 0) {
            i8++;
        }
        byte[] bArr = this.data;
        int i9 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i9, i8 - i9);
        this.position = i8;
        if (i8 < this.limit) {
            this.position = i8 + 1;
        }
        return fromUtf8Bytes;
    }

    public ParsableByteArray(byte[] bArr, int i8) {
        this.data = bArr;
        this.limit = i8;
    }
}
