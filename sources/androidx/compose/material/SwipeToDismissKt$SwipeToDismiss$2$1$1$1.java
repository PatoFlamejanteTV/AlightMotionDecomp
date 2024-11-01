package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$2$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DismissState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2$1$1$1(DismissState dismissState) {
        super(1);
        this.$state = dismissState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5270boximpl(m1338invokeBjo55l4((Density) obj));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1338invokeBjo55l4(Density offset) {
        AbstractC3292y.i(offset, "$this$offset");
        return IntOffsetKt.IntOffset(AbstractC2829a.d(this.$state.getOffset().getValue().floatValue()), 0);
    }
}
