package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$2$4$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DrawerState $drawerState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$4$1(DrawerState drawerState) {
        super(1);
        this.$drawerState = drawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5270boximpl(m1698invokeBjo55l4((Density) obj));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1698invokeBjo55l4(Density offset) {
        AbstractC3292y.i(offset, "$this$offset");
        return IntOffsetKt.IntOffset(AbstractC2829a.d(this.$drawerState.getOffset().getValue().floatValue()), 0);
    }
}
