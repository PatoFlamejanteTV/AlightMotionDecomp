package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItemBaselineLayout$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ InterfaceC2072n $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItemBaselineLayout$3(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, float f8, int i8) {
        super(2);
        this.$icon = interfaceC2072n;
        this.$label = interfaceC2072n2;
        this.$iconPositionAnimationProgress = f8;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationRailKt.NavigationRailItemBaselineLayout(this.$icon, this.$label, this.$iconPositionAnimationProgress, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
