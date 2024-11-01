package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.R;

/* loaded from: classes3.dex */
class FragmentAnim {
    private FragmentAnim() {
    }

    @AnimRes
    private static int getNextAnim(Fragment fragment, boolean z8, boolean z9) {
        if (z9) {
            if (z8) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        }
        if (z8) {
            return fragment.getEnterAnim();
        }
        return fragment.getExitAnim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ResourceType"})
    public static AnimationOrAnimator loadAnimation(@NonNull Context context, @NonNull Fragment fragment, boolean z8, boolean z9) {
        int nextTransition = fragment.getNextTransition();
        int nextAnim = getNextAnim(fragment, z8, z9);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i8 = R.id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i8) != null) {
                fragment.mContainer.setTag(i8, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z8, nextAnim);
        if (onCreateAnimation != null) {
            return new AnimationOrAnimator(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z8, nextAnim);
        if (onCreateAnimator != null) {
            return new AnimationOrAnimator(onCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = transitToAnimResourceId(context, nextTransition, z8);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation != null) {
                        return new AnimationOrAnimator(loadAnimation);
                    }
                } catch (Resources.NotFoundException e8) {
                    throw e8;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                if (loadAnimator != null) {
                    return new AnimationOrAnimator(loadAnimator);
                }
            } catch (RuntimeException e9) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation2 != null) {
                        return new AnimationOrAnimator(loadAnimation2);
                    }
                } else {
                    throw e9;
                }
            }
        }
        return null;
    }

    @AnimRes
    private static int toActivityTransitResId(@NonNull Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i8});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @AnimRes
    private static int transitToAnimResourceId(@NonNull Context context, int i8, boolean z8) {
        if (i8 != 4097) {
            if (i8 != 8194) {
                if (i8 != 8197) {
                    if (i8 != 4099) {
                        if (i8 != 4100) {
                            return -1;
                        }
                        if (z8) {
                            return toActivityTransitResId(context, android.R.attr.activityOpenEnterAnimation);
                        }
                        return toActivityTransitResId(context, android.R.attr.activityOpenExitAnimation);
                    }
                    if (z8) {
                        return R.animator.fragment_fade_enter;
                    }
                    return R.animator.fragment_fade_exit;
                }
                if (z8) {
                    return toActivityTransitResId(context, android.R.attr.activityCloseEnterAnimation);
                }
                return toActivityTransitResId(context, android.R.attr.activityCloseExitAnimation);
            }
            if (z8) {
                return R.animator.fragment_close_enter;
            }
            return R.animator.fragment_close_exit;
        }
        if (z8) {
            return R.animator.fragment_open_enter;
        }
        return R.animator.fragment_open_exit;
    }

    /* loaded from: classes3.dex */
    static class AnimationOrAnimator {
        public final Animation animation;
        public final Animator animator;

        AnimationOrAnimator(Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        AnimationOrAnimator(Animator animator) {
            this.animation = null;
            this.animator = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* loaded from: classes3.dex */
    static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        private boolean mAnimating;
        private final View mChild;
        private boolean mEnded;
        private final ViewGroup mParent;
        private boolean mTransitionEnded;

        /* JADX INFO: Access modifiers changed from: package-private */
        public EndViewTransitionAnimation(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.mAnimating = true;
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j8, @NonNull Transformation transformation) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mEnded && this.mAnimating) {
                this.mAnimating = false;
                this.mParent.post(this);
            } else {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j8, @NonNull Transformation transformation, float f8) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j8, transformation, f8)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }
    }
}
