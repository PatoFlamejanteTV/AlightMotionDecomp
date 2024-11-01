package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$9 extends AbstractC3293z implements Function1 {
    public static final NavHostKt$NavHost$9 INSTANCE = new NavHostKt$NavHost$9();

    NavHostKt$NavHost$9() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }
}
