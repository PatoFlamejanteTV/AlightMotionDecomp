package androidx.compose.animation.core;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$animateDecay$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InterfaceC2072n $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(InterfaceC2072n interfaceC2072n) {
        super(1);
        this.$block = interfaceC2072n;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) obj);
        return I.f8786a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animate) {
        AbstractC3292y.i(animate, "$this$animate");
        this.$block.invoke(animate.getValue(), Float.valueOf(animate.getVelocityVector().getValue()));
    }
}
