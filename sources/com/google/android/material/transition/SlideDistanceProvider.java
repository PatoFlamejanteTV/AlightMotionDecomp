package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;

    @Px
    private int slideDistance = -1;
    private int slideEdge;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i8) {
        this.slideEdge = i8;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i8, @Px int i9) {
        float f8;
        float f9;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i8 != 3) {
            if (i8 != 5) {
                if (i8 != 48) {
                    if (i8 != 80) {
                        if (i8 != 8388611) {
                            if (i8 == 8388613) {
                                if (isRtl(view)) {
                                    f9 = translationX - i9;
                                } else {
                                    f9 = i9 + translationX;
                                }
                                return createTranslationXAnimator(view2, f9, translationX, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i8);
                        }
                        if (isRtl(view)) {
                            f8 = i9 + translationX;
                        } else {
                            f8 = translationX - i9;
                        }
                        return createTranslationXAnimator(view2, f8, translationX, translationX);
                    }
                    return createTranslationYAnimator(view2, i9 + translationY, translationY, translationY);
                }
                return createTranslationYAnimator(view2, translationY - i9, translationY, translationY);
            }
            return createTranslationXAnimator(view2, translationX - i9, translationX, translationX);
        }
        return createTranslationXAnimator(view2, i9 + translationX, translationX, translationX);
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i8, @Px int i9) {
        float f8;
        float f9;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i8 != 3) {
            if (i8 != 5) {
                if (i8 != 48) {
                    if (i8 != 80) {
                        if (i8 != 8388611) {
                            if (i8 == 8388613) {
                                if (isRtl(view)) {
                                    f9 = i9 + translationX;
                                } else {
                                    f9 = translationX - i9;
                                }
                                return createTranslationXAnimator(view2, translationX, f9, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i8);
                        }
                        if (isRtl(view)) {
                            f8 = translationX - i9;
                        } else {
                            f8 = i9 + translationX;
                        }
                        return createTranslationXAnimator(view2, translationX, f8, translationX);
                    }
                    return createTranslationYAnimator(view2, translationY, translationY - i9, translationY);
                }
                return createTranslationYAnimator(view2, translationY, i9 + translationY, translationY);
            }
            return createTranslationXAnimator(view2, translationX, i9 + translationX, translationX);
        }
        return createTranslationXAnimator(view2, translationX, translationX - i9, translationX);
    }

    private static Animator createTranslationXAnimator(final View view, float f8, float f9, final float f10) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f8, f9));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f10);
            }
        });
        return ofPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f8, float f9, final float f10) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f8, f9));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f10);
            }
        });
        return ofPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i8 = this.slideDistance;
        if (i8 != -1) {
            return i8;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Px
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@Px int i8) {
        if (i8 >= 0) {
            this.slideDistance = i8;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int i8) {
        this.slideEdge = i8;
    }
}
