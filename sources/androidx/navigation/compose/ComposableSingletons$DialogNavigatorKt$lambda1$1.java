package androidx.navigation.compose;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$DialogNavigatorKt$lambda1$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final ComposableSingletons$DialogNavigatorKt$lambda1$1 INSTANCE = new ComposableSingletons$DialogNavigatorKt$lambda1$1();

    ComposableSingletons$DialogNavigatorKt$lambda1$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092249270, i8, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:64)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
