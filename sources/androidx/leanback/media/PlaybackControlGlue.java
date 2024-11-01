package androidx.leanback.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.graphics.Float16;
import androidx.leanback.media.PlaybackGlue;
import androidx.leanback.widget.AbstractDetailsDescriptionPresenter;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ControlButtonPresenterSelector;
import androidx.leanback.widget.OnActionClickedListener;
import androidx.leanback.widget.PlaybackControlsRow;
import androidx.leanback.widget.PlaybackControlsRowPresenter;
import androidx.leanback.widget.PlaybackRowPresenter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.SparseArrayObjectAdapter;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PlaybackControlGlue extends PlaybackGlue implements OnActionClickedListener, View.OnKeyListener {
    public static final int ACTION_CUSTOM_LEFT_FIRST = 1;
    public static final int ACTION_CUSTOM_RIGHT_FIRST = 4096;
    public static final int ACTION_FAST_FORWARD = 128;
    public static final int ACTION_PLAY_PAUSE = 64;
    public static final int ACTION_REWIND = 32;
    public static final int ACTION_SKIP_TO_NEXT = 256;
    public static final int ACTION_SKIP_TO_PREVIOUS = 16;
    static final boolean DEBUG = false;
    static final int MSG_UPDATE_PLAYBACK_STATE = 100;
    private static final int NUMBER_OF_SEEK_SPEEDS = 5;
    public static final int PLAYBACK_SPEED_FAST_L0 = 10;
    public static final int PLAYBACK_SPEED_FAST_L1 = 11;
    public static final int PLAYBACK_SPEED_FAST_L2 = 12;
    public static final int PLAYBACK_SPEED_FAST_L3 = 13;
    public static final int PLAYBACK_SPEED_FAST_L4 = 14;
    public static final int PLAYBACK_SPEED_INVALID = -1;
    public static final int PLAYBACK_SPEED_NORMAL = 1;
    public static final int PLAYBACK_SPEED_PAUSED = 0;
    static final String TAG = "PlaybackControlGlue";
    private static final int UPDATE_PLAYBACK_STATE_DELAY_MS = 2000;
    static final Handler sHandler = new UpdatePlaybackStateHandler();
    private PlaybackControlsRow mControlsRow;
    private PlaybackRowPresenter mControlsRowPresenter;
    private boolean mFadeWhenPlaying;
    private PlaybackControlsRow.FastForwardAction mFastForwardAction;
    private final int[] mFastForwardSpeeds;
    final WeakReference<PlaybackControlGlue> mGlueWeakReference;
    private PlaybackControlsRow.PlayPauseAction mPlayPauseAction;
    private int mPlaybackSpeed;
    private PlaybackControlsRow.RewindAction mRewindAction;
    private final int[] mRewindSpeeds;
    private PlaybackControlsRow.SkipNextAction mSkipNextAction;
    private PlaybackControlsRow.SkipPreviousAction mSkipPreviousAction;

    /* loaded from: classes3.dex */
    static class UpdatePlaybackStateHandler extends Handler {
        UpdatePlaybackStateHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PlaybackControlGlue playbackControlGlue;
            if (message.what == 100 && (playbackControlGlue = (PlaybackControlGlue) ((WeakReference) message.obj).get()) != null) {
                playbackControlGlue.updatePlaybackState();
            }
        }
    }

    public PlaybackControlGlue(Context context, int[] iArr) {
        this(context, iArr, iArr);
    }

    private int getMaxForwardSpeedId() {
        return this.mFastForwardSpeeds.length + 9;
    }

    private int getMaxRewindSpeedId() {
        return this.mRewindSpeeds.length + 9;
    }

    private static String getSpeedString(int i8) {
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    switch (i8) {
                        case Float16.MinExponent /* -14 */:
                            return "-PLAYBACK_SPEED_FAST_L4";
                        case -13:
                            return "-PLAYBACK_SPEED_FAST_L3";
                        case -12:
                            return "-PLAYBACK_SPEED_FAST_L2";
                        case -11:
                            return "-PLAYBACK_SPEED_FAST_L1";
                        case -10:
                            return "-PLAYBACK_SPEED_FAST_L0";
                        default:
                            switch (i8) {
                                case 10:
                                    return "PLAYBACK_SPEED_FAST_L0";
                                case 11:
                                    return "PLAYBACK_SPEED_FAST_L1";
                                case 12:
                                    return "PLAYBACK_SPEED_FAST_L2";
                                case 13:
                                    return "PLAYBACK_SPEED_FAST_L3";
                                case 14:
                                    return "PLAYBACK_SPEED_FAST_L4";
                                default:
                                    return null;
                            }
                    }
                }
                return "PLAYBACK_SPEED_NORMAL";
            }
            return "PLAYBACK_SPEED_PAUSED";
        }
        return "PLAYBACK_SPEED_INVALID";
    }

    private static void notifyItemChanged(SparseArrayObjectAdapter sparseArrayObjectAdapter, Object obj) {
        int indexOf = sparseArrayObjectAdapter.indexOf(obj);
        if (indexOf >= 0) {
            sparseArrayObjectAdapter.notifyArrayItemRangeChanged(indexOf, 1);
        }
    }

    private void updateControlsRow() {
        updateRowMetadata();
        updateControlButtons();
        sHandler.removeMessages(100, this.mGlueWeakReference);
        updatePlaybackState();
    }

    private void updatePlaybackStatusAfterUserAction() {
        updatePlaybackState(this.mPlaybackSpeed);
        Handler handler = sHandler;
        handler.removeMessages(100, this.mGlueWeakReference);
        handler.sendMessageDelayed(handler.obtainMessage(100, this.mGlueWeakReference), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    private void updateRowMetadata() {
        if (this.mControlsRow == null) {
            return;
        }
        if (!hasValidMedia()) {
            this.mControlsRow.setImageDrawable(null);
            this.mControlsRow.setTotalTime(0);
            this.mControlsRow.setCurrentTime(0);
        } else {
            this.mControlsRow.setImageDrawable(getMediaArt());
            this.mControlsRow.setTotalTime(getMediaDuration());
            this.mControlsRow.setCurrentTime(getCurrentPosition());
        }
        if (getHost() != null) {
            getHost().notifyPlaybackRowChanged();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected SparseArrayObjectAdapter createPrimaryActionsAdapter(PresenterSelector presenterSelector) {
        SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(presenterSelector);
        onCreatePrimaryActions(sparseArrayObjectAdapter);
        return sparseArrayObjectAdapter;
    }

    boolean dispatchAction(Action action, KeyEvent keyEvent) {
        boolean z8;
        if (action == this.mPlayPauseAction) {
            if (keyEvent != null && keyEvent.getKeyCode() != 85 && keyEvent.getKeyCode() != 126) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (keyEvent == null || keyEvent.getKeyCode() == 85 || keyEvent.getKeyCode() == 127) {
                int i8 = this.mPlaybackSpeed;
                if (!z8 ? i8 != 0 : i8 == 1) {
                    this.mPlaybackSpeed = 0;
                    pause();
                    updatePlaybackStatusAfterUserAction();
                    return true;
                }
            }
            if (z8 && this.mPlaybackSpeed != 1) {
                this.mPlaybackSpeed = 1;
                play(1);
            }
            updatePlaybackStatusAfterUserAction();
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
            if (this.mPlaybackSpeed >= getMaxForwardSpeedId()) {
                return true;
            }
            int i9 = this.mPlaybackSpeed;
            switch (i9) {
                case 10:
                case 11:
                case 12:
                case 13:
                    this.mPlaybackSpeed = i9 + 1;
                    break;
                default:
                    this.mPlaybackSpeed = 10;
                    break;
            }
            play(this.mPlaybackSpeed);
            updatePlaybackStatusAfterUserAction();
            return true;
        }
        if (action == this.mRewindAction) {
            if (this.mPlaybackSpeed <= (-getMaxRewindSpeedId())) {
                return true;
            }
            int i10 = this.mPlaybackSpeed;
            switch (i10) {
                case -13:
                case -12:
                case -11:
                case -10:
                    this.mPlaybackSpeed = i10 - 1;
                    break;
                default:
                    this.mPlaybackSpeed = -10;
                    break;
            }
            play(this.mPlaybackSpeed);
            updatePlaybackStatusAfterUserAction();
            return true;
        }
        return false;
    }

    public void enableProgressUpdating(boolean z8) {
    }

    public PlaybackControlsRow getControlsRow() {
        return this.mControlsRow;
    }

    @Deprecated
    public PlaybackControlsRowPresenter getControlsRowPresenter() {
        PlaybackRowPresenter playbackRowPresenter = this.mControlsRowPresenter;
        if (playbackRowPresenter instanceof PlaybackControlsRowPresenter) {
            return (PlaybackControlsRowPresenter) playbackRowPresenter;
        }
        return null;
    }

    public abstract int getCurrentPosition();

    public abstract int getCurrentSpeedId();

    public int[] getFastForwardSpeeds() {
        return this.mFastForwardSpeeds;
    }

    public abstract Drawable getMediaArt();

    public abstract int getMediaDuration();

    public abstract CharSequence getMediaSubtitle();

    public abstract CharSequence getMediaTitle();

    public PlaybackRowPresenter getPlaybackRowPresenter() {
        return this.mControlsRowPresenter;
    }

    public int[] getRewindSpeeds() {
        return this.mRewindSpeeds;
    }

    public abstract long getSupportedActions();

    public int getUpdatePeriod() {
        return 500;
    }

    public abstract boolean hasValidMedia();

    public boolean isFadingEnabled() {
        return this.mFadeWhenPlaying;
    }

    public abstract boolean isMediaPlaying();

    @Override // androidx.leanback.media.PlaybackGlue
    public boolean isPlaying() {
        return isMediaPlaying();
    }

    public void onActionClicked(Action action) {
        dispatchAction(action, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackGlue
    public void onAttachedToHost(PlaybackGlueHost playbackGlueHost) {
        super.onAttachedToHost(playbackGlueHost);
        playbackGlueHost.setOnKeyInterceptListener(this);
        playbackGlueHost.setOnActionClickedListener(this);
        if (getControlsRow() == null || getPlaybackRowPresenter() == null) {
            onCreateControlsRowAndPresenter();
        }
        playbackGlueHost.setPlaybackRowPresenter(getPlaybackRowPresenter());
        playbackGlueHost.setPlaybackRow(getControlsRow());
    }

    protected void onCreateControlsRowAndPresenter() {
        if (getControlsRow() == null) {
            setControlsRow(new PlaybackControlsRow(this));
        }
        if (getPlaybackRowPresenter() == null) {
            setPlaybackRowPresenter(new PlaybackControlsRowPresenter(new AbstractDetailsDescriptionPresenter() { // from class: androidx.leanback.media.PlaybackControlGlue.1
                @Override // androidx.leanback.widget.AbstractDetailsDescriptionPresenter
                protected void onBindDescription(AbstractDetailsDescriptionPresenter.ViewHolder viewHolder, Object obj) {
                    PlaybackControlGlue playbackControlGlue = (PlaybackControlGlue) obj;
                    if (playbackControlGlue.hasValidMedia()) {
                        viewHolder.getTitle().setText(playbackControlGlue.getMediaTitle());
                        viewHolder.getSubtitle().setText(playbackControlGlue.getMediaSubtitle());
                    } else {
                        viewHolder.getTitle().setText("");
                        viewHolder.getSubtitle().setText("");
                    }
                }
            }) { // from class: androidx.leanback.media.PlaybackControlGlue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // androidx.leanback.widget.PlaybackControlsRowPresenter, androidx.leanback.widget.RowPresenter
                public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
                    super.onBindRowViewHolder(viewHolder, obj);
                    viewHolder.setOnKeyListener(PlaybackControlGlue.this);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // androidx.leanback.widget.PlaybackControlsRowPresenter, androidx.leanback.widget.RowPresenter
                public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
                    super.onUnbindRowViewHolder(viewHolder);
                    viewHolder.setOnKeyListener(null);
                }
            });
        }
    }

    protected void onCreatePrimaryActions(SparseArrayObjectAdapter sparseArrayObjectAdapter) {
    }

    protected void onCreateSecondaryActions(ArrayObjectAdapter arrayObjectAdapter) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackGlue
    public void onDetachedFromHost() {
        enableProgressUpdating(false);
        super.onDetachedFromHost();
    }

    @Override // androidx.leanback.media.PlaybackGlue
    protected void onHostStart() {
        enableProgressUpdating(true);
    }

    @Override // androidx.leanback.media.PlaybackGlue
    protected void onHostStop() {
        enableProgressUpdating(false);
    }

    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (i8 != 4 && i8 != 111) {
            switch (i8) {
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    SparseArrayObjectAdapter sparseArrayObjectAdapter = (SparseArrayObjectAdapter) this.mControlsRow.getPrimaryActionsAdapter();
                    Action actionForKeyCode = this.mControlsRow.getActionForKeyCode(sparseArrayObjectAdapter, i8);
                    if (actionForKeyCode == null || (actionForKeyCode != sparseArrayObjectAdapter.lookup(64) && actionForKeyCode != sparseArrayObjectAdapter.lookup(32) && actionForKeyCode != sparseArrayObjectAdapter.lookup(128) && actionForKeyCode != sparseArrayObjectAdapter.lookup(16) && actionForKeyCode != sparseArrayObjectAdapter.lookup(256))) {
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
        this.mPlaybackSpeed = 1;
        play(1);
        updatePlaybackStatusAfterUserAction();
        if (i8 != 4 && i8 != 111) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onMetadataChanged() {
        updateRowMetadata();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onStateChanged() {
        if (!hasValidMedia()) {
            return;
        }
        Handler handler = sHandler;
        if (handler.hasMessages(100, this.mGlueWeakReference)) {
            handler.removeMessages(100, this.mGlueWeakReference);
            if (getCurrentSpeedId() != this.mPlaybackSpeed) {
                handler.sendMessageDelayed(handler.obtainMessage(100, this.mGlueWeakReference), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                return;
            } else {
                updatePlaybackState();
                return;
            }
        }
        updatePlaybackState();
    }

    public void play(int i8) {
    }

    public void setControlsRow(PlaybackControlsRow playbackControlsRow) {
        this.mControlsRow = playbackControlsRow;
        playbackControlsRow.setPrimaryActionsAdapter(createPrimaryActionsAdapter(new ControlButtonPresenterSelector()));
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ControlButtonPresenterSelector());
        onCreateSecondaryActions(arrayObjectAdapter);
        getControlsRow().setSecondaryActionsAdapter(arrayObjectAdapter);
        updateControlsRow();
    }

    @Deprecated
    public void setControlsRowPresenter(PlaybackControlsRowPresenter playbackControlsRowPresenter) {
        this.mControlsRowPresenter = playbackControlsRowPresenter;
    }

    public void setFadingEnabled(boolean z8) {
        this.mFadeWhenPlaying = z8;
        if (!z8 && getHost() != null) {
            getHost().setControlsOverlayAutoHideEnabled(false);
        }
    }

    public void setPlaybackRowPresenter(PlaybackRowPresenter playbackRowPresenter) {
        this.mControlsRowPresenter = playbackRowPresenter;
    }

    void updateControlButtons() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter = (SparseArrayObjectAdapter) getControlsRow().getPrimaryActionsAdapter();
        long supportedActions = getSupportedActions();
        long j8 = 16 & supportedActions;
        if (j8 != 0 && this.mSkipPreviousAction == null) {
            PlaybackControlsRow.SkipPreviousAction skipPreviousAction = new PlaybackControlsRow.SkipPreviousAction(getContext());
            this.mSkipPreviousAction = skipPreviousAction;
            sparseArrayObjectAdapter.set(16, skipPreviousAction);
        } else if (j8 == 0 && this.mSkipPreviousAction != null) {
            sparseArrayObjectAdapter.clear(16);
            this.mSkipPreviousAction = null;
        }
        long j9 = 32 & supportedActions;
        if (j9 != 0 && this.mRewindAction == null) {
            PlaybackControlsRow.RewindAction rewindAction = new PlaybackControlsRow.RewindAction(getContext(), this.mRewindSpeeds.length);
            this.mRewindAction = rewindAction;
            sparseArrayObjectAdapter.set(32, rewindAction);
        } else if (j9 == 0 && this.mRewindAction != null) {
            sparseArrayObjectAdapter.clear(32);
            this.mRewindAction = null;
        }
        long j10 = 64 & supportedActions;
        if (j10 != 0 && this.mPlayPauseAction == null) {
            PlaybackControlsRow.PlayPauseAction playPauseAction = new PlaybackControlsRow.PlayPauseAction(getContext());
            this.mPlayPauseAction = playPauseAction;
            sparseArrayObjectAdapter.set(64, playPauseAction);
        } else if (j10 == 0 && this.mPlayPauseAction != null) {
            sparseArrayObjectAdapter.clear(64);
            this.mPlayPauseAction = null;
        }
        long j11 = 128 & supportedActions;
        if (j11 != 0 && this.mFastForwardAction == null) {
            PlaybackControlsRow.FastForwardAction fastForwardAction = new PlaybackControlsRow.FastForwardAction(getContext(), this.mFastForwardSpeeds.length);
            this.mFastForwardAction = fastForwardAction;
            sparseArrayObjectAdapter.set(128, fastForwardAction);
        } else if (j11 == 0 && this.mFastForwardAction != null) {
            sparseArrayObjectAdapter.clear(128);
            this.mFastForwardAction = null;
        }
        long j12 = supportedActions & 256;
        if (j12 != 0 && this.mSkipNextAction == null) {
            PlaybackControlsRow.SkipNextAction skipNextAction = new PlaybackControlsRow.SkipNextAction(getContext());
            this.mSkipNextAction = skipNextAction;
            sparseArrayObjectAdapter.set(256, skipNextAction);
        } else if (j12 == 0 && this.mSkipNextAction != null) {
            sparseArrayObjectAdapter.clear(256);
            this.mSkipNextAction = null;
        }
    }

    void updatePlaybackState() {
        if (hasValidMedia()) {
            int currentSpeedId = getCurrentSpeedId();
            this.mPlaybackSpeed = currentSpeedId;
            updatePlaybackState(currentSpeedId);
        }
    }

    public void updateProgress() {
        int currentPosition = getCurrentPosition();
        PlaybackControlsRow playbackControlsRow = this.mControlsRow;
        if (playbackControlsRow != null) {
            playbackControlsRow.setCurrentTime(currentPosition);
        }
    }

    public PlaybackControlGlue(Context context, int[] iArr, int[] iArr2) {
        super(context);
        this.mPlaybackSpeed = 1;
        this.mFadeWhenPlaying = true;
        this.mGlueWeakReference = new WeakReference<>(this);
        if (iArr.length != 0 && iArr.length <= 5) {
            this.mFastForwardSpeeds = iArr;
            if (iArr2.length != 0 && iArr2.length <= 5) {
                this.mRewindSpeeds = iArr2;
                return;
            }
            throw new IllegalStateException("invalid rewindSpeeds array size");
        }
        throw new IllegalStateException("invalid fastForwardSpeeds array size");
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final void play() {
        play(1);
    }

    private void updatePlaybackState(int i8) {
        if (this.mControlsRow == null) {
            return;
        }
        SparseArrayObjectAdapter sparseArrayObjectAdapter = (SparseArrayObjectAdapter) getControlsRow().getPrimaryActionsAdapter();
        PlaybackControlsRow.FastForwardAction fastForwardAction = this.mFastForwardAction;
        if (fastForwardAction != null) {
            int i9 = i8 >= 10 ? i8 - 9 : 0;
            if (fastForwardAction.getIndex() != i9) {
                this.mFastForwardAction.setIndex(i9);
                notifyItemChanged(sparseArrayObjectAdapter, this.mFastForwardAction);
            }
        }
        PlaybackControlsRow.RewindAction rewindAction = this.mRewindAction;
        if (rewindAction != null) {
            int i10 = i8 <= -10 ? (-i8) - 9 : 0;
            if (rewindAction.getIndex() != i10) {
                this.mRewindAction.setIndex(i10);
                notifyItemChanged(sparseArrayObjectAdapter, this.mRewindAction);
            }
        }
        if (i8 == 0) {
            updateProgress();
            enableProgressUpdating(false);
        } else {
            enableProgressUpdating(true);
        }
        if (this.mFadeWhenPlaying && getHost() != null) {
            getHost().setControlsOverlayAutoHideEnabled(i8 == 1);
        }
        PlaybackControlsRow.PlayPauseAction playPauseAction = this.mPlayPauseAction;
        if (playPauseAction != null) {
            int i11 = i8 == 0 ? 0 : 1;
            if (playPauseAction.getIndex() != i11) {
                this.mPlayPauseAction.setIndex(i11);
                notifyItemChanged(sparseArrayObjectAdapter, this.mPlayPauseAction);
            }
        }
        List<PlaybackGlue.PlayerCallback> playerCallbacks = getPlayerCallbacks();
        if (playerCallbacks != null) {
            int size = playerCallbacks.size();
            for (int i12 = 0; i12 < size; i12++) {
                playerCallbacks.get(i12).onPlayStateChanged(this);
            }
        }
    }
}
