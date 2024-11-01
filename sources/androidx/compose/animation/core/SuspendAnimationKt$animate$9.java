package androidx.compose.animation.core;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$9 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1 $block;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ T $lateInitScope;
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$9(T t8, float f8, Animation<T, V> animation, AnimationState<T, V> animationState, Function1 function1) {
        super(1);
        this.$lateInitScope = t8;
        this.$durationScale = f8;
        this.$animation = animation;
        this.$this_animate = animationState;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return I.f8786a;
    }

    public final void invoke(long j8) {
        Object obj = this.$lateInitScope.f34573a;
        AbstractC3292y.f(obj);
        SuspendAnimationKt.doAnimationFrameWithScale((AnimationScope) obj, j8, this.$durationScale, this.$animation, this.$this_animate, this.$block);
    }
}
