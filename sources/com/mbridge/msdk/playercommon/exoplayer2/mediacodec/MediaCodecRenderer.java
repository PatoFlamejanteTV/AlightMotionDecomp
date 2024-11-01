package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = Util.getBytesFromHexString("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final int KEEP_CODEC_RESULT_NO = 0;
    protected static final int KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION = 1;
    protected static final int KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION = 3;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "MediaCodecRenderer";
    private final DecoderInputBuffer buffer;
    private MediaCodec codec;
    private int codecAdaptationWorkaroundMode;
    private long codecHotswapDeadlineMs;
    private MediaCodecInfo codecInfo;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagationWorkaround;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private int codecReinitializationState;
    private final List<Long> decodeOnlyPresentationTimestamps;
    protected DecoderCounters decoderCounters;
    private DrmSession<FrameworkMediaCrypto> drmSession;
    private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private Format format;
    private final FormatHolder formatHolder;
    private ByteBuffer[] inputBuffers;
    private int inputIndex;
    private boolean inputStreamEnded;
    private final MediaCodecSelector mediaCodecSelector;
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private ByteBuffer[] outputBuffers;
    private int outputIndex;
    private boolean outputStreamEnded;
    private DrmSession<FrameworkMediaCrypto> pendingDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private boolean shouldSkipOutputBuffer;
    private boolean waitingForFirstSyncFrame;
    private boolean waitingForKeys;

    /* loaded from: classes4.dex */
    private @interface AdaptationWorkaroundMode {
    }

    /* loaded from: classes4.dex */
    protected @interface KeepCodecResult {
    }

    /* loaded from: classes4.dex */
    private @interface ReconfigurationState {
    }

    /* loaded from: classes4.dex */
    private @interface ReinitializationState {
    }

    public MediaCodecRenderer(int i8, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z8) {
        super(i8);
        boolean z9;
        if (Util.SDK_INT >= 16) {
            z9 = true;
        } else {
            z9 = false;
        }
        Assertions.checkState(z9);
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.drmSessionManager = drmSessionManager;
        this.playClearSamplesWithoutKeys = z8;
        this.buffer = new DecoderInputBuffer(0);
        this.flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
        this.formatHolder = new FormatHolder();
        this.decodeOnlyPresentationTimestamps = new ArrayList();
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.codecReconfigurationState = 0;
        this.codecReinitializationState = 0;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i8 = Util.SDK_INT;
        if (i8 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Util.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i8 < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = Util.DEVICE;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, Format format) {
        if (Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        int i8 = Util.SDK_INT;
        if ((i8 <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (i8 <= 19 && "hb2000".equals(Util.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)))) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        if (Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str)) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if ((Util.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) || ("Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure)) {
            return true;
        }
        return false;
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        int i8 = Util.SDK_INT;
        if (i8 >= 18 && ((i8 != 18 || (!"OMX.SEC.avc.dec".equals(str) && !"OMX.SEC.avc.dec.secure".equals(str))) && (i8 != 19 || !Util.MODEL.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str) && !"OMX.Exynos.avc.dec.secure".equals(str))))) {
            return false;
        }
        return true;
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String str, Format format) {
        if (Util.SDK_INT <= 18 && format.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return true;
        }
        return false;
    }

    private boolean deviceNeedsDrmKeysToConfigureCodecWorkaround() {
        if ("Amazon".equals(Util.MANUFACTURER)) {
            String str = Util.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean drainOutputBuffer(long j8, long j9) throws ExoPlaybackException {
        boolean processOutputBuffer;
        boolean z8;
        int dequeueOutputBuffer;
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.outputBufferInfo, getDequeueOutputBufferTimeoutUs());
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.outputBufferInfo, getDequeueOutputBufferTimeoutUs());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                    this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                }
                MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    processEndOfStream();
                    return false;
                }
                this.outputIndex = dequeueOutputBuffer;
                ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                this.outputBuffer = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(this.outputBufferInfo.offset);
                    ByteBuffer byteBuffer = this.outputBuffer;
                    MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                this.shouldSkipOutputBuffer = shouldSkipOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            } else {
                if (dequeueOutputBuffer == -2) {
                    processOutputFormat();
                    return true;
                }
                if (dequeueOutputBuffer == -3) {
                    processOutputBuffersChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagationWorkaround && (this.inputStreamEnded || this.codecReinitializationState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                MediaCodec mediaCodec = this.codec;
                ByteBuffer byteBuffer2 = this.outputBuffer;
                int i8 = this.outputIndex;
                MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
                processOutputBuffer = processOutputBuffer(j8, j9, mediaCodec, byteBuffer2, i8, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.shouldSkipOutputBuffer);
            } catch (IllegalStateException unused2) {
                processEndOfStream();
                if (this.outputStreamEnded) {
                    releaseCodec();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.codec;
            ByteBuffer byteBuffer3 = this.outputBuffer;
            int i9 = this.outputIndex;
            MediaCodec.BufferInfo bufferInfo4 = this.outputBufferInfo;
            processOutputBuffer = processOutputBuffer(j8, j9, mediaCodec2, byteBuffer3, i9, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.shouldSkipOutputBuffer);
        }
        if (processOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            if ((this.outputBufferInfo.flags & 4) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            resetOutputBuffer();
            if (!z8) {
                return true;
            }
            processEndOfStream();
        }
        return false;
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        int position;
        int readSource;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec == null || this.codecReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputIndex < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.inputIndex = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.buffer.data = getInputBuffer(dequeueInputBuffer);
            this.buffer.clear();
        }
        if (this.codecReinitializationState == 1) {
            if (!this.codecNeedsEosPropagationWorkaround) {
                this.codecReceivedEos = true;
                this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecReinitializationState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = this.buffer.data;
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            this.codec.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.waitingForKeys) {
            readSource = -4;
            position = 0;
        } else {
            if (this.codecReconfigurationState == 1) {
                for (int i8 = 0; i8 < this.format.initializationData.size(); i8++) {
                    this.buffer.data.put(this.format.initializationData.get(i8));
                }
                this.codecReconfigurationState = 2;
            }
            position = this.buffer.data.position();
            readSource = readSource(this.formatHolder, this.buffer, false);
        }
        if (readSource == -3) {
            return false;
        }
        if (readSource == -5) {
            if (this.codecReconfigurationState == 2) {
                this.buffer.clear();
                this.codecReconfigurationState = 1;
            }
            onInputFormatChanged(this.formatHolder.format);
            return true;
        }
        if (this.buffer.isEndOfStream()) {
            if (this.codecReconfigurationState == 2) {
                this.buffer.clear();
                this.codecReconfigurationState = 1;
            }
            this.inputStreamEnded = true;
            if (!this.codecReceivedBuffers) {
                processEndOfStream();
                return false;
            }
            try {
                if (!this.codecNeedsEosPropagationWorkaround) {
                    this.codecReceivedEos = true;
                    this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                return false;
            } catch (MediaCodec.CryptoException e8) {
                throw ExoPlaybackException.createForRenderer(e8, getIndex());
            }
        }
        if (this.waitingForFirstSyncFrame && !this.buffer.isKeyFrame()) {
            this.buffer.clear();
            if (this.codecReconfigurationState == 2) {
                this.codecReconfigurationState = 1;
            }
            return true;
        }
        this.waitingForFirstSyncFrame = false;
        boolean isEncrypted = this.buffer.isEncrypted();
        boolean shouldWaitForKeys = shouldWaitForKeys(isEncrypted);
        this.waitingForKeys = shouldWaitForKeys;
        if (shouldWaitForKeys) {
            return false;
        }
        if (this.codecNeedsDiscardToSpsWorkaround && !isEncrypted) {
            NalUnitUtil.discardToSps(this.buffer.data);
            if (this.buffer.data.position() == 0) {
                return true;
            }
            this.codecNeedsDiscardToSpsWorkaround = false;
        }
        try {
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            long j8 = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isDecodeOnly()) {
                this.decodeOnlyPresentationTimestamps.add(Long.valueOf(j8));
            }
            this.buffer.flip();
            onQueueInputBuffer(this.buffer);
            if (isEncrypted) {
                this.codec.queueSecureInputBuffer(this.inputIndex, 0, getFrameworkCryptoInfo(this.buffer, position), j8, 0);
            } else {
                this.codec.queueInputBuffer(this.inputIndex, 0, this.buffer.data.limit(), j8, 0);
            }
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            this.codecReconfigurationState = 0;
            this.decoderCounters.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e9) {
            throw ExoPlaybackException.createForRenderer(e9, getIndex());
        }
    }

    private void getCodecBuffers() {
        if (Util.SDK_INT < 21) {
            this.inputBuffers = this.codec.getInputBuffers();
            this.outputBuffers = this.codec.getOutputBuffers();
        }
    }

    private static MediaCodec.CryptoInfo getFrameworkCryptoInfo(DecoderInputBuffer decoderInputBuffer, int i8) {
        MediaCodec.CryptoInfo frameworkCryptoInfoV16 = decoderInputBuffer.cryptoInfo.getFrameworkCryptoInfoV16();
        if (i8 == 0) {
            return frameworkCryptoInfoV16;
        }
        if (frameworkCryptoInfoV16.numBytesOfClearData == null) {
            frameworkCryptoInfoV16.numBytesOfClearData = new int[1];
        }
        int[] iArr = frameworkCryptoInfoV16.numBytesOfClearData;
        iArr[0] = iArr[0] + i8;
        return frameworkCryptoInfoV16;
    }

    private ByteBuffer getInputBuffer(int i8) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getInputBuffer(i8);
        }
        return this.inputBuffers[i8];
    }

    private ByteBuffer getOutputBuffer(int i8) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getOutputBuffer(i8);
        }
        return this.outputBuffers[i8];
    }

    private boolean hasOutputBuffer() {
        if (this.outputIndex >= 0) {
            return true;
        }
        return false;
    }

    private void processEndOfStream() throws ExoPlaybackException {
        if (this.codecReinitializationState == 2) {
            releaseCodec();
            maybeInitCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void processOutputBuffersChanged() {
        if (Util.SDK_INT < 21) {
            this.outputBuffers = this.codec.getOutputBuffers();
        }
    }

    private void processOutputFormat() throws ExoPlaybackException {
        MediaFormat outputFormat = this.codec.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        onOutputFormatChanged(this.codec, outputFormat);
    }

    private void resetCodecBuffers() {
        if (Util.SDK_INT < 21) {
            this.inputBuffers = null;
            this.outputBuffers = null;
        }
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private boolean shouldSkipOutputBuffer(long j8) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.decodeOnlyPresentationTimestamps.get(i8).longValue() == j8) {
                this.decodeOnlyPresentationTimestamps.remove(i8);
                return true;
            }
        }
        return false;
    }

    private boolean shouldWaitForKeys(boolean z8) throws ExoPlaybackException {
        DrmSession<FrameworkMediaCrypto> drmSession = this.drmSession;
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

    private void throwDecoderInitError(DecoderInitializationException decoderInitializationException) throws ExoPlaybackException {
        throw ExoPlaybackException.createForRenderer(decoderInitializationException, getIndex());
    }

    protected int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return 0;
    }

    protected abstract void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void flushCodec() throws ExoPlaybackException {
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        resetInputBuffer();
        resetOutputBuffer();
        this.waitingForFirstSyncFrame = true;
        this.waitingForKeys = false;
        this.shouldSkipOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        if (!this.codecNeedsFlushWorkaround && (!this.codecNeedsEosFlushWorkaround || !this.codecReceivedEos)) {
            if (this.codecReinitializationState != 0) {
                releaseCodec();
                maybeInitCodec();
            } else {
                this.codec.flush();
                this.codecReceivedBuffers = false;
            }
        } else {
            releaseCodec();
            maybeInitCodec();
        }
        if (this.codecReconfigured && this.format != null) {
            this.codecReconfigurationState = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec getCodec() {
        return this.codec;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MediaCodecInfo getDecoderInfo(MediaCodecSelector mediaCodecSelector, Format format, boolean z8) throws MediaCodecUtil.DecoderQueryException {
        return mediaCodecSelector.getDecoderInfo(format.sampleMimeType, z8);
    }

    protected long getDequeueOutputBufferTimeoutUs() {
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        if (this.format != null && !this.waitingForKeys && (isSourceReady() || hasOutputBuffer() || (this.codecHotswapDeadlineMs != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.codecHotswapDeadlineMs))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void maybeInitCodec() throws ExoPlaybackException {
        Format format;
        MediaCrypto mediaCrypto;
        boolean z8;
        long j8;
        if (this.codec == null && (format = this.format) != null) {
            DrmSession<FrameworkMediaCrypto> drmSession = this.pendingDrmSession;
            this.drmSession = drmSession;
            String str = format.sampleMimeType;
            if (drmSession != null) {
                FrameworkMediaCrypto mediaCrypto2 = drmSession.getMediaCrypto();
                if (mediaCrypto2 == null) {
                    if (this.drmSession.getError() != null) {
                        mediaCrypto = null;
                        z8 = false;
                    } else {
                        return;
                    }
                } else {
                    mediaCrypto = mediaCrypto2.getWrappedMediaCrypto();
                    z8 = mediaCrypto2.requiresSecureDecoderComponent(str);
                }
                if (deviceNeedsDrmKeysToConfigureCodecWorkaround()) {
                    int state = this.drmSession.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        throw ExoPlaybackException.createForRenderer(this.drmSession.getError(), getIndex());
                    }
                }
            } else {
                mediaCrypto = null;
                z8 = false;
            }
            if (this.codecInfo == null) {
                try {
                    MediaCodecInfo decoderInfo = getDecoderInfo(this.mediaCodecSelector, this.format, z8);
                    this.codecInfo = decoderInfo;
                    if (decoderInfo == null && z8) {
                        MediaCodecInfo decoderInfo2 = getDecoderInfo(this.mediaCodecSelector, this.format, false);
                        this.codecInfo = decoderInfo2;
                        if (decoderInfo2 != null) {
                            Log.w(TAG, "Drm session requires secure decoder for " + str + ", but no secure decoder available. Trying to proceed with " + this.codecInfo.name + ".");
                        }
                    }
                } catch (MediaCodecUtil.DecoderQueryException e8) {
                    throwDecoderInitError(new DecoderInitializationException(this.format, e8, z8, -49998));
                }
                if (this.codecInfo == null) {
                    throwDecoderInitError(new DecoderInitializationException(this.format, (Throwable) null, z8, -49999));
                }
            }
            if (!shouldInitCodec(this.codecInfo)) {
                return;
            }
            String str2 = this.codecInfo.name;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str2);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str2, this.format);
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str2);
            this.codecNeedsEosPropagationWorkaround = codecNeedsEosPropagationWorkaround(this.codecInfo);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str2);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str2);
            this.codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(str2, this.format);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                TraceUtil.beginSection("createCodec:" + str2);
                this.codec = MediaCodec.createByCodecName(str2);
                TraceUtil.endSection();
                TraceUtil.beginSection("configureCodec");
                configureCodec(this.codecInfo, this.codec, this.format, mediaCrypto);
                TraceUtil.endSection();
                TraceUtil.beginSection("startCodec");
                this.codec.start();
                TraceUtil.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                onCodecInitialized(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                getCodecBuffers();
            } catch (Exception e9) {
                throwDecoderInitError(new DecoderInitializationException(this.format, e9, z8, str2));
            }
            if (getState() == 2) {
                j8 = SystemClock.elapsedRealtime() + 1000;
            } else {
                j8 = C.TIME_UNSET;
            }
            this.codecHotswapDeadlineMs = j8;
            resetInputBuffer();
            resetOutputBuffer();
            this.waitingForFirstSyncFrame = true;
            this.decoderCounters.decoderInitCount++;
        }
    }

    protected void onCodecInitialized(String str, long j8, long j9) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.format = null;
        try {
            releaseCodec();
            try {
                DrmSession<FrameworkMediaCrypto> drmSession = this.drmSession;
                if (drmSession != null) {
                    this.drmSessionManager.releaseSession(drmSession);
                }
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession2 = this.pendingDrmSession;
                    if (drmSession2 != null && drmSession2 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession3 = this.pendingDrmSession;
                    if (drmSession3 != null && drmSession3 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.drmSession != null) {
                    this.drmSessionManager.releaseSession(this.drmSession);
                }
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession4 = this.pendingDrmSession;
                    if (drmSession4 != null && drmSession4 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    DrmSession<FrameworkMediaCrypto> drmSession5 = this.pendingDrmSession;
                    if (drmSession5 != null && drmSession5 != this.drmSession) {
                        this.drmSessionManager.releaseSession(drmSession5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onEnabled(boolean z8) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:            if (r5.height == r0.height) goto L36;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInputFormatChanged(com.mbridge.msdk.playercommon.exoplayer2.Format r5) throws com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException {
        /*
            r4 = this;
            com.mbridge.msdk.playercommon.exoplayer2.Format r0 = r4.format
            r4.format = r5
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r5 = r5.drmInitData
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r2 = r0.drmInitData
        Ld:
            boolean r5 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.areEqual(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L49
            com.mbridge.msdk.playercommon.exoplayer2.Format r5 = r4.format
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r5 = r5.drmInitData
            if (r5 == 0) goto L47
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r5 = r4.drmSessionManager
            if (r5 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.mbridge.msdk.playercommon.exoplayer2.Format r3 = r4.format
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData r3 = r3.drmInitData
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession r5 = r5.acquireSession(r1, r3)
            r4.pendingDrmSession = r5
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r1 = r4.drmSession
            if (r5 != r1) goto L49
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r1 = r4.drmSessionManager
            r1.releaseSession(r5)
            goto L49
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.getIndex()
            com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException r5 = com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException.createForRenderer(r5, r0)
            throw r5
        L47:
            r4.pendingDrmSession = r1
        L49:
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r5 = r4.pendingDrmSession
            com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession<com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto> r1 = r4.drmSession
            if (r5 != r1) goto L86
            android.media.MediaCodec r5 = r4.codec
            if (r5 == 0) goto L86
            com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo r1 = r4.codecInfo
            com.mbridge.msdk.playercommon.exoplayer2.Format r3 = r4.format
            int r5 = r4.canKeepCodec(r5, r1, r0, r3)
            if (r5 == 0) goto L86
            if (r5 == r2) goto L93
            r1 = 3
            if (r5 != r1) goto L80
            r4.codecReconfigured = r2
            r4.codecReconfigurationState = r2
            int r5 = r4.codecAdaptationWorkaroundMode
            r1 = 2
            if (r5 == r1) goto L7d
            if (r5 != r2) goto L7c
            com.mbridge.msdk.playercommon.exoplayer2.Format r5 = r4.format
            int r1 = r5.width
            int r3 = r0.width
            if (r1 != r3) goto L7c
            int r5 = r5.height
            int r0 = r0.height
            if (r5 != r0) goto L7c
            goto L7d
        L7c:
            r2 = 0
        L7d:
            r4.codecNeedsAdaptationWorkaroundBuffer = r2
            goto L93
        L80:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L86:
            boolean r5 = r4.codecReceivedBuffers
            if (r5 == 0) goto L8d
            r4.codecReinitializationState = r2
            goto L93
        L8d:
            r4.releaseCodec()
            r4.maybeInitCodec()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer.onInputFormatChanged(com.mbridge.msdk.playercommon.exoplayer2.Format):void");
    }

    protected void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j8, boolean z8) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.codec != null) {
            flushCodec();
        }
    }

    protected void onProcessedOutputBuffer(long j8) {
    }

    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStarted() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStopped() {
    }

    protected abstract boolean processOutputBuffer(long j8, long j9, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i8, int i9, long j10, boolean z8) throws ExoPlaybackException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void releaseCodec() {
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        resetInputBuffer();
        resetOutputBuffer();
        this.waitingForKeys = false;
        this.shouldSkipOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        resetCodecBuffers();
        this.codecInfo = null;
        this.codecReconfigured = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsEosPropagationWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.codecReceivedEos = false;
        this.codecReconfigurationState = 0;
        this.codecReinitializationState = 0;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            this.decoderCounters.decoderReleaseCount++;
            try {
                mediaCodec.stop();
                try {
                    this.codec.release();
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession = this.drmSession;
                    if (drmSession != null && this.pendingDrmSession != drmSession) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession2 = this.drmSession;
                    if (drmSession2 != null && this.pendingDrmSession != drmSession2) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.codec.release();
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession3 = this.drmSession;
                    if (drmSession3 != null && this.pendingDrmSession != drmSession3) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.codec = null;
                    DrmSession<FrameworkMediaCrypto> drmSession4 = this.drmSession;
                    if (drmSession4 != null && this.pendingDrmSession != drmSession4) {
                        try {
                            this.drmSessionManager.releaseSession(drmSession4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public void render(long j8, long j9) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            renderToEndOfStream();
            return;
        }
        if (this.format == null) {
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
        maybeInitCodec();
        if (this.codec != null) {
            TraceUtil.beginSection("drainAndFeed");
            do {
            } while (drainOutputBuffer(j8, j9));
            do {
            } while (feedInputBuffer());
            TraceUtil.endSection();
        } else {
            this.decoderCounters.skippedInputBufferCount += skipSource(j8);
            this.flagsOnlyBuffer.clear();
            int readSource2 = readSource(this.formatHolder, this.flagsOnlyBuffer, false);
            if (readSource2 == -5) {
                onInputFormatChanged(this.formatHolder.format);
            } else if (readSource2 == -4) {
                Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                this.inputStreamEnded = true;
                processEndOfStream();
            }
        }
        this.decoderCounters.ensureUpdated();
    }

    protected void renderToEndOfStream() throws ExoPlaybackException {
    }

    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, this.drmSessionManager, format);
        } catch (MediaCodecUtil.DecoderQueryException e8) {
            throw ExoPlaybackException.createForRenderer(e8, getIndex());
        }
    }

    protected abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* loaded from: classes4.dex */
    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final String decoderName;
        public final String diagnosticInfo;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z8, int i8) {
            super("Decoder init failed: [" + i8 + "], " + format, th);
            this.mimeType = format.sampleMimeType;
            this.secureDecoderRequired = z8;
            this.decoderName = null;
            this.diagnosticInfo = buildCustomDiagnosticInfo(i8);
        }

        private static String buildCustomDiagnosticInfo(int i8) {
            String str;
            if (i8 < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i8);
        }

        private static String getDiagnosticInfoV21(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z8, String str) {
            super("Decoder init failed: " + str + ", " + format, th);
            this.mimeType = format.sampleMimeType;
            this.secureDecoderRequired = z8;
            this.decoderName = str;
            this.diagnosticInfo = Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null;
        }
    }
}
