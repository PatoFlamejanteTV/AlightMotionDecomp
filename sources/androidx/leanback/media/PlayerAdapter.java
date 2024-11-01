package androidx.leanback.media;

/* loaded from: classes3.dex */
public abstract class PlayerAdapter {
    Callback mCallback;

    /* loaded from: classes3.dex */
    public static class Callback {
        public void onBufferedPositionChanged(PlayerAdapter playerAdapter) {
        }

        public void onBufferingStateChanged(PlayerAdapter playerAdapter, boolean z8) {
        }

        public void onCurrentPositionChanged(PlayerAdapter playerAdapter) {
        }

        public void onDurationChanged(PlayerAdapter playerAdapter) {
        }

        public void onError(PlayerAdapter playerAdapter, int i8, String str) {
        }

        public void onMetadataChanged(PlayerAdapter playerAdapter) {
        }

        public void onPlayCompleted(PlayerAdapter playerAdapter) {
        }

        public void onPlayStateChanged(PlayerAdapter playerAdapter) {
        }

        public void onPreparedStateChanged(PlayerAdapter playerAdapter) {
        }

        public void onVideoSizeChanged(PlayerAdapter playerAdapter, int i8, int i9) {
        }
    }

    public void fastForward() {
    }

    public long getBufferedPosition() {
        return 0L;
    }

    public final Callback getCallback() {
        return this.mCallback;
    }

    public long getCurrentPosition() {
        return 0L;
    }

    public long getDuration() {
        return 0L;
    }

    public long getSupportedActions() {
        return 64L;
    }

    public boolean isPlaying() {
        return false;
    }

    public boolean isPrepared() {
        return true;
    }

    public void next() {
    }

    public void onAttachedToHost(PlaybackGlueHost playbackGlueHost) {
    }

    public void onDetachedFromHost() {
    }

    public abstract void pause();

    public abstract void play();

    public void previous() {
    }

    public void rewind() {
    }

    public void seekTo(long j8) {
    }

    public final void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void setProgressUpdatingEnabled(boolean z8) {
    }

    public void setRepeatAction(int i8) {
    }

    public void setShuffleAction(int i8) {
    }
}
