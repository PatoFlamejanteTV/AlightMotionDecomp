package androidx.compose.material;

import Q5.x;
import R5.Q;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ float $peekHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1(int i8, float f8) {
        super(1);
        this.$layoutHeight = i8;
        this.$peekHeightPx = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m1117invokeozmzZPI(((IntSize) obj).m5325unboximpl());
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final Map<BottomSheetValue, Float> m1117invokeozmzZPI(long j8) {
        float m5320getHeightimpl = IntSize.m5320getHeightimpl(j8);
        float f8 = this.$layoutHeight;
        float f9 = this.$peekHeightPx;
        float f10 = f8 - f9;
        if (m5320getHeightimpl == 0.0f || m5320getHeightimpl == f9) {
            return Q.e(x.a(BottomSheetValue.Collapsed, Float.valueOf(f10)));
        }
        return Q.k(x.a(BottomSheetValue.Collapsed, Float.valueOf(f10)), x.a(BottomSheetValue.Expanded, Float.valueOf(this.$layoutHeight - m5320getHeightimpl)));
    }
}
