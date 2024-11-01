package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FocusableSemanticsNode$applySemantics$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ FocusableSemanticsNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableSemanticsNode$applySemantics$1(FocusableSemanticsNode focusableSemanticsNode) {
        super(0);
        this.this$0 = focusableSemanticsNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(FocusRequesterModifierNodeKt.requestFocus(this.this$0));
    }
}
