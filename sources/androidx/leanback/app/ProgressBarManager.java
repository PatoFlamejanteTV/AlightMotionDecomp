package androidx.leanback.app;

import android.R;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class ProgressBarManager {
    private static final long DEFAULT_PROGRESS_BAR_DELAY = 1000;
    boolean mIsShowing;
    View mProgressBarView;
    boolean mUserProvidedProgressBar;
    ViewGroup rootView;
    private long mInitialDelay = 1000;
    private Handler mHandler = new Handler();
    boolean mEnableProgressBar = true;
    private Runnable runnable = new Runnable() { // from class: androidx.leanback.app.ProgressBarManager.1
        @Override // java.lang.Runnable
        public void run() {
            ProgressBarManager progressBarManager = ProgressBarManager.this;
            if (progressBarManager.mEnableProgressBar) {
                boolean z8 = progressBarManager.mUserProvidedProgressBar;
                if ((z8 || progressBarManager.rootView != null) && progressBarManager.mIsShowing) {
                    View view = progressBarManager.mProgressBarView;
                    if (view == null) {
                        progressBarManager.mProgressBarView = new ProgressBar(ProgressBarManager.this.rootView.getContext(), null, R.attr.progressBarStyleLarge);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        ProgressBarManager progressBarManager2 = ProgressBarManager.this;
                        progressBarManager2.rootView.addView(progressBarManager2.mProgressBarView, layoutParams);
                        return;
                    }
                    if (z8) {
                        view.setVisibility(0);
                    }
                }
            }
        }
    };

    public void disableProgressBar() {
        this.mEnableProgressBar = false;
    }

    public void enableProgressBar() {
        this.mEnableProgressBar = true;
    }

    public long getInitialDelay() {
        return this.mInitialDelay;
    }

    public void hide() {
        this.mIsShowing = false;
        if (this.mUserProvidedProgressBar) {
            this.mProgressBarView.setVisibility(4);
        } else {
            View view = this.mProgressBarView;
            if (view != null) {
                this.rootView.removeView(view);
                this.mProgressBarView = null;
            }
        }
        this.mHandler.removeCallbacks(this.runnable);
    }

    public void setInitialDelay(long j8) {
        this.mInitialDelay = j8;
    }

    public void setProgressBarView(View view) {
        if (view.getParent() != null) {
            this.mProgressBarView = view;
            view.setVisibility(4);
            this.mUserProvidedProgressBar = true;
            return;
        }
        throw new IllegalArgumentException("Must have a parent");
    }

    public void setRootView(ViewGroup viewGroup) {
        this.rootView = viewGroup;
    }

    public void show() {
        if (this.mEnableProgressBar) {
            this.mIsShowing = true;
            this.mHandler.postDelayed(this.runnable, this.mInitialDelay);
        }
    }
}
