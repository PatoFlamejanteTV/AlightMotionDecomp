package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TransitionKt$createTransitionAnimation$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Transition<S> $this_createTransitionAnimation;
    final /* synthetic */ Transition<S>.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createTransitionAnimation$1$1(Transition<S> transition, Transition<S>.TransitionAnimationState<T, V> transitionAnimationState) {
        super(1);
        this.$this_createTransitionAnimation = transition;
        this.$transitionAnimation = transitionAnimationState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        this.$this_createTransitionAnimation.addAnimation$animation_core_release(this.$transitionAnimation);
        final Transition<S> transition = this.$this_createTransitionAnimation;
        final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState = this.$transitionAnimation;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.removeAnimation$animation_core_release(transitionAnimationState);
            }
        };
    }
}
