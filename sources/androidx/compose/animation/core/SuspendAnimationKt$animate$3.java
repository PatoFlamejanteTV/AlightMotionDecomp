package androidx.compose.animation.core;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$animate$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InterfaceC2072n $block;
    final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(InterfaceC2072n interfaceC2072n, TwoWayConverter<T, V> twoWayConverter) {
        super(1);
        this.$block = interfaceC2072n;
        this.$typeConverter = twoWayConverter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope) obj);
        return I.f8786a;
    }

    public final void invoke(AnimationScope<T, V> animate) {
        AbstractC3292y.i(animate, "$this$animate");
        this.$block.invoke(animate.getValue(), this.$typeConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
    }
}
