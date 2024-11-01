package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.Timeline;

/* loaded from: classes4.dex */
public abstract class ForwardingTimeline extends Timeline {
    protected final Timeline timeline;

    public ForwardingTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z8) {
        return this.timeline.getFirstWindowIndex(z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z8) {
        return this.timeline.getLastWindowIndex(z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getNextWindowIndex(int i8, int i9, boolean z8) {
        return this.timeline.getNextWindowIndex(i8, i9, z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i8, Timeline.Period period, boolean z8) {
        return this.timeline.getPeriod(i8, period, z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i8, int i9, boolean z8) {
        return this.timeline.getPreviousWindowIndex(i8, i9, z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public Timeline.Window getWindow(int i8, Timeline.Window window, boolean z8, long j8) {
        return this.timeline.getWindow(i8, window, z8, j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }
}
