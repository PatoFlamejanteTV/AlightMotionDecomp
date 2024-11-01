package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectorResult;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
final class ExoPlayerImpl implements ExoPlayer {
    private static final String TAG = "ExoPlayerImpl";
    private final TrackSelectorResult emptyTrackSelectorResult;
    private final Handler eventHandler;
    private boolean hasPendingPrepare;
    private boolean hasPendingSeek;
    private final ExoPlayerImplInternal internalPlayer;
    private final Handler internalPlayerHandler;
    private final CopyOnWriteArraySet<Player.EventListener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private int pendingOperationAcks;
    private final ArrayDeque<PlaybackInfoUpdate> pendingPlaybackInfoUpdates;
    private final Timeline.Period period;
    private boolean playWhenReady;
    private ExoPlaybackException playbackError;
    private PlaybackInfo playbackInfo;
    private PlaybackParameters playbackParameters;
    private final Renderer[] renderers;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PlaybackInfoUpdate {
        private final boolean isLoadingChanged;
        private final Set<Player.EventListener> listeners;
        private final boolean playWhenReady;
        private final PlaybackInfo playbackInfo;
        private final boolean playbackStateOrPlayWhenReadyChanged;
        private final boolean positionDiscontinuity;
        private final int positionDiscontinuityReason;
        private final boolean seekProcessed;
        private final int timelineChangeReason;
        private final boolean timelineOrManifestChanged;
        private final TrackSelector trackSelector;
        private final boolean trackSelectorResultChanged;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2, Set<Player.EventListener> set, TrackSelector trackSelector, boolean z8, int i8, int i9, boolean z9, boolean z10, boolean z11) {
            boolean z12;
            boolean z13;
            boolean z14;
            this.playbackInfo = playbackInfo;
            this.listeners = set;
            this.trackSelector = trackSelector;
            this.positionDiscontinuity = z8;
            this.positionDiscontinuityReason = i8;
            this.timelineChangeReason = i9;
            this.seekProcessed = z9;
            this.playWhenReady = z10;
            if (!z11 && playbackInfo2.playbackState == playbackInfo.playbackState) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.playbackStateOrPlayWhenReadyChanged = z12;
            if (playbackInfo2.timeline == playbackInfo.timeline && playbackInfo2.manifest == playbackInfo.manifest) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.timelineOrManifestChanged = z13;
            if (playbackInfo2.isLoading != playbackInfo.isLoading) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.isLoadingChanged = z14;
            this.trackSelectorResultChanged = playbackInfo2.trackSelectorResult != playbackInfo.trackSelectorResult;
        }

