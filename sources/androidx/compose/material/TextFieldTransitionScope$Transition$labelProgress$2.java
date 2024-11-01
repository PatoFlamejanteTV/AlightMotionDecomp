package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$labelProgress$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final TextFieldTransitionScope$Transition$labelProgress$2 INSTANCE = new TextFieldTransitionScope$Transition$labelProgress$2();

    TextFieldTransitionScope$Transition$labelProgress$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer, int i8) {
        AbstractC3292y.i(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-611722692);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-611722692, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:282)");
        }
        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
