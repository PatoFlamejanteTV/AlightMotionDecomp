package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface Renderer extends PlayerMessage.Target {
    public static final int STATE_DISABLED = 0;
    public static final int STATE_ENABLED = 1;
    public static final int STATE_STARTED = 2;

    /* loaded from: classes4.dex */
    public @interface State {
    }

    void disable();

    void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j8, boolean z8, long j9) throws ExoPlaybackException;

    RendererCapabilities getCapabilities();

    MediaClock getMediaClock();

    int getState();

    SampleStream getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j8, long j9) throws ExoPlaybackException;

    void replaceStream(Format[] formatArr, SampleStream sampleStream, long j8) throws ExoPlaybackException;

    void resetPosition(long j8) throws ExoPlaybackException;

    void setCurrentStreamFinal();

    void setIndex(int i8);

    void start() throws ExoPlaybackException;

    void stop() throws ExoPlaybackException;
}
