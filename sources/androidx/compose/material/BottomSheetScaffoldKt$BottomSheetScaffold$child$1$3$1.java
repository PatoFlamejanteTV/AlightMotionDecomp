package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1(BottomSheetScaffoldState bottomSheetScaffoldState) {
        super(0);
        this.$scaffoldState = bottomSheetScaffoldState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$scaffoldState.getBottomSheetState().requireOffset());
    }
}
