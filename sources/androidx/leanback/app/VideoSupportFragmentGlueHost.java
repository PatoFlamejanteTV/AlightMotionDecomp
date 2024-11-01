package androidx.leanback.app;

import android.view.SurfaceHolder;
import androidx.leanback.media.SurfaceHolderGlueHost;

/* loaded from: classes3.dex */
public class VideoSupportFragmentGlueHost extends PlaybackSupportFragmentGlueHost implements SurfaceHolderGlueHost {
    private final VideoSupportFragment mFragment;

    public VideoSupportFragmentGlueHost(VideoSupportFragment videoSupportFragment) {
        super(videoSupportFragment);
        this.mFragment = videoSupportFragment;
    }

    @Override // androidx.leanback.media.SurfaceHolderGlueHost
    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        this.mFragment.setSurfaceHolderCallback(callback);
    }
}
