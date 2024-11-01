package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$alpha$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$alpha$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(3);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> animateFloat, Composer composer, int i8) {
        FiniteAnimationSpec<Float> finiteAnimationSpec;
        AbstractC3292y.i(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-57153604);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-57153604, i8, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:860)");
        }
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (animateFloat.isTransitioningTo(enterExitState, enterExitState2)) {
            Fade fade = this.$enter.getData$animation_release().getFade();
            if (fade == null || (finiteAnimationSpec = fade.getAnimationSpec()) == null) {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            }
        } else if (!animateFloat.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
        } else {
            Fade fade2 = this.$exit.getData$animation_release().getFade();
            if (fade2 == null || (finiteAnimationSpec = fade2.getAnimationSpec()) == null) {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return finiteAnimationSpec;
    }
}
