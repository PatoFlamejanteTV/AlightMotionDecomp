package androidx.leanback.media;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import androidx.leanback.media.PlayerAdapter;
import androidx.leanback.widget.AbstractDetailsDescriptionPresenter;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.PlaybackControlsRow;
import androidx.leanback.widget.PlaybackRowPresenter;
import androidx.leanback.widget.PlaybackSeekDataProvider;
import androidx.leanback.widget.PlaybackSeekUi;
import androidx.leanback.widget.PlaybackTransportRowPresenter;
import androidx.leanback.widget.RowPresenter;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class PlaybackTransportControlGlue<T extends PlayerAdapter> extends PlaybackBaseControlGlue<T> {
    static final boolean DEBUG = false;
    static final int MSG_UPDATE_PLAYBACK_STATE = 100;
    static final String TAG = "PlaybackTransportGlue";
    static final int UPDATE_PLAYBACK_STATE_DELAY_MS = 2000;
    static final Handler sHandler = new UpdatePlaybackStateHandler();
    final WeakReference<PlaybackBaseControlGlue> mGlueWeakReference;
    final PlaybackTransportControlGlue<T>.SeekUiClient mPlaybackSeekUiClient;
    boolean mSeekEnabled;
    PlaybackSeekDataProvider mSeekProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class SeekUiClient extends PlaybackSeekUi.Client {
        boolean mIsSeek;
        long mLastUserPosition;
        boolean mPausedBeforeSeek;
        long mPositionBeforeSeek;

        SeekUiClient() {
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public PlaybackSeekDataProvider getPlaybackSeekDataProvider() {
            return PlaybackTransportControlGlue.this.mSeekProvider;
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public boolean isSeekEnabled() {
            PlaybackTransportControlGlue playbackTransportControlGlue = PlaybackTransportControlGlue.this;
            if (playbackTransportControlGlue.mSeekProvider == null && !playbackTransportControlGlue.mSeekEnabled) {
                return false;
            }
            return true;
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekFinished(boolean z8) {
            if (!z8) {
                long j8 = this.mLastUserPosition;
                if (j8 >= 0) {
                    PlaybackTransportControlGlue.this.seekTo(j8);
                }
            } else {
                long j9 = this.mPositionBeforeSeek;
                if (j9 >= 0) {
                    PlaybackTransportControlGlue.this.seekTo(j9);
                }
            }
            this.mIsSeek = false;
            if (!this.mPausedBeforeSeek) {
                PlaybackTransportControlGlue.this.play();
            } else {
                PlaybackTransportControlGlue.this.mPlayerAdapter.setProgressUpdatingEnabled(false);
                PlaybackTransportControlGlue.this.onUpdateProgress();
            }
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekPositionChanged(long j8) {
            PlaybackTransportControlGlue playbackTransportControlGlue = PlaybackTransportControlGlue.this;
            if (playbackTransportControlGlue.mSeekProvider == null) {
                playbackTransportControlGlue.mPlayerAdapter.seekTo(j8);
            } else {
                this.mLastUserPosition = j8;
            }
            PlaybackControlsRow playbackControlsRow = PlaybackTransportControlGlue.this.mControlsRow;
            if (playbackControlsRow != null) {
                playbackControlsRow.setCurrentPosition(j8);
            }
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekStarted() {
            long j8;
            this.mIsSeek = true;
            this.mPausedBeforeSeek = !PlaybackTransportControlGlue.this.isPlaying();
            PlaybackTransportControlGlue.this.mPlayerAdapter.setProgressUpdatingEnabled(true);
            PlaybackTransportControlGlue playbackTransportControlGlue = PlaybackTransportControlGlue.this;
            if (playbackTransportControlGlue.mSeekProvider == null) {
                j8 = playbackTransportControlGlue.mPlayerAdapter.getCurrentPosition();
            } else {
                j8 = -1;
            }
            this.mPositionBeforeSeek = j8;
            this.mLastUserPosition = -1L;
            PlaybackTransportControlGlue.this.pause();
        }
    }

    /* loaded from: classes3.dex */
    static class UpdatePlaybackStateHandler extends Handler {
        UpdatePlaybackStateHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PlaybackTransportControlGlue playbackTransportControlGlue;
            if (message.what == 100 && (playbackTransportControlGlue = (PlaybackTransportControlGlue) ((WeakReference) message.obj).get()) != null) {
                playbackTransportControlGlue.onUpdatePlaybackState();
            }
        }
    }

    public PlaybackTransportControlGlue(Context context, T t8) {
        super(context, t8);
        this.mGlueWeakReference = new WeakReference<>(this);
        this.mPlaybackSeekUiClient = new SeekUiClient();
    }

    private void updatePlaybackState(boolean z8) {
        if (this.mControlsRow == null) {
            return;
        }
        if (!z8) {
            onUpdateProgress();
            this.mPlayerAdapter.setProgressUpdatingEnabled(this.mPlaybackSeekUiClient.mIsSeek);
        } else {
            this.mPlayerAdapter.setProgressUpdatingEnabled(true);
        }
        if (this.mFadeWhenPlaying && getHost() != null) {
            getHost().setControlsOverlayAutoHideEnabled(z8);
        }
        PlaybackControlsRow.PlayPauseAction playPauseAction = this.mPlayPauseAction;
        if (playPauseAction != null && playPauseAction.getIndex() != z8) {
            this.mPlayPauseAction.setIndex(z8 ? 1 : 0);
            PlaybackBaseControlGlue.notifyItemChanged((ArrayObjectAdapter) getControlsRow().getPrimaryActionsAdapter(), this.mPlayPauseAction);
        }
    }

    boolean dispatchAction(Action action, KeyEvent keyEvent) {
        boolean z8;
        if (action instanceof PlaybackControlsRow.PlayPauseAction) {
            if (keyEvent != null && keyEvent.getKeyCode() != 85 && keyEvent.getKeyCode() != 126) {
                z8 = false;
            } else {
                z8 = true;
            }
            if ((keyEvent == null || keyEvent.getKeyCode() == 85 || keyEvent.getKeyCode() == 127) && this.mIsPlaying) {
                this.mIsPlaying = false;
                pause();
            } else if (z8 && !this.mIsPlaying) {
                this.mIsPlaying = true;
                play();
            }
            onUpdatePlaybackStatusAfterUserAction();
            return true;
        }
        if (action instanceof PlaybackControlsRow.SkipNextAction) {
            next();
            return true;
        }
        if (action instanceof PlaybackControlsRow.SkipPreviousAction) {
            previous();
            return true;
        }
        return false;
    }

    public final PlaybackSeekDataProvider getSeekProvider() {
        return this.mSeekProvider;
    }

    public final boolean isSeekEnabled() {
        return this.mSeekEnabled;
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.widget.OnActionClickedListener
    public void onActionClicked(Action action) {
        dispatchAction(action, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public void onAttachedToHost(PlaybackGlueHost playbackGlueHost) {
        super.onAttachedToHost(playbackGlueHost);
        if (playbackGlueHost instanceof PlaybackSeekUi) {
            ((PlaybackSeekUi) playbackGlueHost).setPlaybackSeekUiClient(this.mPlaybackSeekUiClient);
        }
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    protected void onCreatePrimaryActions(ArrayObjectAdapter arrayObjectAdapter) {
        PlaybackControlsRow.PlayPauseAction playPauseAction = new PlaybackControlsRow.PlayPauseAction(getContext());
        this.mPlayPauseAction = playPauseAction;
        arrayObjectAdapter.add(playPauseAction);
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    protected PlaybackRowPresenter onCreateRowPresenter() {
        AbstractDetailsDescriptionPresenter abstractDetailsDescriptionPresenter = new AbstractDetailsDescriptionPresenter() { // from class: androidx.leanback.media.PlaybackTransportControlGlue.1
            @Override // androidx.leanback.widget.AbstractDetailsDescriptionPresenter
            protected void onBindDescription(AbstractDetailsDescriptionPresenter.ViewHolder viewHolder, Object obj) {
                PlaybackBaseControlGlue playbackBaseControlGlue = (PlaybackBaseControlGlue) obj;
                viewHolder.getTitle().setText(playbackBaseControlGlue.getTitle());
                viewHolder.getSubtitle().setText(playbackBaseControlGlue.getSubtitle());
            }
        };
        PlaybackTransportRowPresenter playbackTransportRowPresenter = new PlaybackTransportRowPresenter() { // from class: androidx.leanback.media.PlaybackTransportControlGlue.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.leanback.widget.PlaybackTransportRowPresenter, androidx.leanback.widget.RowPresenter
            public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
                super.onBindRowViewHolder(viewHolder, obj);
                viewHolder.setOnKeyListener(PlaybackTransportControlGlue.this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.leanback.widget.PlaybackTransportRowPresenter, androidx.leanback.widget.RowPresenter
            public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
                super.onUnbindRowViewHolder(viewHolder);
                viewHolder.setOnKeyListener(null);
            }
        };
        playbackTransportRowPresenter.setDescriptionPresenter(abstractDetailsDescriptionPresenter);
        return playbackTransportRowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public void onDetachedFromHost() {
        super.onDetachedFromHost();
        if (getHost() instanceof PlaybackSeekUi) {
            ((PlaybackSeekUi) getHost()).setPlaybackSeekUiClient(null);
        }
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, android.view.View.OnKeyListener
    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (i8 != 4 && i8 != 111) {
            switch (i8) {
                default:
                    Action actionForKeyCode = this.mControlsRow.getActionForKeyCode(this.mControlsRow.getPrimaryActionsAdapter(), i8);
                    if (actionForKeyCode == null) {
                        PlaybackControlsRow playbackControlsRow = this.mControlsRow;
                        actionForKeyCode = playbackControlsRow.getActionForKeyCode(playbackControlsRow.getSecondaryActionsAdapter(), i8);
                    }
                    if (actionForKeyCode != null) {
                        if (keyEvent.getAction() == 0) {
                            dispatchAction(actionForKeyCode, keyEvent);
                            return true;
                        }
                        return true;
                    }
                case 19:
                case 20:
                case 21:
                case 22:
                    return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void onPlayStateChanged() {
        Handler handler = sHandler;
        if (handler.hasMessages(100, this.mGlueWeakReference)) {
            handler.removeMessages(100, this.mGlueWeakReference);
            if (this.mPlayerAdapter.isPlaying() != this.mIsPlaying) {
                handler.sendMessageDelayed(handler.obtainMessage(100, this.mGlueWeakReference), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            } else {
                onUpdatePlaybackState();
            }
        } else {
            onUpdatePlaybackState();
        }
        super.onPlayStateChanged();
    }

    void onUpdatePlaybackState() {
        boolean isPlaying = this.mPlayerAdapter.isPlaying();
        this.mIsPlaying = isPlaying;
        updatePlaybackState(isPlaying);
    }

    void onUpdatePlaybackStatusAfterUserAction() {
        updatePlaybackState(this.mIsPlaying);
        Handler handler = sHandler;
        handler.removeMessages(100, this.mGlueWeakReference);
        handler.sendMessageDelayed(handler.obtainMessage(100, this.mGlueWeakReference), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void onUpdateProgress() {
        if (!this.mPlaybackSeekUiClient.mIsSeek) {
            super.onUpdateProgress();
        }
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void setControlsRow(PlaybackControlsRow playbackControlsRow) {
        super.setControlsRow(playbackControlsRow);
        sHandler.removeMessages(100, this.mGlueWeakReference);
        onUpdatePlaybackState();
    }

    public final void setSeekEnabled(boolean z8) {
        this.mSeekEnabled = z8;
    }

    public final void setSeekProvider(PlaybackSeekDataProvider playbackSeekDataProvider) {
        this.mSeekProvider = playbackSeekDataProvider;
    }
}