        public final void notifyListeners() {
            if (this.timelineOrManifestChanged || this.timelineChangeReason == 0) {
                for (Player.EventListener eventListener : this.listeners) {
                    PlaybackInfo playbackInfo = this.playbackInfo;
                    eventListener.onTimelineChanged(playbackInfo.timeline, playbackInfo.manifest, this.timelineChangeReason);
                }
            }
            if (this.positionDiscontinuity) {
                Iterator<Player.EventListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onPositionDiscontinuity(this.positionDiscontinuityReason);
                }
            }
            if (this.trackSelectorResultChanged) {
                this.trackSelector.onSelectionActivated(this.playbackInfo.trackSelectorResult.info);
                for (Player.EventListener eventListener2 : this.listeners) {
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    eventListener2.onTracksChanged(playbackInfo2.trackGroups, playbackInfo2.trackSelectorResult.selections);
                }
            }
            if (this.isLoadingChanged) {
                Iterator<Player.EventListener> it2 = this.listeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onLoadingChanged(this.playbackInfo.isLoading);
                }
            }
            if (this.playbackStateOrPlayWhenReadyChanged) {
                Iterator<Player.EventListener> it3 = this.listeners.iterator();
                while (it3.hasNext()) {
                    it3.next().onPlayerStateChanged(this.playWhenReady, this.playbackInfo.playbackState);
                }
            }
            if (this.seekProcessed) {
                Iterator<Player.EventListener> it4 = this.listeners.iterator();
                while (it4.hasNext()) {
                    it4.next().onSeekProcessed();
                }
            }
        }
    }

    public ExoPlayerImpl(Renderer[] rendererArr, TrackSelector trackSelector, LoadControl loadControl, Clock clock) {
        boolean z8;
        Looper mainLooper;
        Log.i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + ExoPlayerLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "]");
        if (rendererArr.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.renderers = (Renderer[]) Assertions.checkNotNull(rendererArr);
        this.trackSelector = (TrackSelector) Assertions.checkNotNull(trackSelector);
        this.playWhenReady = false;
        this.repeatMode = 0;
        this.shuffleModeEnabled = false;
        this.listeners = new CopyOnWriteArraySet<>();
        TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArr.length], new TrackSelection[rendererArr.length], null);
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.playbackParameters = PlaybackParameters.DEFAULT;
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(mainLooper) { // from class: com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerImpl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ExoPlayerImpl.this.handleEvent(message);
            }
        };
        this.eventHandler = handler;
        this.playbackInfo = new PlaybackInfo(Timeline.EMPTY, 0L, TrackGroupArray.EMPTY, trackSelectorResult);
        this.pendingPlaybackInfoUpdates = new ArrayDeque<>();
        ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(rendererArr, trackSelector, trackSelectorResult, loadControl, this.playWhenReady, this.repeatMode, this.shuffleModeEnabled, handler, this, clock);
        this.internalPlayer = exoPlayerImplInternal;
        this.internalPlayerHandler = new Handler(exoPlayerImplInternal.getPlaybackLooper());
    }

    private PlaybackInfo getResetPlaybackInfo(boolean z8, boolean z9, int i8) {
        Timeline timeline;
        Object obj;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        if (z8) {
            this.maskingWindowIndex = 0;
            this.maskingPeriodIndex = 0;
            this.maskingWindowPositionMs = 0L;
        } else {
            this.maskingWindowIndex = getCurrentWindowIndex();
            this.maskingPeriodIndex = getCurrentPeriodIndex();
            this.maskingWindowPositionMs = getCurrentPosition();
        }
        if (z9) {
            timeline = Timeline.EMPTY;
        } else {
            timeline = this.playbackInfo.timeline;
        }
        Timeline timeline2 = timeline;
        if (z9) {
            obj = null;
        } else {
            obj = this.playbackInfo.manifest;
        }
        Object obj2 = obj;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        long j8 = playbackInfo.startPositionUs;
        long j9 = playbackInfo.contentPositionUs;
        if (z9) {
            trackGroupArray = TrackGroupArray.EMPTY;
        } else {
            trackGroupArray = playbackInfo.trackGroups;
        }
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        if (z9) {
            trackSelectorResult = this.emptyTrackSelectorResult;
        } else {
            trackSelectorResult = playbackInfo.trackSelectorResult;
        }
        return new PlaybackInfo(timeline2, obj2, mediaPeriodId, j8, j9, i8, false, trackGroupArray2, trackSelectorResult);
    }

    private void handlePlaybackInfo(PlaybackInfo playbackInfo, int i8, boolean z8, int i9) {
        int i10;
        int i11 = this.pendingOperationAcks - i8;
        this.pendingOperationAcks = i11;
        if (i11 == 0) {
            if (playbackInfo.startPositionUs == C.TIME_UNSET) {
                playbackInfo = playbackInfo.fromNewPosition(playbackInfo.periodId, 0L, playbackInfo.contentPositionUs);
            }
            PlaybackInfo playbackInfo2 = playbackInfo;
            if ((!this.playbackInfo.timeline.isEmpty() || this.hasPendingPrepare) && playbackInfo2.timeline.isEmpty()) {
                this.maskingPeriodIndex = 0;
                this.maskingWindowIndex = 0;
                this.maskingWindowPositionMs = 0L;
            }
            if (this.hasPendingPrepare) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            boolean z9 = this.hasPendingSeek;
            this.hasPendingPrepare = false;
            this.hasPendingSeek = false;
            updatePlaybackInfo(playbackInfo2, z8, i9, i10, z9, false);
        }
    }

    private long playbackInfoPositionUsToWindowPositionMs(long j8) {
        long usToMs = C.usToMs(j8);
        if (!this.playbackInfo.periodId.isAd()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            playbackInfo.timeline.getPeriod(playbackInfo.periodId.periodIndex, this.period);
            return usToMs + this.period.getPositionInWindowMs();
        }
        return usToMs;
    }

    private boolean shouldMaskPosition() {
        if (!this.playbackInfo.timeline.isEmpty() && this.pendingOperationAcks <= 0) {
            return false;
        }
        return true;
    }

    private void updatePlaybackInfo(PlaybackInfo playbackInfo, boolean z8, int i8, int i9, boolean z9, boolean z10) {
        boolean z11 = !this.pendingPlaybackInfoUpdates.isEmpty();
        this.pendingPlaybackInfoUpdates.addLast(new PlaybackInfoUpdate(playbackInfo, this.playbackInfo, this.listeners, this.trackSelector, z8, i8, i9, z9, this.playWhenReady, z10));
        this.playbackInfo = playbackInfo;
        if (z11) {
            return;
        }
        while (!this.pendingPlaybackInfoUpdates.isEmpty()) {
            this.pendingPlaybackInfoUpdates.peekFirst().notifyListeners();
            this.pendingPlaybackInfoUpdates.removeFirst();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void addListener(Player.EventListener eventListener) {
        this.listeners.add(eventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public final void blockingSendMessages(ExoPlayer.ExoPlayerMessage... exoPlayerMessageArr) {
        ArrayList<PlayerMessage> arrayList = new ArrayList();
        for (ExoPlayer.ExoPlayerMessage exoPlayerMessage : exoPlayerMessageArr) {
            arrayList.add(createMessage(exoPlayerMessage.target).setType(exoPlayerMessage.messageType).setPayload(exoPlayerMessage.message).send());
        }
        boolean z8 = false;
        for (PlayerMessage playerMessage : arrayList) {
            boolean z9 = true;
            while (z9) {
                try {
                    playerMessage.blockUntilDelivered();
                    z9 = false;
                } catch (InterruptedException unused) {
                    z8 = true;
                } catch (TimeoutException e8) {
                    ad.b(TAG, e8.getMessage());
                }
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public final PlayerMessage createMessage(PlayerMessage.Target target) {
        return new PlayerMessage(this.internalPlayer, target, this.playbackInfo.timeline, getCurrentWindowIndex(), this.internalPlayerHandler);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return Util.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final long getBufferedPosition() {
        if (shouldMaskPosition()) {
            return this.maskingWindowPositionMs;
        }
        return playbackInfoPositionUsToWindowPositionMs(this.playbackInfo.bufferedPositionUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final long getContentPosition() {
        if (isPlayingAd()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            playbackInfo.timeline.getPeriod(playbackInfo.periodId.periodIndex, this.period);
            return this.period.getPositionInWindowMs() + C.usToMs(this.playbackInfo.contentPositionUs);
        }
        return getCurrentPosition();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final Object getCurrentManifest() {
        return this.playbackInfo.manifest;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
        if (shouldMaskPosition()) {
            return this.maskingPeriodIndex;
        }
        return this.playbackInfo.periodId.periodIndex;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final long getCurrentPosition() {
        if (shouldMaskPosition()) {
            return this.maskingWindowPositionMs;
        }
        return playbackInfoPositionUsToWindowPositionMs(this.playbackInfo.positionUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final Object getCurrentTag() {
        int currentWindowIndex = getCurrentWindowIndex();
        if (currentWindowIndex > this.playbackInfo.timeline.getWindowCount()) {
            return null;
        }
        return this.playbackInfo.timeline.getWindow(currentWindowIndex, this.window, true).tag;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final Timeline getCurrentTimeline() {
        return this.playbackInfo.timeline;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final TrackGroupArray getCurrentTrackGroups() {
        return this.playbackInfo.trackGroups;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final TrackSelectionArray getCurrentTrackSelections() {
        return this.playbackInfo.trackSelectorResult.selections;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getCurrentWindowIndex() {
        if (shouldMaskPosition()) {
            return this.maskingWindowIndex;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.timeline.getPeriod(playbackInfo.periodId.periodIndex, this.period).windowIndex;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final long getDuration() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (isPlayingAd()) {
            MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
            timeline.getPeriod(mediaPeriodId.periodIndex, this.period);
            return C.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
        }
        return timeline.getWindow(getCurrentWindowIndex(), this.window).getDurationMs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getNextWindowIndex() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return -1;
        }
        return timeline.getNextWindowIndex(getCurrentWindowIndex(), this.repeatMode, this.shuffleModeEnabled);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final ExoPlaybackException getPlaybackError() {
        return this.playbackError;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public final Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getPlaybackState() {
        return this.playbackInfo.playbackState;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getPreviousWindowIndex() {
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty()) {
            return -1;
        }
        return timeline.getPreviousWindowIndex(getCurrentWindowIndex(), this.repeatMode, this.shuffleModeEnabled);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getRendererCount() {
        return this.renderers.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getRendererType(int i8) {
        return this.renderers[i8].getTrackType();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final int getRepeatMode() {
        return this.repeatMode;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
        return this.shuffleModeEnabled;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final Player.TextComponent getTextComponent() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final Player.VideoComponent getVideoComponent() {
        return null;
    }

    final void handleEvent(Message message) {
        int i8 = message.what;
        boolean z8 = true;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
                    this.playbackError = exoPlaybackException;
                    Iterator<Player.EventListener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onPlayerError(exoPlaybackException);
                    }
                    return;
                }
                throw new IllegalStateException();
            }
            PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
            if (!this.playbackParameters.equals(playbackParameters)) {
                this.playbackParameters = playbackParameters;
                Iterator<Player.EventListener> it2 = this.listeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onPlaybackParametersChanged(playbackParameters);
                }
                return;
            }
            return;
        }
        PlaybackInfo playbackInfo = (PlaybackInfo) message.obj;
        int i9 = message.arg1;
        int i10 = message.arg2;
        if (i10 == -1) {
            z8 = false;
        }
        handlePlaybackInfo(playbackInfo, i9, z8, i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final boolean isCurrentWindowDynamic() {
        Timeline timeline = this.playbackInfo.timeline;
        if (!timeline.isEmpty() && timeline.getWindow(getCurrentWindowIndex(), this.window).isDynamic) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final boolean isCurrentWindowSeekable() {
        Timeline timeline = this.playbackInfo.timeline;
        if (!timeline.isEmpty() && timeline.getWindow(getCurrentWindowIndex(), this.window).isSeekable) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final boolean isLoading() {
        return this.playbackInfo.isLoading;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final boolean isPlayingAd() {
        if (!shouldMaskPosition() && this.playbackInfo.periodId.isAd()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public final void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void release() {
        Log.i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + ExoPlayerLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "] [" + ExoPlayerLibraryInfo.registeredModules() + "]");
        this.internalPlayer.release();
        this.eventHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void removeListener(Player.EventListener eventListener) {
        this.listeners.remove(eventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void seekTo(long j8) {
        seekTo(getCurrentWindowIndex(), j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void seekToDefaultPosition() {
        seekToDefaultPosition(getCurrentWindowIndex());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public final void sendMessages(ExoPlayer.ExoPlayerMessage... exoPlayerMessageArr) {
        for (ExoPlayer.ExoPlayerMessage exoPlayerMessage : exoPlayerMessageArr) {
            createMessage(exoPlayerMessage.target).setType(exoPlayerMessage.messageType).setPayload(exoPlayerMessage.message).send();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void setPlayWhenReady(boolean z8) {
        if (this.playWhenReady != z8) {
            this.playWhenReady = z8;
            this.internalPlayer.setPlayWhenReady(z8);
            updatePlaybackInfo(this.playbackInfo, false, 4, 1, false, true);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        this.internalPlayer.setPlaybackParameters(playbackParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void setRepeatMode(int i8) {
        if (this.repeatMode != i8) {
            this.repeatMode = i8;
            this.internalPlayer.setRepeatMode(i8);
            Iterator<Player.EventListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i8);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public final void setSeekParameters(SeekParameters seekParameters) {
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void setShuffleModeEnabled(boolean z8) {
        if (this.shuffleModeEnabled != z8) {
            this.shuffleModeEnabled = z8;
            this.internalPlayer.setShuffleModeEnabled(z8);
            Iterator<Player.EventListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z8);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void stop() {
        stop(false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer
    public final void prepare(MediaSource mediaSource, boolean z8, boolean z9) {
        this.playbackError = null;
        PlaybackInfo resetPlaybackInfo = getResetPlaybackInfo(z8, z9, 2);
        this.hasPendingPrepare = true;
        this.pendingOperationAcks++;
        this.internalPlayer.prepare(mediaSource, z8, z9);
        updatePlaybackInfo(resetPlaybackInfo, false, 4, 1, false, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void seekTo(int i8, long j8) {
        Timeline timeline = this.playbackInfo.timeline;
        if (i8 >= 0 && (timeline.isEmpty() || i8 < timeline.getWindowCount())) {
            this.hasPendingSeek = true;
            this.pendingOperationAcks++;
            if (isPlayingAd()) {
                Log.w(TAG, "seekTo ignored because an ad is playing");
                this.eventHandler.obtainMessage(0, 1, -1, this.playbackInfo).sendToTarget();
                return;
            }
            this.maskingWindowIndex = i8;
            if (timeline.isEmpty()) {
                this.maskingWindowPositionMs = j8 == C.TIME_UNSET ? 0L : j8;
                this.maskingPeriodIndex = 0;
            } else {
                long defaultPositionUs = j8 == C.TIME_UNSET ? timeline.getWindow(i8, this.window).getDefaultPositionUs() : C.msToUs(j8);
                Pair<Integer, Long> periodPosition = timeline.getPeriodPosition(this.window, this.period, i8, defaultPositionUs);
                this.maskingWindowPositionMs = C.usToMs(defaultPositionUs);
                this.maskingPeriodIndex = ((Integer) periodPosition.first).intValue();
            }
            this.internalPlayer.seekTo(timeline, i8, C.msToUs(j8));
            Iterator<Player.EventListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onPositionDiscontinuity(1);
            }
            return;
        }
        throw new IllegalSeekPositionException(timeline, i8, j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void seekToDefaultPosition(int i8) {
        seekTo(i8, C.TIME_UNSET);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player
    public final void stop(boolean z8) {
        if (z8) {
            this.playbackError = null;
        }
        PlaybackInfo resetPlaybackInfo = getResetPlaybackInfo(z8, z8, 1);
        this.pendingOperationAcks++;
        this.internalPlayer.stop(z8);
        updatePlaybackInfo(resetPlaybackInfo, false, 4, 1, false, false);
    }
}
