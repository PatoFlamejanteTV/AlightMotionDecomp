package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
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

/* loaded from: classes.dex */
final class TabKt$TabTransition$color$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final TabKt$TabTransition$color$2 INSTANCE = new TabKt$TabTransition$color$2();

    TabKt$TabTransition$color$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer, int i8) {
        TweenSpec tween$default;
        AbstractC3292y.i(animateColor, "$this$animateColor");
        composer.startReplaceableGroup(-899623535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-899623535, i8, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:273)");
        }
        if (animateColor.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
            tween$default = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
        } else {
            tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
