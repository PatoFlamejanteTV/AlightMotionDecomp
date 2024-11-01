package com.mbridge.msdk.playercommon;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class VideoNativePlayer implements Player.EventListener {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final int INTERVAL_TIME_PLAY_TIME_PROGRESS = 100;
    public static final String TAG = "VideoNativePlayer";
    private SimpleExoPlayer exoPlayer;
    private Timer mBufferTimeoutTimer;
    private long mCurrentPosition;
    private VideoPlayerStatusListener mInnerVFPLisener;
    private View mLoadingView;
    private String mNetUrl;
    private VideoPlayerStatusListener mOutterVFListener;
    private String mPlayUrl;
    private Surface mSurfaceHolder;
    private MediaSource mediaSource;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsStartPlay = true;
    private boolean mIsAllowLoopPlay = true;
    private boolean mHasChaoDi = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private boolean mIsOpenSound = true;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private Runnable playProgressRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.2
        @Override // java.lang.Runnable
        public void run() {
            int i8;
            try {
                if (VideoNativePlayer.this.exoPlayer != null && VideoNativePlayer.this.exoPlayerIsPlaying()) {
                    VideoNativePlayer videoNativePlayer = VideoNativePlayer.this;
                    videoNativePlayer.mCurrentPosition = videoNativePlayer.exoPlayer.getCurrentPosition();
                    int i9 = (int) (VideoNativePlayer.this.mCurrentPosition / 1000);
                    ad.c(VideoNativePlayer.TAG, "currentPosition:" + i9 + " mCurrentPosition:" + VideoNativePlayer.this.mCurrentPosition);
                    if (VideoNativePlayer.this.exoPlayer != null && VideoNativePlayer.this.exoPlayer.getDuration() > 0) {
                        i8 = (int) (VideoNativePlayer.this.exoPlayer.getDuration() / 1000);
                    } else {
                        i8 = 0;
                    }
                    if (VideoNativePlayer.this.mIsStartPlay) {
                        VideoNativePlayer.this.postOnPlayStartOnMainThread(i8);
                        ad.c(VideoNativePlayer.TAG, "onPlayStarted()");
                        VideoNativePlayer.this.mIsStartPlay = false;
                    }
                    if (i9 >= 0 && i8 > 0 && VideoNativePlayer.this.exoPlayerIsPlaying()) {
                        VideoNativePlayer.this.postOnPlayProgressOnMainThread(i9, i8);
                    }
                    VideoNativePlayer.this.mIsComplete = false;
                    if (!VideoNativePlayer.this.mIsBuffering) {
                        VideoNativePlayer.this.hideLoading();
                    }
                    VideoNativePlayer.this.mHandler.postDelayed(this, 1000L);
                }
            } catch (Exception e8) {
                ad.b(VideoNativePlayer.TAG, e8.getMessage());
            }
        }
    };
    private Runnable playProgressMSRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.3
        @Override // java.lang.Runnable
        public void run() {
            long j8;
            try {
                if (VideoNativePlayer.this.exoPlayer != null && VideoNativePlayer.this.exoPlayerIsPlaying()) {
                    VideoNativePlayer videoNativePlayer = VideoNativePlayer.this;
                    videoNativePlayer.mCurrentPosition = videoNativePlayer.exoPlayer.getCurrentPosition();
                    long j9 = VideoNativePlayer.this.mCurrentPosition / 100;
                    if (VideoNativePlayer.this.exoPlayer != null && VideoNativePlayer.this.exoPlayer.getDuration() > 0) {
                        j8 = VideoNativePlayer.this.exoPlayer.getDuration() / 100;
                    } else {
                        j8 = 0;
                    }
                    if (j9 >= 0 && j8 > 0 && VideoNativePlayer.this.exoPlayerIsPlaying()) {
                        VideoNativePlayer videoNativePlayer2 = VideoNativePlayer.this;
                        videoNativePlayer2.postOnPlayProgressMSOnMainThread(videoNativePlayer2.mCurrentPosition / 100, j8);
                    }
                    VideoNativePlayer.this.mHandler.postDelayed(this, 100L);
                }
            } catch (Exception e8) {
                ad.b(VideoNativePlayer.TAG, e8.getMessage());
            }
        }
    };

    private void cancelBufferTimeoutTimer() {
        try {
            Timer timer = this.mBufferTimeoutTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void cancelPlayProgressTimer() {
        try {
            this.mHandler.removeCallbacks(this.playProgressRunnable);
            this.mHandler.removeCallbacks(this.playProgressMSRunnable);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.6
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoNativePlayer.this.mLoadingView != null) {
                        VideoNativePlayer.this.mLoadingView.setVisibility(8);
                    }
                }
            });
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void postOnBufferinEndOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onBufferingEnd();
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onBufferingEnd();
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onBufferingStart(str);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onBufferingStart(str);
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void postOnPlayCompletedOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.14
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayCompleted();
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayCompleted();
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void postOnPlayErrorOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayError(str);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayError(str);
                        }
                    }
                });
            }
            k.a(42, this.mPlayUrl, str);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressMSOnMainThread(final long j8, final long j9) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayProgressMS((int) j8, (int) j9);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayProgressMS((int) j8, (int) j9);
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i8, final int i9) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayProgress(i8, i9);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayProgress(i8, i9);
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void postOnPlaySetDataSourceError2MainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                        }
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayStartOnMainThread(final int i8) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayStarted(i8);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayStarted(i8);
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void startBufferingTimer(final String str) {
        if (!this.mIsNeedBufferingTimeout) {
            ad.b(TAG, "不需要缓冲超时功能");
            return;
        }
        cancelBufferTimeoutTimer();
        Timer timer = new Timer();
        this.mBufferTimeoutTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    if (VideoNativePlayer.this.mHasPrepare && !VideoNativePlayer.this.mIsBuffering) {
                        return;
                    }
                    ad.b(VideoNativePlayer.TAG, "缓冲超时");
                    VideoNativePlayer.this.postOnBufferingStarOnMainThread(str);
                } catch (Exception e8) {
                    ad.b(VideoNativePlayer.TAG, e8.getMessage());
                }
            }
        }, this.mBufferTime * 1000);
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
            this.mHandler.post(this.playProgressMSRunnable);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void closeSound() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer == null) {
                return;
            }
            simpleExoPlayer.setVolume(0.0f);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public boolean exoPlayerIsPlaying() {
        if (this.exoPlayer.getPlaybackState() == 3 && this.exoPlayer.getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public boolean hasPrepare() {
        return this.mHasPrepare;
    }

    public void initBufferIngParam(int i8) {
        if (i8 > 0) {
            this.mBufferTime = i8;
        }
        this.mIsNeedBufferingTimeout = true;
        ad.c(TAG, "mIsNeedBufferingTimeout:" + this.mIsNeedBufferingTimeout + "  mMaxBufferTime:" + this.mBufferTime);
    }

    public boolean initParameter(String str, boolean z8, boolean z9, View view, VideoPlayerStatusListener videoPlayerStatusListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                ad.c(TAG, "netUrl为空 return");
                postOnPlayErrorOnMainThread(PlayerErrorConstant.MEDIAPLAYER_INIT_FAILED);
                return false;
            }
            if (view == null) {
                ad.c(TAG, "loadingView为空 return");
                postOnPlayErrorOnMainThread(PlayerErrorConstant.MEDIAPLAYER_INIT_FAILED);
                return false;
            }
            this.mIsOpenSound = z8;
            this.mIsAllowLoopPlay = z9;
            this.mLoadingView = view;
            this.mNetUrl = str;
            this.mOutterVFListener = videoPlayerStatusListener;
            return true;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            postOnPlayErrorOnMainThread(th.toString());
            return false;
        }
    }

    public boolean isComplete() {
        return this.mIsComplete;
    }

    public boolean isPlayIng() {
        try {
            if (this.exoPlayer != null) {
                if (exoPlayerIsPlaying()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        return exoPlayerIsPlaying();
    }

    public boolean loadingViewIsVisible() {
        try {
            View view = this.mLoadingView;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return false;
        }
    }

    public void onCompletion() {
        try {
            this.mIsComplete = true;
            this.mIsPlaying = false;
            this.mCurrentPosition = 0L;
            hideLoading();
            postOnPlayCompletedOnMainThread();
            ad.c(TAG, "======onCompletion");
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public boolean onError(int i8, String str) {
        try {
            ad.b(TAG, "onError what:" + i8 + " extra:" + str);
            hideLoading();
            this.mHasPrepare = false;
            this.mIsPlaying = false;
            postOnPlayErrorOnMainThread(str);
            return true;
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z8) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        ad.b(TAG, "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String str;
        if (exoPlaybackException != null) {
            int i8 = exoPlaybackException.type;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        str = "Play error, because have a UnexpectedException.";
                    }
                } else {
                    str = "Play error, because have a RendererException.";
                }
            } else {
                str = "Play error, because have a SourceException.";
            }
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                str = exoPlaybackException.getCause().getMessage();
            }
            ad.b(TAG, "onPlayerError : " + str);
            onError(exoPlaybackException.type, str);
        }
        str = "Play error and ExoPlayer have not message.";
        if (exoPlaybackException.getCause() != null) {
            str = exoPlaybackException.getCause().getMessage();
        }
        ad.b(TAG, "onPlayerError : " + str);
        onError(exoPlaybackException.type, str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z8, int i8) {
        ad.b(TAG, "onPlaybackStateChanged : " + i8);
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 == 4) {
                        ad.b(TAG, "onPlaybackStateChanged : Ended : PLAY ENDED");
                        cancelPlayProgressTimer();
                        onCompletion();
                        if (!this.mIsAllowLoopPlay) {
                            this.mHasPrepare = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                ad.b(TAG, "onPlaybackStateChanged : READY");
                this.mIsBuffering = false;
                hideLoading();
                postOnBufferinEndOnMainThread();
                onPrepared();
                return;
            }
            ad.b(TAG, "onPlaybackStateChanged : Buffering");
            this.mIsBuffering = true;
            showLoading();
            startBufferingTimer(PlayerErrorConstant.PLAYERING_TIMEOUT);
            return;
        }
        ad.b(TAG, "onPlaybackStateChanged : IDLE");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i8) {
        ad.b(TAG, "onPositionDiscontinuity : " + i8);
        if (i8 == 0) {
            onCompletion();
        }
    }

    public void onPrepared() {
        try {
            ad.c(TAG, "onPrepared:" + this.mHasPrepare);
            if (this.mIsFrontDesk) {
                this.mHasPrepare = true;
                postOnBufferinEndOnMainThread();
                startPlayProgressTimer();
                if (this.exoPlayer != null) {
                    this.mIsPlaying = true;
                }
                ad.c(TAG, "onprepare mCurrentPosition:" + this.mCurrentPosition + " mHasPrepare：" + this.mHasPrepare);
                return;
            }
            ad.b(TAG, "At background, Do not process");
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i8) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z8) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i8) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void openSound() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer == null) {
                return;
            }
            simpleExoPlayer.setVolume(1.0f);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void pause() {
        try {
            ad.c(TAG, "player pause");
            if (!this.mHasPrepare) {
                ad.c(TAG, "pause !mHasPrepare retrun");
                return;
            }
            if (this.exoPlayer != null && exoPlayerIsPlaying()) {
                ad.c(TAG, "pause " + this.mIsPlaying);
                hideLoading();
                this.exoPlayer.setPlayWhenReady(false);
                this.mIsPlaying = false;
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void play(Context context, String str, int i8) {
        try {
            ad.b(TAG, "进来播放 currentionPosition:" + this.mCurrentPosition);
            this.mCurrentPosition = (long) i8;
            if (TextUtils.isEmpty(str)) {
                postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                return;
            }
            showLoading();
            this.mPlayUrl = str;
            this.mHasPrepare = false;
            this.mIsFrontDesk = true;
            setDataSource(context);
            ad.c(TAG, "mPlayUrl:" + this.mPlayUrl);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void releasePlayer() {
        try {
            ad.c(TAG, "releasePlayer");
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.removeListener(this);
                this.exoPlayer.release();
                this.exoPlayer = null;
                this.mIsPlaying = false;
            }
            if (this.mOutterVFListener != null) {
                this.mOutterVFListener = null;
            }
        } catch (Throwable th) {
            ad.a(TAG, th.getMessage(), th);
        }
        hideLoading();
    }

    public void replaySameSource(Context context, String str, Surface surface) {
        MediaSource mediaSource;
        try {
            showLoading();
            this.mHasPrepare = false;
            this.mIsFrontDesk = true;
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer != null && (mediaSource = this.mediaSource) != null) {
                simpleExoPlayer.prepare(mediaSource);
                this.exoPlayer.setPlayWhenReady(true);
            } else {
                play(context, str, surface);
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDataSource(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.VideoNativePlayer.setDataSource(android.content.Context):void");
    }

    public void setIsComplete(boolean z8) {
        this.mIsComplete = z8;
    }

    public void setIsFrontDesk(boolean z8) {
        String str;
        try {
            this.mIsFrontDesk = z8;
            StringBuilder sb = new StringBuilder();
            sb.append("isFrontDesk: ");
            if (z8) {
                str = "frontStage";
            } else {
                str = "backStage";
            }
            sb.append(str);
            ad.b(TAG, sb.toString());
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoNativePlayer.this.mLoadingView != null) {
                        VideoNativePlayer.this.mLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void start() {
        start((Surface) null);
    }

    public void stop() {
        try {
            if (!this.mHasPrepare) {
                ad.c(TAG, "stop !mHasPrepare retrun");
                return;
            }
            if (this.exoPlayer != null && exoPlayerIsPlaying()) {
                hideLoading();
                this.exoPlayer.stop();
                cancelPlayProgressTimer();
                this.mIsPlaying = false;
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void start(Surface surface) {
        try {
            if (!this.mHasPrepare) {
                ad.c(TAG, "start !mHasPrepare retrun");
                return;
            }
            boolean z8 = true;
            if (this.exoPlayer != null && !exoPlayerIsPlaying()) {
                showLoading();
                if (surface != null) {
                    this.mSurfaceHolder = surface;
                    this.exoPlayer.setVideoSurface(surface);
                }
                play();
                startPlayProgressTimer();
                this.mIsPlaying = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("exoplayer is null : ");
            if (this.exoPlayer != null) {
                z8 = false;
            }
            sb.append(z8);
            ad.c(TAG, sb.toString());
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void start(int i8) {
        try {
            if (!this.mHasPrepare) {
                ad.c(TAG, "start mHasprepare is false return");
                return;
            }
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            if (i8 > 0) {
                this.exoPlayer.seekTo(i8);
            }
            play();
            startPlayProgressTimer();
            this.mIsPlaying = true;
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void play(Context context, String str, Surface surface) {
        try {
            if (TextUtils.isEmpty(str)) {
                postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                return;
            }
            showLoading();
            this.mPlayUrl = str;
            this.mHasPrepare = false;
            this.mIsFrontDesk = true;
            this.mSurfaceHolder = surface;
            setDataSource(context);
            ad.c(TAG, "mPlayUrl:" + this.mPlayUrl);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void play() {
        try {
            this.exoPlayer.setPlayWhenReady(true);
            startPlayProgressTimer();
            this.mIsPlaying = true;
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }
}
