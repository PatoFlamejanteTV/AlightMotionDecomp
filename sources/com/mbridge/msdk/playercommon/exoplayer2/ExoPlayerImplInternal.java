package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultMediaClock;
import com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectorResult;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class ExoPlayerImplInternal implements Handler.Callback, DefaultMediaClock.PlaybackParameterListener, PlayerMessage.Sender, MediaPeriod.Callback, MediaSource.SourceInfoRefreshListener, TrackSelector.InvalidationListener {
    private static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final int MSG_DO_SOME_WORK = 2;
    public static final int MSG_ERROR = 2;
    private static final int MSG_PERIOD_PREPARED = 9;
    public static final int MSG_PLAYBACK_INFO_CHANGED = 0;
    public static final int MSG_PLAYBACK_PARAMETERS_CHANGED = 1;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_REFRESH_SOURCE_INFO = 8;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 12;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 13;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 10;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 11;
    private static final int PREPARING_SOURCE_INTERVAL_MS = 10;
    private static final int RENDERING_INTERVAL_MS = 10;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final Clock clock;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private Renderer[] enabledRenderers;
    private final Handler eventHandler;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private MediaSource mediaSource;
    private int nextPendingMessageIndex;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private int pendingPrepareCount;
    private final Timeline.Period period;
    private boolean playWhenReady;
    private PlaybackInfo playbackInfo;
    private final ExoPlayer player;
    private boolean rebuffering;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private int repeatMode;
    private final boolean retainBackBufferFromKeyframe;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private final MediaPeriodQueue queue = new MediaPeriodQueue();
    private SeekParameters seekParameters = SeekParameters.DEFAULT;
    private final PlaybackInfoUpdate playbackInfoUpdate = new PlaybackInfoUpdate();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class MediaSourceRefreshInfo {
        public final Object manifest;
        public final MediaSource source;
        public final Timeline timeline;

        public MediaSourceRefreshInfo(MediaSource mediaSource, Timeline timeline, Object obj) {
            this.source = mediaSource;
            this.timeline = timeline;
            this.manifest = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public final void setResolvedPosition(int i8, long j8, Object obj) {
            this.resolvedPeriodIndex = i8;
            this.resolvedPeriodTimeUs = j8;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public final int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i8 = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i8 != 0 ? i8 : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PlaybackInfoUpdate {
        private int discontinuityReason;
        private PlaybackInfo lastPlaybackInfo;
        private int operationAcks;
        private boolean positionDiscontinuity;

        private PlaybackInfoUpdate() {
        }

        public final boolean hasPendingUpdate(PlaybackInfo playbackInfo) {
            if (playbackInfo == this.lastPlaybackInfo && this.operationAcks <= 0 && !this.positionDiscontinuity) {
                return false;
            }
            return true;
        }

        public final void incrementPendingOperationAcks(int i8) {
            this.operationAcks += i8;
        }

        public final void reset(PlaybackInfo playbackInfo) {
            this.lastPlaybackInfo = playbackInfo;
            this.operationAcks = 0;
            this.positionDiscontinuity = false;
        }

        public final void setPositionDiscontinuity(int i8) {
            boolean z8 = true;
            if (this.positionDiscontinuity && this.discontinuityReason != 4) {
                if (i8 != 4) {
                    z8 = false;
                }
                Assertions.checkArgument(z8);
            } else {
                this.positionDiscontinuity = true;
                this.discontinuityReason = i8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i8, long j8) {
            this.timeline = timeline;
            this.windowIndex = i8;
            this.windowPositionUs = j8;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, boolean z8, int i8, boolean z9, Handler handler, ExoPlayer exoPlayer, Clock clock) {
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.playWhenReady = z8;
        this.repeatMode = i8;
        this.shuffleModeEnabled = z9;
        this.eventHandler = handler;
        this.player = exoPlayer;
        this.clock = clock;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe();
        this.playbackInfo = new PlaybackInfo(Timeline.EMPTY, C.TIME_UNSET, TrackGroupArray.EMPTY, trackSelectorResult);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        for (int i9 = 0; i9 < rendererArr.length; i9++) {
            rendererArr[i9].setIndex(i9);
            this.rendererCapabilities[i9] = rendererArr[i9].getCapabilities();
        }
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.enabledRenderers = new Renderer[0];
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.internalPlaybackThread = handlerThread;
        handlerThread.start();
        this.handler = clock.createHandler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableRenderer(Renderer renderer) throws ExoPlaybackException {
        this.mediaClock.onRendererDisabled(renderer);
        ensureStopped(renderer);
        renderer.disable();
    }

    private void doSomeWork() throws ExoPlaybackException, IOException {
        int i8;
        boolean z8;
        long uptimeMillis = this.clock.uptimeMillis();
        updatePeriods();
        if (!this.queue.hasPlayingPeriod()) {
            maybeThrowPeriodPrepareError();
            scheduleNextWork(uptimeMillis, 10L);
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
        boolean z9 = true;
        boolean z10 = true;
        for (Renderer renderer : this.enabledRenderers) {
            renderer.render(this.rendererPositionUs, elapsedRealtime);
            if (z10 && renderer.isEnded()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!renderer.isReady() && !renderer.isEnded() && !rendererWaitingForNextStream(renderer)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8) {
                renderer.maybeThrowStreamError();
            }
            if (z9 && z8) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        if (!z9) {
            maybeThrowPeriodPrepareError();
        }
        long j8 = playingPeriod.info.durationUs;
        if (z10 && ((j8 == C.TIME_UNSET || j8 <= this.playbackInfo.positionUs) && playingPeriod.info.isFinal)) {
            setState(4);
            stopRenderers();
        } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z9)) {
            setState(3);
            if (this.playWhenReady) {
                startRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3 && (this.enabledRenderers.length != 0 ? !z9 : !isTimelineReady())) {
            this.rebuffering = this.playWhenReady;
            setState(2);
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            for (Renderer renderer2 : this.enabledRenderers) {
                renderer2.maybeThrowStreamError();
            }
        }
        if ((this.playWhenReady && this.playbackInfo.playbackState == 3) || (i8 = this.playbackInfo.playbackState) == 2) {
            scheduleNextWork(uptimeMillis, 10L);
        } else if (this.enabledRenderers.length != 0 && i8 != 4) {
            scheduleNextWork(uptimeMillis, 1000L);
        } else {
            this.handler.removeMessages(2);
        }
        TraceUtil.endSection();
    }

    private void enableRenderer(int i8, boolean z8, int i9) throws ExoPlaybackException {
        boolean z9;
        boolean z10;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        Renderer renderer = this.renderers[i8];
        this.enabledRenderers[i9] = renderer;
        if (renderer.getState() == 0) {
            TrackSelectorResult trackSelectorResult = playingPeriod.trackSelectorResult;
            RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i8];
            Format[] formats = getFormats(trackSelectorResult.selections.get(i8));
            if (this.playWhenReady && this.playbackInfo.playbackState == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z8 && z9) {
                z10 = true;
            } else {
                z10 = false;
            }
            renderer.enable(rendererConfiguration, formats, playingPeriod.sampleStreams[i8], this.rendererPositionUs, z10, playingPeriod.getRendererOffset());
            this.mediaClock.onRendererEnabled(renderer);
            if (z9) {
                renderer.start();
            }
        }
    }

    private void enableRenderers(boolean[] zArr, int i8) throws ExoPlaybackException {
        this.enabledRenderers = new Renderer[i8];
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        int i9 = 0;
        for (int i10 = 0; i10 < this.renderers.length; i10++) {
            if (playingPeriod.trackSelectorResult.isRendererEnabled(i10)) {
                enableRenderer(i10, zArr[i10], i9);
                i9++;
            }
        }
    }

    private void ensureStopped(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private int getFirstPeriodIndex() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return 0;
        }
        return timeline.getWindow(timeline.getFirstWindowIndex(this.shuffleModeEnabled), this.window).firstPeriodIndex;
    }

    private static Format[] getFormats(TrackSelection trackSelection) {
        int i8;
        if (trackSelection != null) {
            i8 = trackSelection.length();
        } else {
            i8 = 0;
        }
        Format[] formatArr = new Format[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            formatArr[i9] = trackSelection.getFormat(i9);
        }
        return formatArr;
    }

    private Pair<Integer, Long> getPeriodPosition(Timeline timeline, int i8, long j8) {
        return timeline.getPeriodPosition(this.window, this.period, i8, j8);
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (!this.queue.isLoading(mediaPeriod)) {
            return;
        }
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        maybeContinueLoading();
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (!this.queue.isLoading(mediaPeriod)) {
            return;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed);
        updateLoadControlTrackSelection(loadingPeriod.trackGroups, loadingPeriod.trackSelectorResult);
        if (!this.queue.hasPlayingPeriod()) {
            resetRendererPosition(this.queue.advancePlayingPeriod().info.startPositionUs);
            updatePlayingPeriodRenderers(null);
        }
        maybeContinueLoading();
    }

    private void handleSourceInfoRefreshEndedPlayback() {
        setState(4);
        resetInternal(false, true, false);
    }

    private void handleSourceInfoRefreshed(MediaSourceRefreshInfo mediaSourceRefreshInfo) throws ExoPlaybackException {
        Object obj;
        long j8;
        long j9;
        if (mediaSourceRefreshInfo.source != this.mediaSource) {
            return;
        }
        Timeline timeline = this.playbackInfo.timeline;
        Timeline timeline2 = mediaSourceRefreshInfo.timeline;
        Object obj2 = mediaSourceRefreshInfo.manifest;
        this.queue.setTimeline(timeline2);
        this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline2, obj2);
        resolvePendingMessagePositions();
        int i8 = this.pendingPrepareCount;
        long j10 = 0;
        if (i8 > 0) {
            this.playbackInfoUpdate.incrementPendingOperationAcks(i8);
            this.pendingPrepareCount = 0;
            SeekPosition seekPosition = this.pendingInitialSeekPosition;
            if (seekPosition != null) {
                Pair<Integer, Long> resolveSeekPosition = resolveSeekPosition(seekPosition, true);
                this.pendingInitialSeekPosition = null;
                if (resolveSeekPosition == null) {
                    handleSourceInfoRefreshEndedPlayback();
                    return;
                }
                int intValue = ((Integer) resolveSeekPosition.first).intValue();
                long longValue = ((Long) resolveSeekPosition.second).longValue();
                MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = this.queue.resolveMediaPeriodIdForAds(intValue, longValue);
                PlaybackInfo playbackInfo = this.playbackInfo;
                if (resolveMediaPeriodIdForAds.isAd()) {
                    j9 = 0;
                } else {
                    j9 = longValue;
                }
                this.playbackInfo = playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds, j9, longValue);
                return;
            }
            if (this.playbackInfo.startPositionUs == C.TIME_UNSET) {
                if (timeline2.isEmpty()) {
                    handleSourceInfoRefreshEndedPlayback();
                    return;
                }
                Pair<Integer, Long> periodPosition = getPeriodPosition(timeline2, timeline2.getFirstWindowIndex(this.shuffleModeEnabled), C.TIME_UNSET);
                int intValue2 = ((Integer) periodPosition.first).intValue();
                long longValue2 = ((Long) periodPosition.second).longValue();
                MediaSource.MediaPeriodId resolveMediaPeriodIdForAds2 = this.queue.resolveMediaPeriodIdForAds(intValue2, longValue2);
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                if (resolveMediaPeriodIdForAds2.isAd()) {
                    j8 = 0;
                } else {
                    j8 = longValue2;
                }
                this.playbackInfo = playbackInfo2.fromNewPosition(resolveMediaPeriodIdForAds2, j8, longValue2);
                return;
            }
            return;
        }
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        int i9 = playbackInfo3.periodId.periodIndex;
        long j11 = playbackInfo3.contentPositionUs;
        if (timeline.isEmpty()) {
            if (!timeline2.isEmpty()) {
                MediaSource.MediaPeriodId resolveMediaPeriodIdForAds3 = this.queue.resolveMediaPeriodIdForAds(i9, j11);
                PlaybackInfo playbackInfo4 = this.playbackInfo;
                if (!resolveMediaPeriodIdForAds3.isAd()) {
                    j10 = j11;
                }
                this.playbackInfo = playbackInfo4.fromNewPosition(resolveMediaPeriodIdForAds3, j10, j11);
                return;
            }
            return;
        }
        MediaPeriodHolder frontPeriod = this.queue.getFrontPeriod();
        if (frontPeriod == null) {
            obj = timeline.getPeriod(i9, this.period, true).uid;
        } else {
            obj = frontPeriod.uid;
        }
        int indexOfPeriod = timeline2.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            int resolveSubsequentPeriod = resolveSubsequentPeriod(i9, timeline, timeline2);
            if (resolveSubsequentPeriod == -1) {
                handleSourceInfoRefreshEndedPlayback();
                return;
            }
            Pair<Integer, Long> periodPosition2 = getPeriodPosition(timeline2, timeline2.getPeriod(resolveSubsequentPeriod, this.period).windowIndex, C.TIME_UNSET);
            int intValue3 = ((Integer) periodPosition2.first).intValue();
            long longValue3 = ((Long) periodPosition2.second).longValue();
            MediaSource.MediaPeriodId resolveMediaPeriodIdForAds4 = this.queue.resolveMediaPeriodIdForAds(intValue3, longValue3);
            timeline2.getPeriod(intValue3, this.period, true);
            if (frontPeriod != null) {
                Object obj3 = this.period.uid;
                frontPeriod.info = frontPeriod.info.copyWithPeriodIndex(-1);
                while (true) {
                    frontPeriod = frontPeriod.next;
                    if (frontPeriod == null) {
                        break;
                    } else if (frontPeriod.uid.equals(obj3)) {
                        frontPeriod.info = this.queue.getUpdatedMediaPeriodInfo(frontPeriod.info, intValue3);
                    } else {
                        frontPeriod.info = frontPeriod.info.copyWithPeriodIndex(-1);
                    }
                }
            }
            if (!resolveMediaPeriodIdForAds4.isAd()) {
                j10 = longValue3;
            }
            this.playbackInfo = this.playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds4, seekToPeriodPosition(resolveMediaPeriodIdForAds4, j10), longValue3);
            return;
        }
        if (indexOfPeriod != i9) {
            this.playbackInfo = this.playbackInfo.copyWithPeriodIndex(indexOfPeriod);
        }
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        if (mediaPeriodId.isAd()) {
            MediaSource.MediaPeriodId resolveMediaPeriodIdForAds5 = this.queue.resolveMediaPeriodIdForAds(indexOfPeriod, j11);
            if (!resolveMediaPeriodIdForAds5.equals(mediaPeriodId)) {
                if (!resolveMediaPeriodIdForAds5.isAd()) {
                    j10 = j11;
                }
                this.playbackInfo = this.playbackInfo.fromNewPosition(resolveMediaPeriodIdForAds5, seekToPeriodPosition(resolveMediaPeriodIdForAds5, j10), j11);
                return;
            }
        }
        if (!this.queue.updateQueuedPeriods(mediaPeriodId, this.rendererPositionUs)) {
            seekToCurrentPosition(false);
        }
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j8 = playingPeriod.info.durationUs;
        if (j8 != C.TIME_UNSET && this.playbackInfo.positionUs >= j8 && ((mediaPeriodHolder = playingPeriod.next) == null || (!mediaPeriodHolder.prepared && !mediaPeriodHolder.info.id.isAd()))) {
            return false;
        }
        return true;
    }

    private void maybeContinueLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long nextLoadPositionUs = loadingPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            setIsLoading(false);
            return;
        }
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(nextLoadPositionUs - loadingPeriod.toPeriodTime(this.rendererPositionUs), this.mediaClock.getPlaybackParameters().speed);
        setIsLoading(shouldContinueLoading);
        if (shouldContinueLoading) {
            loadingPeriod.continueLoading(this.rendererPositionUs);
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        int i8;
        if (this.playbackInfoUpdate.hasPendingUpdate(this.playbackInfo)) {
            Handler handler = this.eventHandler;
            int i9 = this.playbackInfoUpdate.operationAcks;
            if (this.playbackInfoUpdate.positionDiscontinuity) {
                i8 = this.playbackInfoUpdate.discontinuityReason;
            } else {
                i8 = -1;
            }
            handler.obtainMessage(0, i9, i8, this.playbackInfo).sendToTarget();
            this.playbackInfoUpdate.reset(this.playbackInfo);
        }
    }

    private void maybeThrowPeriodPrepareError() throws IOException {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (loadingPeriod != null && !loadingPeriod.prepared) {
            if (readingPeriod == null || readingPeriod.next == loadingPeriod) {
                for (Renderer renderer : this.enabledRenderers) {
                    if (!renderer.hasReadStreamToEnd()) {
                        return;
                    }
                }
                loadingPeriod.mediaPeriod.maybeThrowPrepareError();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x006b, code lost:            r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0034, code lost:            r1 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeTriggerPendingMessages(long r7, long r9) throws com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerImplInternal.maybeTriggerPendingMessages(long, long):void");
    }

    private void maybeUpdateLoadingPeriod() throws IOException {
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod()) {
            MediaPeriodInfo nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo);
            if (nextMediaPeriodInfo == null) {
                this.mediaSource.maybeThrowSourceInfoRefreshError();
                return;
            }
            this.queue.enqueueNextMediaPeriod(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSource, this.playbackInfo.timeline.getPeriod(nextMediaPeriodInfo.id.periodIndex, this.period, true).uid, nextMediaPeriodInfo).prepare(this, nextMediaPeriodInfo.startPositionUs);
            setIsLoading(true);
        }
    }

    private void prepareInternal(MediaSource mediaSource, boolean z8, boolean z9) {
        this.pendingPrepareCount++;
        resetInternal(true, z8, z9);
        this.loadControl.onPrepared();
        this.mediaSource = mediaSource;
        setState(2);
        mediaSource.prepareSource(this.player, true, this);
        this.handler.sendEmptyMessage(2);
    }

    private void releaseInternal() {
        resetInternal(true, true, true);
        this.loadControl.onReleased();
        setState(1);
        this.internalPlaybackThread.quitSafely();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    private boolean rendererWaitingForNextStream(Renderer renderer) {
        MediaPeriodHolder mediaPeriodHolder = this.queue.getReadingPeriod().next;
        if (mediaPeriodHolder != null && mediaPeriodHolder.prepared && renderer.hasReadStreamToEnd()) {
            return true;
        }
        return false;
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
        boolean z8;
        if (!this.queue.hasPlayingPeriod()) {
            return;
        }
        float f8 = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z9 = true;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.next) {
            if (playingPeriod.selectTracks(f8)) {
                if (z9) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean removeAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection(this.playbackInfo.positionUs, removeAfter, zArr);
                    updateLoadControlTrackSelection(playingPeriod2.trackGroups, playingPeriod2.trackSelectorResult);
                    PlaybackInfo playbackInfo = this.playbackInfo;
                    if (playbackInfo.playbackState != 4 && applyTrackSelection != playbackInfo.positionUs) {
                        PlaybackInfo playbackInfo2 = this.playbackInfo;
                        this.playbackInfo = playbackInfo2.fromNewPosition(playbackInfo2.periodId, applyTrackSelection, playbackInfo2.contentPositionUs);
                        this.playbackInfoUpdate.setPositionDiscontinuity(4);
                        resetRendererPosition(applyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i8 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i8];
                        if (renderer.getState() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        zArr2[i8] = z8;
                        SampleStream sampleStream = playingPeriod2.sampleStreams[i8];
                        if (sampleStream != null) {
                            i9++;
                        }
                        if (z8) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i8]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i8++;
                    }
                    this.playbackInfo = this.playbackInfo.copyWithTrackInfo(playingPeriod2.trackGroups, playingPeriod2.trackSelectorResult);
                    enableRenderers(zArr2, i9);
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                        updateLoadControlTrackSelection(playingPeriod.trackGroups, playingPeriod.trackSelectorResult);
                    }
                }
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z9 = false;
            }
        }
    }

    private void resetInternal(boolean z8, boolean z9, boolean z10) {
        Timeline timeline;
        Object obj;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j8;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        MediaSource mediaSource;
        this.handler.removeMessages(2);
        this.rebuffering = false;
        this.mediaClock.stop();
        this.rendererPositionUs = 0L;
        for (Renderer renderer : this.enabledRenderers) {
            try {
                disableRenderer(renderer);
            } catch (ExoPlaybackException | RuntimeException e8) {
                Log.e(TAG, "Stop failed.", e8);
            }
        }
        this.enabledRenderers = new Renderer[0];
        this.queue.clear(!z9);
        setIsLoading(false);
        if (z9) {
            this.pendingInitialSeekPosition = null;
        }
        if (z10) {
            this.queue.setTimeline(Timeline.EMPTY);
            Iterator<PendingMessageInfo> it = this.pendingMessages.iterator();
            while (it.hasNext()) {
                it.next().message.markAsProcessed(false);
            }
            this.pendingMessages.clear();
            this.nextPendingMessageIndex = 0;
        }
        if (z10) {
            timeline = Timeline.EMPTY;
        } else {
            timeline = this.playbackInfo.timeline;
        }
        Timeline timeline2 = timeline;
        if (z10) {
            obj = null;
        } else {
            obj = this.playbackInfo.manifest;
        }
        if (z9) {
            mediaPeriodId = new MediaSource.MediaPeriodId(getFirstPeriodIndex());
        } else {
            mediaPeriodId = this.playbackInfo.periodId;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        long j9 = C.TIME_UNSET;
        if (z9) {
            j8 = -9223372036854775807L;
        } else {
            j8 = this.playbackInfo.positionUs;
        }
        if (!z9) {
            j9 = this.playbackInfo.contentPositionUs;
        }
        long j10 = j9;
        PlaybackInfo playbackInfo = this.playbackInfo;
        int i8 = playbackInfo.playbackState;
        if (z10) {
            trackGroupArray = TrackGroupArray.EMPTY;
        } else {
            trackGroupArray = playbackInfo.trackGroups;
        }
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        if (z10) {
            trackSelectorResult = this.emptyTrackSelectorResult;
        } else {
            trackSelectorResult = playbackInfo.trackSelectorResult;
        }
        this.playbackInfo = new PlaybackInfo(timeline2, obj, mediaPeriodId2, j8, j10, i8, false, trackGroupArray2, trackSelectorResult);
        if (z8 && (mediaSource = this.mediaSource) != null) {
            mediaSource.releaseSource(this);
            this.mediaSource = null;
        }
    }

    private void resetRendererPosition(long j8) throws ExoPlaybackException {
        if (this.queue.hasPlayingPeriod()) {
            j8 = this.queue.getPlayingPeriod().toRendererTime(j8);
        }
        this.rendererPositionUs = j8;
        this.mediaClock.resetPosition(j8);
        for (Renderer renderer : this.enabledRenderers) {
            renderer.resetPosition(this.rendererPositionUs);
        }
    }

    private boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Integer, Long> resolveSeekPosition = resolveSeekPosition(new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getWindowIndex(), C.msToUs(pendingMessageInfo.message.getPositionMs())), false);
            if (resolveSeekPosition == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(((Integer) resolveSeekPosition.first).intValue(), ((Long) resolveSeekPosition.second).longValue(), this.playbackInfo.timeline.getPeriod(((Integer) resolveSeekPosition.first).intValue(), this.period, true).uid);
        } else {
            int indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(obj);
            if (indexOfPeriod == -1) {
                return false;
            }
            pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        }
        return true;
    }

    private void resolvePendingMessagePositions() {
        for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size))) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
        }
        Collections.sort(this.pendingMessages);
    }

    private Pair<Integer, Long> resolveSeekPosition(SeekPosition seekPosition, boolean z8) {
        int resolveSubsequentPeriod;
        Timeline timeline = this.playbackInfo.timeline;
        Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline2.isEmpty()) {
            timeline2 = timeline;
        }
        try {
            Pair<Integer, Long> periodPosition = timeline2.getPeriodPosition(this.window, this.period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            if (timeline == timeline2) {
                return periodPosition;
            }
            int indexOfPeriod = timeline.getIndexOfPeriod(timeline2.getPeriod(((Integer) periodPosition.first).intValue(), this.period, true).uid);
            if (indexOfPeriod != -1) {
                return Pair.create(Integer.valueOf(indexOfPeriod), (Long) periodPosition.second);
            }
            if (!z8 || (resolveSubsequentPeriod = resolveSubsequentPeriod(((Integer) periodPosition.first).intValue(), timeline2, timeline)) == -1) {
                return null;
            }
            return getPeriodPosition(timeline, timeline.getPeriod(resolveSubsequentPeriod, this.period).windowIndex, C.TIME_UNSET);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalSeekPositionException(timeline, seekPosition.windowIndex, seekPosition.windowPositionUs);
        }
    }

    private int resolveSubsequentPeriod(int i8, Timeline timeline, Timeline timeline2) {
        int periodCount = timeline.getPeriodCount();
        int i9 = i8;
        int i10 = -1;
        for (int i11 = 0; i11 < periodCount && i10 == -1; i11++) {
            i9 = timeline.getNextPeriodIndex(i9, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            if (i9 == -1) {
                break;
            }
            i10 = timeline2.getIndexOfPeriod(timeline.getPeriod(i9, this.period, true).uid);
        }
        return i10;
    }

    private void scheduleNextWork(long j8, long j9) {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessageAtTime(2, j8 + j9);
    }

    private void seekToCurrentPosition(boolean z8) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = playbackInfo.fromNewPosition(mediaPeriodId, seekToPeriodPosition, playbackInfo.contentPositionUs);
            if (z8) {
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:7:0x005d, B:9:0x0061, B:14:0x006a, B:22:0x0075, B:24:0x007f, B:28:0x008b, B:29:0x0095, B:31:0x00a5, B:37:0x00bc, B:40:0x00c6, B:44:0x00ca), top: B:6:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:7:0x005d, B:9:0x0061, B:14:0x006a, B:22:0x0075, B:24:0x007f, B:28:0x008b, B:29:0x0095, B:31:0x00a5, B:37:0x00bc, B:40:0x00c6, B:44:0x00ca), top: B:6:0x005d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void seekToInternal(com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerImplInternal.SeekPosition r21) throws com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerImplInternal.seekToInternal(com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerImplInternal$SeekPosition):void");
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j8) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j8, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod());
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.mediaSource != null && this.pendingPrepareCount <= 0) {
            PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
            if (resolvePendingMessagePosition(pendingMessageInfo)) {
                this.pendingMessages.add(pendingMessageInfo);
                Collections.sort(this.pendingMessages);
                return;
            } else {
                playerMessage.markAsProcessed(false);
                return;
            }
        }
        this.pendingMessages.add(new PendingMessageInfo(playerMessage));
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getHandler().getLooper() == this.handler.getLooper()) {
            deliverMessage(playerMessage);
            int i8 = this.playbackInfo.playbackState;
            if (i8 == 3 || i8 == 2) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        playerMessage.getHandler().post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerImplInternal.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ExoPlayerImplInternal.this.deliverMessage(playerMessage);
                } catch (ExoPlaybackException e8) {
                    Log.e(ExoPlayerImplInternal.TAG, "Unexpected error delivering message on external thread.", e8);
                    throw new RuntimeException(e8);
                }
            }
        });
    }

    private void setIsLoading(boolean z8) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.isLoading != z8) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z8);
        }
    }

    private void setPlayWhenReadyInternal(boolean z8) throws ExoPlaybackException {
        this.rebuffering = false;
        this.playWhenReady = z8;
        if (!z8) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i8 = this.playbackInfo.playbackState;
        if (i8 == 3) {
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i8 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) {
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void setRepeatModeInternal(int i8) throws ExoPlaybackException {
        this.repeatMode = i8;
        if (!this.queue.updateRepeatMode(i8)) {
            seekToCurrentPosition(true);
        }
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z8) throws ExoPlaybackException {
        this.shuffleModeEnabled = z8;
        if (!this.queue.updateShuffleModeEnabled(z8)) {
            seekToCurrentPosition(true);
        }
    }

    private void setState(int i8) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i8) {
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i8);
        }
    }

    private boolean shouldKeepPeriodHolder(MediaSource.MediaPeriodId mediaPeriodId, long j8, MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodId.equals(mediaPeriodHolder.info.id) && mediaPeriodHolder.prepared) {
            this.playbackInfo.timeline.getPeriod(mediaPeriodHolder.info.id.periodIndex, this.period);
            int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j8);
            if (adGroupIndexAfterPositionUs == -1 || this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs) == mediaPeriodHolder.info.endPositionUs) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean shouldTransitionToReadyState(boolean z8) {
        if (this.enabledRenderers.length == 0) {
            return isTimelineReady();
        }
        if (!z8) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long bufferedPositionUs = loadingPeriod.getBufferedPositionUs(!loadingPeriod.info.isFinal);
        if (bufferedPositionUs != Long.MIN_VALUE && !this.loadControl.shouldStartPlayback(bufferedPositionUs - loadingPeriod.toPeriodTime(this.rendererPositionUs), this.mediaClock.getPlaybackParameters().speed, this.rebuffering)) {
            return false;
        }
        return true;
    }

    private void startRenderers() throws ExoPlaybackException {
        this.rebuffering = false;
        this.mediaClock.start();
        for (Renderer renderer : this.enabledRenderers) {
            renderer.start();
        }
    }

    private void stopInternal(boolean z8, boolean z9) {
        resetInternal(true, z8, z8);
        this.playbackInfoUpdate.incrementPendingOperationAcks(this.pendingPrepareCount + (z9 ? 1 : 0));
        this.pendingPrepareCount = 0;
        this.loadControl.onStopped();
        setState(1);
    }

    private void stopRenderers() throws ExoPlaybackException {
        this.mediaClock.stop();
        for (Renderer renderer : this.enabledRenderers) {
            ensureStopped(renderer);
        }
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private void updatePeriods() throws ExoPlaybackException, IOException {
        boolean z8;
        boolean z9;
        int i8;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource == null) {
            return;
        }
        if (this.pendingPrepareCount > 0) {
            mediaSource.maybeThrowSourceInfoRefreshError();
            return;
        }
        maybeUpdateLoadingPeriod();
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        int i9 = 0;
        if (loadingPeriod != null && !loadingPeriod.isFullyBuffered()) {
            if (!this.playbackInfo.isLoading) {
                maybeContinueLoading();
            }
        } else {
            setIsLoading(false);
        }
        if (!this.queue.hasPlayingPeriod()) {
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z10 = false;
        while (this.playWhenReady && playingPeriod != readingPeriod && this.rendererPositionUs >= playingPeriod.next.rendererPositionOffsetUs) {
            if (z10) {
                maybeNotifyPlaybackInfoChanged();
            }
            if (playingPeriod.info.isLastInTimelinePeriod) {
                i8 = 0;
            } else {
                i8 = 3;
            }
            MediaPeriodHolder advancePlayingPeriod = this.queue.advancePlayingPeriod();
            updatePlayingPeriodRenderers(playingPeriod);
            PlaybackInfo playbackInfo = this.playbackInfo;
            MediaPeriodInfo mediaPeriodInfo = advancePlayingPeriod.info;
            this.playbackInfo = playbackInfo.fromNewPosition(mediaPeriodInfo.id, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.contentPositionUs);
            this.playbackInfoUpdate.setPositionDiscontinuity(i8);
            updatePlaybackPositions();
            playingPeriod = advancePlayingPeriod;
            z10 = true;
        }
        if (readingPeriod.info.isFinal) {
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i9 < rendererArr.length) {
                    Renderer renderer = rendererArr[i9];
                    SampleStream sampleStream = readingPeriod.sampleStreams[i9];
                    if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                        renderer.setCurrentStreamFinal();
                    }
                    i9++;
                } else {
                    return;
                }
            }
        } else {
            MediaPeriodHolder mediaPeriodHolder = readingPeriod.next;
            if (mediaPeriodHolder != null && mediaPeriodHolder.prepared) {
                int i10 = 0;
                while (true) {
                    Renderer[] rendererArr2 = this.renderers;
                    if (i10 < rendererArr2.length) {
                        Renderer renderer2 = rendererArr2[i10];
                        SampleStream sampleStream2 = readingPeriod.sampleStreams[i10];
                        if (renderer2.getStream() == sampleStream2) {
                            if (sampleStream2 == null || renderer2.hasReadStreamToEnd()) {
                                i10++;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        TrackSelectorResult trackSelectorResult = readingPeriod.trackSelectorResult;
                        MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                        TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.trackSelectorResult;
                        if (advanceReadingPeriod.mediaPeriod.readDiscontinuity() != C.TIME_UNSET) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        int i11 = 0;
                        while (true) {
                            Renderer[] rendererArr3 = this.renderers;
                            if (i11 < rendererArr3.length) {
                                Renderer renderer3 = rendererArr3[i11];
                                if (trackSelectorResult.isRendererEnabled(i11)) {
                                    if (!z8) {
                                        if (!renderer3.isCurrentStreamFinal()) {
                                            TrackSelection trackSelection = trackSelectorResult2.selections.get(i11);
                                            boolean isRendererEnabled = trackSelectorResult2.isRendererEnabled(i11);
                                            if (this.rendererCapabilities[i11].getTrackType() == 5) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i11];
                                            RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i11];
                                            if (isRendererEnabled && rendererConfiguration2.equals(rendererConfiguration) && !z9) {
                                                renderer3.replaceStream(getFormats(trackSelection), advanceReadingPeriod.sampleStreams[i11], advanceReadingPeriod.getRendererOffset());
                                            }
                                        }
                                    }
                                    renderer3.setCurrentStreamFinal();
                                }
                                i11++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        long bufferedPositionUs;
        if (!this.queue.hasPlayingPeriod()) {
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long readDiscontinuity = playingPeriod.mediaPeriod.readDiscontinuity();
        if (readDiscontinuity != C.TIME_UNSET) {
            resetRendererPosition(readDiscontinuity);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                this.playbackInfo = playbackInfo.fromNewPosition(playbackInfo.periodId, readDiscontinuity, playbackInfo.contentPositionUs);
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs();
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            this.playbackInfo.positionUs = periodTime;
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (this.enabledRenderers.length == 0) {
            bufferedPositionUs = playingPeriod.info.durationUs;
        } else {
            bufferedPositionUs = playingPeriod.getBufferedPositionUs(true);
        }
        playbackInfo2.bufferedPositionUs = bufferedPositionUs;
    }

    private void updatePlayingPeriodRenderers(MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        boolean z8;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null && mediaPeriodHolder != playingPeriod) {
            boolean[] zArr = new boolean[this.renderers.length];
            int i8 = 0;
            int i9 = 0;
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i8 < rendererArr.length) {
                    Renderer renderer = rendererArr[i8];
                    if (renderer.getState() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zArr[i8] = z8;
                    if (playingPeriod.trackSelectorResult.isRendererEnabled(i8)) {
                        i9++;
                    }
                    if (zArr[i8] && (!playingPeriod.trackSelectorResult.isRendererEnabled(i8) || (renderer.isCurrentStreamFinal() && renderer.getStream() == mediaPeriodHolder.sampleStreams[i8]))) {
                        disableRenderer(renderer);
                    }
                    i8++;
                } else {
                    this.playbackInfo = this.playbackInfo.copyWithTrackInfo(playingPeriod.trackGroups, playingPeriod.trackSelectorResult);
                    enableRenderers(zArr, i9);
                    return;
                }
            }
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f8) {
        for (MediaPeriodHolder frontPeriod = this.queue.getFrontPeriod(); frontPeriod != null; frontPeriod = frontPeriod.next) {
            TrackSelectorResult trackSelectorResult = frontPeriod.trackSelectorResult;
            if (trackSelectorResult != null) {
                for (TrackSelection trackSelection : trackSelectorResult.selections.getAll()) {
                    if (trackSelection != null) {
                        trackSelection.onPlaybackSpeed(f8);
                    }
                }
            }
        }
    }

    public final Looper getPlaybackLooper() {
        return this.internalPlaybackThread.getLooper();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        try {
            switch (message.what) {
                case 0:
                    MediaSource mediaSource = (MediaSource) message.obj;
                    if (message.arg1 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (message.arg2 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    prepareInternal(mediaSource, z8, z9);
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    setPlayWhenReadyInternal(z10);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    stopInternal(z11, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handleSourceInfoRefreshed((MediaSourceRefreshInfo) message.obj);
                    break;
                case 9:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 10:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 11:
                    reselectTracksInternal();
                    break;
                case 12:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    setShuffleModeEnabledInternal(z12);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                default:
                    return false;
            }
            maybeNotifyPlaybackInfoChanged();
        } catch (ExoPlaybackException e8) {
            Log.e(TAG, "Playback error.", e8);
            stopInternal(false, false);
            this.eventHandler.obtainMessage(2, e8).sendToTarget();
            maybeNotifyPlaybackInfoChanged();
        } catch (IOException e9) {
            Log.e(TAG, "Source error.", e9);
            stopInternal(false, false);
            this.eventHandler.obtainMessage(2, ExoPlaybackException.createForSource(e9)).sendToTarget();
            maybeNotifyPlaybackInfoChanged();
        } catch (RuntimeException e10) {
            Log.e(TAG, "Internal runtime error.", e10);
            stopInternal(false, false);
            this.eventHandler.obtainMessage(2, ExoPlaybackException.createForUnexpected(e10)).sendToTarget();
            maybeNotifyPlaybackInfoChanged();
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.DefaultMediaClock.PlaybackParameterListener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.eventHandler.obtainMessage(1, playbackParameters).sendToTarget();
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource.SourceInfoRefreshListener
    public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline, Object obj) {
        this.handler.obtainMessage(8, new MediaSourceRefreshInfo(mediaSource, timeline, obj)).sendToTarget();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public final void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(11);
    }

    public final void prepare(MediaSource mediaSource, boolean z8, boolean z9) {
        this.handler.obtainMessage(0, z8 ? 1 : 0, z9 ? 1 : 0, mediaSource).sendToTarget();
    }

    public final synchronized void release() {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.sendEmptyMessage(7);
            long elapsedRealtime = this.clock.elapsedRealtime();
            long j8 = DEFAULT_RELEASE_TIMEOUT_MS;
            long j9 = elapsedRealtime + DEFAULT_RELEASE_TIMEOUT_MS;
            boolean z8 = false;
            while (!this.released && j8 > 0) {
                try {
                    wait(j8);
                } catch (InterruptedException unused) {
                    z8 = true;
                }
                j8 = j9 - this.clock.elapsedRealtime();
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void seekTo(Timeline timeline, int i8, long j8) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i8, j8)).sendToTarget();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Sender
    public final synchronized void sendMessage(PlayerMessage playerMessage) {
        if (this.released) {
            Log.w(TAG, "Ignoring messages sent after release.");
            playerMessage.markAsProcessed(false);
        } else {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
        }
    }

    public final void setPlayWhenReady(boolean z8) {
        this.handler.obtainMessage(1, z8 ? 1 : 0, 0).sendToTarget();
    }

    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public final void setRepeatMode(int i8) {
        this.handler.obtainMessage(12, i8, 0).sendToTarget();
    }

    public final void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public final void setShuffleModeEnabled(boolean z8) {
        this.handler.obtainMessage(13, z8 ? 1 : 0, 0).sendToTarget();
    }

    public final void stop(boolean z8) {
        this.handler.obtainMessage(6, z8 ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader.Callback
    public final void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(10, mediaPeriod).sendToTarget();
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j8, boolean z8) throws ExoPlaybackException {
        stopRenderers();
        this.rebuffering = false;
        setState(2);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (true) {
            if (mediaPeriodHolder == null) {
                break;
            }
            if (shouldKeepPeriodHolder(mediaPeriodId, j8, mediaPeriodHolder)) {
                this.queue.removeAfter(mediaPeriodHolder);
                break;
            }
            mediaPeriodHolder = this.queue.advancePlayingPeriod();
        }
        if (playingPeriod != mediaPeriodHolder || z8) {
            for (Renderer renderer : this.enabledRenderers) {
                disableRenderer(renderer);
            }
            this.enabledRenderers = new Renderer[0];
            playingPeriod = null;
        }
        if (mediaPeriodHolder != null) {
            updatePlayingPeriodRenderers(playingPeriod);
            if (mediaPeriodHolder.hasEnabledTracks) {
                j8 = mediaPeriodHolder.mediaPeriod.seekToUs(j8);
                mediaPeriodHolder.mediaPeriod.discardBuffer(j8 - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j8);
            maybeContinueLoading();
        } else {
            this.queue.clear(true);
            resetRendererPosition(j8);
        }
        this.handler.sendEmptyMessage(2);
        return j8;
    }
}
