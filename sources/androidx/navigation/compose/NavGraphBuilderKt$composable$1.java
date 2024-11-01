package androidx.navigation.compose;

import Q5.I;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavGraphBuilderKt$composable$1 extends AbstractC3293z implements InterfaceC2074p {
    final /* synthetic */ InterfaceC2073o $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilderKt$composable$1(InterfaceC2073o interfaceC2073o) {
        super(4);
        this.$content = interfaceC2073o;
    }

    @Override // c6.InterfaceC2074p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(484185514, i8, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:52)");
        }
        this.$content.invoke(navBackStackEntry, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
