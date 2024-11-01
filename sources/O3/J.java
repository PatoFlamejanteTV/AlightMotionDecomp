package O3;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.motion.widget.Key;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import o4.AbstractC3531e;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7210c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f7211d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7212a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7213b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public J(Context context) {
        AbstractC3292y.i(context, "context");
        this.f7212a = context;
        this.f7213b = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, 0.0f, 0.0f);
        ofFloat.setDuration(1500L);
        AbstractC3292y.f(ofFloat);
        ofFloat.addListener(new b(function0));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(View view, int i8, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((view.getLeft() + ((view.getRight() - view.getLeft()) / 2.0f)) - (i8 / 2.0f)));
        ofFloat.setDuration(this.f7213b);
        AbstractC3292y.f(ofFloat);
        ofFloat.addListener(new e(view, function0));
        ofFloat.start();
    }

    public final void d(View view, int i8, Function0 onAnimationEnd) {
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(onAnimationEnd, "onAnimationEnd");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f7212a, AbstractC3531e.f35943a);
        loadAnimation.setAnimationListener(new c(view, this, i8, onAnimationEnd));
        view.startAnimation(loadAnimation);
    }

    public final void e(View view) {
        AbstractC3292y.i(view, "view");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f7212a, AbstractC3531e.f35944b);
        loadAnimation.setAnimationListener(new d(view));
        view.startAnimation(loadAnimation);
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7214a;

        public b(Function0 function0) {
            this.f7214a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7214a.invoke();
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

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f7216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7218d;

        c(View view, J j8, int i8, Function0 function0) {
            this.f7215a = view;
            this.f7216b = j8;
            this.f7217c = i8;
            this.f7218d = function0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f7215a.setVisibility(0);
            this.f7216b.f(this.f7215a, this.f7217c, this.f7218d);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f7215a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7219a;

        d(View view) {
            this.f7219a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f7219a.setVisibility(4);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f7219a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f7221b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7222c;

        public e(View view, Function0 function0) {
            this.f7221b = view;
            this.f7222c = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            J.this.c(this.f7221b, this.f7222c);
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
