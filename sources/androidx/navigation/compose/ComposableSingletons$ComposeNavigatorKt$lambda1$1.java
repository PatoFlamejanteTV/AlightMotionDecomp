package androidx.navigation.compose;

import Q5.I;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$ComposeNavigatorKt$lambda1$1 extends AbstractC3293z implements InterfaceC2074p {
    public static final ComposableSingletons$ComposeNavigatorKt$lambda1$1 INSTANCE = new ComposableSingletons$ComposeNavigatorKt$lambda1$1();

    ComposableSingletons$ComposeNavigatorKt$lambda1$1() {
        super(4);
    }

    @Override // c6.InterfaceC2074p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(127448943, i8, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda-1.<anonymous> (ComposeNavigator.kt:62)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
