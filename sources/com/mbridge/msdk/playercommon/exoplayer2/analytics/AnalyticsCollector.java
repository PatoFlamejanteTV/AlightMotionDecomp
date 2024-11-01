package com.mbridge.msdk.playercommon.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.analytics.AnalyticsListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public class AnalyticsCollector implements Player.EventListener, AudioRendererEventListener, DefaultDrmSessionEventListener, MetadataOutput, MediaSourceEventListener, BandwidthMeter.EventListener, VideoRendererEventListener {
    private final Clock clock;
    private Player player;
    private final CopyOnWriteArraySet<AnalyticsListener> listeners = new CopyOnWriteArraySet<>();
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker = new MediaPeriodQueueTracker();
    private final Timeline.Window window = new Timeline.Window();

    /* loaded from: classes4.dex */
    public static class Factory {
        public AnalyticsCollector createAnalyticsCollector(Player player, Clock clock) {
            return new AnalyticsCollector(player, clock);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class MediaPeriodQueueTracker {
        private boolean isSeeking;
        private WindowAndMediaPeriodId lastReportedPlayingMediaPeriod;
        private WindowAndMediaPeriodId readingMediaPeriod;
        private final ArrayList<WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>();
        private final Timeline.Period period = new Timeline.Period();
        private Timeline timeline = Timeline.EMPTY;

        private void updateLastReportedPlayingMediaPeriod() {
            if (!this.activeMediaPeriods.isEmpty()) {
                this.lastReportedPlayingMediaPeriod = this.activeMediaPeriods.get(0);
            }
        }

        private WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(WindowAndMediaPeriodId windowAndMediaPeriodId, Timeline timeline) {
            if (!timeline.isEmpty() && !this.timeline.isEmpty()) {
                int indexOfPeriod = timeline.getIndexOfPeriod(this.timeline.getPeriod(windowAndMediaPeriodId.mediaPeriodId.periodIndex, this.period, true).uid);
                if (indexOfPeriod == -1) {
                    return windowAndMediaPeriodId;
                }
                return new WindowAndMediaPeriodId(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, windowAndMediaPeriodId.mediaPeriodId.copyWithPeriodIndex(indexOfPeriod));
            }
            return windowAndMediaPeriodId;
        }

        public final WindowAndMediaPeriodId getLastReportedPlayingMediaPeriod() {
            return this.lastReportedPlayingMediaPeriod;
        }

        public final WindowAndMediaPeriodId getLoadingMediaPeriod() {
            if (this.activeMediaPeriods.isEmpty()) {
                return null;
            }
            return this.activeMediaPeriods.get(r0.size() - 1);
        }

        public final WindowAndMediaPeriodId getPlayingMediaPeriod() {
            if (!this.activeMediaPeriods.isEmpty() && !this.timeline.isEmpty() && !this.isSeeking) {
                return this.activeMediaPeriods.get(0);
            }
            return null;
        }

        public final WindowAndMediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public final boolean isSeeking() {
            return this.isSeeking;
        }

        public final void onMediaPeriodCreated(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            this.activeMediaPeriods.add(new WindowAndMediaPeriodId(i8, mediaPeriodId));
            if (this.activeMediaPeriods.size() == 1 && !this.timeline.isEmpty()) {
                updateLastReportedPlayingMediaPeriod();
            }
        }

        public final void onMediaPeriodReleased(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            WindowAndMediaPeriodId windowAndMediaPeriodId;
            WindowAndMediaPeriodId windowAndMediaPeriodId2 = new WindowAndMediaPeriodId(i8, mediaPeriodId);
            this.activeMediaPeriods.remove(windowAndMediaPeriodId2);
            if (windowAndMediaPeriodId2.equals(this.readingMediaPeriod)) {
                if (this.activeMediaPeriods.isEmpty()) {
                    windowAndMediaPeriodId = null;
                } else {
                    windowAndMediaPeriodId = this.activeMediaPeriods.get(0);
                }
                this.readingMediaPeriod = windowAndMediaPeriodId;
            }
        }

        public final void onPositionDiscontinuity(int i8) {
            updateLastReportedPlayingMediaPeriod();
        }

        public final void onReadingStarted(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            this.readingMediaPeriod = new WindowAndMediaPeriodId(i8, mediaPeriodId);
        }

        public final void onSeekProcessed() {
            this.isSeeking = false;
            updateLastReportedPlayingMediaPeriod();
        }

        public final void onSeekStarted() {
            this.isSeeking = true;
        }

        public final void onTimelineChanged(Timeline timeline) {
            for (int i8 = 0; i8 < this.activeMediaPeriods.size(); i8++) {
                ArrayList<WindowAndMediaPeriodId> arrayList = this.activeMediaPeriods;
                arrayList.set(i8, updateMediaPeriodToNewTimeline(arrayList.get(i8), timeline));
            }
            WindowAndMediaPeriodId windowAndMediaPeriodId = this.readingMediaPeriod;
            if (windowAndMediaPeriodId != null) {
                this.readingMediaPeriod = updateMediaPeriodToNewTimeline(windowAndMediaPeriodId, timeline);
            }
            this.timeline = timeline;
            updateLastReportedPlayingMediaPeriod();
        }

        public final MediaSource.MediaPeriodId tryResolveWindowIndex(int i8) {
            Timeline timeline = this.timeline;
            if (timeline == null) {
                return null;
            }
            int periodCount = timeline.getPeriodCount();
            MediaSource.MediaPeriodId mediaPeriodId = null;
            for (int i9 = 0; i9 < this.activeMediaPeriods.size(); i9++) {
                WindowAndMediaPeriodId windowAndMediaPeriodId = this.activeMediaPeriods.get(i9);
                int i10 = windowAndMediaPeriodId.mediaPeriodId.periodIndex;
                if (i10 < periodCount && this.timeline.getPeriod(i10, this.period).windowIndex == i8) {
                    if (mediaPeriodId != null) {
                        return null;
                    }
                    mediaPeriodId = windowAndMediaPeriodId.mediaPeriodId;
                }
            }
            return mediaPeriodId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class WindowAndMediaPeriodId {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public WindowAndMediaPeriodId(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
            this.windowIndex = i8;
            this.mediaPeriodId = mediaPeriodId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || WindowAndMediaPeriodId.class != obj.getClass()) {
                return false;
            }
            WindowAndMediaPeriodId windowAndMediaPeriodId = (WindowAndMediaPeriodId) obj;
            if (this.windowIndex == windowAndMediaPeriodId.windowIndex && this.mediaPeriodId.equals(windowAndMediaPeriodId.mediaPeriodId)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.windowIndex * 31) + this.mediaPeriodId.hashCode();
        }
    }

    protected AnalyticsCollector(Player player, Clock clock) {
        this.player = player;
        this.clock = (Clock) Assertions.checkNotNull(clock);
    }

    private AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLastReportedPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    public void addListener(AnalyticsListener analyticsListener) {
        this.listeners.add(analyticsListener);
    }

    protected AnalyticsListener.EventTime generateEventTime(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
        long defaultPositionMs;
        long j8;
        Assertions.checkNotNull(this.player);
        long elapsedRealtime = this.clock.elapsedRealtime();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        long j9 = 0;
        if (i8 == this.player.getCurrentWindowIndex()) {
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                if (this.player.getCurrentAdGroupIndex() == mediaPeriodId.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId.adIndexInAdGroup) {
                    j9 = this.player.getCurrentPosition();
                }
                j8 = j9;
            } else {
                defaultPositionMs = this.player.getContentPosition();
                j8 = defaultPositionMs;
            }
        } else {
            if (i8 < currentTimeline.getWindowCount() && (mediaPeriodId == null || !mediaPeriodId.isAd())) {
                defaultPositionMs = currentTimeline.getWindow(i8, this.window).getDefaultPositionMs();
                j8 = defaultPositionMs;
            }
            j8 = j9;
        }
        return new AnalyticsListener.EventTime(elapsedRealtime, currentTimeline, i8, mediaPeriodId, j8, this.player.getCurrentPosition(), this.player.getBufferedPosition() - this.player.getContentPosition());
    }

    protected Set<AnalyticsListener> getListeners() {
        return DesugarCollections.unmodifiableSet(this.listeners);
    }

    public final void notifyNetworkTypeChanged(NetworkInfo networkInfo) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkTypeChanged(generatePlayingMediaPeriodEventTime, networkInfo);
        }
    }

    public final void notifySeekStarted() {
        if (!this.mediaPeriodQueueTracker.isSeeking()) {
            AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
            this.mediaPeriodQueueTracker.onSeekStarted();
            Iterator<AnalyticsListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onSeekStarted(generatePlayingMediaPeriodEventTime);
            }
        }
    }

    public final void notifyViewportSizeChanged(int i8, int i9) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onViewportSizeChange(generatePlayingMediaPeriodEventTime, i8, i9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderInitialized(String str, long j8, long j9) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(generateReadingMediaPeriodEventTime, 1, str, j9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(generateLastReportedPlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(generatePlayingMediaPeriodEventTime, 1, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioInputFormatChanged(Format format) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(generateReadingMediaPeriodEventTime, 1, format);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSessionId(int i8) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(generateReadingMediaPeriodEventTime, i8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSinkUnderrun(int i8, long j8, long j9) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAudioUnderrun(generateReadingMediaPeriodEventTime, i8, j8, j9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i8, long j8, long j9) {
        AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onBandwidthEstimate(generateLoadingMediaPeriodEventTime, i8, j8, j9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(generateEventTime, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysLoaded() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysLoaded(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRemoved() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRemoved(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmKeysRestored() {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRestored(generateReadingMediaPeriodEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener
    public final void onDrmSessionManagerError(Exception exc) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(generateReadingMediaPeriodEventTime, exc);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i8, long j8) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(generateLastReportedPlayingMediaPeriodEventTime, i8, j8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCanceled(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadCompleted(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z8) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(generateEventTime, loadEventInfo, mediaLoadData, iOException, z8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadStarted(generateEventTime, loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onLoadingChanged(boolean z8) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onLoadingChanged(generatePlayingMediaPeriodEventTime, z8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodCreated(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodCreated(i8, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(generateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onMediaPeriodReleased(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onMediaPeriodReleased(i8, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodReleased(generateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(generatePlayingMediaPeriodEventTime, metadata);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackParametersChanged(generatePlayingMediaPeriodEventTime, playbackParameters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerError(generatePlayingMediaPeriodEventTime, exoPlaybackException);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(boolean z8, int i8) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(generatePlayingMediaPeriodEventTime, z8, i8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(int i8) {
        this.mediaPeriodQueueTracker.onPositionDiscontinuity(i8);
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(generatePlayingMediaPeriodEventTime, i8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onReadingStarted(int i8, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onReadingStarted(i8, mediaPeriodId);
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(generateEventTime);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderedFirstFrame(generateReadingMediaPeriodEventTime, surface);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onRepeatModeChanged(int i8) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRepeatModeChanged(generatePlayingMediaPeriodEventTime, i8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onSeekProcessed() {
        if (this.mediaPeriodQueueTracker.isSeeking()) {
            this.mediaPeriodQueueTracker.onSeekProcessed();
            AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
            Iterator<AnalyticsListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onSeekProcessed(generatePlayingMediaPeriodEventTime);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onShuffleModeEnabledChanged(boolean z8) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onShuffleModeChanged(generatePlayingMediaPeriodEventTime, z8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onTimelineChanged(Timeline timeline, Object obj, int i8) {
        this.mediaPeriodQueueTracker.onTimelineChanged(timeline);
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(generatePlayingMediaPeriodEventTime, i8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public final void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(generatePlayingMediaPeriodEventTime, trackGroupArray, trackSelectionArray);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i8, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateEventTime = generateEventTime(i8, mediaPeriodId);
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onUpstreamDiscarded(generateEventTime, mediaLoadData);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j8, long j9) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(generateReadingMediaPeriodEventTime, 2, str, j9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime = generateLastReportedPlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(generateLastReportedPlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(generatePlayingMediaPeriodEventTime, 2, decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(Format format) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(generateReadingMediaPeriodEventTime, 2, format);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i8, int i9, int i10, float f8) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        Iterator<AnalyticsListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(generateReadingMediaPeriodEventTime, i8, i9, i10, f8);
        }
    }

    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void resetForNewMediaSource() {
        for (WindowAndMediaPeriodId windowAndMediaPeriodId : new ArrayList(this.mediaPeriodQueueTracker.activeMediaPeriods)) {
            onMediaPeriodReleased(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
        }
    }

    public void setPlayer(Player player) {
        boolean z8;
        if (this.player == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.player = (Player) Assertions.checkNotNull(player);
    }

    private AnalyticsListener.EventTime generateEventTime(WindowAndMediaPeriodId windowAndMediaPeriodId) {
        if (windowAndMediaPeriodId == null) {
            int currentWindowIndex = ((Player) Assertions.checkNotNull(this.player)).getCurrentWindowIndex();
            return generateEventTime(currentWindowIndex, this.mediaPeriodQueueTracker.tryResolveWindowIndex(currentWindowIndex));
        }
        return generateEventTime(windowAndMediaPeriodId.windowIndex, windowAndMediaPeriodId.mediaPeriodId);
    }
}
