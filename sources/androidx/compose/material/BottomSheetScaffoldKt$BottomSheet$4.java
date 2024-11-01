package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheet$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1 $calculateAnchors;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ BottomSheetState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$4(BottomSheetState bottomSheetState, boolean z8, Function1 function1, Shape shape, float f8, long j8, long j9, Modifier modifier, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$state = bottomSheetState;
        this.$sheetGesturesEnabled = z8;
        this.$calculateAnchors = function1;
        this.$sheetShape = shape;
        this.$sheetElevation = f8;
        this.$sheetBackgroundColor = j8;
        this.$sheetContentColor = j9;
        this.$modifier = modifier;
        this.$content = interfaceC2073o;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        BottomSheetScaffoldKt.m1110BottomSheet0cLKjW4(this.$state, this.$sheetGesturesEnabled, this.$calculateAnchors, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
