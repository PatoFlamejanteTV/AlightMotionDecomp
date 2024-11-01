package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(@GravityInt int i8, @GravityInt int i9) {
        if ((GravityCompat.getAbsoluteGravity(i8, ViewCompat.getLayoutDirection(this.view)) & i9) == i9) {
            return true;
        }
        return false;
    }

    private int getEdgeMargin(boolean z8) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z8) {
                return marginLayoutParams.leftMargin;
            }
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v8 = this.view;
        if (v8 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v8;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i8), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt final int i8, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z8;
        if (backEventCompat.getSwipeEdge() == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i8, 3);
        float width = (this.view.getWidth() * this.view.getScaleX()) + getEdgeMargin(checkAbsoluteGravity);
        V v8 = this.view;
        Property property = View.TRANSLATION_X;
        if (checkAbsoluteGravity) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v8, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z8, i8);
            }
        });
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i8) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i8);
    }

    @VisibleForTesting
    public void updateBackProgress(float f8, boolean z8, @GravityInt int i8) {
        int i9;
        float interpolateProgress = interpolateProgress(f8);
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i8, 3);
        boolean z9 = z8 == checkAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f9 = width;
        if (f9 > 0.0f) {
            float f10 = height;
            if (f10 <= 0.0f) {
                return;
            }
            float f11 = this.maxScaleXDistanceShrink / f9;
            float f12 = this.maxScaleXDistanceGrow / f9;
            float f13 = this.maxScaleYDistance / f10;
            V v8 = this.view;
            if (checkAbsoluteGravity) {
                f9 = 0.0f;
            }
            v8.setPivotX(f9);
            if (!z9) {
                f12 = -f11;
            }
            float lerp = AnimationUtils.lerp(0.0f, f12, interpolateProgress);
            float f14 = lerp + 1.0f;
            this.view.setScaleX(f14);
            float lerp2 = 1.0f - AnimationUtils.lerp(0.0f, f13, interpolateProgress);
            this.view.setScaleY(lerp2);
            V v9 = this.view;
            if (v9 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v9;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (checkAbsoluteGravity) {
                        i9 = (width - childAt.getRight()) + childAt.getWidth();
                    } else {
                        i9 = -childAt.getLeft();
                    }
                    childAt.setPivotX(i9);
                    childAt.setPivotY(-childAt.getTop());
                    float f15 = z9 ? 1.0f - lerp : 1.0f;
                    float f16 = lerp2 != 0.0f ? (f14 / lerp2) * f15 : 1.0f;
                    childAt.setScaleX(f15);
                    childAt.setScaleY(f16);
                }
            }
        }
    }
}
