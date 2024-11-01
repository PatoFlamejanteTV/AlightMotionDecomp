package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class WavHeader implements SeekMap {
    private final int averageBytesPerSecond;
    private final int bitsPerSample;
    private final int blockAlignment;
    private long dataSize;
    private long dataStartPosition;
    private final int encoding;
    private final int numChannels;
    private final int sampleRateHz;

    public WavHeader(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.numChannels = i8;
        this.sampleRateHz = i9;
        this.averageBytesPerSecond = i10;
        this.blockAlignment = i11;
        this.bitsPerSample = i12;
        this.encoding = i13;
    }

    public final int getBitrate() {
        return this.sampleRateHz * this.bitsPerSample * this.numChannels;
    }

    public final int getBytesPerFrame() {
        return this.blockAlignment;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return ((this.dataSize / this.blockAlignment) * 1000000) / this.sampleRateHz;
    }

    public final int getEncoding() {
        return this.encoding;
    }

    public final int getNumChannels() {
        return this.numChannels;
    }

    public final int getSampleRateHz() {
        return this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j8) {
        int i8 = this.blockAlignment;
        long constrainValue = Util.constrainValue((((this.averageBytesPerSecond * j8) / 1000000) / i8) * i8, 0L, this.dataSize - i8);
        long j9 = this.dataStartPosition + constrainValue;
        long timeUs = getTimeUs(j9);
        SeekPoint seekPoint = new SeekPoint(timeUs, j9);
        if (timeUs < j8) {
            long j10 = this.dataSize;
            int i9 = this.blockAlignment;
            if (constrainValue != j10 - i9) {
                long j11 = j9 + i9;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j11), j11));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public final long getTimeUs(long j8) {
        return (Math.max(0L, j8 - this.dataStartPosition) * 1000000) / this.averageBytesPerSecond;
    }

    public final boolean hasDataBounds() {
        if (this.dataStartPosition != 0 && this.dataSize != 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public final void setDataBounds(long j8, long j9) {
        this.dataStartPosition = j8;
        this.dataSize = j9;
    }
}
