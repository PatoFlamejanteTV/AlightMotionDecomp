package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailTransition$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ InterfaceC2073o $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailTransition$1(InterfaceC2073o interfaceC2073o, int i8, State<Float> state) {
        super(2);
        this.$content = interfaceC2073o;
        this.$$dirty = i8;
        this.$animationProgress$delegate = state;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        float NavigationRailTransition_Klgx_Pg$lambda$3;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1688205042, i8, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:242)");
        }
        InterfaceC2073o interfaceC2073o = this.$content;
        NavigationRailTransition_Klgx_Pg$lambda$3 = NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$3(this.$animationProgress$delegate);
        interfaceC2073o.invoke(Float.valueOf(NavigationRailTransition_Klgx_Pg$lambda$3), composer, Integer.valueOf((this.$$dirty >> 6) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
