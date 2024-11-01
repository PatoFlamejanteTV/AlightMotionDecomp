package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes4.dex */
public final class RendererConfiguration {
    public static final RendererConfiguration DEFAULT = new RendererConfiguration(0);
    public final int tunnelingAudioSessionId;

    public RendererConfiguration(int i8) {
        this.tunnelingAudioSessionId = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RendererConfiguration.class == obj.getClass() && this.tunnelingAudioSessionId == ((RendererConfiguration) obj).tunnelingAudioSessionId) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.tunnelingAudioSessionId;
    }
}
