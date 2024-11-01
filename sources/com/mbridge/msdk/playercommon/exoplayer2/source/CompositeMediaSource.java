package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, MediaSourceAndListener> childSources = new HashMap<>();
    private Handler eventHandler;
    private ExoPlayer player;

    /* loaded from: classes4.dex */
    private final class ForwardingEventListener implements MediaSourceEventListener {
        private MediaSourceEventListener.EventDispatcher eventDispatcher;
        private final T id;

        public ForwardingEventListener(T t8) {
            this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(null);
            this.id = t8;
        }

        private boolean maybeUpdateEventDispatcher(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2;
            if (mediaPeriodId != null) {
                mediaPeriodId2 = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.id, mediaPeriodId);
                if (mediaPeriodId2 == null) {
                    return false;
                }
            } else {
                mediaPeriodId2 = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.id, i8);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodId2)) {
                this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodId2, 0L);
                return true;
            }
            return true;
        }

        private MediaSourceEventListener.MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener.MediaLoadData mediaLoadData) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.id, mediaLoadData.mediaStartTimeMs);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.id, mediaLoadData.mediaEndTimeMs);
            if (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) {
                return mediaLoadData;
            }
            return new MediaSourceEventListener.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onDownstreamFormatChanged(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadCanceled(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadCompleted(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadError(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z8) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData), iOException, z8);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadStarted(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onMediaPeriodCreated(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.mediaPeriodCreated();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onMediaPeriodReleased(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.mediaPeriodReleased();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onReadingStarted(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.readingStarted();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onUpstreamDiscarded(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i8, mediaPeriodId)) {
                this.eventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class MediaSourceAndListener {
        public final MediaSourceEventListener eventListener;
        public final MediaSource.SourceInfoRefreshListener listener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener, MediaSourceEventListener mediaSourceEventListener) {
            this.mediaSource = mediaSource;
            this.listener = sourceInfoRefreshListener;
            this.eventListener = mediaSourceEventListener;
        }
    }

    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(T t8, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    protected long getMediaTimeForChildMediaTime(T t8, long j8) {
        return j8;
    }

    protected int getWindowIndexForChildWindowIndex(T t8, int i8) {
        return i8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<MediaSourceAndListener> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    protected abstract void onChildSourceInfoRefreshed(T t8, MediaSource mediaSource, Timeline timeline, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void prepareChildSource(final T t8, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t8));
        MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener = new MediaSource.SourceInfoRefreshListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource.SourceInfoRefreshListener
            public void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline, Object obj) {
                CompositeMediaSource.this.onChildSourceInfoRefreshed(t8, mediaSource2, timeline, obj);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(t8);
        this.childSources.put(t8, new MediaSourceAndListener(mediaSource, sourceInfoRefreshListener, forwardingEventListener));
        mediaSource.addEventListener(this.eventHandler, forwardingEventListener);
        mediaSource.prepareSource(this.player, false, sourceInfoRefreshListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z8) {
        this.player = exoPlayer;
        this.eventHandler = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void releaseChildSource(T t8) {
        MediaSourceAndListener remove = this.childSources.remove(t8);
        remove.mediaSource.releaseSource(remove.listener);
        remove.mediaSource.removeEventListener(remove.eventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.listener);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
        this.player = null;
    }
}
