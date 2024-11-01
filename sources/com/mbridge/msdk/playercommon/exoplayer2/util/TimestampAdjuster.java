package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes4.dex */
public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private volatile long lastSampleTimestampUs = C.TIME_UNSET;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j8) {
        setFirstSampleTimestampUs(j8);
    }

    public static long ptsToUs(long j8) {
        return (j8 * 1000000) / 90000;
    }

    public static long usToPts(long j8) {
        return (j8 * 90000) / 1000000;
    }

    public final long adjustSampleTimestamp(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            this.lastSampleTimestampUs = j8;
        } else {
            long j9 = this.firstSampleTimestampUs;
            if (j9 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j9 - j8;
            }
            synchronized (this) {
                this.lastSampleTimestampUs = j8;
                notifyAll();
            }
        }
        return j8 + this.timestampOffsetUs;
    }

    public final long adjustTsTimestamp(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            long usToPts = usToPts(this.lastSampleTimestampUs);
            long j9 = (4294967296L + usToPts) / MAX_PTS_PLUS_ONE;
            long j10 = ((j9 - 1) * MAX_PTS_PLUS_ONE) + j8;
            j8 += j9 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j10 - usToPts) < Math.abs(j8 - usToPts)) {
                j8 = j10;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j8));
    }

    public final long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public final long getLastAdjustedTimestampUs() {
        if (this.lastSampleTimestampUs != C.TIME_UNSET) {
            return this.timestampOffsetUs + this.lastSampleTimestampUs;
        }
        long j8 = this.firstSampleTimestampUs;
        if (j8 == Long.MAX_VALUE) {
            return C.TIME_UNSET;
        }
        return j8;
    }

    public final long getTimestampOffsetUs() {
        if (this.firstSampleTimestampUs == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.lastSampleTimestampUs == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return this.timestampOffsetUs;
    }

    public final void reset() {
        this.lastSampleTimestampUs = C.TIME_UNSET;
    }

    public final synchronized void setFirstSampleTimestampUs(long j8) {
        boolean z8;
        if (this.lastSampleTimestampUs == C.TIME_UNSET) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.firstSampleTimestampUs = j8;
    }

    public final synchronized void waitUntilInitialized() throws InterruptedException {
        while (this.lastSampleTimestampUs == C.TIME_UNSET) {
            wait();
        }
    }
}
