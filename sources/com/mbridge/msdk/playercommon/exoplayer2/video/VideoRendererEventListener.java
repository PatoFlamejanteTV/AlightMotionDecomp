package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public interface VideoRendererEventListener {

    /* loaded from: classes4.dex */
    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            Handler handler2;
            if (videoRendererEventListener != null) {
                handler2 = (Handler) Assertions.checkNotNull(handler);
            } else {
                handler2 = null;
            }
            this.handler = handler2;
            this.listener = videoRendererEventListener;
        }

        public final void decoderInitialized(final String str, final long j8, final long j9) {
            if (this.listener != null) {
                this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener.EventDispatcher.2
                    @Override // java.lang.Runnable
                    public void run() {
                        EventDispatcher.this.listener.onVideoDecoderInitialized(str, j8, j9);
                    }
                });
            }
        }

        public final void disabled(final DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener.EventDispatcher.7
                    @Override // java.lang.Runnable
                    public void run() {
                        decoderCounters.ensureUpdated();
                        EventDispatcher.this.listener.onVideoDisabled(decoderCounters);
                    }
                });
            }
        }

        public final void droppedFrames(final int i8, final long j8) {
            if (this.listener != null) {
                this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener.EventDispatcher.4
                    @Override // java.lang.Runnable
                    public void run() {
                        EventDispatcher.this.listener.onDroppedFrames(i8, j8);
                    }
                });
            }
        }

        public final void enabled(final DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener.EventDispatcher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EventDispatcher.this.listener.onVideoEnabled(decoderCounters);
                    }
                });
            }
        }

        public final void inputFormatChanged(final Format format) {
            if (this.listener != null) {
                this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener.EventDispatcher.3
                    @Override // java.lang.Runnable
                    public void run() {
                        EventDispatcher.this.listener.onVideoInputFormatChanged(format);
                    }
                });
            }
        }

        public final void renderedFirstFrame(final Surface surface) {
            if (this.listener != null) {
                this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener.EventDispatcher.6
                    @Override // java.lang.Runnable
                    public void run() {
                        EventDispatcher.this.listener.onRenderedFirstFrame(surface);
                    }
                });
            }
        }

        public final void videoSizeChanged(final int i8, final int i9, final int i10, final float f8) {
            if (this.listener != null) {
                this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener.EventDispatcher.5
                    @Override // java.lang.Runnable
                    public void run() {
                        EventDispatcher.this.listener.onVideoSizeChanged(i8, i9, i10, f8);
                    }
                });
            }
        }
    }

    void onDroppedFrames(int i8, long j8);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j8, long j9);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(Format format);

    void onVideoSizeChanged(int i8, int i9, int i10, float f8);
}
