package com.mbridge.msdk.playercommon.exoplayer2;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage;
import com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsCollector;
import com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioAttributes;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.TextOutput;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class SimpleExoPlayer implements ExoPlayer, Player.TextComponent, Player.VideoComponent {
    private static final String TAG = "SimpleExoPlayer";
    private final AnalyticsCollector analyticsCollector;
    private AudioAttributes audioAttributes;
    private final CopyOnWriteArraySet<AudioRendererEventListener> audioDebugListeners;
    private DecoderCounters audioDecoderCounters;
    private Format audioFormat;
    private int audioSessionId;
    private float audioVolume;
    private final ComponentListener componentListener;
    private List<Cue> currentCues;
    private final Handler eventHandler;
    private MediaSource mediaSource;
    private final CopyOnWriteArraySet<MetadataOutput> metadataOutputs;
    private boolean ownsSurface;
    private final ExoPlayer player;
    protected final Renderer[] renderers;
    private Surface surface;
    private SurfaceHolder surfaceHolder;
    private final CopyOnWriteArraySet<TextOutput> textOutputs;
    private TextureView textureView;
    private final CopyOnWriteArraySet<VideoRendererEventListener> videoDebugListeners;
    private DecoderCounters videoDecoderCounters;
    private Format videoFormat;
    private final CopyOnWriteArraySet<com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener> videoListeners;
    private int videoScalingMode;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class ComponentListener implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, AudioRendererEventListener, MetadataOutput, TextOutput, VideoRendererEventListener {
        private ComponentListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
        public final void onAudioDecoderInitialized(String str, long j8, long j9) {
            Iterator it = SimpleExoPlayer.this.audioDebugListeners.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioDecoderInitialized(str, j8, j9);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
        public final void onAudioDisabled(DecoderCounters decoderCounters) {
            Iterator it = SimpleExoPlayer.this.audioDebugListeners.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioDisabled(decoderCounters);
            }
            SimpleExoPlayer.this.audioFormat = null;
            SimpleExoPlayer.this.audioDecoderCounters = null;
            SimpleExoPlayer.this.audioSessionId = 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
        public final void onAudioEnabled(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.audioDecoderCounters = decoderCounters;
            Iterator it = SimpleExoPlayer.this.audioDebugListeners.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioEnabled(decoderCounters);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
        public final void onAudioInputFormatChanged(Format format) {
            SimpleExoPlayer.this.audioFormat = format;
            Iterator it = SimpleExoPlayer.this.audioDebugListeners.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioInputFormatChanged(format);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
        public final void onAudioSessionId(int i8) {
            SimpleExoPlayer.this.audioSessionId = i8;
            Iterator it = SimpleExoPlayer.this.audioDebugListeners.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioSessionId(i8);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
        public final void onAudioSinkUnderrun(int i8, long j8, long j9) {
            Iterator it = SimpleExoPlayer.this.audioDebugListeners.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioSinkUnderrun(i8, j8, j9);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.TextOutput
        public final void onCues(List<Cue> list) {
            SimpleExoPlayer.this.currentCues = list;
            Iterator it = SimpleExoPlayer.this.textOutputs.iterator();
            while (it.hasNext()) {
                ((TextOutput) it.next()).onCues(list);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
        public final void onDroppedFrames(int i8, long j8) {
            Iterator it = SimpleExoPlayer.this.videoDebugListeners.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onDroppedFrames(i8, j8);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput
        public final void onMetadata(Metadata metadata) {
            Iterator it = SimpleExoPlayer.this.metadataOutputs.iterator();
            while (it.hasNext()) {
                ((MetadataOutput) it.next()).onMetadata(metadata);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
        public final void onRenderedFirstFrame(Surface surface) {
            if (SimpleExoPlayer.this.surface == surface) {
                Iterator it = SimpleExoPlayer.this.videoListeners.iterator();
                while (it.hasNext()) {
                    ((com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener) it.next()).onRenderedFirstFrame();
                }
            }
            Iterator it2 = SimpleExoPlayer.this.videoDebugListeners.iterator();
            while (it2.hasNext()) {
                ((VideoRendererEventListener) it2.next()).onRenderedFirstFrame(surface);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
            SimpleExoPlayer.this.setVideoSurfaceInternal(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.setVideoSurfaceInternal(null, true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
        public final void onVideoDecoderInitialized(String str, long j8, long j9) {
            Iterator it = SimpleExoPlayer.this.videoDebugListeners.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoDecoderInitialized(str, j8, j9);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
        public final void onVideoDisabled(DecoderCounters decoderCounters) {
            Iterator it = SimpleExoPlayer.this.videoDebugListeners.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoDisabled(decoderCounters);
            }
            SimpleExoPlayer.this.videoFormat = null;
            SimpleExoPlayer.this.videoDecoderCounters = null;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
        public final void onVideoEnabled(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.videoDecoderCounters = decoderCounters;
            Iterator it = SimpleExoPlayer.this.videoDebugListeners.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoEnabled(decoderCounters);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
        public final void onVideoInputFormatChanged(Format format) {
            SimpleExoPlayer.this.videoFormat = format;
            Iterator it = SimpleExoPlayer.this.videoDebugListeners.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoInputFormatChanged(format);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
        public final void onVideoSizeChanged(int i8, int i9, int i10, float f8) {
            Iterator it = SimpleExoPlayer.this.videoListeners.iterator();
            while (it.hasNext()) {
                ((com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener) it.next()).onVideoSizeChanged(i8, i9, i10, f8);
            }
            Iterator it2 = SimpleExoPlayer.this.videoDebugListeners.iterator();
            while (it2.hasNext()) {
                ((VideoRendererEventListener) it2.next()).onVideoSizeChanged(i8, i9, i10, f8);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.setVideoSurfaceInternal(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.setVideoSurfaceInternal(null, false);
        }
    }

    /* loaded from: classes4.dex */
    public interface VideoListener extends com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleExoPlayer(RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        this(renderersFactory, trackSelector, loadControl, drmSessionManager, new AnalyticsCollector.Factory());
    }

    private void removeSurfaceCallbacks() {
        TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                Log.w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSurfaceInternal(Surface surface, boolean z8) {
        ArrayList arrayList = new ArrayList();
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 2) {
                arrayList.add(this.player.createMessage(renderer).setType(1).setPayload(surface).send());
            }
        }
        Surface surface2 = this.surface;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PlayerMessage) it.next()).blockUntilDelivered();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.player.stop(false);
            }
            if (this.ownsSurface) {
                this.surface.release();
            }
        }
        this.surface = surface;
        this.ownsSurface = z8;
    }

    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        this.analyticsCollector.addListener(analyticsListener);
    }

    public void addAudioDebugListener(AudioRendererEventListener audioRendererEventListener) {
        this.audioDebugListeners.add(audioRendererEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void addListener(Player.EventListener eventListener) {
        this.player.addListener(eventListener);
    }

    public void addMetadataOutput(MetadataOutput metadataOutput) {
        this.metadataOutputs.add(metadataOutput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.TextComponent
    public void addTextOutput(TextOutput textOutput) {
        if (!this.currentCues.isEmpty()) {
            textOutput.onCues(this.currentCues);
        }
        this.textOutputs.add(textOutput);
    }

    public void addVideoDebugListener(VideoRendererEventListener videoRendererEventListener) {
        this.videoDebugListeners.add(videoRendererEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void addVideoListener(com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener videoListener) {
        this.videoListeners.add(videoListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public void blockingSendMessages(ExoPlayer.ExoPlayerMessage... exoPlayerMessageArr) {
        this.player.blockingSendMessages(exoPlayerMessageArr);
    }

    public void clearMetadataOutput(MetadataOutput metadataOutput) {
        removeMetadataOutput(metadataOutput);
    }

    public void clearTextOutput(TextOutput textOutput) {
        removeTextOutput(textOutput);
    }

    public void clearVideoListener(VideoListener videoListener) {
        removeVideoListener(videoListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void clearVideoSurface() {
        setVideoSurface(null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null && surfaceHolder == this.surfaceHolder) {
            setVideoSurfaceHolder(null);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        clearVideoSurfaceHolder(holder);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void clearVideoTextureView(TextureView textureView) {
        if (textureView != null && textureView == this.textureView) {
            setVideoTextureView(null);
        }
    }

    protected ExoPlayer createExoPlayerImpl(Renderer[] rendererArr, TrackSelector trackSelector, LoadControl loadControl, Clock clock) {
        return new ExoPlayerImpl(rendererArr, trackSelector, loadControl, clock);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        return this.player.createMessage(target);
    }

    public AnalyticsCollector getAnalyticsCollector() {
        return this.analyticsCollector;
    }

    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    public DecoderCounters getAudioDecoderCounters() {
        return this.audioDecoderCounters;
    }

    public Format getAudioFormat() {
        return this.audioFormat;
    }

    public int getAudioSessionId() {
        return this.audioSessionId;
    }

    public int getAudioStreamType() {
        return Util.getStreamTypeForAudioUsage(this.audioAttributes.usage);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getBufferedPercentage() {
        return this.player.getBufferedPercentage();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public long getBufferedPosition() {
        return this.player.getBufferedPosition();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public long getContentPosition() {
        return this.player.getContentPosition();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        return this.player.getCurrentAdGroupIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public Object getCurrentManifest() {
        return this.player.getCurrentManifest();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        return this.player.getCurrentPeriodIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public long getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public Object getCurrentTag() {
        return this.player.getCurrentTag();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        return this.player.getCurrentTimeline();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public TrackGroupArray getCurrentTrackGroups() {
        return this.player.getCurrentTrackGroups();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public TrackSelectionArray getCurrentTrackSelections() {
        return this.player.getCurrentTrackSelections();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getCurrentWindowIndex() {
        return this.player.getCurrentWindowIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public long getDuration() {
        return this.player.getDuration();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getNextWindowIndex() {
        return this.player.getNextWindowIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public ExoPlaybackException getPlaybackError() {
        return this.player.getPlaybackError();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.player.getPlaybackLooper();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.player.getPlaybackParameters();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getPreviousWindowIndex() {
        return this.player.getPreviousWindowIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getRendererCount() {
        return this.player.getRendererCount();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getRendererType(int i8) {
        return this.player.getRendererType(i8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public int getRepeatMode() {
        return this.player.getRepeatMode();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        return this.player.getShuffleModeEnabled();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public Player.TextComponent getTextComponent() {
        return this;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public Player.VideoComponent getVideoComponent() {
        return this;
    }

    public DecoderCounters getVideoDecoderCounters() {
        return this.videoDecoderCounters;
    }

    public Format getVideoFormat() {
        return this.videoFormat;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public int getVideoScalingMode() {
        return this.videoScalingMode;
    }

    public float getVolume() {
        return this.audioVolume;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public boolean isCurrentWindowDynamic() {
        return this.player.isCurrentWindowDynamic();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public boolean isCurrentWindowSeekable() {
        return this.player.isCurrentWindowSeekable();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public boolean isLoading() {
        return this.player.isLoading();
    }

    public final boolean isPlaying() {
        if (getPlaybackState() == 3 && getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public boolean isPlayingAd() {
        return this.player.isPlayingAd();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void release() {
        this.player.release();
        removeSurfaceCallbacks();
        Surface surface = this.surface;
        if (surface != null) {
            if (this.ownsSurface) {
                surface.release();
            }
            this.surface = null;
        }
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            mediaSource.removeEventListener(this.analyticsCollector);
        }
        this.currentCues = Collections.emptyList();
    }

    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        this.analyticsCollector.removeListener(analyticsListener);
    }

    public void removeAudioDebugListener(AudioRendererEventListener audioRendererEventListener) {
        this.audioDebugListeners.remove(audioRendererEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void removeListener(Player.EventListener eventListener) {
        this.player.removeListener(eventListener);
    }

    public void removeMetadataOutput(MetadataOutput metadataOutput) {
        this.metadataOutputs.remove(metadataOutput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.TextComponent
    public void removeTextOutput(TextOutput textOutput) {
        this.textOutputs.remove(textOutput);
    }

    public void removeVideoDebugListener(VideoRendererEventListener videoRendererEventListener) {
        this.videoDebugListeners.remove(videoRendererEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void removeVideoListener(com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener videoListener) {
        this.videoListeners.remove(videoListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void seekTo(long j8) {
        this.analyticsCollector.notifySeekStarted();
        this.player.seekTo(j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void seekToDefaultPosition() {
        this.analyticsCollector.notifySeekStarted();
        this.player.seekToDefaultPosition();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public void sendMessages(ExoPlayer.ExoPlayerMessage... exoPlayerMessageArr) {
        this.player.sendMessages(exoPlayerMessageArr);
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
        this.audioAttributes = audioAttributes;
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 1) {
                this.player.createMessage(renderer).setType(3).setPayload(audioAttributes).send();
            }
        }
    }

    public void setAudioDebugListener(AudioRendererEventListener audioRendererEventListener) {
        this.audioDebugListeners.retainAll(Collections.singleton(this.analyticsCollector));
        if (audioRendererEventListener != null) {
            addAudioDebugListener(audioRendererEventListener);
        }
    }

    public void setAudioStreamType(int i8) {
        int audioUsageForStreamType = Util.getAudioUsageForStreamType(i8);
        setAudioAttributes(new AudioAttributes.Builder().setUsage(audioUsageForStreamType).setContentType(Util.getAudioContentTypeForStreamType(i8)).build());
    }

    public void setMetadataOutput(MetadataOutput metadataOutput) {
        this.metadataOutputs.retainAll(Collections.singleton(this.analyticsCollector));
        if (metadataOutput != null) {
            addMetadataOutput(metadataOutput);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void setPlayWhenReady(boolean z8) {
        this.player.setPlayWhenReady(z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        PlaybackParameters playbackParameters;
        float speed;
        float pitch;
        if (playbackParams != null) {
            playbackParams.allowDefaults();
            speed = playbackParams.getSpeed();
            pitch = playbackParams.getPitch();
            playbackParameters = new PlaybackParameters(speed, pitch);
        } else {
            playbackParameters = null;
        }
        setPlaybackParameters(playbackParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void setRepeatMode(int i8) {
        this.player.setRepeatMode(i8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public void setSeekParameters(SeekParameters seekParameters) {
        this.player.setSeekParameters(seekParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void setShuffleModeEnabled(boolean z8) {
        this.player.setShuffleModeEnabled(z8);
    }

    public void setTextOutput(TextOutput textOutput) {
        this.textOutputs.clear();
        if (textOutput != null) {
            addTextOutput(textOutput);
        }
    }

    public void setVideoDebugListener(VideoRendererEventListener videoRendererEventListener) {
        this.videoDebugListeners.retainAll(Collections.singleton(this.analyticsCollector));
        if (videoRendererEventListener != null) {
            addVideoDebugListener(videoRendererEventListener);
        }
    }

    public void setVideoListener(VideoListener videoListener) {
        this.videoListeners.clear();
        if (videoListener != null) {
            addVideoListener(videoListener);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void setVideoScalingMode(int i8) {
        this.videoScalingMode = i8;
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 2) {
                this.player.createMessage(renderer).setType(4).setPayload(Integer.valueOf(i8)).send();
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void setVideoSurface(Surface surface) {
        removeSurfaceCallbacks();
        setVideoSurfaceInternal(surface, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:            if (r2.isValid() != false) goto L11;     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setVideoSurfaceHolder(android.view.SurfaceHolder r2) {
        /*
            r1 = this;
            r1.removeSurfaceCallbacks()
            r1.surfaceHolder = r2
            if (r2 != 0) goto L8
            goto L1a
        L8:
            com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer$ComponentListener r0 = r1.componentListener
            r2.addCallback(r0)
            android.view.Surface r2 = r2.getSurface()
            if (r2 == 0) goto L1a
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r0 = 0
            r1.setVideoSurfaceInternal(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer.setVideoSurfaceHolder(android.view.SurfaceHolder):void");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        setVideoSurfaceHolder(holder);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void setVideoTextureView(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        removeSurfaceCallbacks();
        this.textureView = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w(TAG, "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.componentListener);
            if (textureView.isAvailable()) {
                surfaceTexture = textureView.getSurfaceTexture();
            } else {
                surfaceTexture = null;
            }
            if (surfaceTexture != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        setVideoSurfaceInternal(surface, true);
    }

    public void setVolume(float f8) {
        this.audioVolume = f8;
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 1) {
                this.player.createMessage(renderer).setType(2).setPayload(Float.valueOf(f8)).send();
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void stop() {
        stop(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleExoPlayer(RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, AnalyticsCollector.Factory factory) {
        this(renderersFactory, trackSelector, loadControl, drmSessionManager, factory, Clock.DEFAULT);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.VideoComponent
    public void clearVideoSurface(Surface surface) {
        if (surface == null || surface != this.surface) {
            return;
        }
        setVideoSurface(null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource, boolean z8, boolean z9) {
        MediaSource mediaSource2 = this.mediaSource;
        if (mediaSource2 != mediaSource) {
            if (mediaSource2 != null) {
                mediaSource2.removeEventListener(this.analyticsCollector);
                this.analyticsCollector.resetForNewMediaSource();
            }
            mediaSource.addEventListener(this.eventHandler, this.analyticsCollector);
            this.mediaSource = mediaSource;
        }
        this.player.prepare(mediaSource, z8, z9);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void stop(boolean z8) {
        this.player.stop(z8);
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            mediaSource.removeEventListener(this.analyticsCollector);
            this.mediaSource = null;
            this.analyticsCollector.resetForNewMediaSource();
        }
        this.currentCues = Collections.emptyList();
    }

    protected SimpleExoPlayer(RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, AnalyticsCollector.Factory factory, Clock clock) {
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.videoListeners = new CopyOnWriteArraySet<>();
        this.textOutputs = new CopyOnWriteArraySet<>();
        this.metadataOutputs = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<VideoRendererEventListener> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.videoDebugListeners = copyOnWriteArraySet;
        CopyOnWriteArraySet<AudioRendererEventListener> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.audioDebugListeners = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.eventHandler = handler;
        Renderer[] createRenderers = renderersFactory.createRenderers(handler, componentListener, componentListener, componentListener, componentListener, drmSessionManager);
        this.renderers = createRenderers;
        this.audioVolume = 1.0f;
        this.audioSessionId = 0;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.videoScalingMode = 1;
        this.currentCues = Collections.emptyList();
        ExoPlayer createExoPlayerImpl = createExoPlayerImpl(createRenderers, trackSelector, loadControl, clock);
        this.player = createExoPlayerImpl;
        AnalyticsCollector createAnalyticsCollector = factory.createAnalyticsCollector(createExoPlayerImpl, clock);
        this.analyticsCollector = createAnalyticsCollector;
        addListener(createAnalyticsCollector);
        copyOnWriteArraySet.add(createAnalyticsCollector);
        copyOnWriteArraySet2.add(createAnalyticsCollector);
        addMetadataOutput(createAnalyticsCollector);
        if (drmSessionManager instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) drmSessionManager).addListener(handler, createAnalyticsCollector);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void seekTo(int i8, long j8) {
        this.analyticsCollector.notifySeekStarted();
        this.player.seekTo(i8, j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public void seekToDefaultPosition(int i8) {
        this.analyticsCollector.notifySeekStarted();
        this.player.seekToDefaultPosition(i8);
    }
}
