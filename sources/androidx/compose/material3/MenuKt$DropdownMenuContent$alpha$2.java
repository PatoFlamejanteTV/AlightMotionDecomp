package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$alpha$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final MenuKt$DropdownMenuContent$alpha$2 INSTANCE = new MenuKt$DropdownMenuContent$alpha$2();

    MenuKt$DropdownMenuContent$alpha$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer, int i8) {
        TweenSpec tween$default;
        AbstractC3292y.i(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(896631233);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(896631233, i8, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:101)");
        }
        if (animateFloat.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
            tween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
        } else {
            tween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
