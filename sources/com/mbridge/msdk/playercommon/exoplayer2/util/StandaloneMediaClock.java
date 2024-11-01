package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;

/* loaded from: classes4.dex */
public final class StandaloneMediaClock implements MediaClock {
    private long baseElapsedMs;
    private long baseUs;
    private final Clock clock;
    private PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
    private boolean started;

    public StandaloneMediaClock(Clock clock) {
        this.clock = clock;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public final long getPositionUs() {
        long mediaTimeUsForPlayoutTimeMs;
        long j8 = this.baseUs;
        if (this.started) {
            long elapsedRealtime = this.clock.elapsedRealtime() - this.baseElapsedMs;
            PlaybackParameters playbackParameters = this.playbackParameters;
            if (playbackParameters.speed == 1.0f) {
                mediaTimeUsForPlayoutTimeMs = C.msToUs(elapsedRealtime);
            } else {
                mediaTimeUsForPlayoutTimeMs = playbackParameters.getMediaTimeUsForPlayoutTimeMs(elapsedRealtime);
            }
            return j8 + mediaTimeUsForPlayoutTimeMs;
        }
        return j8;
    }

    public final void resetPosition(long j8) {
        this.baseUs = j8;
        if (this.started) {
            this.baseElapsedMs = this.clock.elapsedRealtime();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public final PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (this.started) {
            resetPosition(getPositionUs());
        }
        this.playbackParameters = playbackParameters;
        return playbackParameters;
    }

    public final void start() {
        if (!this.started) {
            this.baseElapsedMs = this.clock.elapsedRealtime();
            this.started = true;
        }
    }

    public final void stop() {
        if (this.started) {
            resetPosition(getPositionUs());
            this.started = false;
        }
    }
}
