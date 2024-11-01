package androidx.compose.ui.input.nestedscroll;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NestedScrollNode$updateDispatcherFields$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$updateDispatcherFields$1(NestedScrollNode nestedScrollNode) {
        super(0);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final M invoke() {
        M nestedCoroutineScope;
        nestedCoroutineScope = this.this$0.getNestedCoroutineScope();
        return nestedCoroutineScope;
    }
}
