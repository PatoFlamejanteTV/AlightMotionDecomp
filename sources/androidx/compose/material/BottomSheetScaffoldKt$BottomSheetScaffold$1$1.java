package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Density $density;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1$1(BottomSheetScaffoldState bottomSheetScaffoldState, Density density) {
        super(0);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1116invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1116invoke() {
        this.$scaffoldState.getBottomSheetState().setDensity$material_release(this.$density);
    }
}
