package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;

/* loaded from: classes4.dex */
public interface MediaClock {
    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);
}
