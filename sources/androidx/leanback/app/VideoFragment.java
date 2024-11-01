package androidx.leanback.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.R;

@Deprecated
/* loaded from: classes3.dex */
public class VideoFragment extends PlaybackFragment {
    static final int SURFACE_CREATED = 1;
    static final int SURFACE_NOT_CREATED = 0;
    SurfaceHolder.Callback mMediaPlaybackCallback;
    int mState = 0;
    SurfaceView mVideoSurface;

    public SurfaceView getSurfaceView() {
        return this.mVideoSurface;
    }

    @Override // androidx.leanback.app.PlaybackFragment, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle);
        SurfaceView surfaceView = (SurfaceView) LayoutInflater.from(FragmentUtil.getContext(this)).inflate(R.layout.lb_video_surface, viewGroup2, false);
        this.mVideoSurface = surfaceView;
        viewGroup2.addView(surfaceView, 0);
        this.mVideoSurface.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: androidx.leanback.app.VideoFragment.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
                SurfaceHolder.Callback callback = VideoFragment.this.mMediaPlaybackCallback;
                if (callback != null) {
                    callback.surfaceChanged(surfaceHolder, i8, i9, i10);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                SurfaceHolder.Callback callback = VideoFragment.this.mMediaPlaybackCallback;
                if (callback != null) {
                    callback.surfaceCreated(surfaceHolder);
                }
                VideoFragment.this.mState = 1;
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                SurfaceHolder.Callback callback = VideoFragment.this.mMediaPlaybackCallback;
                if (callback != null) {
                    callback.surfaceDestroyed(surfaceHolder);
                }
                VideoFragment.this.mState = 0;
            }
        });
        setBackgroundType(2);
        return viewGroup2;
    }

    @Override // androidx.leanback.app.PlaybackFragment, android.app.Fragment
    public void onDestroyView() {
        this.mVideoSurface = null;
        this.mState = 0;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.app.PlaybackFragment
    public void onVideoSizeChanged(int i8, int i9) {
        int width = getView().getWidth();
        int height = getView().getHeight();
        ViewGroup.LayoutParams layoutParams = this.mVideoSurface.getLayoutParams();
        int i10 = width * i9;
        int i11 = i8 * height;
        if (i10 > i11) {
            layoutParams.height = height;
            layoutParams.width = i11 / i9;
        } else {
            layoutParams.width = width;
            layoutParams.height = i10 / i8;
        }
        this.mVideoSurface.setLayoutParams(layoutParams);
    }

    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        this.mMediaPlaybackCallback = callback;
        if (callback != null && this.mState == 1) {
            callback.surfaceCreated(this.mVideoSurface.getHolder());
        }
    }
}
