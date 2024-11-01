package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final long[] timestampsUs;
    public final Track track;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i8, long[] jArr2, int[] iArr2, long j8) {
        boolean z8;
        boolean z9;
        if (iArr.length == jArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        if (jArr.length == jArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        Assertions.checkArgument(z9);
        Assertions.checkArgument(iArr2.length == jArr2.length);
        this.track = track;
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i8;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.durationUs = j8;
        this.sampleCount = jArr.length;
    }

    public final int getIndexOfEarlierOrEqualSynchronizationSample(long j8) {
        for (int binarySearchFloor = Util.binarySearchFloor(this.timestampsUs, j8, true, false); binarySearchFloor >= 0; binarySearchFloor--) {
            if ((this.flags[binarySearchFloor] & 1) != 0) {
                return binarySearchFloor;
            }
        }
        return -1;
    }

    public final int getIndexOfLaterOrEqualSynchronizationSample(long j8) {
        for (int binarySearchCeil = Util.binarySearchCeil(this.timestampsUs, j8, true, false); binarySearchCeil < this.timestampsUs.length; binarySearchCeil++) {
            if ((this.flags[binarySearchCeil] & 1) != 0) {
                return binarySearchCeil;
            }
        }
        return -1;
    }
}
