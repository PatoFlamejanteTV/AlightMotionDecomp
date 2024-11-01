package androidx.leanback.media;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.leanback.media.PlayerAdapter;
import androidx.leanback.widget.AbstractDetailsDescriptionPresenter;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.PlaybackControlsRow;
import androidx.leanback.widget.PlaybackControlsRowPresenter;
import androidx.leanback.widget.PlaybackRowPresenter;
import androidx.leanback.widget.RowPresenter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class PlaybackBannerControlGlue<T extends PlayerAdapter> extends PlaybackBaseControlGlue<T> {
    public static final int ACTION_CUSTOM_LEFT_FIRST = 1;
    public static final int ACTION_CUSTOM_RIGHT_FIRST = 4096;
    public static final int ACTION_FAST_FORWARD = 128;
    public static final int ACTION_PLAY_PAUSE = 64;
    public static final int ACTION_REWIND = 32;
    public static final int ACTION_SKIP_TO_NEXT = 256;
    public static final int ACTION_SKIP_TO_PREVIOUS = 16;
    private static final int NUMBER_OF_SEEK_SPEEDS = 5;
    public static final int PLAYBACK_SPEED_FAST_L0 = 10;
    public static final int PLAYBACK_SPEED_FAST_L1 = 11;
    public static final int PLAYBACK_SPEED_FAST_L2 = 12;
    public static final int PLAYBACK_SPEED_FAST_L3 = 13;
    public static final int PLAYBACK_SPEED_FAST_L4 = 14;
    public static final int PLAYBACK_SPEED_INVALID = -1;
    public static final int PLAYBACK_SPEED_NORMAL = 1;
    public static final int PLAYBACK_SPEED_PAUSED = 0;
    private static final String TAG = "PlaybackBannerControlGlue";
    private PlaybackControlsRow.FastForwardAction mFastForwardAction;
    private final int[] mFastForwardSpeeds;
    private boolean mIsCustomizedFastForwardSupported;
    private boolean mIsCustomizedRewindSupported;
    private int mPlaybackSpeed;
    private PlaybackControlsRow.RewindAction mRewindAction;
    private final int[] mRewindSpeeds;
    private PlaybackControlsRow.SkipNextAction mSkipNextAction;
    private PlaybackControlsRow.SkipPreviousAction mSkipPreviousAction;
    private long mStartPosition;
    private long mStartTime;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface ACTION_ {
    }

    public PlaybackBannerControlGlue(Context context, int[] iArr, T t8) {
        this(context, iArr, iArr, t8);
    }

    private void decrementRewindPlaybackSpeed() {
        int i8 = this.mPlaybackSpeed;
        switch (i8) {
            case -13:
            case -12:
            case -11:
            case -10:
                this.mPlaybackSpeed = i8 - 1;
                return;
            default:
                this.mPlaybackSpeed = -10;
                return;
        }
    }

    private void fakePause() {
        this.mIsPlaying = true;
        this.mStartPosition = getCurrentPosition();
        this.mStartTime = System.currentTimeMillis();
        super.pause();
        onUpdatePlaybackState();
    }

    private int getMaxForwardSpeedId() {
        return this.mFastForwardSpeeds.length + 9;
    }

    private int getMaxRewindSpeedId() {
        return this.mRewindSpeeds.length + 9;
    }

    private void incrementFastForwardPlaybackSpeed() {
        int i8 = this.mPlaybackSpeed;
        switch (i8) {
            case 10:
            case 11:
            case 12:
            case 13:
                this.mPlaybackSpeed = i8 + 1;
                return;
            default:
                this.mPlaybackSpeed = 10;
                return;
        }
    }

    private void updatePlaybackState(boolean z8) {
        int i8;
        if (this.mControlsRow == null) {
            return;
        }
        int i9 = 0;
        if (!z8) {
            onUpdateProgress();
            this.mPlayerAdapter.setProgressUpdatingEnabled(false);
        } else {
            this.mPlayerAdapter.setProgressUpdatingEnabled(true);
        }
        if (this.mFadeWhenPlaying && getHost() != null) {
            getHost().setControlsOverlayAutoHideEnabled(z8);
        }
        ArrayObjectAdapter arrayObjectAdapter = (ArrayObjectAdapter) getControlsRow().getPrimaryActionsAdapter();
        PlaybackControlsRow.PlayPauseAction playPauseAction = this.mPlayPauseAction;
        if (playPauseAction != null && playPauseAction.getIndex() != z8) {
            this.mPlayPauseAction.setIndex(z8 ? 1 : 0);
            PlaybackBaseControlGlue.notifyItemChanged(arrayObjectAdapter, this.mPlayPauseAction);
        }
        PlaybackControlsRow.FastForwardAction fastForwardAction = this.mFastForwardAction;
        if (fastForwardAction != null) {
            int i10 = this.mPlaybackSpeed;
            if (i10 >= 10) {
                i8 = i10 - 9;
            } else {
                i8 = 0;
            }
            if (fastForwardAction.getIndex() != i8) {
                this.mFastForwardAction.setIndex(i8);
                PlaybackBaseControlGlue.notifyItemChanged(arrayObjectAdapter, this.mFastForwardAction);
            }
        }
        PlaybackControlsRow.RewindAction rewindAction = this.mRewindAction;
        if (rewindAction != null) {
            int i11 = this.mPlaybackSpeed;
            if (i11 <= -10) {
                i9 = (-i11) - 9;
            }
            if (rewindAction.getIndex() != i9) {
                this.mRewindAction.setIndex(i9);
                PlaybackBaseControlGlue.notifyItemChanged(arrayObjectAdapter, this.mRewindAction);
            }
        }
    }

    boolean dispatchAction(Action action, KeyEvent keyEvent) {
        boolean z8 = false;
        if (action == this.mPlayPauseAction) {
            if (keyEvent == null || keyEvent.getKeyCode() == 85 || keyEvent.getKeyCode() == 126) {
                z8 = true;
            }
            if (keyEvent == null || keyEvent.getKeyCode() == 85 || keyEvent.getKeyCode() == 127) {
                int i8 = this.mPlaybackSpeed;
                if (!z8 ? i8 != 0 : i8 == 1) {
                    pause();
                    onUpdatePlaybackStatusAfterUserAction();
                    return true;
                }
            }
            if (z8 && this.mPlaybackSpeed != 1) {
                play();
            }
            onUpdatePlaybackStatusAfterUserAction();
            return true;
        }
        if (action == this.mSkipNextAction) {
            next();
            return true;
        }
        if (action == this.mSkipPreviousAction) {
            previous();
            return true;
        }
        if (action == this.mFastForwardAction) {
            if (!this.mPlayerAdapter.isPrepared() || this.mPlaybackSpeed >= getMaxForwardSpeedId()) {
                return true;
            }
            if (this.mIsCustomizedFastForwardSupported) {
                this.mIsPlaying = true;
                this.mPlayerAdapter.fastForward();
            } else {
                fakePause();
            }
            incrementFastForwardPlaybackSpeed();
            onUpdatePlaybackStatusAfterUserAction();
            return true;
        }
        if (action == this.mRewindAction) {
            if (!this.mPlayerAdapter.isPrepared() || this.mPlaybackSpeed <= (-getMaxRewindSpeedId())) {
                return true;
            }
            if (this.mIsCustomizedFastForwardSupported) {
                this.mIsPlaying = true;
                this.mPlayerAdapter.rewind();
            } else {
                fakePause();
            }
            decrementRewindPlaybackSpeed();
            onUpdatePlaybackStatusAfterUserAction();
            return true;
        }
        return false;
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public long getCurrentPosition() {
        int i8;
        int i9 = this.mPlaybackSpeed;
        if (i9 != 0 && i9 != 1) {
            if (i9 >= 10) {
                if (this.mIsCustomizedFastForwardSupported) {
                    return this.mPlayerAdapter.getCurrentPosition();
                }
                i8 = getFastForwardSpeeds()[i9 - 10];
            } else if (i9 <= -10) {
                if (this.mIsCustomizedRewindSupported) {
                    return this.mPlayerAdapter.getCurrentPosition();
                }
                i8 = -getRewindSpeeds()[(-i9) - 10];
            } else {
                return -1L;
            }
            long currentTimeMillis = this.mStartPosition + ((System.currentTimeMillis() - this.mStartTime) * i8);
            if (currentTimeMillis > getDuration()) {
                this.mPlaybackSpeed = 0;
                long duration = getDuration();
                this.mPlayerAdapter.seekTo(duration);
                this.mStartPosition = 0L;
                pause();
                return duration;
            }
            if (currentTimeMillis < 0) {
                this.mPlaybackSpeed = 0;
                this.mPlayerAdapter.seekTo(0L);
                this.mStartPosition = 0L;
                pause();
                return 0L;
            }
            return currentTimeMillis;
        }
        return this.mPlayerAdapter.getCurrentPosition();
    }

    @NonNull
    public int[] getFastForwardSpeeds() {
        return this.mFastForwardSpeeds;
    }

    @NonNull
    public int[] getRewindSpeeds() {
        return this.mRewindSpeeds;
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.widget.OnActionClickedListener
    public void onActionClicked(Action action) {
        dispatchAction(action, null);
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    protected void onCreatePrimaryActions(ArrayObjectAdapter arrayObjectAdapter) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        long supportedActions = getSupportedActions();
        long j8 = 16 & supportedActions;
        if (j8 != 0 && this.mSkipPreviousAction == null) {
            PlaybackControlsRow.SkipPreviousAction skipPreviousAction = new PlaybackControlsRow.SkipPreviousAction(getContext());
            this.mSkipPreviousAction = skipPreviousAction;
            arrayObjectAdapter.add(skipPreviousAction);
        } else if (j8 == 0 && (obj = this.mSkipPreviousAction) != null) {
            arrayObjectAdapter.remove(obj);
            this.mSkipPreviousAction = null;
        }
        long j9 = 32 & supportedActions;
        if (j9 != 0 && this.mRewindAction == null) {
            PlaybackControlsRow.RewindAction rewindAction = new PlaybackControlsRow.RewindAction(getContext(), this.mRewindSpeeds.length);
            this.mRewindAction = rewindAction;
            arrayObjectAdapter.add(rewindAction);
        } else if (j9 == 0 && (obj2 = this.mRewindAction) != null) {
            arrayObjectAdapter.remove(obj2);
            this.mRewindAction = null;
        }
        long j10 = 64 & supportedActions;
        if (j10 != 0 && this.mPlayPauseAction == null) {
            this.mPlayPauseAction = new PlaybackControlsRow.PlayPauseAction(getContext());
            PlaybackControlsRow.PlayPauseAction playPauseAction = new PlaybackControlsRow.PlayPauseAction(getContext());
            this.mPlayPauseAction = playPauseAction;
            arrayObjectAdapter.add(playPauseAction);
        } else if (j10 == 0 && (obj3 = this.mPlayPauseAction) != null) {
            arrayObjectAdapter.remove(obj3);
            this.mPlayPauseAction = null;
        }
        long j11 = 128 & supportedActions;
        if (j11 != 0 && this.mFastForwardAction == null) {
            this.mFastForwardAction = new PlaybackControlsRow.FastForwardAction(getContext(), this.mFastForwardSpeeds.length);
            PlaybackControlsRow.FastForwardAction fastForwardAction = new PlaybackControlsRow.FastForwardAction(getContext(), this.mFastForwardSpeeds.length);
            this.mFastForwardAction = fastForwardAction;
            arrayObjectAdapter.add(fastForwardAction);
        } else if (j11 == 0 && (obj4 = this.mFastForwardAction) != null) {
            arrayObjectAdapter.remove(obj4);
            this.mFastForwardAction = null;
        }
        long j12 = supportedActions & 256;
        if (j12 != 0 && this.mSkipNextAction == null) {
            PlaybackControlsRow.SkipNextAction skipNextAction = new PlaybackControlsRow.SkipNextAction(getContext());
            this.mSkipNextAction = skipNextAction;
            arrayObjectAdapter.add(skipNextAction);
        } else if (j12 == 0 && (obj5 = this.mSkipNextAction) != null) {
            arrayObjectAdapter.remove(obj5);
            this.mSkipNextAction = null;
        }
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    protected PlaybackRowPresenter onCreateRowPresenter() {
        return new PlaybackControlsRowPresenter(new AbstractDetailsDescriptionPresenter() { // from class: androidx.leanback.media.PlaybackBannerControlGlue.1
            @Override // androidx.leanback.widget.AbstractDetailsDescriptionPresenter
            protected void onBindDescription(AbstractDetailsDescriptionPresenter.ViewHolder viewHolder, Object obj) {
                PlaybackBannerControlGlue playbackBannerControlGlue = (PlaybackBannerControlGlue) obj;
                viewHolder.getTitle().setText(playbackBannerControlGlue.getTitle());
                viewHolder.getSubtitle().setText(playbackBannerControlGlue.getSubtitle());
            }
        }) { // from class: androidx.leanback.media.PlaybackBannerControlGlue.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.leanback.widget.PlaybackControlsRowPresenter, androidx.leanback.widget.RowPresenter
            public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
                super.onBindRowViewHolder(viewHolder, obj);
                viewHolder.setOnKeyListener(PlaybackBannerControlGlue.this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.leanback.widget.PlaybackControlsRowPresenter, androidx.leanback.widget.RowPresenter
            public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
                super.onUnbindRowViewHolder(viewHolder);
                viewHolder.setOnKeyListener(null);
            }
        };
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, android.view.View.OnKeyListener
    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (i8 != 4 && i8 != 111) {
            switch (i8) {
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    Action actionForKeyCode = this.mControlsRow.getActionForKeyCode(this.mControlsRow.getPrimaryActionsAdapter(), i8);
                    if (actionForKeyCode == null) {
                        PlaybackControlsRow playbackControlsRow = this.mControlsRow;
                        actionForKeyCode = playbackControlsRow.getActionForKeyCode(playbackControlsRow.getSecondaryActionsAdapter(), i8);
                    }
                    if (actionForKeyCode == null) {
                        return false;
                    }
                    if (keyEvent.getAction() == 0) {
                        dispatchAction(actionForKeyCode, keyEvent);
                    }
                    return true;
            }
        }
        int i9 = this.mPlaybackSpeed;
        if (i9 < 10 && i9 > -10) {
            return false;
        }
        play();
        onUpdatePlaybackStatusAfterUserAction();
        if (i8 == 4 || i8 == 111) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void onPlayCompleted() {
        super.onPlayCompleted();
        this.mIsPlaying = false;
        this.mPlaybackSpeed = 0;
        this.mStartPosition = getCurrentPosition();
        this.mStartTime = System.currentTimeMillis();
        onUpdatePlaybackState();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void onPlayStateChanged() {
        onUpdatePlaybackState();
        super.onPlayStateChanged();
    }

    void onUpdatePlaybackState() {
        updatePlaybackState(this.mIsPlaying);
    }

    void onUpdatePlaybackStatusAfterUserAction() {
        updatePlaybackState(this.mIsPlaying);
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public void pause() {
        this.mIsPlaying = false;
        this.mPlaybackSpeed = 0;
        this.mStartPosition = getCurrentPosition();
        this.mStartTime = System.currentTimeMillis();
        super.pause();
        onUpdatePlaybackState();
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public void play() {
        if (!this.mPlayerAdapter.isPrepared()) {
            return;
        }
        if (this.mPlaybackSpeed == 0 && this.mPlayerAdapter.getCurrentPosition() >= this.mPlayerAdapter.getDuration()) {
            this.mStartPosition = 0L;
        } else {
            this.mStartPosition = getCurrentPosition();
        }
        this.mStartTime = System.currentTimeMillis();
        this.mIsPlaying = true;
        this.mPlaybackSpeed = 1;
        this.mPlayerAdapter.seekTo(this.mStartPosition);
        super.play();
        onUpdatePlaybackState();
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void setControlsRow(PlaybackControlsRow playbackControlsRow) {
        super.setControlsRow(playbackControlsRow);
        onUpdatePlaybackState();
    }

    public PlaybackBannerControlGlue(Context context, int[] iArr, int[] iArr2, T t8) {
        super(context, t8);
        this.mPlaybackSpeed = 0;
        this.mStartPosition = 0L;
        if (iArr.length != 0 && iArr.length <= 5) {
            this.mFastForwardSpeeds = iArr;
            if (iArr2.length != 0 && iArr2.length <= 5) {
                this.mRewindSpeeds = iArr2;
                if ((this.mPlayerAdapter.getSupportedActions() & 128) != 0) {
                    this.mIsCustomizedFastForwardSupported = true;
                }
                if ((this.mPlayerAdapter.getSupportedActions() & 32) != 0) {
                    this.mIsCustomizedRewindSupported = true;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("invalid rewindSpeeds array size");
        }
        throw new IllegalArgumentException("invalid fastForwardSpeeds array size");
    }
}
