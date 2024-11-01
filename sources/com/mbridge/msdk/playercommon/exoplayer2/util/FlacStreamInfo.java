package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes4.dex */
public final class FlacStreamInfo {
    public final int bitsPerSample;
    public final int channels;
    public final int maxBlockSize;
    public final int maxFrameSize;
    public final int minBlockSize;
    public final int minFrameSize;
    public final int sampleRate;
    public final long totalSamples;

    public FlacStreamInfo(byte[] bArr, int i8) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.setPosition(i8 * 8);
        this.minBlockSize = parsableBitArray.readBits(16);
        this.maxBlockSize = parsableBitArray.readBits(16);
        this.minFrameSize = parsableBitArray.readBits(24);
        this.maxFrameSize = parsableBitArray.readBits(24);
        this.sampleRate = parsableBitArray.readBits(20);
        this.channels = parsableBitArray.readBits(3) + 1;
        this.bitsPerSample = parsableBitArray.readBits(5) + 1;
        this.totalSamples = ((parsableBitArray.readBits(4) & 15) << 32) | (parsableBitArray.readBits(32) & 4294967295L);
    }

    public final int bitRate() {
        return this.bitsPerSample * this.sampleRate;
    }

    public final long durationUs() {
        return (this.totalSamples * 1000000) / this.sampleRate;
    }

    public final long getApproxBytesPerFrame() {
        long j8;
        long j9;
        long j10;
        int i8 = this.maxFrameSize;
        if (i8 > 0) {
            j9 = (i8 + this.minFrameSize) / 2;
            j10 = 1;
        } else {
            int i9 = this.minBlockSize;
            if (i9 == this.maxBlockSize && i9 > 0) {
                j8 = i9;
            } else {
                j8 = 4096;
            }
            j9 = ((j8 * this.channels) * this.bitsPerSample) / 8;
            j10 = 64;
        }
        return j9 + j10;
    }

    public final long getSampleIndex(long j8) {
        return Util.constrainValue((j8 * this.sampleRate) / 1000000, 0L, this.totalSamples - 1);
    }

    public final int maxDecodedFrameSize() {
        return this.maxBlockSize * this.channels * (this.bitsPerSample / 8);
    }

    public FlacStreamInfo(int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8) {
        this.minBlockSize = i8;
        this.maxBlockSize = i9;
        this.minFrameSize = i10;
        this.maxFrameSize = i11;
        this.sampleRate = i12;
        this.channels = i13;
        this.bitsPerSample = i14;
        this.totalSamples = j8;
    }
}
