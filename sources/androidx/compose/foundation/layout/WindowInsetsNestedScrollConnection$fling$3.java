package androidx.compose.foundation.layout;

import Q5.I;
import Q5.t;
import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$3 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {374}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $target;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03111 extends AbstractC3293z implements Function1 {
            final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03111(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
                super(1);
                this.this$0 = windowInsetsNestedScrollConnection;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Animatable<Float, AnimationVector1D>) obj);
                return I.f8786a;
            }

            public final void invoke(Animatable<Float, AnimationVector1D> animateTo) {
                AbstractC3292y.i(animateTo, "$this$animateTo");
                this.this$0.adjustInsets(animateTo.getValue().floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i8, int i9, float f8, WindowInsetsAnimationController windowInsetsAnimationController, boolean z8, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, U5.d dVar) {
            super(2, dVar);
            this.$current = i8;
            this.$target = i9;
            this.$flingAmount = f8;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z8;
            this.this$0 = windowInsetsNestedScrollConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, this.this$0, dVar);
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
                Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float b9 = kotlin.coroutines.jvm.internal.b.b(this.$target);
                Float b10 = kotlin.coroutines.jvm.internal.b.b(this.$flingAmount);
                C03111 c03111 = new C03111(this.this$0);
                this.label = 1;
                if (Animatable.animateTo$default(Animatable$default, b9, null, b10, c03111, this, 2, null) == e8) {
                    return e8;
                }
            }
            this.$animationController.finish(this.$targetShown);
            this.this$0.animationController = null;
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i8, int i9, float f8, WindowInsetsAnimationController windowInsetsAnimationController, boolean z8, U5.d dVar) {
        super(2, dVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i8;
        this.$target = i9;
        this.$flingAmount = f8;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, dVar);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3488x0 d8;
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            M m8 = (M) this.L$0;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            d8 = AbstractC3462k.d(m8, null, null, new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, windowInsetsNestedScrollConnection, null), 3, null);
            windowInsetsNestedScrollConnection.animationJob = d8;
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
