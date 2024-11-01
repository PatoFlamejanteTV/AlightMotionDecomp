package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class TransitionKt$animateIntOffset$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final TransitionKt$animateIntOffset$1 INSTANCE = new TransitionKt$animateIntOffset$1();

    public TransitionKt$animateIntOffset$1() {
        super(3);
    }

    @Composable
    public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer, int i8) {
        AbstractC3292y.i(segment, "$this$null");
        composer.startReplaceableGroup(-1953479610);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1953479610, i8, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1059)");
        }
        SpringSpec<IntOffset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5270boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
