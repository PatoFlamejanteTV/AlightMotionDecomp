package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AnimatedContentScopeImpl implements AnimatedContentScope, AnimatedVisibilityScope {
    private final /* synthetic */ AnimatedVisibilityScope $$delegate_0;

    public AnimatedContentScopeImpl(AnimatedVisibilityScope animatedVisibilityScope) {
        AbstractC3292y.i(animatedVisibilityScope, "animatedVisibilityScope");
        this.$$delegate_0 = animatedVisibilityScope;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @ExperimentalAnimationApi
    public Modifier animateEnterExit(Modifier modifier, EnterTransition enter, ExitTransition exit, String label) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(enter, "enter");
        AbstractC3292y.i(exit, "exit");
        AbstractC3292y.i(label, "label");
        return this.$$delegate_0.animateEnterExit(modifier, enter, exit, label);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @ExperimentalAnimationApi
    public Transition<EnterExitState> getTransition() {
        return this.$$delegate_0.getTransition();
    }
}
