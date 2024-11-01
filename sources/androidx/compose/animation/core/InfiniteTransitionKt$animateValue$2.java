package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class InfiniteTransitionKt$animateValue$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InfiniteTransition $this_animateValue;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$2(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState) {
        super(1);
        this.$this_animateValue = infiniteTransition;
        this.$transitionAnimation = transitionAnimationState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        this.$this_animateValue.addAnimation$animation_core_release(this.$transitionAnimation);
        final InfiniteTransition infiniteTransition = this.$this_animateValue;
        final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState = this.$transitionAnimation;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                InfiniteTransition.this.removeAnimation$animation_core_release(transitionAnimationState);
            }
        };
    }
}
