package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private boolean readEndOfStream = true;
    private int state;
    private SampleStream stream;
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private final int trackType;

    public BaseRenderer(int i8) {
        this.trackType = i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean supportsFormatDrm(DrmSessionManager<?> drmSessionManager, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (drmSessionManager == null) {
            return false;
        }
        return drmSessionManager.canAcquireSession(drmInitData);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void disable() {
        boolean z8 = true;
        if (this.state != 1) {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final Format[] getStreamFormats() {
        return this.streamFormats;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer, com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i8, Object obj) throws ExoPlaybackException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readEndOfStream;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isSourceReady() {
        if (this.readEndOfStream) {
            return this.streamIsFinal;
        }
        return this.stream.isReady();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
        this.stream.maybeThrowError();
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z8) throws ExoPlaybackException {
    }

    protected void onPositionReset(long j8, boolean z8) throws ExoPlaybackException {
    }

    protected void onStarted() throws ExoPlaybackException {
    }

    protected void onStopped() throws ExoPlaybackException {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onStreamChanged(Format[] formatArr, long j8) throws ExoPlaybackException {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int readSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
        int readData = this.stream.readData(formatHolder, decoderInputBuffer, z8);
        if (readData == -4) {
            if (decoderInputBuffer.isEndOfStream()) {
                this.readEndOfStream = true;
                if (this.streamIsFinal) {
                    return -4;
                }
                return -3;
            }
            decoderInputBuffer.timeUs += this.streamOffsetUs;
        } else if (readData == -5) {
            Format format = formatHolder.format;
            long j8 = format.subsampleOffsetUs;
            if (j8 != Long.MAX_VALUE) {
                formatHolder.format = format.copyWithSubsampleOffsetUs(j8 + this.streamOffsetUs);
            }
        }
        return readData;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j8) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        this.readEndOfStream = false;
        this.streamFormats = formatArr;
        this.streamOffsetUs = j8;
        onStreamChanged(formatArr, j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public final void resetPosition(long j8) throws ExoPlaybackException {
        this.streamIsFinal = false;
        this.readEndOfStream = false;
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

    /* JADX INFO: Access modifiers changed from: protected */
    public int skipSource(long j8) {
        return this.stream.skipData(j8 - this.streamOffsetUs);
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
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }
}
