package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNode$_foldedChildren$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LayoutNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$_foldedChildren$1(LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4239invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4239invoke() {
        this.this$0.getLayoutDelegate$ui_release().markChildrenDirty();
    }
}
