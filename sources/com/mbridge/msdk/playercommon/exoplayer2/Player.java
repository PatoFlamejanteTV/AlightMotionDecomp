package com.mbridge.msdk.playercommon.exoplayer2;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.text.TextOutput;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener;

/* loaded from: classes4.dex */
public interface Player {
    public static final int DISCONTINUITY_REASON_AD_INSERTION = 3;
    public static final int DISCONTINUITY_REASON_INTERNAL = 4;
    public static final int DISCONTINUITY_REASON_PERIOD_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_DYNAMIC = 2;
    public static final int TIMELINE_CHANGE_REASON_PREPARED = 0;
    public static final int TIMELINE_CHANGE_REASON_RESET = 1;

    /* loaded from: classes4.dex */
    public static abstract class DefaultEventListener implements EventListener {
        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean z8) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z8, int i8) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i8) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i8) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onSeekProcessed() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z8) {
        }

        public void onTimelineChanged(Timeline timeline, Object obj) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i8) {
            onTimelineChanged(timeline, obj);
        }
    }

    /* loaded from: classes4.dex */
    public @interface DiscontinuityReason {
    }

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onLoadingChanged(boolean z8);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlayerError(ExoPlaybackException exoPlaybackException);

        void onPlayerStateChanged(boolean z8, int i8);

        void onPositionDiscontinuity(int i8);

        void onRepeatModeChanged(int i8);

        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z8);

        void onTimelineChanged(Timeline timeline, Object obj, int i8);

        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);
    }

    /* loaded from: classes4.dex */
    public @interface RepeatMode {
    }

    /* loaded from: classes4.dex */
    public interface TextComponent {
        void addTextOutput(TextOutput textOutput);

        void removeTextOutput(TextOutput textOutput);
    }

    /* loaded from: classes4.dex */
    public @interface TimelineChangeReason {
    }

    /* loaded from: classes4.dex */
    public interface VideoComponent {
        void addVideoListener(VideoListener videoListener);

        void clearVideoSurface();

        void clearVideoSurface(Surface surface);

        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(SurfaceView surfaceView);

        void clearVideoTextureView(TextureView textureView);

        int getVideoScalingMode();

        void removeVideoListener(VideoListener videoListener);

        void setVideoScalingMode(int i8);

        void setVideoSurface(Surface surface);

        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(SurfaceView surfaceView);

        void setVideoTextureView(TextureView textureView);
    }

    void addListener(EventListener eventListener);

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    Object getCurrentManifest();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    Object getCurrentTag();

    Timeline getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    TrackSelectionArray getCurrentTrackSelections();

    int getCurrentWindowIndex();

    long getDuration();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    ExoPlaybackException getPlaybackError();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPreviousWindowIndex();

    int getRendererCount();

    int getRendererType(int i8);

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    TextComponent getTextComponent();

    VideoComponent getVideoComponent();

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowSeekable();

    boolean isLoading();

    boolean isPlayingAd();

    void release();

    void removeListener(EventListener eventListener);

    void seekTo(int i8, long j8);

    void seekTo(long j8);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i8);

    void setPlayWhenReady(boolean z8);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setRepeatMode(int i8);

    void setShuffleModeEnabled(boolean z8);

    void stop();

    void stop(boolean z8);
}
