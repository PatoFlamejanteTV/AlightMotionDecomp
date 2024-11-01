package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class SinglePeriodTimeline extends Timeline {
    private static final Object UID = new Object();
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final Object tag;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    public SinglePeriodTimeline(long j8, boolean z8, boolean z9) {
        this(j8, z8, z9, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        if (UID.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i8, Timeline.Period period, boolean z8) {
        Object obj;
        Assertions.checkIndex(i8, 0, 1);
        if (z8) {
            obj = UID;
        } else {
            obj = null;
        }
        return period.set(null, obj, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final int getPeriodCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:            if (r1 > r4) goto L13;     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.playercommon.exoplayer2.Timeline.Window getWindow(int r19, com.mbridge.msdk.playercommon.exoplayer2.Timeline.Window r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkIndex(r3, r1, r2)
            if (r21 == 0) goto Lf
            java.lang.Object r1 = r0.tag
        Ld:
            r3 = r1
            goto L11
        Lf:
            r1 = 0
            goto Ld
        L11:
            long r1 = r0.windowDefaultStartPositionUs
            boolean r9 = r0.isDynamic
            if (r9 == 0) goto L31
            r4 = 0
            int r6 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r6 == 0) goto L31
            long r4 = r0.windowDurationUs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2a
        L28:
            r10 = r6
            goto L32
        L2a:
            long r1 = r1 + r22
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L31
            goto L28
        L31:
            r10 = r1
        L32:
            long r4 = r0.presentationStartTimeMs
            long r6 = r0.windowStartTimeMs
            boolean r8 = r0.isSeekable
            long r12 = r0.windowDurationUs
            r15 = 0
            long r1 = r0.windowPositionInPeriodUs
            r14 = 0
            r16 = r1
            r2 = r20
            com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window r1 = r2.set(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.source.SinglePeriodTimeline.getWindow(int, com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window, boolean, long):com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j8, boolean z8, boolean z9, Object obj) {
        this(j8, j8, 0L, 0L, z8, z9, obj);
    }

    public SinglePeriodTimeline(long j8, long j9, long j10, long j11, boolean z8, boolean z9, Object obj) {
        this(C.TIME_UNSET, C.TIME_UNSET, j8, j9, j10, j11, z8, z9, obj);
    }

    public SinglePeriodTimeline(long j8, long j9, long j10, long j11, long j12, long j13, boolean z8, boolean z9, Object obj) {
        this.presentationStartTimeMs = j8;
        this.windowStartTimeMs = j9;
        this.periodDurationUs = j10;
        this.windowDurationUs = j11;
        this.windowPositionInPeriodUs = j12;
        this.windowDefaultStartPositionUs = j13;
        this.isSeekable = z8;
        this.isDynamic = z9;
        this.tag = obj;
    }
}
