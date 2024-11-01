package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {955}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SliderKt$animateToTarget$2 extends l implements InterfaceC2072n {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SliderKt$animateToTarget$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ DragScope $$this$drag;
        final /* synthetic */ P $latestValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragScope dragScope, P p8) {
            super(1);
            this.$$this$drag = dragScope;
            this.$latestValue = p8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animatable<Float, AnimationVector1D>) obj);
            return I.f8786a;
        }

        public final void invoke(Animatable<Float, AnimationVector1D> animateTo) {
            AbstractC3292y.i(animateTo, "$this$animateTo");
            this.$$this$drag.dragBy(animateTo.getValue().floatValue() - this.$latestValue.f34570a);
            this.$latestValue.f34570a = animateTo.getValue().floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f8, float f9, float f10, d dVar) {
        super(2, dVar);
        this.$current = f8;
        this.$target = f9;
        this.$velocity = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, dVar);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(DragScope dragScope, d dVar) {
        return ((SliderKt$animateToTarget$2) create(dragScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TweenSpec tweenSpec;
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
            DragScope dragScope = (DragScope) this.L$0;
            P p8 = new P();
            float f8 = this.$current;
            p8.f34570a = f8;
            Animatable Animatable$default = AnimatableKt.Animatable$default(f8, 0.0f, 2, null);
            Float b9 = kotlin.coroutines.jvm.internal.b.b(this.$target);
            tweenSpec = SliderKt.SliderToTickAnimation;
            Float b10 = kotlin.coroutines.jvm.internal.b.b(this.$velocity);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dragScope, p8);
            this.label = 1;
            if (Animatable$default.animateTo(b9, tweenSpec, b10, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
