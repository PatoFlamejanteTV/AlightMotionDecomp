package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
final class FocusablePinnableContainerNode$retrievePinnableContainer$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ T $container;
    final /* synthetic */ FocusablePinnableContainerNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusablePinnableContainerNode$retrievePinnableContainer$1(T t8, FocusablePinnableContainerNode focusablePinnableContainerNode) {
        super(0);
        this.$container = t8;
        this.this$0 = focusablePinnableContainerNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m315invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m315invoke() {
        this.$container.f34573a = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, PinnableContainerKt.getLocalPinnableContainer());
    }
}
