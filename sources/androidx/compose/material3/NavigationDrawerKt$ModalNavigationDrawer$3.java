package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ InterfaceC2072n $drawerContent;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$3(InterfaceC2072n interfaceC2072n, Modifier modifier, DrawerState drawerState, boolean z8, long j8, InterfaceC2072n interfaceC2072n2, int i8, int i9) {
        super(2);
        this.$drawerContent = interfaceC2072n;
        this.$modifier = modifier;
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z8;
        this.$scrimColor = j8;
        this.$content = interfaceC2072n2;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationDrawerKt.m1692ModalNavigationDrawerFHprtrg(this.$drawerContent, this.$modifier, this.$drawerState, this.$gesturesEnabled, this.$scrimColor, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
