package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;

/* loaded from: classes4.dex */
abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final ShuffleOrder shuffleOrder;

    public AbstractConcatenatedTimeline(boolean z8, ShuffleOrder shuffleOrder) {
        this.isAtomic = z8;
        this.shuffleOrder = shuffleOrder;
        this.childCount = shuffleOrder.getLength();
    }

    private int getNextChildIndex(int i8, boolean z8) {
        if (z8) {
            return this.shuffleOrder.getNextIndex(i8);
        }
        if (i8 < this.childCount - 1) {
            return i8 + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i8, boolean z8) {
        if (z8) {
            return this.shuffleOrder.getPreviousIndex(i8);
        }
        if (i8 > 0) {
            return i8 - 1;
        }
        return -1;
    }

    protected abstract int getChildIndexByChildUid(Object obj);

    protected abstract int getChildIndexByPeriodIndex(int i8);

    protected abstract int getChildIndexByWindowIndex(int i8);

    protected abstract Object getChildUidByChildIndex(int i8);

    protected abstract int getFirstPeriodIndexByChildIndex(int i8);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z8) {
        if (this.childCount == 0) {
            return -1;
        }
        int i8 = 0;
        if (this.isAtomic) {
            z8 = false;
        }
        if (z8) {
            i8 = this.shuffleOrder.getFirstIndex();
        }
        while (getTimelineByChildIndex(i8).isEmpty()) {
            i8 = getNextChildIndex(i8, z8);
            if (i8 == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(i8) + getTimelineByChildIndex(i8).getFirstWindowIndex(z8);
    }

    protected abstract int getFirstWindowIndexByChildIndex(int i8);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int childIndexByChildUid = getChildIndexByChildUid(obj2);
        if (childIndexByChildUid == -1 || (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(obj3)) == -1) {
            return -1;
        }
        return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z8) {
        int i8;
        int i9 = this.childCount;
        if (i9 == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z8 = false;
        }
        if (z8) {
            i8 = this.shuffleOrder.getLastIndex();
        } else {
            i8 = i9 - 1;
        }
        while (getTimelineByChildIndex(i8).isEmpty()) {
            i8 = getPreviousChildIndex(i8, z8);
            if (i8 == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(i8) + getTimelineByChildIndex(i8).getLastWindowIndex(z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getNextWindowIndex(int i8, int i9, boolean z8) {
        int i10 = 0;
        if (this.isAtomic) {
            if (i9 == 1) {
                i9 = 2;
            }
            z8 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i8);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        Timeline timelineByChildIndex = getTimelineByChildIndex(childIndexByWindowIndex);
        int i11 = i8 - firstWindowIndexByChildIndex;
        if (i9 != 2) {
            i10 = i9;
        }
        int nextWindowIndex = timelineByChildIndex.getNextWindowIndex(i11, i10, z8);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(childIndexByWindowIndex, z8);
        while (nextChildIndex != -1 && getTimelineByChildIndex(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z8);
        }
        if (nextChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(nextChildIndex) + getTimelineByChildIndex(nextChildIndex).getFirstWindowIndex(z8);
        }
        if (i9 != 2) {
            return -1;
        }
        return getFirstWindowIndex(z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i8, Timeline.Period period, boolean z8) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i8);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(i8 - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), period, z8);
        period.windowIndex += firstWindowIndexByChildIndex;
        if (z8) {
            period.uid = Pair.create(getChildUidByChildIndex(childIndexByPeriodIndex), period.uid);
        }
        return period;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i8, int i9, boolean z8) {
        int i10 = 0;
        if (this.isAtomic) {
            if (i9 == 1) {
                i9 = 2;
            }
            z8 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i8);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        Timeline timelineByChildIndex = getTimelineByChildIndex(childIndexByWindowIndex);
        int i11 = i8 - firstWindowIndexByChildIndex;
        if (i9 != 2) {
            i10 = i9;
        }
        int previousWindowIndex = timelineByChildIndex.getPreviousWindowIndex(i11, i10, z8);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(childIndexByWindowIndex, z8);
        while (previousChildIndex != -1 && getTimelineByChildIndex(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z8);
        }
        if (previousChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(previousChildIndex) + getTimelineByChildIndex(previousChildIndex).getLastWindowIndex(z8);
        }
        if (i9 != 2) {
            return -1;
        }
        return getLastWindowIndex(z8);
    }

    protected abstract Timeline getTimelineByChildIndex(int i8);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i8, Timeline.Window window, boolean z8, long j8) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i8);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(i8 - firstWindowIndexByChildIndex, window, z8, j8);
        window.firstPeriodIndex += firstPeriodIndexByChildIndex;
        window.lastPeriodIndex += firstPeriodIndexByChildIndex;
        return window;
    }
}
