package androidx.compose.animation.core;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$animate$7 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$7(AnimationState<T, V> animationState) {
        super(0);
        this.$this_animate = animationState;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m227invoke() {
        this.$this_animate.setRunning$animation_core_release(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m227invoke();
        return I.f8786a;
    }
}
