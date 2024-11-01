package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    /* JADX INFO: Access modifiers changed from: protected */
    public IndeterminateAnimatorDelegate(int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void cancelAnimatorImmediately();

    /* JADX INFO: Access modifiers changed from: protected */
    public float getFractionInRange(int i8, int i9, int i10) {
        return (i8 - i9) / i10;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerDrawable(@NonNull IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void requestCancelAnimatorAfterCurrentCycle();

    @VisibleForTesting
    abstract void resetPropertiesForNewStart();

    @VisibleForTesting
    abstract void setAnimationFraction(float f8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
