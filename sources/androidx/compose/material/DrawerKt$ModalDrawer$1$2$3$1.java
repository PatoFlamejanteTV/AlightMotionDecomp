package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DrawerKt$ModalDrawer$1$2$3$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$3$1(float f8, float f9, DrawerState drawerState) {
        super(0);
        this.$minValue = f8;
        this.$maxValue = f9;
        this.$drawerState = drawerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float calculateFraction;
        calculateFraction = DrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.requireOffset$material_release());
        return Float.valueOf(calculateFraction);
    }
}
