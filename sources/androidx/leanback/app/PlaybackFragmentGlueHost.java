package androidx.leanback.app;

import android.view.View;
import androidx.leanback.media.PlaybackGlueHost;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.OnActionClickedListener;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.PlaybackRowPresenter;
import androidx.leanback.widget.PlaybackSeekUi;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;

@Deprecated
/* loaded from: classes3.dex */
public class PlaybackFragmentGlueHost extends PlaybackGlueHost implements PlaybackSeekUi {
    final PlaybackFragment mFragment;
    final PlaybackGlueHost.PlayerCallback mPlayerCallback = new PlaybackGlueHost.PlayerCallback() { // from class: androidx.leanback.app.PlaybackFragmentGlueHost.2
        @Override // androidx.leanback.media.PlaybackGlueHost.PlayerCallback
        public void onBufferingStateChanged(boolean z8) {
            PlaybackFragmentGlueHost.this.mFragment.onBufferingStateChanged(z8);
        }

        @Override // androidx.leanback.media.PlaybackGlueHost.PlayerCallback
        public void onError(int i8, CharSequence charSequence) {
            PlaybackFragmentGlueHost.this.mFragment.onError(i8, charSequence);
        }

        @Override // androidx.leanback.media.PlaybackGlueHost.PlayerCallback
        public void onVideoSizeChanged(int i8, int i9) {
            PlaybackFragmentGlueHost.this.mFragment.onVideoSizeChanged(i8, i9);
        }
    };

    public PlaybackFragmentGlueHost(PlaybackFragment playbackFragment) {
        this.mFragment = playbackFragment;
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void fadeOut() {
        this.mFragment.fadeOut();
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public PlaybackGlueHost.PlayerCallback getPlayerCallback() {
        return this.mPlayerCallback;
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void hideControlsOverlay(boolean z8) {
        this.mFragment.hideControlsOverlay(z8);
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public boolean isControlsOverlayAutoHideEnabled() {
        return this.mFragment.isControlsOverlayAutoHideEnabled();
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public boolean isControlsOverlayVisible() {
        return this.mFragment.isControlsOverlayVisible();
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void notifyPlaybackRowChanged() {
        this.mFragment.notifyPlaybackRowChanged();
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setControlsOverlayAutoHideEnabled(boolean z8) {
        this.mFragment.setControlsOverlayAutoHideEnabled(z8);
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setHostCallback(PlaybackGlueHost.HostCallback hostCallback) {
        this.mFragment.setHostCallback(hostCallback);
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setOnActionClickedListener(final OnActionClickedListener onActionClickedListener) {
        if (onActionClickedListener == null) {
            this.mFragment.setOnPlaybackItemViewClickedListener(null);
        } else {
            this.mFragment.setOnPlaybackItemViewClickedListener(new OnItemViewClickedListener() { // from class: androidx.leanback.app.PlaybackFragmentGlueHost.1
                @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
                public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                    if (obj instanceof Action) {
                        onActionClickedListener.onActionClicked((Action) obj);
                    }
                }
            });
        }
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setOnKeyInterceptListener(View.OnKeyListener onKeyListener) {
        this.mFragment.setOnKeyInterceptListener(onKeyListener);
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setPlaybackRow(Row row) {
        this.mFragment.setPlaybackRow(row);
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setPlaybackRowPresenter(PlaybackRowPresenter playbackRowPresenter) {
        this.mFragment.setPlaybackRowPresenter(playbackRowPresenter);
    }

    @Override // androidx.leanback.widget.PlaybackSeekUi
    public void setPlaybackSeekUiClient(PlaybackSeekUi.Client client) {
        this.mFragment.setPlaybackSeekUiClient(client);
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void showControlsOverlay(boolean z8) {
        this.mFragment.showControlsOverlay(z8);
    }
}
