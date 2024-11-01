package androidx.leanback.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.leanback.media.PlaybackGlue;
import androidx.leanback.media.PlaybackGlueHost;
import androidx.leanback.media.PlayerAdapter;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ControlButtonPresenterSelector;
import androidx.leanback.widget.OnActionClickedListener;
import androidx.leanback.widget.PlaybackControlsRow;
import androidx.leanback.widget.PlaybackRowPresenter;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PlaybackBaseControlGlue<T extends PlayerAdapter> extends PlaybackGlue implements OnActionClickedListener, View.OnKeyListener {
    public static final int ACTION_CUSTOM_LEFT_FIRST = 1;
    public static final int ACTION_CUSTOM_RIGHT_FIRST = 4096;
    public static final int ACTION_FAST_FORWARD = 128;
    public static final int ACTION_PLAY_PAUSE = 64;
    public static final int ACTION_REPEAT = 512;
    public static final int ACTION_REWIND = 32;
    public static final int ACTION_SHUFFLE = 1024;
    public static final int ACTION_SKIP_TO_NEXT = 256;
    public static final int ACTION_SKIP_TO_PREVIOUS = 16;
    static final boolean DEBUG = false;
    static final String TAG = "PlaybackTransportGlue";
    final PlayerAdapter.Callback mAdapterCallback;
    boolean mBuffering;
    PlaybackControlsRow mControlsRow;
    PlaybackRowPresenter mControlsRowPresenter;
    Drawable mCover;
    int mErrorCode;
    String mErrorMessage;
    boolean mErrorSet;
    boolean mFadeWhenPlaying;
    boolean mIsPlaying;
    PlaybackControlsRow.PlayPauseAction mPlayPauseAction;
    final T mPlayerAdapter;
    PlaybackGlueHost.PlayerCallback mPlayerCallback;
    CharSequence mSubtitle;
    CharSequence mTitle;
    int mVideoHeight;
    int mVideoWidth;

    public PlaybackBaseControlGlue(Context context, T t8) {
        super(context);
        this.mIsPlaying = false;
        this.mFadeWhenPlaying = true;
        this.mBuffering = false;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mErrorSet = false;
        PlayerAdapter.Callback callback = new PlayerAdapter.Callback() { // from class: androidx.leanback.media.PlaybackBaseControlGlue.1
            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onBufferedPositionChanged(PlayerAdapter playerAdapter) {
                PlaybackBaseControlGlue.this.onUpdateBufferedProgress();
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onBufferingStateChanged(PlayerAdapter playerAdapter, boolean z8) {
                PlaybackBaseControlGlue playbackBaseControlGlue = PlaybackBaseControlGlue.this;
                playbackBaseControlGlue.mBuffering = z8;
                PlaybackGlueHost.PlayerCallback playerCallback = playbackBaseControlGlue.mPlayerCallback;
                if (playerCallback != null) {
                    playerCallback.onBufferingStateChanged(z8);
                }
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onCurrentPositionChanged(PlayerAdapter playerAdapter) {
                PlaybackBaseControlGlue.this.onUpdateProgress();
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onDurationChanged(PlayerAdapter playerAdapter) {
                PlaybackBaseControlGlue.this.onUpdateDuration();
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onError(PlayerAdapter playerAdapter, int i8, String str) {
                PlaybackBaseControlGlue playbackBaseControlGlue = PlaybackBaseControlGlue.this;
                playbackBaseControlGlue.mErrorSet = true;
                playbackBaseControlGlue.mErrorCode = i8;
                playbackBaseControlGlue.mErrorMessage = str;
                PlaybackGlueHost.PlayerCallback playerCallback = playbackBaseControlGlue.mPlayerCallback;
                if (playerCallback != null) {
                    playerCallback.onError(i8, str);
                }
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onMetadataChanged(PlayerAdapter playerAdapter) {
                PlaybackBaseControlGlue.this.onMetadataChanged();
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onPlayCompleted(PlayerAdapter playerAdapter) {
                PlaybackBaseControlGlue.this.onPlayCompleted();
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onPlayStateChanged(PlayerAdapter playerAdapter) {
                PlaybackBaseControlGlue.this.onPlayStateChanged();
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onPreparedStateChanged(PlayerAdapter playerAdapter) {
                PlaybackBaseControlGlue.this.onPreparedStateChanged();
            }

            @Override // androidx.leanback.media.PlayerAdapter.Callback
            public void onVideoSizeChanged(PlayerAdapter playerAdapter, int i8, int i9) {
                PlaybackBaseControlGlue playbackBaseControlGlue = PlaybackBaseControlGlue.this;
                playbackBaseControlGlue.mVideoWidth = i8;
                playbackBaseControlGlue.mVideoHeight = i9;
                PlaybackGlueHost.PlayerCallback playerCallback = playbackBaseControlGlue.mPlayerCallback;
                if (playerCallback != null) {
                    playerCallback.onVideoSizeChanged(i8, i9);
                }
            }
        };
        this.mAdapterCallback = callback;
        this.mPlayerAdapter = t8;
        t8.setCallback(callback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void notifyItemChanged(ArrayObjectAdapter arrayObjectAdapter, Object obj) {
        int indexOf = arrayObjectAdapter.indexOf(obj);
        if (indexOf >= 0) {
            arrayObjectAdapter.notifyArrayItemRangeChanged(indexOf, 1);
        }
    }

    private void updateControlsRow() {
        onMetadataChanged();
    }

    public Drawable getArt() {
        return this.mCover;
    }

    public final long getBufferedPosition() {
        return this.mPlayerAdapter.getBufferedPosition();
    }

    public PlaybackControlsRow getControlsRow() {
        return this.mControlsRow;
    }

    public long getCurrentPosition() {
        return this.mPlayerAdapter.getCurrentPosition();
    }

    public final long getDuration() {
        return this.mPlayerAdapter.getDuration();
    }

    public PlaybackRowPresenter getPlaybackRowPresenter() {
        return this.mControlsRowPresenter;
    }

    public final T getPlayerAdapter() {
        return this.mPlayerAdapter;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public long getSupportedActions() {
        return this.mPlayerAdapter.getSupportedActions();
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean isControlsOverlayAutoHideEnabled() {
        return this.mFadeWhenPlaying;
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final boolean isPlaying() {
        return this.mPlayerAdapter.isPlaying();
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final boolean isPrepared() {
        return this.mPlayerAdapter.isPrepared();
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void next() {
        this.mPlayerAdapter.next();
    }

    public abstract void onActionClicked(Action action);

    void onAttachHostCallback() {
        int i8;
        PlaybackGlueHost.PlayerCallback playerCallback = this.mPlayerCallback;
        if (playerCallback != null) {
            int i9 = this.mVideoWidth;
            if (i9 != 0 && (i8 = this.mVideoHeight) != 0) {
                playerCallback.onVideoSizeChanged(i9, i8);
            }
            if (this.mErrorSet) {
                this.mPlayerCallback.onError(this.mErrorCode, this.mErrorMessage);
            }
            this.mPlayerCallback.onBufferingStateChanged(this.mBuffering);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackGlue
    public void onAttachedToHost(PlaybackGlueHost playbackGlueHost) {
        super.onAttachedToHost(playbackGlueHost);
        playbackGlueHost.setOnKeyInterceptListener(this);
        playbackGlueHost.setOnActionClickedListener(this);
        onCreateDefaultControlsRow();
        onCreateDefaultRowPresenter();
        playbackGlueHost.setPlaybackRowPresenter(getPlaybackRowPresenter());
        playbackGlueHost.setPlaybackRow(getControlsRow());
        this.mPlayerCallback = playbackGlueHost.getPlayerCallback();
        onAttachHostCallback();
        this.mPlayerAdapter.onAttachedToHost(playbackGlueHost);
    }

    void onCreateDefaultControlsRow() {
        if (this.mControlsRow == null) {
            setControlsRow(new PlaybackControlsRow(this));
        }
    }

    void onCreateDefaultRowPresenter() {
        if (this.mControlsRowPresenter == null) {
            setPlaybackRowPresenter(onCreateRowPresenter());
        }
    }

    protected void onCreatePrimaryActions(ArrayObjectAdapter arrayObjectAdapter) {
    }

    protected abstract PlaybackRowPresenter onCreateRowPresenter();

    protected void onCreateSecondaryActions(ArrayObjectAdapter arrayObjectAdapter) {
    }

    void onDetachHostCallback() {
        this.mErrorSet = false;
        this.mErrorCode = 0;
        this.mErrorMessage = null;
        PlaybackGlueHost.PlayerCallback playerCallback = this.mPlayerCallback;
        if (playerCallback != null) {
            playerCallback.onBufferingStateChanged(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackGlue
    public void onDetachedFromHost() {
        onDetachHostCallback();
        this.mPlayerCallback = null;
        this.mPlayerAdapter.onDetachedFromHost();
        this.mPlayerAdapter.setProgressUpdatingEnabled(false);
        super.onDetachedFromHost();
    }

    @Override // androidx.leanback.media.PlaybackGlue
    protected void onHostStart() {
        this.mPlayerAdapter.setProgressUpdatingEnabled(true);
    }

    @Override // androidx.leanback.media.PlaybackGlue
    protected void onHostStop() {
        this.mPlayerAdapter.setProgressUpdatingEnabled(false);
    }

    public abstract boolean onKey(View view, int i8, KeyEvent keyEvent);

    protected void onMetadataChanged() {
        PlaybackControlsRow playbackControlsRow = this.mControlsRow;
        if (playbackControlsRow == null) {
            return;
        }
        playbackControlsRow.setImageDrawable(getArt());
        this.mControlsRow.setDuration(getDuration());
        this.mControlsRow.setCurrentPosition(getCurrentPosition());
        if (getHost() != null) {
            getHost().notifyPlaybackRowChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void onPlayCompleted() {
        List<PlaybackGlue.PlayerCallback> playerCallbacks = getPlayerCallbacks();
        if (playerCallbacks != null) {
            int size = playerCallbacks.size();
            for (int i8 = 0; i8 < size; i8++) {
                playerCallbacks.get(i8).onPlayCompleted(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void onPlayStateChanged() {
        List<PlaybackGlue.PlayerCallback> playerCallbacks = getPlayerCallbacks();
        if (playerCallbacks != null) {
            int size = playerCallbacks.size();
            for (int i8 = 0; i8 < size; i8++) {
                playerCallbacks.get(i8).onPlayStateChanged(this);
            }
        }
    }

    @CallSuper
    protected void onPreparedStateChanged() {
        onUpdateDuration();
        List<PlaybackGlue.PlayerCallback> playerCallbacks = getPlayerCallbacks();
        if (playerCallbacks != null) {
            int size = playerCallbacks.size();
            for (int i8 = 0; i8 < size; i8++) {
                playerCallbacks.get(i8).onPreparedStateChanged(this);
            }
        }
    }

    @CallSuper
    protected void onUpdateBufferedProgress() {
        PlaybackControlsRow playbackControlsRow = this.mControlsRow;
        if (playbackControlsRow != null) {
            playbackControlsRow.setBufferedPosition(this.mPlayerAdapter.getBufferedPosition());
        }
    }

    @CallSuper
    protected void onUpdateDuration() {
        long j8;
        PlaybackControlsRow playbackControlsRow = this.mControlsRow;
        if (playbackControlsRow != null) {
            if (this.mPlayerAdapter.isPrepared()) {
                j8 = this.mPlayerAdapter.getDuration();
            } else {
                j8 = -1;
            }
            playbackControlsRow.setDuration(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void onUpdateProgress() {
        long j8;
        PlaybackControlsRow playbackControlsRow = this.mControlsRow;
        if (playbackControlsRow != null) {
            if (this.mPlayerAdapter.isPrepared()) {
                j8 = getCurrentPosition();
            } else {
                j8 = -1;
            }
            playbackControlsRow.setCurrentPosition(j8);
        }
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void pause() {
        this.mPlayerAdapter.pause();
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void play() {
        this.mPlayerAdapter.play();
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void previous() {
        this.mPlayerAdapter.previous();
    }

    public final void seekTo(long j8) {
        this.mPlayerAdapter.seekTo(j8);
    }

    public void setArt(Drawable drawable) {
        if (this.mCover == drawable) {
            return;
        }
        this.mCover = drawable;
        this.mControlsRow.setImageDrawable(drawable);
        if (getHost() != null) {
            getHost().notifyPlaybackRowChanged();
        }
    }

    public void setControlsOverlayAutoHideEnabled(boolean z8) {
        this.mFadeWhenPlaying = z8;
        if (!z8 && getHost() != null) {
            getHost().setControlsOverlayAutoHideEnabled(false);
        }
    }

    public void setControlsRow(PlaybackControlsRow playbackControlsRow) {
        this.mControlsRow = playbackControlsRow;
        playbackControlsRow.setCurrentPosition(-1L);
        this.mControlsRow.setDuration(-1L);
        this.mControlsRow.setBufferedPosition(-1L);
        if (this.mControlsRow.getPrimaryActionsAdapter() == null) {
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ControlButtonPresenterSelector());
            onCreatePrimaryActions(arrayObjectAdapter);
            this.mControlsRow.setPrimaryActionsAdapter(arrayObjectAdapter);
        }
        if (this.mControlsRow.getSecondaryActionsAdapter() == null) {
            ArrayObjectAdapter arrayObjectAdapter2 = new ArrayObjectAdapter(new ControlButtonPresenterSelector());
            onCreateSecondaryActions(arrayObjectAdapter2);
            getControlsRow().setSecondaryActionsAdapter(arrayObjectAdapter2);
        }
        updateControlsRow();
    }

    public void setPlaybackRowPresenter(PlaybackRowPresenter playbackRowPresenter) {
        this.mControlsRowPresenter = playbackRowPresenter;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mSubtitle)) {
            return;
        }
        this.mSubtitle = charSequence;
        if (getHost() != null) {
            getHost().notifyPlaybackRowChanged();
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mTitle)) {
            return;
        }
        this.mTitle = charSequence;
        if (getHost() != null) {
            getHost().notifyPlaybackRowChanged();
        }
    }
}
