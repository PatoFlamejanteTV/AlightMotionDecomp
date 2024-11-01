package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.TransformOrigin;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$$inlined$animateValue$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final EnterExitTransitionKt$createModifier$$inlined$animateValue$1 INSTANCE = new EnterExitTransitionKt$createModifier$$inlined$animateValue$1();

    public EnterExitTransitionKt$createModifier$$inlined$animateValue$1() {
        super(3);
    }

    @Composable
    public final SpringSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment, Composer composer, int i8) {
        AbstractC3292y.i(segment, "$this$null");
        composer.startReplaceableGroup(-895531546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-895531546, i8, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:852)");
        }
        SpringSpec<TransformOrigin> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
