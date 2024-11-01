package t5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4032k extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f39929a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39930b;

    /* renamed from: c, reason: collision with root package name */
    private final float f39931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4032k(View itemView, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f39929a = context;
        this.f39930b = 1.0f;
        this.f39931c = 0.6f;
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

    public final void c(ProgressBar pb, final ImageView ivIcon) {
        AbstractC3292y.i(pb, "pb");
        AbstractC3292y.i(ivIcon, "ivIcon");
        if (pb.getVisibility() == 0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39931c, this.f39930b);
            ofFloat.setStartDelay(200L);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t5.j
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC4032k.d(ivIcon, valueAnimator);
                }
            });
            AbstractC3292y.f(ofFloat);
            ofFloat.addListener(new a(pb));
            ofFloat.start();
        }
    }

    public final void e(ProgressBar pb, final ImageView ivIcon) {
        AbstractC3292y.i(pb, "pb");
        AbstractC3292y.i(ivIcon, "ivIcon");
        if (pb.getVisibility() == 8) {
            pb.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39930b, this.f39931c);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t5.i
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC4032k.f(ivIcon, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* renamed from: t5.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f39932a;

        public a(ProgressBar progressBar) {
            this.f39932a = progressBar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f39932a.setVisibility(8);
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
