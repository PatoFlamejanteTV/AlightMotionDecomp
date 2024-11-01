package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$labelTextStyleColor$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final TextFieldTransitionScope$Transition$labelTextStyleColor$2 INSTANCE = new TextFieldTransitionScope$Transition$labelTextStyleColor$2();

    TextFieldTransitionScope$Transition$labelTextStyleColor$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer, int i8) {
        AbstractC3292y.i(animateColor, "$this$animateColor");
        composer.startReplaceableGroup(1103405032);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1103405032, i8, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:313)");
        }
        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
