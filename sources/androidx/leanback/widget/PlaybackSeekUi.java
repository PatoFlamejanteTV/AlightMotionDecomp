package androidx.leanback.widget;

/* loaded from: classes3.dex */
public interface PlaybackSeekUi {

    /* loaded from: classes3.dex */
    public static class Client {
        public PlaybackSeekDataProvider getPlaybackSeekDataProvider() {
            return null;
        }

        public boolean isSeekEnabled() {
            return false;
        }

        public void onSeekFinished(boolean z8) {
        }

        public void onSeekPositionChanged(long j8) {
        }

        public void onSeekStarted() {
        }
    }

    void setPlaybackSeekUiClient(Client client);
}
