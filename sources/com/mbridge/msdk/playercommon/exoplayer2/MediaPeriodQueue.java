package com.mbridge.msdk.playercommon.exoplayer2;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
final class MediaPeriodQueue {
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private int length;
    private MediaPeriodHolder loading;
    private long nextWindowSequenceNumber;
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private MediaPeriodHolder playing;
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private Timeline timeline;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();

    private boolean canKeepMediaPeriodHolder(MediaPeriodHolder mediaPeriodHolder, MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
        if (mediaPeriodInfo2.startPositionUs == mediaPeriodInfo.startPositionUs && mediaPeriodInfo2.endPositionUs == mediaPeriodInfo.endPositionUs && mediaPeriodInfo2.id.equals(mediaPeriodInfo.id)) {
            return true;
        }
        return false;
    }

    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.periodId, playbackInfo.contentPositionUs, playbackInfo.startPositionUs);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfo(MediaPeriodHolder mediaPeriodHolder, long j8) {
        int i8;
        long j9;
        long j10;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        if (mediaPeriodInfo.isLastInTimelinePeriod) {
            int nextPeriodIndex = this.timeline.getNextPeriodIndex(mediaPeriodInfo.id.periodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            if (nextPeriodIndex == -1) {
                return null;
            }
            int i9 = this.timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
            Object obj = this.period.uid;
            long j11 = mediaPeriodInfo.id.windowSequenceNumber;
            long j12 = 0;
            if (this.timeline.getWindow(i9, this.window).firstPeriodIndex == nextPeriodIndex) {
                Pair<Integer, Long> periodPosition = this.timeline.getPeriodPosition(this.window, this.period, i9, C.TIME_UNSET, Math.max(0L, (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j8));
                if (periodPosition == null) {
                    return null;
                }
                int intValue = ((Integer) periodPosition.first).intValue();
                long longValue = ((Long) periodPosition.second).longValue();
                MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.next;
                if (mediaPeriodHolder2 != null && mediaPeriodHolder2.uid.equals(obj)) {
                    j10 = mediaPeriodHolder.next.info.id.windowSequenceNumber;
                } else {
                    j10 = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + j10;
                }
                j12 = longValue;
                j9 = j10;
                i8 = intValue;
            } else {
                i8 = nextPeriodIndex;
                j9 = j11;
            }
            long j13 = j12;
            return getMediaPeriodInfo(resolveMediaPeriodIdForAds(i8, j13, j9), j13, j12);
        }
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        if (mediaPeriodId.isAd()) {
            int i10 = mediaPeriodId.adGroupIndex;
            int adCountInAdGroup = this.period.getAdCountInAdGroup(i10);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i10, mediaPeriodId.adIndexInAdGroup);
            if (nextAdIndexToPlay < adCountInAdGroup) {
                if (!this.period.isAdAvailable(i10, nextAdIndexToPlay)) {
                    return null;
                }
                return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, i10, nextAdIndexToPlay, mediaPeriodInfo.contentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            return getMediaPeriodInfoForContent(mediaPeriodId.periodIndex, mediaPeriodInfo.contentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        long j14 = mediaPeriodInfo.endPositionUs;
        if (j14 != Long.MIN_VALUE) {
            int adGroupIndexForPositionUs = this.period.getAdGroupIndexForPositionUs(j14);
            if (adGroupIndexForPositionUs == -1) {
                return getMediaPeriodInfoForContent(mediaPeriodId.periodIndex, mediaPeriodInfo.endPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(adGroupIndexForPositionUs);
            if (!this.period.isAdAvailable(adGroupIndexForPositionUs, firstAdIndexToPlay)) {
                return null;
            }
            return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, adGroupIndexForPositionUs, firstAdIndexToPlay, mediaPeriodInfo.endPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        int adGroupCount = this.period.getAdGroupCount();
        if (adGroupCount == 0) {
            return null;
        }
        int i11 = adGroupCount - 1;
        if (this.period.getAdGroupTimeUs(i11) != Long.MIN_VALUE || this.period.hasPlayedAdGroup(i11)) {
            return null;
        }
        int firstAdIndexToPlay2 = this.period.getFirstAdIndexToPlay(i11);
        if (!this.period.isAdAvailable(i11, firstAdIndexToPlay2)) {
            return null;
        }
        return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, i11, firstAdIndexToPlay2, this.period.getDurationUs(), mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j8, long j9) {
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        if (mediaPeriodId.isAd()) {
            if (!this.period.isAdAvailable(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup)) {
                return null;
            }
            return getMediaPeriodInfoForAd(mediaPeriodId.periodIndex, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j8, mediaPeriodId.windowSequenceNumber);
        }
        return getMediaPeriodInfoForContent(mediaPeriodId.periodIndex, j9, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(int i8, int i9, int i10, long j8, long j9) {
        long j10;
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(i8, i9, i10, j9);
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId, Long.MIN_VALUE);
        boolean isLastInTimeline = isLastInTimeline(mediaPeriodId, isLastInPeriod);
        long adDurationUs = this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        if (i10 == this.period.getFirstAdIndexToPlay(i9)) {
            j10 = this.period.getAdResumePositionUs();
        } else {
            j10 = 0;
        }
        return new MediaPeriodInfo(mediaPeriodId, j10, Long.MIN_VALUE, j8, adDurationUs, isLastInPeriod, isLastInTimeline);
    }

    private MediaPeriodInfo getMediaPeriodInfoForContent(int i8, long j8, long j9) {
        long adGroupTimeUs;
        long j10;
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(i8, j9);
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j8);
        if (adGroupIndexAfterPositionUs == -1) {
            adGroupTimeUs = Long.MIN_VALUE;
        } else {
            adGroupTimeUs = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        }
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId, adGroupTimeUs);
        boolean isLastInTimeline = isLastInTimeline(mediaPeriodId, isLastInPeriod);
        if (adGroupTimeUs == Long.MIN_VALUE) {
            j10 = this.period.getDurationUs();
        } else {
            j10 = adGroupTimeUs;
        }
        return new MediaPeriodInfo(mediaPeriodId, j8, adGroupTimeUs, C.TIME_UNSET, j10, isLastInPeriod, isLastInTimeline);
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId, long j8) {
        int adGroupCount = this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period).getAdGroupCount();
        if (adGroupCount == 0) {
            return true;
        }
        int i8 = adGroupCount - 1;
        boolean isAd = mediaPeriodId.isAd();
        if (this.period.getAdGroupTimeUs(i8) != Long.MIN_VALUE) {
            if (!isAd && j8 == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i8);
        if (adCountInAdGroup == -1) {
            return false;
        }
        if (isAd && mediaPeriodId.adGroupIndex == i8 && mediaPeriodId.adIndexInAdGroup == adCountInAdGroup - 1) {
            return true;
        }
        if (!isAd && this.period.getFirstAdIndexToPlay(i8) == adCountInAdGroup) {
            return true;
        }
        return false;
    }

    private boolean isLastInTimeline(MediaSource.MediaPeriodId mediaPeriodId, boolean z8) {
        if (!this.timeline.getWindow(this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period).windowIndex, this.window).isDynamic && this.timeline.isLastPeriod(mediaPeriodId.periodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z8) {
            return true;
        }
        return false;
    }

    private long resolvePeriodIndexToWindowSequenceNumber(int i8) {
        int indexOfPeriod;
        Object obj = this.timeline.getPeriod(i8, this.period, true).uid;
        int i9 = this.period.windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = this.timeline.getIndexOfPeriod(obj2)) != -1 && this.timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i9) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder frontPeriod = getFrontPeriod(); frontPeriod != null; frontPeriod = frontPeriod.next) {
            if (frontPeriod.uid.equals(obj)) {
                return frontPeriod.info.id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder frontPeriod2 = getFrontPeriod(); frontPeriod2 != null; frontPeriod2 = frontPeriod2.next) {
            int indexOfPeriod2 = this.timeline.getIndexOfPeriod(frontPeriod2.uid);
            if (indexOfPeriod2 != -1 && this.timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i9) {
                return frontPeriod2.info.id.windowSequenceNumber;
            }
        }
        long j8 = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j8;
        return j8;
    }

    private boolean updateForPlaybackModeChange() {
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder frontPeriod = getFrontPeriod();
        if (frontPeriod == null) {
            return true;
        }
        while (true) {
            int nextPeriodIndex = this.timeline.getNextPeriodIndex(frontPeriod.info.id.periodIndex, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (true) {
                mediaPeriodHolder = frontPeriod.next;
                if (mediaPeriodHolder == null || frontPeriod.info.isLastInTimelinePeriod) {
                    break;
                }
                frontPeriod = mediaPeriodHolder;
            }
            if (nextPeriodIndex == -1 || mediaPeriodHolder == null || mediaPeriodHolder.info.id.periodIndex != nextPeriodIndex) {
                break;
            }
            frontPeriod = mediaPeriodHolder;
        }
        boolean removeAfter = removeAfter(frontPeriod);
        MediaPeriodInfo mediaPeriodInfo = frontPeriod.info;
        frontPeriod.info = getUpdatedMediaPeriodInfo(mediaPeriodInfo, mediaPeriodInfo.id);
        if (!removeAfter || !hasPlayingPeriod()) {
            return true;
        }
        return false;
    }

    public final MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder != null) {
            if (mediaPeriodHolder == this.reading) {
                this.reading = mediaPeriodHolder.next;
            }
            mediaPeriodHolder.release();
            int i8 = this.length - 1;
            this.length = i8;
            if (i8 == 0) {
                this.loading = null;
                MediaPeriodHolder mediaPeriodHolder2 = this.playing;
                this.oldFrontPeriodUid = mediaPeriodHolder2.uid;
                this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder2.info.id.windowSequenceNumber;
            }
            this.playing = this.playing.next;
        } else {
            MediaPeriodHolder mediaPeriodHolder3 = this.loading;
            this.playing = mediaPeriodHolder3;
            this.reading = mediaPeriodHolder3;
        }
        return this.playing;
    }

    public final MediaPeriodHolder advanceReadingPeriod() {
        boolean z8;
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        if (mediaPeriodHolder != null && mediaPeriodHolder.next != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        MediaPeriodHolder mediaPeriodHolder2 = this.reading.next;
        this.reading = mediaPeriodHolder2;
        return mediaPeriodHolder2;
    }

    public final void clear(boolean z8) {
        Object obj;
        MediaPeriodHolder frontPeriod = getFrontPeriod();
        if (frontPeriod != null) {
            if (z8) {
                obj = frontPeriod.uid;
            } else {
                obj = null;
            }
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = frontPeriod.info.id.windowSequenceNumber;
            frontPeriod.release();
            removeAfter(frontPeriod);
        } else if (!z8) {
            this.oldFrontPeriodUid = null;
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
    }

    public final MediaPeriod enqueueNextMediaPeriod(RendererCapabilities[] rendererCapabilitiesArr, TrackSelector trackSelector, Allocator allocator, MediaSource mediaSource, Object obj, MediaPeriodInfo mediaPeriodInfo) {
        long rendererOffset;
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder == null) {
            rendererOffset = mediaPeriodInfo.startPositionUs;
        } else {
            rendererOffset = mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs;
        }
        MediaPeriodHolder mediaPeriodHolder2 = new MediaPeriodHolder(rendererCapabilitiesArr, rendererOffset, trackSelector, allocator, mediaSource, obj, mediaPeriodInfo);
        if (this.loading != null) {
            Assertions.checkState(hasPlayingPeriod());
            this.loading.next = mediaPeriodHolder2;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolder2;
        this.length++;
        return mediaPeriodHolder2.mediaPeriod;
    }

    public final MediaPeriodHolder getFrontPeriod() {
        if (hasPlayingPeriod()) {
            return this.playing;
        }
        return this.loading;
    }

    public final MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public final MediaPeriodInfo getNextMediaPeriodInfo(long j8, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder == null) {
            return getFirstMediaPeriodInfo(playbackInfo);
        }
        return getFollowingMediaPeriodInfo(mediaPeriodHolder, j8);
    }

    public final MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public final MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    public final MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo mediaPeriodInfo, int i8) {
        return getUpdatedMediaPeriodInfo(mediaPeriodInfo, mediaPeriodInfo.id.copyWithPeriodIndex(i8));
    }

    public final boolean hasPlayingPeriod() {
        if (this.playing != null) {
            return true;
        }
        return false;
    }

    public final boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod) {
            return true;
        }
        return false;
    }

    public final void reevaluateBuffer(long j8) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j8);
        }
    }

    public final boolean removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        boolean z8;
        boolean z9 = false;
        if (mediaPeriodHolder != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.loading = mediaPeriodHolder;
        while (true) {
            mediaPeriodHolder = mediaPeriodHolder.next;
            if (mediaPeriodHolder != null) {
                if (mediaPeriodHolder == this.reading) {
                    this.reading = this.playing;
                    z9 = true;
                }
                mediaPeriodHolder.release();
                this.length--;
            } else {
                this.loading.next = null;
                return z9;
            }
        }
    }

    public final MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(int i8, long j8) {
        return resolveMediaPeriodIdForAds(i8, j8, resolvePeriodIndexToWindowSequenceNumber(i8));
    }

    public final void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public final boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null && (mediaPeriodHolder.info.isFinal || !mediaPeriodHolder.isFullyBuffered() || this.loading.info.durationUs == C.TIME_UNSET || this.length >= 100)) {
            return false;
        }
        return true;
    }

    public final boolean updateQueuedPeriods(MediaSource.MediaPeriodId mediaPeriodId, long j8) {
        int i8 = mediaPeriodId.periodIndex;
        MediaPeriodHolder mediaPeriodHolder = null;
        int i9 = i8;
        for (MediaPeriodHolder frontPeriod = getFrontPeriod(); frontPeriod != null; frontPeriod = frontPeriod.next) {
            if (mediaPeriodHolder == null) {
                frontPeriod.info = getUpdatedMediaPeriodInfo(frontPeriod.info, i9);
            } else if (i9 != -1 && frontPeriod.uid.equals(this.timeline.getPeriod(i9, this.period, true).uid)) {
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(mediaPeriodHolder, j8);
                if (followingMediaPeriodInfo == null) {
                    return true ^ removeAfter(mediaPeriodHolder);
                }
                frontPeriod.info = getUpdatedMediaPeriodInfo(frontPeriod.info, i9);
                if (!canKeepMediaPeriodHolder(frontPeriod, followingMediaPeriodInfo)) {
                    return true ^ removeAfter(mediaPeriodHolder);
                }
            } else {
                return true ^ removeAfter(mediaPeriodHolder);
            }
            if (frontPeriod.info.isLastInTimelinePeriod) {
                i9 = this.timeline.getNextPeriodIndex(i9, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            }
            mediaPeriodHolder = frontPeriod;
        }
        return true;
    }

    public final boolean updateRepeatMode(int i8) {
        this.repeatMode = i8;
        return updateForPlaybackModeChange();
    }

    public final boolean updateShuffleModeEnabled(boolean z8) {
        this.shuffleModeEnabled = z8;
        return updateForPlaybackModeChange();
    }

    private MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(int i8, long j8, long j9) {
        this.timeline.getPeriod(i8, this.period);
        int adGroupIndexForPositionUs = this.period.getAdGroupIndexForPositionUs(j8);
        if (adGroupIndexForPositionUs == -1) {
            return new MediaSource.MediaPeriodId(i8, j9);
        }
        return new MediaSource.MediaPeriodId(i8, adGroupIndexForPositionUs, this.period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j9);
    }

    private MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo mediaPeriodInfo, MediaSource.MediaPeriodId mediaPeriodId) {
        long j8;
        long durationUs;
        long j9 = mediaPeriodInfo.startPositionUs;
        long j10 = mediaPeriodInfo.endPositionUs;
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId, j10);
        boolean isLastInTimeline = isLastInTimeline(mediaPeriodId, isLastInPeriod);
        this.timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
        if (mediaPeriodId.isAd()) {
            durationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        } else if (j10 == Long.MIN_VALUE) {
            durationUs = this.period.getDurationUs();
        } else {
            j8 = j10;
            return new MediaPeriodInfo(mediaPeriodId, j9, j10, mediaPeriodInfo.contentPositionUs, j8, isLastInPeriod, isLastInTimeline);
        }
        j8 = durationUs;
        return new MediaPeriodInfo(mediaPeriodId, j9, j10, mediaPeriodInfo.contentPositionUs, j8, isLastInPeriod, isLastInTimeline);
    }
}
