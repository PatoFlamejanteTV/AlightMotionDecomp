package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
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
public final class TextFieldTransitionScope$Transition$placeholderOpacity$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final TextFieldTransitionScope$Transition$placeholderOpacity$2 INSTANCE = new TextFieldTransitionScope$Transition$placeholderOpacity$2();

    TextFieldTransitionScope$Transition$placeholderOpacity$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer, int i8) {
        FiniteAnimationSpec<Float> tween;
        AbstractC3292y.i(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-1079955085);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079955085, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:293)");
        }
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        if (animateFloat.isTransitioningTo(inputPhase, inputPhase2)) {
            tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
        } else if (!animateFloat.isTransitioningTo(inputPhase2, inputPhase) && !animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase2)) {
            tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        } else {
            tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween;
    }
}
