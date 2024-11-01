package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;

/* loaded from: classes4.dex */
final class MediaPeriodInfo {
    public final long contentPositionUs;
    public final long durationUs;
    public final long endPositionUs;
    public final MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final long startPositionUs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j8, long j9, long j10, long j11, boolean z8, boolean z9) {
        this.id = mediaPeriodId;
        this.startPositionUs = j8;
        this.endPositionUs = j9;
        this.contentPositionUs = j10;
        this.durationUs = j11;
        this.isLastInTimelinePeriod = z8;
        this.isFinal = z9;
    }

    public final MediaPeriodInfo copyWithPeriodIndex(int i8) {
        return new MediaPeriodInfo(this.id.copyWithPeriodIndex(i8), this.startPositionUs, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }

    public final MediaPeriodInfo copyWithStartPositionUs(long j8) {
        return new MediaPeriodInfo(this.id, j8, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }
}
