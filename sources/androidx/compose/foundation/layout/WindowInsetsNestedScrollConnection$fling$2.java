package androidx.compose.foundation.layout;

import Q5.I;
import Q5.t;
import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {364}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ P $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {348}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ P $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03101 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ WindowInsetsAnimationController $animationController;
            final /* synthetic */ P $endVelocity;
            final /* synthetic */ int $hidden;
            final /* synthetic */ int $shown;
            final /* synthetic */ boolean $targetShown;
            final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03101(int i8, int i9, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, P p8, WindowInsetsAnimationController windowInsetsAnimationController, boolean z8) {
                super(2);
                this.$hidden = i8;
                this.$shown = i9;
                this.this$0 = windowInsetsNestedScrollConnection;
                this.$endVelocity = p8;
                this.$animationController = windowInsetsAnimationController;
                this.$targetShown = z8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return I.f8786a;
            }

            public final void invoke(float f8, float f9) {
                InterfaceC3488x0 interfaceC3488x0;
                float f10 = this.$hidden;
                if (f8 <= this.$shown && f10 <= f8) {
                    this.this$0.adjustInsets(f8);
                    return;
                }
                this.$endVelocity.f34570a = f9;
                this.$animationController.finish(this.$targetShown);
                this.this$0.animationController = null;
                interfaceC3488x0 = this.this$0.animationJob;
                if (interfaceC3488x0 != null) {
                    interfaceC3488x0.cancel(new WindowInsetsAnimationCancelledException());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i8, float f8, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i9, int i10, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, P p8, WindowInsetsAnimationController windowInsetsAnimationController, boolean z8, U5.d dVar) {
            super(2, dVar);
            this.$current = i8;
            this.$flingAmount = f8;
            this.$spec = splineBasedFloatDecayAnimationSpec;
            this.$hidden = i9;
            this.$shown = i10;
            this.this$0 = windowInsetsNestedScrollConnection;
            this.$endVelocity = p8;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                float f8 = this.$current;
                float f9 = this.$flingAmount;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
                C03101 c03101 = new C03101(this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown);
                this.label = 1;
                if (SuspendAnimationKt.animateDecay(f8, f9, splineBasedFloatDecayAnimationSpec, c03101, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i8, float f8, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i9, int i10, P p8, WindowInsetsAnimationController windowInsetsAnimationController, boolean z8, U5.d dVar) {
        super(2, dVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i8;
        this.$flingAmount = f8;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i9;
        this.$shown = i10;
        this.$endVelocity = p8;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, dVar);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3488x0 d8;
        InterfaceC3488x0 interfaceC3488x0;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            M m8 = (M) this.L$0;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            d8 = AbstractC3462k.d(m8, null, null, new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, windowInsetsNestedScrollConnection, this.$endVelocity, this.$animationController, this.$targetShown, null), 3, null);
            windowInsetsNestedScrollConnection.animationJob = d8;
            interfaceC3488x0 = this.this$0.animationJob;
            if (interfaceC3488x0 != null) {
                this.label = 1;
                if (interfaceC3488x0.k(this) == e8) {
                    return e8;
                }
            }
        }
        this.this$0.animationJob = null;
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
