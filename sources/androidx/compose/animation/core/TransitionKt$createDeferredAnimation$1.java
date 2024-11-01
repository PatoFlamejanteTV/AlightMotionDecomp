package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TransitionKt$createDeferredAnimation$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Transition<S>.DeferredAnimation<T, V> $lazyAnim;
    final /* synthetic */ Transition<S> $this_createDeferredAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createDeferredAnimation$1(Transition<S> transition, Transition<S>.DeferredAnimation<T, V> deferredAnimation) {
        super(1);
        this.$this_createDeferredAnimation = transition;
        this.$lazyAnim = deferredAnimation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        final Transition<S> transition = this.$this_createDeferredAnimation;
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = this.$lazyAnim;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.removeAnimation$animation_core_release(deferredAnimation);
            }
        };
    }
}
