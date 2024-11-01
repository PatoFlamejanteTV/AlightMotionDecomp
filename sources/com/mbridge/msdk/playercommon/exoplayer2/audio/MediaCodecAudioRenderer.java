package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaFormatUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private int channelCount;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private final Context context;
    private long currentPositionUs;
    private int encoderDelay;
    private int encoderPadding;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean passthroughEnabled;
    private MediaFormat passthroughMediaFormat;
    private int pcmEncoding;

    /* loaded from: classes4.dex */
    private final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onAudioSessionId(int i8) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioSessionId(i8);
            MediaCodecAudioRenderer.this.onAudioSessionId(i8);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onPositionDiscontinuity() {
            MediaCodecAudioRenderer.this.onAudioTrackPositionDiscontinuity();
            MediaCodecAudioRenderer.this.allowPositionDiscontinuity = true;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.Listener
        public final void onUnderrun(int i8, long j8, long j9) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackUnderrun(i8, j8, j9);
            MediaCodecAudioRenderer.this.onAudioTrackUnderrun(i8, j8, j9);
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, (DrmSessionManager<FrameworkMediaCrypto>) null, false);
    }

    private static boolean areAdaptationCompatible(Format format, Format format2) {
        if (format.sampleMimeType.equals(format2.sampleMimeType) && format.channelCount == format2.channelCount && format.sampleRate == format2.sampleRate && format.encoderDelay == 0 && format.encoderPadding == 0 && format2.encoderDelay == 0 && format2.encoderPadding == 0 && format.initializationDataEquals(format2)) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        if (Util.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str2 = Util.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
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

    protected boolean allowPassthrough(String str) {
        int encoding = MimeTypes.getEncoding(str);
        if (encoding != 0 && this.audioSink.isEncodingSupported(encoding)) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format, getStreamFormats());
        this.codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.passthroughEnabled = mediaCodecInfo.passthrough;
        String str = mediaCodecInfo.mimeType;
        if (str == null) {
            str = MimeTypes.AUDIO_RAW;
        }
        MediaFormat mediaFormat = getMediaFormat(format, str, this.codecMaxInputSize);
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
        if (this.passthroughEnabled) {
            this.passthroughMediaFormat = mediaFormat;
            mediaFormat.setString("mime", format.sampleMimeType);
        } else {
            this.passthroughMediaFormat = null;
        }
    }

    protected int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        return getCodecMaxInputSize(mediaCodecInfo, format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecInfo getDecoderInfo(MediaCodecSelector mediaCodecSelector, Format format, boolean z8) throws MediaCodecUtil.DecoderQueryException {
        MediaCodecInfo passthroughDecoderInfo;
        if (allowPassthrough(format.sampleMimeType) && (passthroughDecoderInfo = mediaCodecSelector.getPassthroughDecoderInfo()) != null) {
            return passthroughDecoderInfo;
        }
        return super.getDecoderInfo(mediaCodecSelector, format, z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public MediaClock getMediaClock() {
        return this;
    }

    protected MediaFormat getMediaFormat(Format format, String str, int i8) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", i8);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
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

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isEnded() {
        if (super.isEnded() && this.audioSink.isEnded()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        if (!this.audioSink.hasPendingData() && !super.isReady()) {
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

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(String str, long j8, long j9) {
        this.eventDispatcher.decoderInitialized(str, j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onDisabled() {
        try {
            this.audioSink.release();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onEnabled(boolean z8) throws ExoPlaybackException {
        super.onEnabled(z8);
        this.eventDispatcher.enabled(this.decoderCounters);
        int i8 = getConfiguration().tunnelingAudioSessionId;
        if (i8 != 0) {
            this.audioSink.enableTunnelingV21(i8);
        } else {
            this.audioSink.disableTunneling();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(Format format) throws ExoPlaybackException {
        int i8;
        super.onInputFormatChanged(format);
        this.eventDispatcher.inputFormatChanged(format);
        if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            i8 = format.pcmEncoding;
        } else {
            i8 = 2;
        }
        this.pcmEncoding = i8;
        this.channelCount = format.channelCount;
        this.encoderDelay = format.encoderDelay;
        this.encoderPadding = format.encoderPadding;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i8;
        int[] iArr;
        int i9;
        MediaFormat mediaFormat2 = this.passthroughMediaFormat;
        if (mediaFormat2 != null) {
            i8 = MimeTypes.getEncoding(mediaFormat2.getString("mime"));
            mediaFormat = this.passthroughMediaFormat;
        } else {
            i8 = this.pcmEncoding;
        }
        int i10 = i8;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.codecNeedsDiscardChannelsWorkaround && integer == 6 && (i9 = this.channelCount) < 6) {
            iArr = new int[i9];
            for (int i11 = 0; i11 < this.channelCount; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = null;
        }
        try {
            this.audioSink.configure(i10, integer, integer2, 0, iArr, this.encoderDelay, this.encoderPadding);
        } catch (AudioSink.ConfigurationException e8) {
            throw ExoPlaybackException.createForRenderer(e8, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j8, boolean z8) throws ExoPlaybackException {
        super.onPositionReset(j8, z8);
        this.audioSink.reset();
        this.currentPositionUs = j8;
        this.allowFirstBufferPositionDiscontinuity = true;
        this.allowPositionDiscontinuity = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (this.allowFirstBufferPositionDiscontinuity && !decoderInputBuffer.isDecodeOnly()) {
            if (Math.abs(decoderInputBuffer.timeUs - this.currentPositionUs) > 500000) {
                this.currentPositionUs = decoderInputBuffer.timeUs;
            }
            this.allowFirstBufferPositionDiscontinuity = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.audioSink.play();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
        super.onStopped();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j8, long j9, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i8, int i9, long j10, boolean z8) throws ExoPlaybackException {
        if (this.passthroughEnabled && (i9 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i8, false);
            return true;
        }
        if (z8) {
            mediaCodec.releaseOutputBuffer(i8, false);
            this.decoderCounters.skippedOutputBufferCount++;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.audioSink.handleBuffer(byteBuffer, j10)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i8, false);
            this.decoderCounters.renderedOutputBufferCount++;
            return true;
        } catch (AudioSink.InitializationException | AudioSink.WriteException e8) {
            throw ExoPlaybackException.createForRenderer(e8, getIndex());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected void renderToEndOfStream() throws ExoPlaybackException {
        try {
            this.audioSink.playToEndOfStream();
        } catch (AudioSink.WriteException e8) {
            throw ExoPlaybackException.createForRenderer(e8, getIndex());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.MediaClock
    public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters) {
        return this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    protected int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i8;
        boolean z8;
        int i9;
        int i10;
        int i11;
        String str = format.sampleMimeType;
        if (!MimeTypes.isAudio(str)) {
            return 0;
        }
        if (Util.SDK_INT >= 21) {
            i8 = 32;
        } else {
            i8 = 0;
        }
        boolean supportsFormatDrm = BaseRenderer.supportsFormatDrm(drmSessionManager, format.drmInitData);
        if (supportsFormatDrm && allowPassthrough(str) && mediaCodecSelector.getPassthroughDecoderInfo() != null) {
            return i8 | 12;
        }
        if ((MimeTypes.AUDIO_RAW.equals(str) && !this.audioSink.isEncodingSupported(format.pcmEncoding)) || !this.audioSink.isEncodingSupported(2)) {
            return 1;
        }
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z8 = false;
            for (int i12 = 0; i12 < drmInitData.schemeDataCount; i12++) {
                z8 |= drmInitData.get(i12).requiresSecureDecryption;
            }
        } else {
            z8 = false;
        }
        MediaCodecInfo decoderInfo = mediaCodecSelector.getDecoderInfo(str, z8);
        if (decoderInfo == null) {
            if (!z8 || mediaCodecSelector.getDecoderInfo(str, false) == null) {
                return 1;
            }
            return 2;
        }
        if (!supportsFormatDrm) {
            return 2;
        }
        if (Util.SDK_INT >= 21 && (((i10 = format.sampleRate) != -1 && !decoderInfo.isAudioSampleRateSupportedV21(i10)) || ((i11 = format.channelCount) != -1 && !decoderInfo.isAudioChannelCountSupportedV21(i11)))) {
            i9 = 3;
        } else {
            i9 = 4;
        }
        return i9 | i8 | 8;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z8) {
        this(context, mediaCodecSelector, drmSessionManager, z8, null, null);
    }

    private int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        PackageManager packageManager;
        int i8 = Util.SDK_INT;
        if (i8 >= 24 || !"OMX.google.raw.decoder".equals(mediaCodecInfo.name) || (i8 == 23 && (packageManager = this.context.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return format.maxInputSize;
        }
        return -1;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, null, false, handler, audioRendererEventListener);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z8, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, drmSessionManager, z8, handler, audioRendererEventListener, null, new AudioProcessor[0]);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z8, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, drmSessionManager, z8, handler, audioRendererEventListener, new DefaultAudioSink(audioCapabilities, audioProcessorArr));
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z8, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(1, mediaCodecSelector, drmSessionManager, z8);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        audioSink.setListener(new AudioSinkListener());
    }
}
