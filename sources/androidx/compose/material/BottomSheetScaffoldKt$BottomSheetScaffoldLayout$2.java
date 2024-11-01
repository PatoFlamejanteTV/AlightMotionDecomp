package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2073o $body;
    final /* synthetic */ InterfaceC2073o $bottomSheet;
    final /* synthetic */ InterfaceC2072n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Function0 $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ InterfaceC2072n $snackbarHost;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, float f8, int i8, Function0 function0, BottomSheetState bottomSheetState, int i9) {
        super(2);
        this.$topBar = interfaceC2072n;
        this.$body = interfaceC2073o;
        this.$bottomSheet = interfaceC2073o2;
        this.$floatingActionButton = interfaceC2072n2;
        this.$snackbarHost = interfaceC2072n3;
        this.$sheetPeekHeight = f8;
        this.$floatingActionButtonPosition = i8;
        this.$sheetOffset = function0;
        this.$sheetState = bottomSheetState;
        this.$$changed = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        BottomSheetScaffoldKt.m1112BottomSheetScaffoldLayoutKCBPh4w(this.$topBar, this.$body, this.$bottomSheet, this.$floatingActionButton, this.$snackbarHost, this.$sheetPeekHeight, this.$floatingActionButtonPosition, this.$sheetOffset, this.$sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
