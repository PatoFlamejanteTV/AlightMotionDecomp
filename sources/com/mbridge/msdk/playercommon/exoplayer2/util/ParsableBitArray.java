package com.mbridge.msdk.playercommon.exoplayer2.util;

import androidx.core.view.MotionEventCompat;

/* loaded from: classes4.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
    }

    private void assertValidOffset() {
        boolean z8;
        int i8;
        int i9 = this.byteOffset;
        if (i9 >= 0 && (i9 < (i8 = this.byteLimit) || (i9 == i8 && this.bitOffset == 0))) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
    }

    public final int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public final void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public final int getBytePosition() {
        boolean z8;
        if (this.bitOffset == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        return this.byteOffset;
    }

    public final int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public final void putInt(int i8, int i9) {
        if (i9 < 32) {
            i8 &= (1 << i9) - 1;
        }
        int min = Math.min(8 - this.bitOffset, i9);
        int i10 = this.bitOffset;
        int i11 = (8 - i10) - min;
        int i12 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i10) | ((1 << i11) - 1);
        byte[] bArr = this.data;
        int i13 = this.byteOffset;
        byte b9 = (byte) (i12 & bArr[i13]);
        bArr[i13] = b9;
        int i14 = i9 - min;
        bArr[i13] = (byte) (b9 | ((i8 >>> i14) << i11));
        int i15 = i13 + 1;
        while (i14 > 8) {
            this.data[i15] = (byte) (i8 >>> (i14 - 8));
            i14 -= 8;
            i15++;
        }
        int i16 = 8 - i14;
        byte[] bArr2 = this.data;
        byte b10 = (byte) (bArr2[i15] & ((1 << i16) - 1));
        bArr2[i15] = b10;
        bArr2[i15] = (byte) (((i8 & ((1 << i14) - 1)) << i16) | b10);
        skipBits(i9);
        assertValidOffset();
    }

    public final boolean readBit() {
        boolean z8;
        if ((this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        skipBit();
        return z8;
    }

    public final int readBits(int i8) {
        int i9;
        if (i8 == 0) {
            return 0;
        }
        this.bitOffset += i8;
        int i10 = 0;
        while (true) {
            i9 = this.bitOffset;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.bitOffset = i11;
            byte[] bArr = this.data;
            int i12 = this.byteOffset;
            this.byteOffset = i12 + 1;
            i10 |= (bArr[i12] & 255) << i11;
        }
        byte[] bArr2 = this.data;
        int i13 = this.byteOffset;
        int i14 = ((-1) >>> (32 - i8)) & (i10 | ((bArr2[i13] & 255) >> (8 - i9)));
        if (i9 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i13 + 1;
        }
        assertValidOffset();
        return i14;
    }

    public final void readBytes(byte[] bArr, int i8, int i9) {
        boolean z8;
        if (this.bitOffset == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        System.arraycopy(this.data, this.byteOffset, bArr, i8, i9);
        this.byteOffset += i9;
        assertValidOffset();
    }

    public final void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public final void setPosition(int i8) {
        int i9 = i8 / 8;
        this.byteOffset = i9;
        this.bitOffset = i8 - (i9 * 8);
        assertValidOffset();
    }

    public final void skipBit() {
        int i8 = this.bitOffset + 1;
        this.bitOffset = i8;
        if (i8 == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
        assertValidOffset();
    }

    public final void skipBits(int i8) {
        int i9 = i8 / 8;
        int i10 = this.byteOffset + i9;
        this.byteOffset = i10;
        int i11 = this.bitOffset + (i8 - (i9 * 8));
        this.bitOffset = i11;
        if (i11 > 7) {
            this.byteOffset = i10 + 1;
            this.bitOffset = i11 - 8;
        }
        assertValidOffset();
    }

    public final void skipBytes(int i8) {
        boolean z8;
        if (this.bitOffset == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.byteOffset += i8;
        assertValidOffset();
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public final void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.data, parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] bArr, int i8) {
        this.data = bArr;
        this.byteLimit = i8;
    }

    public final void reset(byte[] bArr, int i8) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i8;
    }

    public final void readBits(byte[] bArr, int i8, int i9) {
        int i10 = (i9 >> 3) + i8;
        while (i8 < i10) {
            byte[] bArr2 = this.data;
            int i11 = this.byteOffset;
            int i12 = i11 + 1;
            this.byteOffset = i12;
            byte b9 = bArr2[i11];
            int i13 = this.bitOffset;
            byte b10 = (byte) (b9 << i13);
            bArr[i8] = b10;
            bArr[i8] = (byte) (((255 & bArr2[i12]) >> (8 - i13)) | b10);
            i8++;
        }
        int i14 = i9 & 7;
        if (i14 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (255 >> i14));
        bArr[i10] = b11;
        int i15 = this.bitOffset;
        if (i15 + i14 > 8) {
            byte[] bArr3 = this.data;
            int i16 = this.byteOffset;
            this.byteOffset = i16 + 1;
            bArr[i10] = (byte) (b11 | ((bArr3[i16] & 255) << i15));
            this.bitOffset = i15 - 8;
        }
        int i17 = this.bitOffset + i14;
        this.bitOffset = i17;
        byte[] bArr4 = this.data;
        int i18 = this.byteOffset;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i18]) >> (8 - i17)) << (8 - i14))) | bArr[i10]);
        if (i17 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i18 + 1;
        }
        assertValidOffset();
    }
}
