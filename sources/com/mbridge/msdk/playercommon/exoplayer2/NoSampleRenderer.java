package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private int state;
    private SampleStream stream;
    private boolean streamIsFinal;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void disable() {
        boolean z8 = true;
        if (this.state != 1) {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.state = 0;
        this.stream = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j8, boolean z8, long j9) throws ExoPlaybackException {
        boolean z9;
        if (this.state == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Assertions.checkState(z9);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z8);
        replaceStream(formatArr, sampleStream, j9);
        onPositionReset(j8, z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    protected final RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    protected final int getIndex() {
        return this.index;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final SampleStream getStream() {
        return this.stream;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer, com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return 5;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i8, Object obj) throws ExoPlaybackException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z8) throws ExoPlaybackException {
    }

    protected void onPositionReset(long j8, boolean z8) throws ExoPlaybackException {
    }

    protected void onRendererOffsetChanged(long j8) throws ExoPlaybackException {
    }

    protected void onStarted() throws ExoPlaybackException {
    }

    protected void onStopped() throws ExoPlaybackException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j8) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        onRendererOffsetChanged(j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void resetPosition(long j8) throws ExoPlaybackException {
        this.streamIsFinal = false;
        onPositionReset(j8, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void setIndex(int i8) {
        this.index = i8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        boolean z8 = true;
        if (this.state != 1) {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.state = 2;
        onStarted();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void stop() throws ExoPlaybackException {
        boolean z8;
        if (this.state == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.state = 1;
        onStopped();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) throws ExoPlaybackException {
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }
}
