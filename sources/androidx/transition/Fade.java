package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public class Fade extends Visibility {
    public static final int IN = 1;
    private static final String LOG_TAG = "Fade";
    public static final int OUT = 2;
    private static final String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mLayerTypeChanged = false;
        private final View mView;

        FadeAnimatorListener(View view) {
            this.mView = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ViewUtils.setTransitionAlpha(this.mView, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.mView.hasOverlappingRendering() && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            float f8;
            if (this.mView.getVisibility() == 0) {
                f8 = ViewUtils.getTransitionAlpha(this.mView);
            } else {
                f8 = 0.0f;
            }
            this.mView.setTag(R.id.transition_pause_alpha, Float.valueOf(f8));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            this.mView.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z8) {
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
            if (z8) {
                return;
            }
            ViewUtils.setTransitionAlpha(this.mView, 1.0f);
            ViewUtils.clearNonTransitionAlpha(this.mView);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public /* synthetic */ void onTransitionEnd(Transition transition, boolean z8) {
            e.a(this, transition, z8);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition, boolean z8) {
        }
    }

    public Fade(int i8) {
        setMode(i8);
    }

    private Animator createAnimation(View view, float f8, float f9) {
        if (f8 == f9) {
            return null;
        }
        ViewUtils.setTransitionAlpha(view, f8);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ViewUtils.TRANSITION_ALPHA, f9);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        ofFloat.addListener(fadeAnimatorListener);
        getRootTransition().addListener(fadeAnimatorListener);
        return ofFloat;
    }

    private static float getStartAlpha(TransitionValues transitionValues, float f8) {
        Float f9;
        if (transitionValues != null && (f9 = (Float) transitionValues.values.get(PROPNAME_TRANSITION_ALPHA)) != null) {
            return f9.floatValue();
        }
        return f8;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        Float f8 = (Float) transitionValues.view.getTag(R.id.transition_pause_alpha);
        if (f8 == null) {
            if (transitionValues.view.getVisibility() == 0) {
                f8 = Float.valueOf(ViewUtils.getTransitionAlpha(transitionValues.view));
            } else {
                f8 = Float.valueOf(0.0f);
            }
        }
        transitionValues.values.put(PROPNAME_TRANSITION_ALPHA, f8);
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        ViewUtils.saveNonTransitionAlpha(view);
        return createAnimation(view, getStartAlpha(transitionValues, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        ViewUtils.saveNonTransitionAlpha(view);
        Animator createAnimation = createAnimation(view, getStartAlpha(transitionValues, 1.0f), 0.0f);
        if (createAnimation == null) {
            ViewUtils.setTransitionAlpha(view, getStartAlpha(transitionValues2, 1.0f));
        }
        return createAnimation;
    }

    public Fade() {
    }

    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.FADE);
        setMode(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        obtainStyledAttributes.recycle();
    }
}
