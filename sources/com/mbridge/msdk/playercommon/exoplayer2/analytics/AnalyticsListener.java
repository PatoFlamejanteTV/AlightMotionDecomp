package com.mbridge.msdk.playercommon.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface AnalyticsListener {

    /* loaded from: classes4.dex */
    public static final class EventTime {
        public final long currentPlaybackPositionMs;
        public final long eventPlaybackPositionMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j8, Timeline timeline, int i8, MediaSource.MediaPeriodId mediaPeriodId, long j9, long j10, long j11) {
            this.realtimeMs = j8;
            this.timeline = timeline;
            this.windowIndex = i8;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j9;
            this.currentPlaybackPositionMs = j10;
            this.totalBufferedDurationMs = j11;
        }
    }

    void onAudioSessionId(EventTime eventTime, int i8);

    void onAudioUnderrun(EventTime eventTime, int i8, long j8, long j9);

    void onBandwidthEstimate(EventTime eventTime, int i8, long j8, long j9);

    void onDecoderDisabled(EventTime eventTime, int i8, DecoderCounters decoderCounters);

    void onDecoderEnabled(EventTime eventTime, int i8, DecoderCounters decoderCounters);

    void onDecoderInitialized(EventTime eventTime, int i8, String str, long j8);

    void onDecoderInputFormatChanged(EventTime eventTime, int i8, Format format);

    void onDownstreamFormatChanged(EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onDrmKeysLoaded(EventTime eventTime);

    void onDrmKeysRemoved(EventTime eventTime);

    void onDrmKeysRestored(EventTime eventTime);

    void onDrmSessionManagerError(EventTime eventTime, Exception exc);

    void onDroppedVideoFrames(EventTime eventTime, int i8, long j8);

    void onLoadCanceled(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onLoadCompleted(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onLoadError(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z8);

    void onLoadStarted(EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onLoadingChanged(EventTime eventTime, boolean z8);

    void onMediaPeriodCreated(EventTime eventTime);

    void onMediaPeriodReleased(EventTime eventTime);

    void onMetadata(EventTime eventTime, Metadata metadata);

    void onNetworkTypeChanged(EventTime eventTime, NetworkInfo networkInfo);

    void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters);

    void onPlayerError(EventTime eventTime, ExoPlaybackException exoPlaybackException);

    void onPlayerStateChanged(EventTime eventTime, boolean z8, int i8);

    void onPositionDiscontinuity(EventTime eventTime, int i8);

    void onReadingStarted(EventTime eventTime);

    void onRenderedFirstFrame(EventTime eventTime, Surface surface);

    void onRepeatModeChanged(EventTime eventTime, int i8);

    void onSeekProcessed(EventTime eventTime);

    void onSeekStarted(EventTime eventTime);

    void onShuffleModeChanged(EventTime eventTime, boolean z8);

    void onTimelineChanged(EventTime eventTime, int i8);

    void onTracksChanged(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    void onUpstreamDiscarded(EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData);

    void onVideoSizeChanged(EventTime eventTime, int i8, int i9, int i10, float f8);

    void onViewportSizeChange(EventTime eventTime, int i8, int i9);
}
