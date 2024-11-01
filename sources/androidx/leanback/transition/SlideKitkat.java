package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RequiresApi;
import androidx.leanback.R;

@RequiresApi(19)
/* loaded from: classes3.dex */
class SlideKitkat extends Visibility {
    private static final String TAG = "SlideKitkat";
    private CalculateSlide mSlideCalculator;
    private int mSlideEdge;
    private static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
    private static final TimeInterpolator sAccelerate = new AccelerateInterpolator();
    private static final CalculateSlide sCalculateLeft = new CalculateSlideHorizontal() { // from class: androidx.leanback.transition.SlideKitkat.1
        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getGone(View view) {
            return view.getTranslationX() - view.getWidth();
        }
    };
    private static final CalculateSlide sCalculateTop = new CalculateSlideVertical() { // from class: androidx.leanback.transition.SlideKitkat.2
        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getGone(View view) {
            return view.getTranslationY() - view.getHeight();
        }
    };
    private static final CalculateSlide sCalculateRight = new CalculateSlideHorizontal() { // from class: androidx.leanback.transition.SlideKitkat.3
        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getGone(View view) {
            return view.getTranslationX() + view.getWidth();
        }
    };
    private static final CalculateSlide sCalculateBottom = new CalculateSlideVertical() { // from class: androidx.leanback.transition.SlideKitkat.4
        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getGone(View view) {
            return view.getTranslationY() + view.getHeight();
        }
    };
    private static final CalculateSlide sCalculateStart = new CalculateSlideHorizontal() { // from class: androidx.leanback.transition.SlideKitkat.5
        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getGone(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() + view.getWidth();
            }
            return view.getTranslationX() - view.getWidth();
        }
    };
    private static final CalculateSlide sCalculateEnd = new CalculateSlideHorizontal() { // from class: androidx.leanback.transition.SlideKitkat.6
        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getGone(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() - view.getWidth();
            }
            return view.getTranslationX() + view.getWidth();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface CalculateSlide {
        float getGone(View view);

        float getHere(View view);

        Property<View, Float> getProperty();
    }

    /* loaded from: classes3.dex */
    private static abstract class CalculateSlideHorizontal implements CalculateSlide {
        CalculateSlideHorizontal() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getHere(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public Property<View, Float> getProperty() {
            return View.TRANSLATION_X;
        }
    }

    /* loaded from: classes3.dex */
    private static abstract class CalculateSlideVertical implements CalculateSlide {
        CalculateSlideVertical() {
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getHere(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public Property<View, Float> getProperty() {
            return View.TRANSLATION_Y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SlideAnimatorListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;
        private final float mEndValue;
        private final int mFinalVisibility;
        private float mPausedValue;
        private final Property<View, Float> mProp;
        private final float mTerminalValue;
        private final View mView;

        public SlideAnimatorListener(View view, Property<View, Float> property, float f8, float f9, int i8) {
            this.mProp = property;
            this.mView = view;
            this.mTerminalValue = f8;
            this.mEndValue = f9;
            this.mFinalVisibility = i8;
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mView.setTag(R.id.lb_slide_transition_value, new float[]{this.mView.getTranslationX(), this.mView.getTranslationY()});
            this.mProp.set(this.mView, Float.valueOf(this.mTerminalValue));
            this.mCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.mCanceled) {
                this.mProp.set(this.mView, Float.valueOf(this.mTerminalValue));
            }
            this.mView.setVisibility(this.mFinalVisibility);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.mPausedValue = this.mProp.get(this.mView).floatValue();
            this.mProp.set(this.mView, Float.valueOf(this.mEndValue));
            this.mView.setVisibility(this.mFinalVisibility);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.mProp.set(this.mView, Float.valueOf(this.mPausedValue));
            this.mView.setVisibility(0);
        }
    }

    public SlideKitkat() {
        setSlideEdge(80);
    }

    private Animator createAnimation(View view, Property<View, Float> property, float f8, float f9, float f10, TimeInterpolator timeInterpolator, int i8) {
        int i9 = R.id.lb_slide_transition_value;
        float[] fArr = (float[]) view.getTag(i9);
        if (fArr != null) {
            if (View.TRANSLATION_Y == property) {
                f8 = fArr[1];
            } else {
                f8 = fArr[0];
            }
            view.setTag(i9, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f8, f9);
        SlideAnimatorListener slideAnimatorListener = new SlideAnimatorListener(view, property, f10, f9, i8);
        ofFloat.addListener(slideAnimatorListener);
        ofFloat.addPauseListener(slideAnimatorListener);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    public int getSlideEdge() {
        return this.mSlideEdge;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i8, TransitionValues transitionValues2, int i9) {
        View view;
        if (transitionValues2 != null) {
            view = transitionValues2.view;
        } else {
            view = null;
        }
        if (view == null) {
            return null;
        }
        float here = this.mSlideCalculator.getHere(view);
        return createAnimation(view, this.mSlideCalculator.getProperty(), this.mSlideCalculator.getGone(view), here, here, sDecelerate, 0);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i8, TransitionValues transitionValues2, int i9) {
        View view;
        if (transitionValues != null) {
            view = transitionValues.view;
        } else {
            view = null;
        }
        if (view == null) {
            return null;
        }
        float here = this.mSlideCalculator.getHere(view);
        return createAnimation(view, this.mSlideCalculator.getProperty(), here, this.mSlideCalculator.getGone(view), here, sAccelerate, 4);
    }

    public void setSlideEdge(int i8) {
        if (i8 != 3) {
            if (i8 != 5) {
                if (i8 != 48) {
                    if (i8 != 80) {
                        if (i8 != 8388611) {
                            if (i8 == 8388613) {
                                this.mSlideCalculator = sCalculateEnd;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.mSlideCalculator = sCalculateStart;
                        }
                    } else {
                        this.mSlideCalculator = sCalculateBottom;
                    }
                } else {
                    this.mSlideCalculator = sCalculateTop;
                }
            } else {
                this.mSlideCalculator = sCalculateRight;
            }
        } else {
            this.mSlideCalculator = sCalculateLeft;
        }
        this.mSlideEdge = i8;
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbSlide);
        setSlideEdge(obtainStyledAttributes.getInt(R.styleable.lbSlide_lb_slideEdge, 80));
        long j8 = obtainStyledAttributes.getInt(R.styleable.lbSlide_android_duration, -1);
        if (j8 >= 0) {
            setDuration(j8);
        }
        long j9 = obtainStyledAttributes.getInt(R.styleable.lbSlide_android_startDelay, -1);
        if (j9 > 0) {
            setStartDelay(j9);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.lbSlide_android_interpolator, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }
}
