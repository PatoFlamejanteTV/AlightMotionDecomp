package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes4.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] bArr, int i8, int i9) {
        reset(bArr, i8, i9);
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

    private int readExpGolombCodeNum() {
        int i8 = 0;
        int i9 = 0;
        while (!readBit()) {
            i9++;
        }
        int i10 = (1 << i9) - 1;
        if (i9 > 0) {
            i8 = readBits(i9);
        }
        return i10 + i8;
    }

    private boolean shouldSkipByte(int i8) {
        if (2 <= i8 && i8 < this.byteLimit) {
            byte[] bArr = this.data;
            if (bArr[i8] == 3 && bArr[i8 - 2] == 0 && bArr[i8 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean canReadBits(int i8) {
        int i9 = this.byteOffset;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        int i12 = (this.bitOffset + i8) - (i10 * 8);
        if (i12 > 7) {
            i11++;
            i12 -= 8;
        }
        while (true) {
            i9++;
            if (i9 > i11 || i11 >= this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i9)) {
                i11++;
                i9 += 2;
            }
        }
        int i13 = this.byteLimit;
        if (i11 < i13) {
            return true;
        }
        if (i11 == i13 && i12 == 0) {
            return true;
        }
        return false;
    }

    public final boolean canReadExpGolombCodedNum() {
        boolean z8;
        int i8 = this.byteOffset;
        int i9 = this.bitOffset;
        int i10 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i10++;
        }
        if (this.byteOffset == this.byteLimit) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.byteOffset = i8;
        this.bitOffset = i9;
        if (z8 || !canReadBits((i10 * 2) + 1)) {
            return false;
        }
        return true;
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
        int i10;
        this.bitOffset += i8;
        int i11 = 0;
        while (true) {
            i9 = this.bitOffset;
            i10 = 2;
            if (i9 <= 8) {
                break;
            }
            int i12 = i9 - 8;
            this.bitOffset = i12;
            byte[] bArr = this.data;
            int i13 = this.byteOffset;
            i11 |= (bArr[i13] & 255) << i12;
            if (!shouldSkipByte(i13 + 1)) {
                i10 = 1;
            }
            this.byteOffset = i13 + i10;
        }
        byte[] bArr2 = this.data;
        int i14 = this.byteOffset;
        int i15 = ((-1) >>> (32 - i8)) & (i11 | ((bArr2[i14] & 255) >> (8 - i9)));
        if (i9 == 8) {
            this.bitOffset = 0;
            if (!shouldSkipByte(i14 + 1)) {
                i10 = 1;
            }
            this.byteOffset = i14 + i10;
        }
        assertValidOffset();
        return i15;
    }

    public final int readSignedExpGolombCodedInt() {
        int i8;
        int readExpGolombCodeNum = readExpGolombCodeNum();
        if (readExpGolombCodeNum % 2 == 0) {
            i8 = -1;
        } else {
            i8 = 1;
        }
        return i8 * ((readExpGolombCodeNum + 1) / 2);
    }

    public final int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public final void reset(byte[] bArr, int i8, int i9) {
        this.data = bArr;
        this.byteOffset = i8;
        this.byteLimit = i9;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public final void skipBit() {
        int i8 = 1;
        int i9 = this.bitOffset + 1;
        this.bitOffset = i9;
        if (i9 == 8) {
            this.bitOffset = 0;
            int i10 = this.byteOffset;
            if (shouldSkipByte(i10 + 1)) {
                i8 = 2;
            }
            this.byteOffset = i10 + i8;
        }
        assertValidOffset();
    }

    public final void skipBits(int i8) {
        int i9 = this.byteOffset;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        this.byteOffset = i11;
        int i12 = this.bitOffset + (i8 - (i10 * 8));
        this.bitOffset = i12;
        if (i12 > 7) {
            this.byteOffset = i11 + 1;
            this.bitOffset = i12 - 8;
        }
        while (true) {
            i9++;
            if (i9 <= this.byteOffset) {
                if (shouldSkipByte(i9)) {
                    this.byteOffset++;
                    i9 += 2;
                }
            } else {
                assertValidOffset();
                return;
            }
        }
    }
}
