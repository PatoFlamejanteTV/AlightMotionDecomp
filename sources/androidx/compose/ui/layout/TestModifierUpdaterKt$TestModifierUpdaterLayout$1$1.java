package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $onAttached;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(Function1 function1) {
        super(1);
        this.$onAttached = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode) {
        this.$onAttached.invoke(new TestModifierUpdater(layoutNode));
    }
}
