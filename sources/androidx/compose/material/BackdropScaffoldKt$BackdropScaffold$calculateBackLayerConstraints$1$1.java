package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $headerHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(float f8) {
        super(1);
        this.$headerHeightPx = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Constraints.m5111boximpl(m1095invokeZezNO4M(((Constraints) obj).m5129unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
    public final long m1095invokeZezNO4M(long j8) {
        return ConstraintsKt.m5140offsetNN6EwU$default(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null), 0, -AbstractC2829a.d(this.$headerHeightPx), 1, null);
    }
}
