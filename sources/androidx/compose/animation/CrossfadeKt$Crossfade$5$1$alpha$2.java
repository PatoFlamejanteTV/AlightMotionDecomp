package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$5$1$alpha$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$alpha$2(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        super(3);
        this.$animationSpec = finiteAnimationSpec;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<T> animateFloat, Composer composer, int i8) {
        AbstractC3292y.i(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(438406499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(438406499, i8, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
        }
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return finiteAnimationSpec;
    }
}
