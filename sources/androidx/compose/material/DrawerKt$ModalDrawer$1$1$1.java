package androidx.compose.material;

import Q5.I;
import Q5.x;
import R5.Q;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DrawerKt$ModalDrawer$1$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Density $density;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$1$1(DrawerState drawerState, Density density, float f8, float f9) {
        super(0);
        this.$drawerState = drawerState;
        this.$density = density;
        this.$minValue = f8;
        this.$maxValue = f9;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1207invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1207invoke() {
        this.$drawerState.setDensity$material_release(this.$density);
        AnchoredDraggableState.updateAnchors$material_release$default(this.$drawerState.getAnchoredDraggableState$material_release(), Q.k(x.a(DrawerValue.Closed, Float.valueOf(this.$minValue)), x.a(DrawerValue.Open, Float.valueOf(this.$maxValue))), null, 2, null);
    }
}
