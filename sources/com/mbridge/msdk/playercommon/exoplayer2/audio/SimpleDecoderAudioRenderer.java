package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleOutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public abstract class SimpleDecoderAudioRenderer extends BaseRenderer implements MediaClock {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    private SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> decoder;
    private DecoderCounters decoderCounters;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private DrmSession<ExoMediaCrypto> drmSession;
    private final DrmSessionManager<ExoMediaCrypto> drmSessionManager;
    private int encoderDelay;
    private int encoderPadding;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private final FormatHolder formatHolder;
    private DecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    private SimpleOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private DrmSession<ExoMediaCrypto> pendingDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private boolean waitingForKeys;

    /* loaded from: classes4.dex */
    private final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onAudioSessionId(int i8) {
            SimpleDecoderAudioRenderer.this.eventDispatcher.audioSessionId(i8);
            SimpleDecoderAudioRenderer.this.onAudioSessionId(i8);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onPositionDiscontinuity() {
            SimpleDecoderAudioRenderer.this.onAudioTrackPositionDiscontinuity();
            SimpleDecoderAudioRenderer.this.allowPositionDiscontinuity = true;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onUnderrun(int i8, long j8, long j9) {
            SimpleDecoderAudioRenderer.this.eventDispatcher.audioTrackUnderrun(i8, j8, j9);
            SimpleDecoderAudioRenderer.this.onAudioTrackUnderrun(i8, j8, j9);
        }
    }

    /* loaded from: classes4.dex */
    private @interface ReinitializationState {
    }

    public SimpleDecoderAudioRenderer() {
        this((Handler) null, (AudioRendererEventListener) null, new AudioProcessor[0]);
    }

    private boolean drainOutputBuffer() throws ExoPlaybackException, AudioDecoderException, AudioSink.ConfigurationException, AudioSink.InitializationException, AudioSink.WriteException {
        if (this.outputBuffer == null) {
            SimpleOutputBuffer dequeueOutputBuffer = this.decoder.dequeueOutputBuffer();
            this.outputBuffer = dequeueOutputBuffer;
            if (dequeueOutputBuffer == null) {
                return false;
            }
            this.decoderCounters.skippedOutputBufferCount += dequeueOutputBuffer.skippedOutputBufferCount;
        }
        if (this.outputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            } else {
                this.outputBuffer.release();
                this.outputBuffer = null;
                processEndOfStream();
            }
            return false;
        }
        if (this.audioTrackNeedsConfigure) {
            Format outputFormat = getOutputFormat();
            this.audioSink.configure(outputFormat.pcmEncoding, outputFormat.channelCount, outputFormat.sampleRate, 0, null, this.encoderDelay, this.encoderPadding);
            this.audioTrackNeedsConfigure = false;
        }
        AudioSink audioSink = this.audioSink;
        SimpleOutputBuffer simpleOutputBuffer = this.outputBuffer;
        if (!audioSink.handleBuffer(simpleOutputBuffer.data, simpleOutputBuffer.timeUs)) {
            return false;
        }
        this.decoderCounters.renderedOutputBufferCount++;
        this.outputBuffer.release();
        this.outputBuffer = null;
        return true;
    }

    private boolean feedInputBuffer() throws AudioDecoderException, ExoPlaybackException {
        int readSource;
        SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> simpleDecoder = this.decoder;
        if (simpleDecoder == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            DecoderInputBuffer dequeueInputBuffer = simpleDecoder.dequeueInputBuffer();
            this.inputBuffer = dequeueInputBuffer;
            if (dequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 1) {
            this.inputBuffer.setFlags(4);
            this.decoder.queueInputBuffer((SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException>) this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        if (this.waitingForKeys) {
            readSource = -4;
        } else {
            readSource = readSource(this.formatHolder, this.inputBuffer, false);
        }
        if (readSource == -3) {
            return false;
        }
        if (readSource == -5) {
            onInputFormatChanged(this.formatHolder.format);
            return true;
        }
        if (this.inputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            this.decoder.queueInputBuffer((SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException>) this.inputBuffer);
            this.inputBuffer = null;
            return false;
        }
        boolean shouldWaitForKeys = shouldWaitForKeys(this.inputBuffer.isEncrypted());
        this.waitingForKeys = shouldWaitForKeys;
        if (shouldWaitForKeys) {
            return false;
        }
        this.inputBuffer.flip();
        onQueueInputBuffer(this.inputBuffer);
        this.decoder.queueInputBuffer((SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException>) this.inputBuffer);
        this.decoderReceivedBuffers = true;
        this.decoderCounters.inputBufferCount++;
        this.inputBuffer = null;
        return true;
    }

    private void flushDecoder() throws ExoPlaybackException {
        this.waitingForKeys = false;
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        SimpleOutputBuffer simpleOutputBuffer = this.outputBuffer;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.outputBuffer = null;
        }
        this.decoder.flush();
        this.decoderReceivedBuffers = false;
    }

    private void maybeInitDecoder() throws ExoPlaybackException {
        ExoMediaCrypto exoMediaCrypto;
        if (this.decoder != null) {
            return;
        }
        DrmSession<ExoMediaCrypto> drmSession = this.pendingDrmSession;
        this.drmSession = drmSession;
        if (drmSession != null) {
            exoMediaCrypto = drmSession.getMediaCrypto();
            if (exoMediaCrypto == null && this.drmSession.getError() == null) {
                return;
            }
        } else {
            exoMediaCrypto = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TraceUtil.beginSection("createAudioDecoder");
            this.decoder = createDecoder(this.inputFormat, exoMediaCrypto);
            TraceUtil.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.eventDispatcher.decoderInitialized(this.decoder.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (AudioDecoderException e8) {
            throw ExoPlaybackException.createForRenderer(e8, getIndex());
        }
    }

    private void onInputFormatChanged(Format format) throws ExoPlaybackException {
        DrmInitData drmInitData;
        Format format2 = this.inputFormat;
        this.inputFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.drmInitData;
        }
        if (!Util.areEqual(drmInitData2, drmInitData)) {
            if (this.inputFormat.drmInitData != null) {
                DrmSessionManager<ExoMediaCrypto> drmSessionManager = this.drmSessionManager;
                if (drmSessionManager != null) {
                    DrmSession<ExoMediaCrypto> acquireSession = drmSessionManager.acquireSession(Looper.myLooper(), this.inputFormat.drmInitData);
                    this.pendingDrmSession = acquireSession;
                    if (acquireSession == this.drmSession) {
                        this.drmSessionManager.releaseSession(acquireSession);
                    }
                } else {
                    throw ExoPlaybackException.createForRenderer(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
            } else {
                this.pendingDrmSession = null;
            }
        }
        if (this.decoderReceivedBuffers) {
            this.decoderReinitializationState = 1;
        } else {
            releaseDecoder();
            maybeInitDecoder();
            this.audioTrackNeedsConfigure = true;
        }
        this.encoderDelay = format.encoderDelay;
        this.encoderPadding = format.encoderPadding;
        this.eventDispatcher.inputFormatChanged(format);
    }

    private void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (this.allowFirstBufferPositionDiscontinuity && !decoderInputBuffer.isDecodeOnly()) {
            if (Math.abs(decoderInputBuffer.timeUs - this.currentPositionUs) > 500000) {
                this.currentPositionUs = decoderInputBuffer.timeUs;
            }
            this.allowFirstBufferPositionDiscontinuity = false;
        }
    }

    private void processEndOfStream() throws ExoPlaybackException {
        this.outputStreamEnded = true;
        try {
            this.audioSink.playToEndOfStream();
        } catch (AudioSink.WriteException e8) {
            throw ExoPlaybackException.createForRenderer(e8, getIndex());
        }
    }

    private void releaseDecoder() {
        SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> simpleDecoder = this.decoder;
        if (simpleDecoder == null) {
            return;
        }
        this.inputBuffer = null;
        this.outputBuffer = null;
        simpleDecoder.release();
        this.decoder = null;
        this.decoderCounters.decoderReleaseCount++;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
    }

    private boolean shouldWaitForKeys(boolean z8) throws ExoPlaybackException {
        DrmSession<ExoMediaCrypto> drmSession = this.drmSession;
        if (drmSession == null || (!z8 && this.playClearSamplesWithoutKeys)) {
            return false;
        }
        int state = drmSession.getState();
        if (state != 1) {
            if (state == 4) {
                return false;
            }
            return true;
        }
        throw ExoPlaybackException.createForRenderer(this.drmSession.getError(), getIndex());
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    protected abstract SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> createDecoder(Format format, ExoMediaCrypto exoMediaCrypto) throws AudioDecoderException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public MediaClock getMediaClock() {
        return this;
    }

    protected Format getOutputFormat() {
        Format format = this.inputFormat;
        return Format.createAudioSampleFormat(null, MimeTypes.AUDIO_RAW, null, -1, -1, format.channelCount, format.sampleRate, 2, null, null, 0, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i8, Object obj) throws ExoPlaybackException {
        if (i8 != 2) {
            if (i8 != 3) {
                super.handleMessage(i8, obj);
                return;
            } else {
                this.audioSink.setAudioAttributes((AudioAttributes) obj);
                return;
            }
        }
        this.audioSink.setVolume(((Float) obj).floatValue());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isEnded() {
        if (this.outputStreamEnded && this.audioSink.isEnded()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        if (!this.audioSink.hasPendingData() && (this.inputFormat == null || this.waitingForKeys || (!isSourceReady() && this.outputBuffer == null))) {
            return false;
        }
        return true;
    }

    protected void onAudioSessionId(int i8) {
    }

    protected void onAudioTrackPositionDiscontinuity() {
    }

    protected void onAudioTrackUnderrun(int i8, long j8, long j9) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        this.waitingForKeys = false;
        try {
            releaseDecoder();
            this.audioSink.release();
            try {
                DrmSession<ExoMediaCrypto> drmSession = this.drmSession;
                if (drmSession != null) {
                    this.drmSessionManager.releaseSession(drmSession);
                }
                try {
                    DrmSession<ExoMediaCrypto> drmSession2 = this.pendingDrmSession;
                    if (drmSession2 != null && drmSession2 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    DrmSession<ExoMediaCrypto> drmSession3 = this.pendingDrmSession;
                    if (drmSession3 != null && drmSession3 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                DrmSession<ExoMediaCrypto> drmSession4 = this.drmSession;
                if (drmSession4 != null) {
                    this.drmSessionManager.releaseSession(drmSession4);
                }
                try {
                    DrmSession<ExoMediaCrypto> drmSession5 = this.pendingDrmSession;
                    if (drmSession5 != null && drmSession5 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession5);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    DrmSession<ExoMediaCrypto> drmSession6 = this.pendingDrmSession;
                    if (drmSession6 != null && drmSession6 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession6);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    protected void onEnabled(boolean z8) throws ExoPlaybackException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        int i8 = getConfiguration().tunnelingAudioSessionId;
        if (i8 != 0) {
            this.audioSink.enableTunnelingV21(i8);
        } else {
            this.audioSink.disableTunneling();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    protected void onPositionReset(long j8, boolean z8) throws ExoPlaybackException {
        this.audioSink.reset();
        this.currentPositionUs = j8;
        this.allowFirstBufferPositionDiscontinuity = true;
        this.allowPositionDiscontinuity = true;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.decoder != null) {
            flushDecoder();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    protected void onStarted() {
        this.audioSink.play();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    protected void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public void render(long j8, long j9) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            try {
                this.audioSink.playToEndOfStream();
                return;
            } catch (AudioSink.WriteException e8) {
                throw ExoPlaybackException.createForRenderer(e8, getIndex());
            }
        }
        if (this.inputFormat == null) {
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(this.formatHolder, this.flagsOnlyBuffer, true);
            if (readSource == -5) {
                onInputFormatChanged(this.formatHolder.format);
            } else {
                if (readSource == -4) {
                    Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    processEndOfStream();
                    return;
                }
                return;
            }
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                do {
                } while (drainOutputBuffer());
                do {
                } while (feedInputBuffer());
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (AudioDecoderException | AudioSink.ConfigurationException | AudioSink.InitializationException | AudioSink.WriteException e9) {
                throw ExoPlaybackException.createForRenderer(e9, getIndex());
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters) {
        return this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) {
        int i8;
        int supportsFormatInternal = supportsFormatInternal(this.drmSessionManager, format);
        if (supportsFormatInternal <= 2) {
            return supportsFormatInternal;
        }
        if (Util.SDK_INT >= 21) {
            i8 = 32;
        } else {
            i8 = 0;
        }
        return supportsFormatInternal | i8 | 8;
    }

    protected abstract int supportsFormatInternal(DrmSessionManager<ExoMediaCrypto> drmSessionManager, Format format);

    protected final boolean supportsOutputEncoding(int i8) {
        return this.audioSink.isEncodingSupported(i8);
    }

    public SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audioRendererEventListener, AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, null, null, false, audioProcessorArr);
    }

    public SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities) {
        this(handler, audioRendererEventListener, audioCapabilities, null, false, new AudioProcessor[0]);
    }

    public SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, DrmSessionManager<ExoMediaCrypto> drmSessionManager, boolean z8, AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, drmSessionManager, z8, new DefaultAudioSink(audioCapabilities, audioProcessorArr));
    }

    public SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audioRendererEventListener, DrmSessionManager<ExoMediaCrypto> drmSessionManager, boolean z8, AudioSink audioSink) {
        super(1);
        this.drmSessionManager = drmSessionManager;
        this.playClearSamplesWithoutKeys = z8;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.audioSink = audioSink;
        audioSink.setListener(new AudioSinkListener());
        this.formatHolder = new FormatHolder();
        this.flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
        this.decoderReinitializationState = 0;
        this.audioTrackNeedsConfigure = true;
    }
}
