package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$2$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ InterfaceC2072n $styledLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$2$1(boolean z8, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8) {
        super(3);
        this.$alwaysShowLabel = z8;
        this.$icon = interfaceC2072n;
        this.$styledLabel = interfaceC2072n2;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).floatValue(), (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(float f8, Composer composer, int i8) {
        int i9;
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(f8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670576792, i8, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
        }
        if (this.$alwaysShowLabel) {
            f8 = 1.0f;
        }
        NavigationRailKt.NavigationRailItemBaselineLayout(this.$icon, this.$styledLabel, f8, composer, (this.$$dirty >> 6) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
