package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
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

    public final int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public final boolean readBit() {
        boolean z8;
        if ((((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        skipBits(1);
        return z8;
    }

    public final int readBits(int i8) {
        int i9 = this.byteOffset;
        int min = Math.min(i8, 8 - this.bitOffset);
        int i10 = i9 + 1;
        int i11 = ((this.data[i9] & 255) >> this.bitOffset) & (255 >> (8 - min));
        while (min < i8) {
            i11 |= (this.data[i10] & 255) << min;
            min += 8;
            i10++;
        }
        int i12 = i11 & ((-1) >>> (32 - i8));
        skipBits(i8);
        return i12;
    }

    public final void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public final void setPosition(int i8) {
        int i9 = i8 / 8;
        this.byteOffset = i9;
        this.bitOffset = i8 - (i9 * 8);
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
}
