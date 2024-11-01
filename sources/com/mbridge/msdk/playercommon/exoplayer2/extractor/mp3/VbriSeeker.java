package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class VbriSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "VbriSeeker";
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j8) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j8;
    }

    public static VbriSeeker create(long j8, long j9, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int i8;
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0) {
            return null;
        }
        int i9 = mpegAudioHeader.sampleRate;
        long j10 = readInt;
        if (i9 >= 32000) {
            i8 = 1152;
        } else {
            i8 = 576;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j10, i8 * 1000000, i9);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j11 = j9 + mpegAudioHeader.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long j12 = j9;
        int i10 = 0;
        while (i10 < readUnsignedShort) {
            long j13 = j11;
            long j14 = scaleLargeTimestamp;
            jArr[i10] = (i10 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i10] = Math.max(j12, j13);
            if (readUnsignedShort3 != 1) {
                if (readUnsignedShort3 != 2) {
                    if (readUnsignedShort3 != 3) {
                        if (readUnsignedShort3 != 4) {
                            return null;
                        }
                        readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
                    } else {
                        readUnsignedByte = parsableByteArray.readUnsignedInt24();
                    }
                } else {
                    readUnsignedByte = parsableByteArray.readUnsignedShort();
                }
            } else {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            }
            j12 += readUnsignedByte * readUnsignedShort2;
            i10++;
            j11 = j13;
            scaleLargeTimestamp = j14;
        }
        long j15 = scaleLargeTimestamp;
        if (j8 != -1 && j8 != j12) {
            Log.w(TAG, "VBRI data size mismatch: " + j8 + ", " + j12);
        }
        return new VbriSeeker(jArr, jArr2, j15);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j8) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j8, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs < j8 && binarySearchFloor != this.timesUs.length - 1) {
            int i8 = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i8], this.positions[i8]));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j8) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j8, true, true)];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
