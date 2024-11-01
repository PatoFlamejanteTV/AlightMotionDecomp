package s5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3969c {

    /* renamed from: a, reason: collision with root package name */
    public static final C3969c f39130a = new C3969c();

    private C3969c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ImageView imageView, ValueAnimator valueAnimator) {
        AbstractC3292y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3292y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        imageView.setScaleX(floatValue);
        imageView.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        imageView.setPadding(i8, i8, i8, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ImageView imageView, ValueAnimator valueAnimator) {
        AbstractC3292y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3292y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        imageView.setScaleX(floatValue);
        imageView.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        imageView.setPadding(i8, i8, i8, i8);
    }

    public final void c(ProgressBar progressBar, final ImageView imageView) {
        AbstractC3292y.i(progressBar, "progressBar");
        AbstractC3292y.i(imageView, "imageView");
        if (progressBar.getVisibility() == 0) {
            progressBar.setVisibility(8);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.4f, 1.0f);
            ofFloat.setStartDelay(200L);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: s5.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C3969c.d(imageView, valueAnimator);
                }
            });
            AbstractC3292y.f(ofFloat);
            ofFloat.addListener(new a(progressBar));
            ofFloat.start();
        }
    }

    public final void e(ProgressBar progressBar, final ImageView imageView) {
        AbstractC3292y.i(progressBar, "progressBar");
        AbstractC3292y.i(imageView, "imageView");
        if (progressBar.getVisibility() == 8) {
            progressBar.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.4f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: s5.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C3969c.f(imageView, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* renamed from: s5.c$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f39131a;

        public a(ProgressBar progressBar) {
            this.f39131a = progressBar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f39131a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
