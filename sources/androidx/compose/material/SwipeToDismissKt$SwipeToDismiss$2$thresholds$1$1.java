package androidx.compose.material;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Function1 $dismissThresholds;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(Function1 function1) {
        super(2);
        this.$dismissThresholds = function1;
    }

    @Override // c6.InterfaceC2072n
    public final ThresholdConfig invoke(DismissValue from, DismissValue to) {
        DismissDirection dismissDirection;
        AbstractC3292y.i(from, "from");
        AbstractC3292y.i(to, "to");
        Function1 function1 = this.$dismissThresholds;
        dismissDirection = SwipeToDismissKt.getDismissDirection(from, to);
        AbstractC3292y.f(dismissDirection);
        return (ThresholdConfig) function1.invoke(dismissDirection);
    }
}
