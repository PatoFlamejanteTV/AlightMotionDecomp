package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ClickableSemanticsNode$applySemantics$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ClickableSemanticsNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableSemanticsNode$applySemantics$2(ClickableSemanticsNode clickableSemanticsNode) {
        super(0);
        this.this$0 = clickableSemanticsNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Function0 function0;
        function0 = this.this$0.onLongClick;
        if (function0 != null) {
            function0.invoke();
        }
        return Boolean.TRUE;
    }
}
