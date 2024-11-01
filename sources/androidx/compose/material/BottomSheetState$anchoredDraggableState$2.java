package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetState$anchoredDraggableState$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ BottomSheetState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState$anchoredDraggableState$2(BottomSheetState bottomSheetState) {
        super(0);
        this.this$0 = bottomSheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Density requireDensity;
        float f8;
        requireDensity = this.this$0.requireDensity();
        f8 = BottomSheetScaffoldKt.BottomSheetScaffoldVelocityThreshold;
        return Float.valueOf(requireDensity.mo425toPx0680j_4(f8));
    }
}
