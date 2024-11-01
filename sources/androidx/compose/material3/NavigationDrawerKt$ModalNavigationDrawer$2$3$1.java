package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$2$3$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$3$1(float f8, float f9, DrawerState drawerState) {
        super(0);
        this.$minValue = f8;
        this.$maxValue = f9;
        this.$drawerState = drawerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float calculateFraction;
        calculateFraction = NavigationDrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.getOffset().getValue().floatValue());
        return Float.valueOf(calculateFraction);
    }
}
