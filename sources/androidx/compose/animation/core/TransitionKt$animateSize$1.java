package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class TransitionKt$animateSize$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final TransitionKt$animateSize$1 INSTANCE = new TransitionKt$animateSize$1();

    public TransitionKt$animateSize$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer, int i8) {
        AbstractC3292y.i(segment, "$this$null");
        composer.startReplaceableGroup(-1607152761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1607152761, i8, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1026)");
        }
        SpringSpec<Size> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2769boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }
}
