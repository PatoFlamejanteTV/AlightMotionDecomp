package androidx.compose.material;

import Q5.I;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheet$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue> $anchorChangeCallback;
    final /* synthetic */ Function1 $calculateAnchors;
    final /* synthetic */ BottomSheetState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$1(BottomSheetState bottomSheetState, Function1 function1, AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue> anchorChangedCallback) {
        super(1);
        this.$state = bottomSheetState;
        this.$calculateAnchors = function1;
        this.$anchorChangeCallback = anchorChangedCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1115invokeozmzZPI(((IntSize) obj).m5325unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1115invokeozmzZPI(long j8) {
        this.$state.getAnchoredDraggableState$material_release().updateAnchors$material_release((Map) this.$calculateAnchors.invoke(IntSize.m5313boximpl(j8)), this.$anchorChangeCallback);
    }
}
