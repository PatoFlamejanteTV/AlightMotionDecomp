package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$2$1$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ BottomDrawerState $drawerState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2$1$3(BottomDrawerState bottomDrawerState) {
        super(1);
        this.$drawerState = bottomDrawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5270boximpl(m1205invokeBjo55l4((Density) obj));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1205invokeBjo55l4(Density offset) {
        AbstractC3292y.i(offset, "$this$offset");
        return IntOffsetKt.IntOffset(0, AbstractC2829a.d(this.$drawerState.requireOffset$material_release()));
    }
}
