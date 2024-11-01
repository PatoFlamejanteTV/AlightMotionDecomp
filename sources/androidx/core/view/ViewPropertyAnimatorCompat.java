package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class ViewPropertyAnimatorCompat {
    private final WeakReference<View> mView;

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static ViewPropertyAnimator translationZ(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.translationZ(f8);
        }

        @DoNotInline
        static ViewPropertyAnimator translationZBy(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.translationZBy(f8);
        }

        @DoNotInline
        static ViewPropertyAnimator z(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.z(f8);
        }

        @DoNotInline
        static ViewPropertyAnimator zBy(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.zBy(f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewPropertyAnimatorCompat(View view) {
        this.mView = new WeakReference<>(view);
    }

    private void setListenerInternal(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationCancel(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat alpha(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat alphaBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alphaBy(f8);
        }
        return this;
    }

    public void cancel() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @Nullable
    public Interpolator getInterpolator() {
        View view = this.mView.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotation(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotation(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationX(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationX(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationXBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationXBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationY(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationY(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationYBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationYBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleX(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleX(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleXBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleXBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleY(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleY(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleYBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleYBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setDuration(long j8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setDuration(j8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setInterpolator(@Nullable Interpolator interpolator) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setListener(@Nullable ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = this.mView.get();
        if (view != null) {
            setListenerInternal(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setStartDelay(long j8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setUpdateListener(@Nullable final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.mView.get();
        if (view != null) {
            if (viewPropertyAnimatorUpdateListener != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.L
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewPropertyAnimatorUpdateListener.this.onAnimationUpdate(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public void start() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationX(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationX(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationXBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationXBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationY(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationYBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationYBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZ(float f8) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZ(view.animate(), f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZBy(view.animate(), f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withEndAction(@NonNull Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public ViewPropertyAnimatorCompat withLayer() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withStartAction(@NonNull Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat x(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().x(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat xBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().xBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat y(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().y(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat yBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().yBy(f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat z(float f8) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.z(view.animate(), f8);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat zBy(float f8) {
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.zBy(view.animate(), f8);
        }
        return this;
    }
}
