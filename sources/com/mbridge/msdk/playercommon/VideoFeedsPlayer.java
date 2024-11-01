package com.mbridge.msdk.playercommon;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class VideoFeedsPlayer implements Player.EventListener {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final String TAG = "VideoFeedsPlayer";
    private SimpleExoPlayer exoPlayer;
    private Timer mBufferTimeoutTimer;
    private long mCurrentPosition;
    private View mFullScreenLoadingView;
    private volatile VideoPlayerStatusListener mInnerVFPLisener;
    private boolean mIsSilent;
    private WeakReference<View> mLoadingView;
    private volatile VideoPlayerStatusListener mOutterVFListener;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private MediaSource mediaSource;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private Object mLock = new Object();
    private boolean isStart = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private Runnable playProgressRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.2
        @Override // java.lang.Runnable
        public void run() {
            long j8;
            try {
                if (VideoFeedsPlayer.this.exoPlayer != null && VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                    VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                    videoFeedsPlayer.mCurrentPosition = videoFeedsPlayer.exoPlayer.getCurrentPosition();
                    float f8 = ((float) VideoFeedsPlayer.this.mCurrentPosition) / 1000.0f;
                    float f9 = (float) (VideoFeedsPlayer.this.mCurrentPosition % 1000);
                    int round = Math.round(f8);
                    ad.c(VideoFeedsPlayer.TAG, "currentPosition:" + round + " mCurrentPosition:" + VideoFeedsPlayer.this.mCurrentPosition);
                    if (VideoFeedsPlayer.this.exoPlayer != null && VideoFeedsPlayer.this.exoPlayer.getDuration() > 0) {
                        j8 = VideoFeedsPlayer.this.exoPlayer.getDuration() / 1000;
                        if (f9 > 0.0f && f9 < 500.0f) {
                            round++;
                        }
                    } else {
                        j8 = 0;
                    }
                    if (round >= 0 && j8 > 0 && round < 1 + j8) {
                        VideoFeedsPlayer.this.postOnPlayProgressOnMainThread(round, (int) j8);
                    }
                    VideoFeedsPlayer.this.mIsComplete = false;
                    if (!VideoFeedsPlayer.this.mIsBuffering) {
                        VideoFeedsPlayer.this.hideLoading();
                    }
                    VideoFeedsPlayer.this.mHandler.postDelayed(this, 1000L);
                }
            } catch (Exception e8) {
                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
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
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mLoadingView != null && VideoFeedsPlayer.this.mLoadingView.get() != null) {
                        ((View) VideoFeedsPlayer.this.mLoadingView.get()).setVisibility(8);
                    }
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(8);
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingEnd();
                            } catch (Exception e8) {
                                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingEnd();
                            } catch (Exception e9) {
                                ad.b(VideoFeedsPlayer.TAG, e9.getMessage());
                            }
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingStart(str);
                            } catch (Exception e8) {
                                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingStart(str);
                            } catch (Exception e9) {
                                ad.b(VideoFeedsPlayer.TAG, e9.getMessage());
                            }
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayCompleted();
                            } catch (Exception e8) {
                                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayCompleted();
                            } catch (Exception e9) {
                                ad.b(VideoFeedsPlayer.TAG, e9.getMessage());
                            }
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayError(str);
                            } catch (Exception e8) {
                                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayError(str);
                            } catch (Exception e9) {
                                ad.b(VideoFeedsPlayer.TAG, e9.getMessage());
                            }
                        }
                    }
                });
            }
            k.a(94, this.mPlayUrl, str);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i8, final int i9) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayProgress(i8, i9);
                            } catch (Exception e8) {
                                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayProgress(i8, i9);
                            } catch (Exception e9) {
                                ad.b(VideoFeedsPlayer.TAG, e9.getMessage());
                            }
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                            } catch (Exception e8) {
                                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                            } catch (Exception e9) {
                                ad.b(VideoFeedsPlayer.TAG, e9.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void postOnPlayStartOnMainThread(final long j8) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        int i8 = (int) j8;
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayStarted(i8);
                            } catch (Exception e8) {
                                ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayStarted(i8);
                            } catch (Exception e9) {
                                ad.b(VideoFeedsPlayer.TAG, e9.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    private void startBufferIngTimer(final String str) {
        if (!this.mIsNeedBufferingTimeout) {
            ad.b(TAG, "不需要缓冲超时功能");
            return;
        }
        cancelBufferTimeoutTimer();
        Timer timer = new Timer();
        this.mBufferTimeoutTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    if (VideoFeedsPlayer.this.mHasPrepare && !VideoFeedsPlayer.this.mIsBuffering) {
                        return;
                    }
                    ad.b(VideoFeedsPlayer.TAG, "缓冲超时");
                    VideoFeedsPlayer.this.postOnBufferingStarOnMainThread(str);
                } catch (Exception e8) {
                    ad.b(VideoFeedsPlayer.TAG, e8.getMessage());
                }
            }
        }, this.mBufferTime * 1000);
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
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
            this.mIsSilent = true;
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

    public boolean fullScreenLoadingViewisVisible() {
        try {
            View view = this.mFullScreenLoadingView;
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

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public int getDuration() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.getDuration();
            return 0;
        }
        return 0;
    }

    public boolean halfLoadingViewisVisible() {
        try {
            WeakReference<View> weakReference = this.mLoadingView;
            if (weakReference != null && weakReference.get() != null) {
                if (this.mLoadingView.get().getVisibility() == 0) {
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

    public boolean initPlayer(Context context, View view, String str, VideoPlayerStatusListener videoPlayerStatusListener) {
        try {
            if (view == null) {
                ad.c(TAG, "loadingView is NULL");
                postOnPlayErrorOnMainThread(PlayerErrorConstant.MEDIAPLAYER_INIT_FAILED);
                return false;
            }
            this.mOutterVFListener = videoPlayerStatusListener;
            this.mLoadingView = new WeakReference<>(view);
            this.exoPlayer = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(context), new DefaultTrackSelector(), new DefaultLoadControl());
            this.mediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(context, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.exoPlayer.setRepeatMode(0);
            this.exoPlayer.prepare(this.mediaSource);
            this.exoPlayer.addListener(this);
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

    public boolean isSilent() {
        return this.mIsSilent;
    }

    public void justSeekTo(int i8) {
        try {
            this.mCurrentPosition = i8;
            if (!this.mHasPrepare) {
                ad.a(TAG, "seekTo return mHasPrepare false");
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void onBufferingUpdate(int i8) {
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
            ad.b(TAG, "onError what: " + i8 + " extra: " + str);
            hideLoading();
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
        if (!this.mIsFrontDesk && "MIX 3".equalsIgnoreCase(z.h()) && z.w().equalsIgnoreCase("Xiaomi")) {
            return true;
        }
        this.mHasPrepare = false;
        postOnPlayErrorOnMainThread(str);
        return true;
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
            startBufferIngTimer(PlayerErrorConstant.PLAYERING_TIMEOUT);
            return;
        }
        ad.b(TAG, "onPlaybackStateChanged : IDLE");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i8) {
    }

    public void onPrepared() {
        try {
            ad.c(TAG, "onPrepared:" + this.mHasPrepare);
            this.mHasPrepare = true;
            boolean z8 = this.mIsFrontDesk;
            if (z8) {
                if (z8) {
                    hideLoading();
                    SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
                    if (simpleExoPlayer != null) {
                        this.mIsPlaying = true;
                        if (!this.isStart) {
                            postOnPlayStartOnMainThread(simpleExoPlayer.getDuration() / 1000);
                            ad.c(TAG, "onPlayStarted()，getCurrentPosition:" + this.exoPlayer.getCurrentPosition());
                            this.isStart = true;
                        }
                    }
                    postOnBufferinEndOnMainThread();
                    startPlayProgressTimer();
                    ad.c(TAG, "onPrepare mCurrentPosition:" + this.mCurrentPosition + " onPrepare mHasPrepare：" + this.mHasPrepare);
                    return;
                }
                return;
            }
            ad.b(TAG, "At background, Do not process");
            if (this.exoPlayer != null) {
                pause();
            }
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
            this.mIsSilent = false;
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void pause() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null && exoPlayerIsPlaying()) {
                ad.c(TAG, "pause isPalying:" + exoPlayerIsPlaying() + " mIsPlaying:" + this.mIsPlaying);
                hideLoading();
                this.exoPlayer.setPlayWhenReady(false);
                this.mIsPlaying = false;
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void play(String str, int i8) {
        try {
            synchronized (this.mLock) {
                try {
                    ad.b(TAG, "Start Play currentionPosition:" + this.mCurrentPosition);
                    if (i8 > 0) {
                        this.mCurrentPosition = i8;
                    }
                    if (TextUtils.isEmpty(str)) {
                        postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                        return;
                    }
                    this.mPlayUrl = str;
                    this.mHasPrepare = false;
                    this.mIsFrontDesk = true;
                    showLoading();
                    setDataSource();
                    ad.c(TAG, "mPlayUrl:" + this.mPlayUrl);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void prepare() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (!this.mHasPrepare && (simpleExoPlayer = this.exoPlayer) != null) {
                simpleExoPlayer.prepare(this.mediaSource);
                this.mHasPrepare = true;
                this.mIsPlaying = false;
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void releasePlayer() {
        try {
            ad.c(TAG, "release");
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.removeListener(this);
                this.exoPlayer.release();
                this.mInnerVFPLisener = null;
                this.mOutterVFListener = null;
            }
            hideLoading();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void seekTo(int i8) {
        long j8 = i8;
        try {
            this.mCurrentPosition = j8;
            if (!this.mHasPrepare) {
                ad.a(TAG, "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j8);
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void seekToEndFrame() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void setDataSource() {
        try {
            ad.c(TAG, "setDataSource");
            if (this.exoPlayer != null) {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    setDisplay(surfaceHolder);
                }
                this.mHasPrepare = false;
                this.exoPlayer.prepare(this.mediaSource);
                this.exoPlayer.setPlayWhenReady(true);
                startBufferIngTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
            postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.exoPlayer.getVideoComponent().setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            postOnPlayErrorOnMainThread(th.toString());
        }
    }

    public void setFullScreenLoadingView(View view) {
        if (view != null) {
            try {
                this.mFullScreenLoadingView = view;
            } catch (Exception e8) {
                ad.b(TAG, e8.getMessage());
            }
        }
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

    public void setPlaybackParams(float f8) {
        try {
            if (exoPlayerIsPlaying()) {
                this.exoPlayer.setPlaybackParameters(new PlaybackParameters(f8));
            } else {
                this.exoPlayer.setPlaybackParameters(new PlaybackParameters(f8));
                this.exoPlayer.stop();
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void setVolume(float f8, float f9) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f9);
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void start(boolean z8) {
        try {
            if (!this.mHasPrepare) {
                ad.c(TAG, "!mHasPrepare");
                return;
            }
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            showLoading();
            play();
            this.mIsPlaying = true;
            if (z8) {
                startPlayProgressTimer();
            }
            ad.c(TAG, "start");
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void stop() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null && exoPlayerIsPlaying()) {
                hideLoading();
                this.exoPlayer.stop();
                this.mHasPrepare = false;
                this.mIsPlaying = false;
                this.mIsComplete = true;
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void start(int i8) {
        try {
            if (this.mHasPrepare) {
                if (this.exoPlayer != null && !exoPlayerIsPlaying()) {
                    if (i8 > 0) {
                        this.exoPlayer.seekTo(i8);
                        play();
                    } else {
                        play();
                        this.mIsPlaying = true;
                        ad.c(TAG, "=========start 指定进度");
                    }
                }
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public void play(String str, SurfaceHolder surfaceHolder) {
        try {
            synchronized (this.mLock) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                        return;
                    }
                    this.mPlayUrl = str;
                    this.mHasPrepare = false;
                    this.mIsFrontDesk = true;
                    this.mSurfaceHolder = surfaceHolder;
                    showLoading();
                    setDataSource();
                    ad.c(TAG, "mPlayUrl:" + this.mPlayUrl);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void play() {
        this.exoPlayer.setPlayWhenReady(true);
    }
}
