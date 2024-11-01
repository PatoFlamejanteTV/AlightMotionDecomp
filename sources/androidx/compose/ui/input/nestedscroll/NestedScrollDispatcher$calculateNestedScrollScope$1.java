package androidx.compose.ui.input.nestedscroll;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NestedScrollDispatcher$calculateNestedScrollScope$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$calculateNestedScrollScope$1(NestedScrollDispatcher nestedScrollDispatcher) {
        super(0);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.jvm.functions.Function0
    public final M invoke() {
        return this.this$0.getScope$ui_release();
    }
}
