package androidx.compose.animation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalAnimationApi
/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    private final MutableState<IntSize> targetSize;
    private Transition<EnterExitState> transition;

    public AnimatedVisibilityScopeImpl(Transition<EnterExitState> transition) {
        MutableState<IntSize> mutableStateOf$default;
        AbstractC3292y.i(transition, "transition");
        this.transition = transition;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5313boximpl(IntSize.Companion.m5326getZeroYbymL2g()), null, 2, null);
        this.targetSize = mutableStateOf$default;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public /* synthetic */ Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        return AnimatedVisibilityScope.CC.a(this, modifier, enterTransition, exitTransition, str);
    }

    public final MutableState<IntSize> getTargetSize$animation_release() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(Transition<EnterExitState> transition) {
        AbstractC3292y.i(transition, "<set-?>");
        this.transition = transition;
    }
}
