package androidx.leanback.app;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import androidx.leanback.media.PlaybackGlue;
import androidx.leanback.widget.DetailsParallax;
import androidx.leanback.widget.Parallax;
import androidx.leanback.widget.ParallaxEffect;
import androidx.leanback.widget.ParallaxTarget;

/* loaded from: classes3.dex */
final class DetailsBackgroundVideoHelper {
    private static final long BACKGROUND_CROSS_FADE_DURATION = 500;
    private static final long CROSSFADE_DELAY = 1000;
    static final int INITIAL = 0;
    static final int NO_VIDEO = 2;
    static final int PLAY_VIDEO = 1;
    ValueAnimator mBackgroundAnimator;
    Drawable mBackgroundDrawable;
    private final DetailsParallax mDetailsParallax;
    private ParallaxEffect mParallaxEffect;
    private PlaybackGlue mPlaybackGlue;
    private int mCurrentState = 0;
    PlaybackControlStateCallback mControlStateCallback = new PlaybackControlStateCallback();
    private boolean mBackgroundDrawableVisible = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class PlaybackControlStateCallback extends PlaybackGlue.PlayerCallback {
        PlaybackControlStateCallback() {
        }

        @Override // androidx.leanback.media.PlaybackGlue.PlayerCallback
        public void onPreparedStateChanged(PlaybackGlue playbackGlue) {
            if (playbackGlue.isPrepared()) {
                DetailsBackgroundVideoHelper.this.internalStartPlayback();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DetailsBackgroundVideoHelper(PlaybackGlue playbackGlue, DetailsParallax detailsParallax, Drawable drawable) {
        this.mPlaybackGlue = playbackGlue;
        this.mDetailsParallax = detailsParallax;
        this.mBackgroundDrawable = drawable;
        drawable.setAlpha(255);
        startParallax();
    }

    private void applyState() {
        int i8 = this.mCurrentState;
        if (i8 != 1) {
            if (i8 == 2) {
                crossFadeBackgroundToVideo(false);
                PlaybackGlue playbackGlue = this.mPlaybackGlue;
                if (playbackGlue != null) {
                    playbackGlue.removePlayerCallback(this.mControlStateCallback);
                    this.mPlaybackGlue.pause();
                    return;
                }
                return;
            }
            return;
        }
        PlaybackGlue playbackGlue2 = this.mPlaybackGlue;
        if (playbackGlue2 != null) {
            if (playbackGlue2.isPrepared()) {
                internalStartPlayback();
                return;
            } else {
                this.mPlaybackGlue.addPlayerCallback(this.mControlStateCallback);
                return;
            }
        }
        crossFadeBackgroundToVideo(false);
    }

    void crossFadeBackgroundToVideo(boolean z8) {
        crossFadeBackgroundToVideo(z8, false);
    }

    void internalStartPlayback() {
        PlaybackGlue playbackGlue = this.mPlaybackGlue;
        if (playbackGlue != null) {
            playbackGlue.play();
        }
        this.mDetailsParallax.getRecyclerView().postDelayed(new Runnable() { // from class: androidx.leanback.app.DetailsBackgroundVideoHelper.2
            @Override // java.lang.Runnable
            public void run() {
                DetailsBackgroundVideoHelper.this.crossFadeBackgroundToVideo(true);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isVideoVisible() {
        if (this.mCurrentState == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPlaybackGlue(PlaybackGlue playbackGlue) {
        PlaybackGlue playbackGlue2 = this.mPlaybackGlue;
        if (playbackGlue2 != null) {
            playbackGlue2.removePlayerCallback(this.mControlStateCallback);
        }
        this.mPlaybackGlue = playbackGlue;
        applyState();
    }

    void startParallax() {
        if (this.mParallaxEffect != null) {
            return;
        }
        Parallax.IntProperty overviewRowTop = this.mDetailsParallax.getOverviewRowTop();
        this.mParallaxEffect = this.mDetailsParallax.addEffect(overviewRowTop.atFraction(1.0f), overviewRowTop.atFraction(0.0f)).target(new ParallaxTarget() { // from class: androidx.leanback.app.DetailsBackgroundVideoHelper.1
            @Override // androidx.leanback.widget.ParallaxTarget
            public void update(float f8) {
                if (f8 == 1.0f) {
                    DetailsBackgroundVideoHelper.this.updateState(2);
                } else {
                    DetailsBackgroundVideoHelper.this.updateState(1);
                }
            }
        });
        this.mDetailsParallax.updateValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopParallax() {
        this.mDetailsParallax.removeEffect(this.mParallaxEffect);
    }

    void updateState(int i8) {
        if (i8 == this.mCurrentState) {
            return;
        }
        this.mCurrentState = i8;
        applyState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void crossFadeBackgroundToVideo(boolean z8, boolean z9) {
        boolean z10 = !z8;
        if (this.mBackgroundDrawableVisible == z10) {
            if (z9) {
                ValueAnimator valueAnimator = this.mBackgroundAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.mBackgroundAnimator = null;
                }
                Drawable drawable = this.mBackgroundDrawable;
                if (drawable != null) {
                    drawable.setAlpha(z8 ? 0 : 255);
                    return;
                }
                return;
            }
            return;
        }
        this.mBackgroundDrawableVisible = z10;
        ValueAnimator valueAnimator2 = this.mBackgroundAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.mBackgroundAnimator = null;
        }
        float f8 = z8 ? 1.0f : 0.0f;
        float f9 = z8 ? 0.0f : 1.0f;
        Drawable drawable2 = this.mBackgroundDrawable;
        if (drawable2 == null) {
            return;
        }
        if (z9) {
            drawable2.setAlpha(z8 ? 0 : 255);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f9);
        this.mBackgroundAnimator = ofFloat;
        ofFloat.setDuration(BACKGROUND_CROSS_FADE_DURATION);
        this.mBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.app.DetailsBackgroundVideoHelper.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                DetailsBackgroundVideoHelper.this.mBackgroundDrawable.setAlpha((int) (((Float) valueAnimator3.getAnimatedValue()).floatValue() * 255.0f));
            }
        });
        this.mBackgroundAnimator.addListener(new Animator.AnimatorListener() { // from class: androidx.leanback.app.DetailsBackgroundVideoHelper.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DetailsBackgroundVideoHelper.this.mBackgroundAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.mBackgroundAnimator.start();
    }
}
