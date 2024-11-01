package androidx.compose.ui.graphics.vector;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GroupComponent$wrappedListener$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ GroupComponent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupComponent$wrappedListener$1(GroupComponent groupComponent) {
        super(1);
        this.this$0 = groupComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VNode) obj);
        return I.f8786a;
    }

    public final void invoke(VNode vNode) {
        this.this$0.markTintForVNode(vNode);
        Function1 invalidateListener$ui_release = this.this$0.getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(vNode);
        }
    }
}
