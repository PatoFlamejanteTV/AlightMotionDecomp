package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class XingSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j8, int i8, long j9) {
        this(j8, i8, j9, -1L, null);
    }

    public static XingSeeker create(long j8, long j9, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt;
        int i8 = mpegAudioHeader.samplesPerFrame;
        int i9 = mpegAudioHeader.sampleRate;
        int readInt = parsableByteArray.readInt();
        if ((readInt & 1) == 1 && (readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) != 0) {
            long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedIntToInt, i8 * 1000000, i9);
            if ((readInt & 6) != 6) {
                return new XingSeeker(j9, mpegAudioHeader.frameSize, scaleLargeTimestamp);
            }
            long readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            long[] jArr = new long[100];
            for (int i10 = 0; i10 < 100; i10++) {
                jArr[i10] = parsableByteArray.readUnsignedByte();
            }
            if (j8 != -1) {
                long j10 = j9 + readUnsignedIntToInt2;
                if (j8 != j10) {
                    Log.w(TAG, "XING data size mismatch: " + j8 + ", " + j10);
                }
            }
            return new XingSeeker(j9, mpegAudioHeader.frameSize, scaleLargeTimestamp, readUnsignedIntToInt2, jArr);
        }
        return null;
    }

    private long getTimeUsForTableIndex(int i8) {
        return (this.durationUs * i8) / 100;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j8) {
        double d8;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long constrainValue = Util.constrainValue(j8, 0L, this.durationUs);
        double d9 = (constrainValue * 100.0d) / this.durationUs;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i8 = (int) d9;
                long[] jArr = this.tableOfContents;
                double d11 = jArr[i8];
                if (i8 == 99) {
                    d8 = 256.0d;
                } else {
                    d8 = jArr[i8 + 1];
                }
                d10 = d11 + ((d9 - i8) * (d8 - d11));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d10 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j8) {
        long j9;
        double d8;
        long j10 = j8 - this.dataStartPosition;
        if (isSeekable() && j10 > this.xingFrameSize) {
            double d9 = (j10 * 256.0d) / this.dataSize;
            int binarySearchFloor = Util.binarySearchFloor(this.tableOfContents, (long) d9, true, true);
            long timeUsForTableIndex = getTimeUsForTableIndex(binarySearchFloor);
            long j11 = this.tableOfContents[binarySearchFloor];
            int i8 = binarySearchFloor + 1;
            long timeUsForTableIndex2 = getTimeUsForTableIndex(i8);
            if (binarySearchFloor == 99) {
                j9 = 256;
            } else {
                j9 = this.tableOfContents[i8];
            }
            if (j11 == j9) {
                d8 = 0.0d;
            } else {
                d8 = (d9 - j11) / (j9 - j11);
            }
            return timeUsForTableIndex + Math.round(d8 * (timeUsForTableIndex2 - timeUsForTableIndex));
        }
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        if (this.tableOfContents != null) {
            return true;
        }
        return false;
    }

    private XingSeeker(long j8, int i8, long j9, long j10, long[] jArr) {
        this.dataStartPosition = j8;
        this.xingFrameSize = i8;
        this.durationUs = j9;
        this.dataSize = j10;
        this.tableOfContents = jArr;
    }
}
