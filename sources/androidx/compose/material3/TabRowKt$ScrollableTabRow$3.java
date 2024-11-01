package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ InterfaceC2072n $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ InterfaceC2073o $indicator;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ InterfaceC2072n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$3(int i8, Modifier modifier, long j8, long j9, float f8, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i9, int i10) {
        super(2);
        this.$selectedTabIndex = i8;
        this.$modifier = modifier;
        this.$containerColor = j8;
        this.$contentColor = j9;
        this.$edgePadding = f8;
        this.$indicator = interfaceC2073o;
        this.$divider = interfaceC2072n;
        this.$tabs = interfaceC2072n2;
        this.$$changed = i9;
        this.$$default = i10;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        TabRowKt.m1813ScrollableTabRowsKfQg0A(this.$selectedTabIndex, this.$modifier, this.$containerColor, this.$contentColor, this.$edgePadding, this.$indicator, this.$divider, this.$tabs, composer, this.$$changed | 1, this.$$default);
    }
}
