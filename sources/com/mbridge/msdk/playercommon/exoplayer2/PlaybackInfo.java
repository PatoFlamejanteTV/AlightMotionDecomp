package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectorResult;

/* loaded from: classes4.dex */
final class PlaybackInfo {
    public volatile long bufferedPositionUs;
    public final long contentPositionUs;
    public final boolean isLoading;
    public final Object manifest;
    public final MediaSource.MediaPeriodId periodId;
    public final int playbackState;
    public volatile long positionUs;
    public final long startPositionUs;
    public final Timeline timeline;
    public final TrackGroupArray trackGroups;
    public final TrackSelectorResult trackSelectorResult;

    public PlaybackInfo(Timeline timeline, long j8, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this(timeline, null, new MediaSource.MediaPeriodId(0), j8, C.TIME_UNSET, 1, false, trackGroupArray, trackSelectorResult);
    }

    private static void copyMutablePositions(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2) {
        playbackInfo2.positionUs = playbackInfo.positionUs;
        playbackInfo2.bufferedPositionUs = playbackInfo.bufferedPositionUs;
    }

    public final PlaybackInfo copyWithIsLoading(boolean z8) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId, this.startPositionUs, this.contentPositionUs, this.playbackState, z8, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithPeriodIndex(int i8) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId.copyWithPeriodIndex(i8), this.startPositionUs, this.contentPositionUs, this.playbackState, this.isLoading, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithPlaybackState(int i8) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId, this.startPositionUs, this.contentPositionUs, i8, this.isLoading, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithTimeline(Timeline timeline, Object obj) {
        PlaybackInfo playbackInfo = new PlaybackInfo(timeline, obj, this.periodId, this.startPositionUs, this.contentPositionUs, this.playbackState, this.isLoading, this.trackGroups, this.trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo copyWithTrackInfo(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        PlaybackInfo playbackInfo = new PlaybackInfo(this.timeline, this.manifest, this.periodId, this.startPositionUs, this.contentPositionUs, this.playbackState, this.isLoading, trackGroupArray, trackSelectorResult);
        copyMutablePositions(this, playbackInfo);
        return playbackInfo;
    }

    public final PlaybackInfo fromNewPosition(MediaSource.MediaPeriodId mediaPeriodId, long j8, long j9) {
        long j10;
        Timeline timeline = this.timeline;
        Object obj = this.manifest;
        if (mediaPeriodId.isAd()) {
            j10 = j9;
        } else {
            j10 = -9223372036854775807L;
        }
        return new PlaybackInfo(timeline, obj, mediaPeriodId, j8, j10, this.playbackState, this.isLoading, this.trackGroups, this.trackSelectorResult);
    }

    public PlaybackInfo(Timeline timeline, Object obj, MediaSource.MediaPeriodId mediaPeriodId, long j8, long j9, int i8, boolean z8, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.timeline = timeline;
        this.manifest = obj;
        this.periodId = mediaPeriodId;
        this.startPositionUs = j8;
        this.contentPositionUs = j9;
        this.positionUs = j8;
        this.bufferedPositionUs = j8;
        this.playbackState = i8;
        this.isLoading = z8;
        this.trackGroups = trackGroupArray;
        this.trackSelectorResult = trackSelectorResult;
    }
}
