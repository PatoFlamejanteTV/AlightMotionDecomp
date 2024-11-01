package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;
import n6.M;

@f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {TypedValues.MotionType.TYPE_EASING}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultFlingBehavior$performFling$2 extends l implements InterfaceC2072n {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ScrollScope $this_performFling;
    Object L$0;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ P $lastValue;
        final /* synthetic */ ScrollScope $this_performFling;
        final /* synthetic */ P $velocityLeft;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(P p8, ScrollScope scrollScope, P p9, DefaultFlingBehavior defaultFlingBehavior) {
            super(1);
            this.$lastValue = p8;
            this.$this_performFling = scrollScope;
            this.$velocityLeft = p9;
            this.this$0 = defaultFlingBehavior;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnimationScope<Float, AnimationVector1D>) obj);
            return I.f8786a;
        }

        public final void invoke(AnimationScope<Float, AnimationVector1D> animateDecay) {
            AbstractC3292y.i(animateDecay, "$this$animateDecay");
            float floatValue = animateDecay.getValue().floatValue() - this.$lastValue.f34570a;
            float scrollBy = this.$this_performFling.scrollBy(floatValue);
            this.$lastValue.f34570a = animateDecay.getValue().floatValue();
            this.$velocityLeft.f34570a = animateDecay.getVelocity().floatValue();
            if (Math.abs(floatValue - scrollBy) > 0.5f) {
                animateDecay.cancelAnimation();
            }
            DefaultFlingBehavior defaultFlingBehavior = this.this$0;
            defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f8, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, U5.d dVar) {
        super(2, dVar);
        this.$initialVelocity = f8;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f8;
        DecayAnimationSpec decayAnimationSpec;
        P p8;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                p8 = (P) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                P p9 = new P();
                p9.f34570a = this.$initialVelocity;
                P p10 = new P();
                AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                decayAnimationSpec = this.this$0.flingDecay;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(p10, this.$this_performFling, p9, this.this$0);
                this.L$0 = p9;
                this.label = 1;
                if (SuspendAnimationKt.animateDecay$default(AnimationState$default, decayAnimationSpec, false, anonymousClass1, this, 2, null) == e8) {
                    return e8;
                }
                p8 = p9;
            } else {
                f8 = this.$initialVelocity;
                return kotlin.coroutines.jvm.internal.b.b(f8);
            }
        }
        f8 = p8.f34570a;
        return kotlin.coroutines.jvm.internal.b.b(f8);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((DefaultFlingBehavior$performFling$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
