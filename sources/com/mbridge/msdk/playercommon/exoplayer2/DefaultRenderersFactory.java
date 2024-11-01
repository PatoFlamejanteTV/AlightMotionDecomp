package com.mbridge.msdk.playercommon.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioCapabilities;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.MediaCodecAudioRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.text.TextOutput;
import com.mbridge.msdk.playercommon.exoplayer2.text.TextRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.video.MediaCodecVideoRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    protected static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final long allowedVideoJoiningTimeMs;
    private final Context context;
    private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    private final int extensionRendererMode;

    /* loaded from: classes4.dex */
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this(context, 0);
    }

    protected AudioProcessor[] buildAudioProcessors() {
        return new AudioProcessor[0];
    }

    protected void buildAudioRenderers(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, AudioProcessor[] audioProcessorArr, Handler handler, AudioRendererEventListener audioRendererEventListener, int i8, ArrayList<Renderer> arrayList) {
        int i9;
        arrayList.add(new MediaCodecAudioRenderer(context, MediaCodecSelector.DEFAULT, drmSessionManager, false, handler, audioRendererEventListener, AudioCapabilities.getCapabilities(context), audioProcessorArr));
        if (i8 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i8 == 2) {
            size--;
        }
        try {
            try {
                i9 = size + 1;
            } catch (Exception e8) {
                throw new RuntimeException("Error instantiating Opus extension", e8);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            try {
                arrayList.add(size, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                Log.i(TAG, "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i9;
                i9 = size;
                try {
                    int i10 = i9 + 1;
                    try {
                        arrayList.add(i9, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                        Log.i(TAG, "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i9 = i10;
                        i10 = i9;
                        arrayList.add(i10, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                        Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                    }
                    arrayList.add(i10, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                    Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                } catch (Exception e9) {
                    throw new RuntimeException("Error instantiating FLAC extension", e9);
                }
            }
            arrayList.add(i10, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
            Log.i(TAG, "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused4) {
            return;
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e10);
        }
        try {
            int i102 = i9 + 1;
            arrayList.add(i9, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
            Log.i(TAG, "Loaded LibflacAudioRenderer.");
        } catch (ClassNotFoundException unused5) {
        }
    }

    protected void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i8, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    protected void buildMiscellaneousRenderers(Context context, Handler handler, int i8, ArrayList<Renderer> arrayList) {
    }

    protected void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i8, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    protected void buildVideoRenderers(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, long j8, Handler handler, VideoRendererEventListener videoRendererEventListener, int i8, ArrayList<Renderer> arrayList) {
        arrayList.add(new MediaCodecVideoRenderer(context, MediaCodecSelector.DEFAULT, j8, drmSessionManager, false, handler, videoRendererEventListener, 50));
        if (i8 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i8 == 2) {
            size--;
        }
        try {
            arrayList.add(size, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j8), handler, videoRendererEventListener, 50));
            Log.i(TAG, "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e8) {
            throw new RuntimeException("Error instantiating VP9 extension", e8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2;
        if (drmSessionManager == null) {
            drmSessionManager2 = this.drmSessionManager;
        } else {
            drmSessionManager2 = drmSessionManager;
        }
        ArrayList<Renderer> arrayList = new ArrayList<>();
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager3 = drmSessionManager2;
        buildVideoRenderers(this.context, drmSessionManager3, this.allowedVideoJoiningTimeMs, handler, videoRendererEventListener, this.extensionRendererMode, arrayList);
        buildAudioRenderers(this.context, drmSessionManager3, buildAudioProcessors(), handler, audioRendererEventListener, this.extensionRendererMode, arrayList);
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[arrayList.size()]);
    }

    public DefaultRenderersFactory(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        this(context, drmSessionManager, 0);
    }

    public DefaultRenderersFactory(Context context, int i8) {
        this(context, null, i8, 5000L);
    }

    public DefaultRenderersFactory(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, int i8) {
        this(context, drmSessionManager, i8, 5000L);
    }

    public DefaultRenderersFactory(Context context, int i8, long j8) {
        this(context, null, i8, j8);
    }

    public DefaultRenderersFactory(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, int i8, long j8) {
        this.context = context;
        this.extensionRendererMode = i8;
        this.allowedVideoJoiningTimeMs = j8;
        this.drmSessionManager = drmSessionManager;
    }
}
