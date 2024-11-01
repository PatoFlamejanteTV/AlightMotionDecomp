package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import com.mbridge.msdk.playercommon.exoplayer2.util.StandaloneMediaClock;

/* loaded from: classes4.dex */
final class DefaultMediaClock implements MediaClock {
    private final PlaybackParameterListener listener;
    private MediaClock rendererClock;
    private Renderer rendererClockSource;
    private final StandaloneMediaClock standaloneMediaClock;

    /* loaded from: classes4.dex */
    public interface PlaybackParameterListener {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(PlaybackParameterListener playbackParameterListener, Clock clock) {
        this.listener = playbackParameterListener;
        this.standaloneMediaClock = new StandaloneMediaClock(clock);
    }

    private void ensureSynced() {
        this.standaloneMediaClock.resetPosition(this.rendererClock.getPositionUs());
        PlaybackParameters playbackParameters = this.rendererClock.getPlaybackParameters();
        if (!playbackParameters.equals(this.standaloneMediaClock.getPlaybackParameters())) {
            this.standaloneMediaClock.setPlaybackParameters(playbackParameters);
            this.listener.onPlaybackParametersChanged(playbackParameters);
        }
    }

    private boolean isUsingRendererClock() {
        Renderer renderer = this.rendererClockSource;
        if (renderer != null && !renderer.isEnded() && (this.rendererClockSource.isReady() || !this.rendererClockSource.hasReadStreamToEnd())) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            return mediaClock.getPlaybackParameters();
        }
        return this.standaloneMediaClock.getPlaybackParameters();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public final long getPositionUs() {
        if (isUsingRendererClock()) {
            return this.rendererClock.getPositionUs();
        }
        return this.standaloneMediaClock.getPositionUs();
    }

    public final void onRendererDisabled(Renderer renderer) {
        if (renderer == this.rendererClockSource) {
            this.rendererClock = null;
            this.rendererClockSource = null;
        }
    }

    public final void onRendererEnabled(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 != null && mediaClock2 != (mediaClock = this.rendererClock)) {
            if (mediaClock == null) {
                this.rendererClock = mediaClock2;
                this.rendererClockSource = renderer;
                mediaClock2.setPlaybackParameters(this.standaloneMediaClock.getPlaybackParameters());
                ensureSynced();
                return;
            }
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public final void resetPosition(long j8) {
        this.standaloneMediaClock.resetPosition(j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public final PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            playbackParameters = mediaClock.setPlaybackParameters(playbackParameters);
        }
        this.standaloneMediaClock.setPlaybackParameters(playbackParameters);
        this.listener.onPlaybackParametersChanged(playbackParameters);
        return playbackParameters;
    }

    public final void start() {
        this.standaloneMediaClock.start();
    }

    public final void stop() {
        this.standaloneMediaClock.stop();
    }

    public final long syncAndGetPositionUs() {
        if (isUsingRendererClock()) {
            ensureSynced();
            return this.rendererClock.getPositionUs();
        }
        return this.standaloneMediaClock.getPositionUs();
    }
}
