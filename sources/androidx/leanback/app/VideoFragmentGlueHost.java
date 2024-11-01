package androidx.leanback.app;

import android.view.SurfaceHolder;
import androidx.leanback.media.SurfaceHolderGlueHost;

@Deprecated
/* loaded from: classes3.dex */
public class VideoFragmentGlueHost extends PlaybackFragmentGlueHost implements SurfaceHolderGlueHost {
    private final VideoFragment mFragment;

    public VideoFragmentGlueHost(VideoFragment videoFragment) {
        super(videoFragment);
        this.mFragment = videoFragment;
    }

    @Override // androidx.leanback.media.SurfaceHolderGlueHost
    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        this.mFragment.setSurfaceHolderCallback(callback);
    }
}
