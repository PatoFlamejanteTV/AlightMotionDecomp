package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ModalBottomSheetKt$ModalBottomSheetLayout$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Density $density;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$1(ModalBottomSheetState modalBottomSheetState, Density density) {
        super(0);
        this.$sheetState = modalBottomSheetState;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1257invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1257invoke() {
        this.$sheetState.setDensity$material_release(this.$density);
    }
}
