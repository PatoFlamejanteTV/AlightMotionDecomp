package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ScatterMapKt;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> GROW_FRACTION = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.getGrowFraction());
        }

        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f8) {
            drawableWithAnimatedVisibilityChange.setGrowFraction(f8.floatValue());
        }
    };
    private List<Animatable2Compat.AnimationCallback> animationCallbacks;
    final BaseProgressIndicatorSpec baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private Animatable2Compat.AnimationCallback internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    private ValueAnimator showAnimator;

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, to = ScatterMapKt.Sentinel)
    private int totalAlpha;
    final Paint paint = new Paint();
    AnimatorDurationScaleProvider animatorDurationScaleProvider = new AnimatorDurationScaleProvider();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DrawableWithAnimatedVisibilityChange(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.context = context;
        this.baseSpec = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    private void cancelAnimatorsWithoutCallbacks(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z8 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.ignoreCallbacks = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        Animatable2Compat.AnimationCallback animationCallback = this.internalAnimationCallback;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null && !this.ignoreCallbacks) {
            Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        Animatable2Compat.AnimationCallback animationCallback = this.internalAnimationCallback;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null && !this.ignoreCallbacks) {
            Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onAnimationStart(this);
            }
        }
    }

    private void endAnimatorsWithoutCallbacks(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z8 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = z8;
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, GROW_FRACTION, 0.0f, 1.0f);
            this.showAnimator = ofFloat;
            ofFloat.setDuration(500L);
            this.showAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, GROW_FRACTION, 1.0f, 0.0f);
            this.hideAnimator = ofFloat2;
            ofFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setHideAnimator(this.hideAnimator);
        }
    }

    private void setHideAnimator(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.hideAnimator = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                DrawableWithAnimatedVisibilityChange.this.dispatchAnimationEnd();
            }
        });
    }

    private void setShowAnimator(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.showAnimator = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DrawableWithAnimatedVisibilityChange.this.dispatchAnimationStart();
            }
        });
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.totalAlpha;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getGrowFraction() {
        if (!this.baseSpec.isShowAnimationEnabled() && !this.baseSpec.isHideAnimationEnabled()) {
            return 1.0f;
        }
        if (!this.mockHideAnimationRunning && !this.mockShowAnimationRunning) {
            return this.growFraction;
        }
        return this.mockGrowFraction;
    }

    @NonNull
    ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.hideAnimator;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning) {
            return true;
        }
        return false;
    }

    public boolean isRunning() {
        if (!isShowing() && !isHiding()) {
            return false;
        }
        return true;
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.showAnimator;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning) {
            return true;
        }
        return false;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (!this.animationCallbacks.contains(animationCallback)) {
            this.animationCallbacks.add(animationCallback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i8) {
        this.totalAlpha = i8;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGrowFraction(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        if (this.growFraction != f8) {
            this.growFraction = f8;
            invalidateSelf();
        }
    }

    void setInternalAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.internalAnimationCallback = animationCallback;
    }

    @VisibleForTesting
    void setMockHideAnimationRunning(boolean z8, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.mockHideAnimationRunning = z8;
        this.mockGrowFraction = f8;
    }

    @VisibleForTesting
    void setMockShowAnimationRunning(boolean z8, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.mockShowAnimationRunning = z8;
        this.mockGrowFraction = f8;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        return setVisible(z8, z9, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setVisibleInternal(boolean z8, boolean z9, boolean z10) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z11;
        boolean isHideAnimationEnabled;
        maybeInitializeAnimators();
        if (!isVisible() && !z8) {
            return false;
        }
        if (z8) {
            valueAnimator = this.showAnimator;
        } else {
            valueAnimator = this.hideAnimator;
        }
        if (z8) {
            valueAnimator2 = this.hideAnimator;
        } else {
            valueAnimator2 = this.showAnimator;
        }
        if (!z10) {
            if (valueAnimator2.isRunning()) {
                cancelAnimatorsWithoutCallbacks(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorsWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z8, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        if (z8 && !super.setVisible(z8, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z8) {
            isHideAnimationEnabled = this.baseSpec.isShowAnimationEnabled();
        } else {
            isHideAnimationEnabled = this.baseSpec.isHideAnimationEnabled();
        }
        if (!isHideAnimationEnabled) {
            endAnimatorsWithoutCallbacks(valueAnimator);
            return z11;
        }
        if (!z9 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
        return z11;
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null && list.contains(animationCallback)) {
            this.animationCallbacks.remove(animationCallback);
            if (this.animationCallbacks.isEmpty()) {
                this.animationCallbacks = null;
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean setVisible(boolean z8, boolean z9, boolean z10) {
        return setVisibleInternal(z8, z9, z10 && this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) > 0.0f);
    }
}
