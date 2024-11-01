package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SwipeToDismissKt$rememberDismissState$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ DismissValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$rememberDismissState$2$1(DismissValue dismissValue, Function1 function1) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DismissState invoke() {
        return new DismissState(this.$initialValue, this.$confirmStateChange);
    }
}
