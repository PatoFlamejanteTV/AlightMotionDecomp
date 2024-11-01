package androidx.compose.material3;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final NavigationDrawerKt$ModalNavigationDrawer$1 INSTANCE = new NavigationDrawerKt$ModalNavigationDrawer$1();

    NavigationDrawerKt$ModalNavigationDrawer$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
        AbstractC3292y.i(drawerValue, "<anonymous parameter 0>");
        AbstractC3292y.i(drawerValue2, "<anonymous parameter 1>");
        return new FractionalThreshold(0.5f);
    }
}
