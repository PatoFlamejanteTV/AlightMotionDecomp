package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DefaultExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ExtractorMediaSource extends BaseMediaSource implements ExtractorMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_LIVE = 6;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_ON_DEMAND = 3;
    public static final int MIN_RETRY_COUNT_DEFAULT_FOR_MEDIA = -1;
    private final int continueLoadingCheckIntervalBytes;
    private final String customCacheKey;
    private final DataSource.Factory dataSourceFactory;
    private final ExtractorsFactory extractorsFactory;
    private final int minLoadableRetryCount;
    private final Object tag;
    private long timelineDurationUs;
    private boolean timelineIsSeekable;
    private final Uri uri;

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onLoadError(IOException iOException);
    }

    /* loaded from: classes4.dex */
    private static final class EventListenerWrapper extends DefaultMediaSourceEventListener {
        private final EventListener eventListener;

        public EventListenerWrapper(EventListener eventListener) {
            this.eventListener = (EventListener) Assertions.checkNotNull(eventListener);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.DefaultMediaSourceEventListener, com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public final void onLoadError(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z8) {
            this.eventListener.onLoadError(iOException);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Factory implements AdsMediaSource.MediaSourceFactory {
        private String customCacheKey;
        private final DataSource.Factory dataSourceFactory;
        private ExtractorsFactory extractorsFactory;
        private boolean isCreateCalled;
        private Object tag;
        private int minLoadableRetryCount = -1;
        private int continueLoadingCheckIntervalBytes = 1048576;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
        public final int[] getSupportedTypes() {
            return new int[]{3};
        }

        public final Factory setContinueLoadingCheckIntervalBytes(int i8) {
            Assertions.checkState(!this.isCreateCalled);
            this.continueLoadingCheckIntervalBytes = i8;
            return this;
        }

        public final Factory setCustomCacheKey(String str) {
            Assertions.checkState(!this.isCreateCalled);
            this.customCacheKey = str;
            return this;
        }

        public final Factory setExtractorsFactory(ExtractorsFactory extractorsFactory) {
            Assertions.checkState(!this.isCreateCalled);
            this.extractorsFactory = extractorsFactory;
            return this;
        }

        public final Factory setMinLoadableRetryCount(int i8) {
            Assertions.checkState(!this.isCreateCalled);
            this.minLoadableRetryCount = i8;
            return this;
        }

        public final Factory setTag(Object obj) {
            Assertions.checkState(!this.isCreateCalled);
            this.tag = obj;
            return this;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
        public final ExtractorMediaSource createMediaSource(Uri uri) {
            this.isCreateCalled = true;
            if (this.extractorsFactory == null) {
                this.extractorsFactory = new DefaultExtractorsFactory();
            }
            return new ExtractorMediaSource(uri, this.dataSourceFactory, this.extractorsFactory, this.minLoadableRetryCount, this.customCacheKey, this.continueLoadingCheckIntervalBytes, this.tag);
        }

        public final ExtractorMediaSource createMediaSource(Uri uri, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            ExtractorMediaSource createMediaSource = createMediaSource(uri);
            if (handler != null && mediaSourceEventListener != null) {
                createMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return createMediaSource;
        }
    }

    private void notifySourceInfoRefreshed(long j8, boolean z8) {
        this.timelineDurationUs = j8;
        this.timelineIsSeekable = z8;
        refreshSourceInfo(new SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.tag), null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        boolean z8;
        if (mediaPeriodId.periodIndex == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        return new ExtractorMediaPeriod(this.uri, this.dataSourceFactory.createDataSource(), this.extractorsFactory.createExtractors(), this.minLoadableRetryCount, createEventDispatcher(mediaPeriodId), this, allocator, this.customCacheKey, this.continueLoadingCheckIntervalBytes);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaPeriod.Listener
    public final void onSourceInfoRefreshed(long j8, boolean z8) {
        if (j8 == C.TIME_UNSET) {
            j8 = this.timelineDurationUs;
        }
        if (this.timelineDurationUs == j8 && this.timelineIsSeekable == z8) {
            return;
        }
        notifySourceInfoRefreshed(j8, z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z8) {
        notifySourceInfoRefreshed(this.timelineDurationUs, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        ((ExtractorMediaPeriod) mediaPeriod).release();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
    }

    public ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, Handler handler, EventListener eventListener) {
        this(uri, factory, extractorsFactory, handler, eventListener, null);
    }

    public ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, Handler handler, EventListener eventListener, String str) {
        this(uri, factory, extractorsFactory, -1, handler, eventListener, str, 1048576);
    }

    public ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, int i8, Handler handler, EventListener eventListener, String str, int i9) {
        this(uri, factory, extractorsFactory, i8, str, i9, null);
        if (eventListener == null || handler == null) {
            return;
        }
        addEventListener(handler, new EventListenerWrapper(eventListener));
    }

    private ExtractorMediaSource(Uri uri, DataSource.Factory factory, ExtractorsFactory extractorsFactory, int i8, String str, int i9, Object obj) {
        this.uri = uri;
        this.dataSourceFactory = factory;
        this.extractorsFactory = extractorsFactory;
        this.minLoadableRetryCount = i8;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i9;
        this.timelineDurationUs = C.TIME_UNSET;
        this.tag = obj;
    }
}
