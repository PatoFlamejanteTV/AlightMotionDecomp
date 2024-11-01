package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class PlaybackParameters {
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    public final float pitch;
    private final int scaledUsPerMs;
    public final boolean skipSilence;
    public final float speed;

    public PlaybackParameters(float f8) {
        this(f8, 1.0f, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch && this.skipSilence == playbackParameters.skipSilence) {
            return true;
        }
        return false;
    }

    public final long getMediaTimeUsForPlayoutTimeMs(long j8) {
        return j8 * this.scaledUsPerMs;
    }

    public final int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.speed)) * 31) + Float.floatToRawIntBits(this.pitch)) * 31) + (this.skipSilence ? 1 : 0);
    }

    public PlaybackParameters(float f8, float f9) {
        this(f8, f9, false);
    }

    public PlaybackParameters(float f8, float f9, boolean z8) {
        Assertions.checkArgument(f8 > 0.0f);
        Assertions.checkArgument(f9 > 0.0f);
        this.speed = f8;
        this.pitch = f9;
        this.skipSilence = z8;
        this.scaledUsPerMs = Math.round(f8 * 1000.0f);
    }
}
