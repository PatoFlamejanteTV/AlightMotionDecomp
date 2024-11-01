package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.h;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusableSemanticsNode extends Modifier.Node implements SemanticsModifierNode, FocusRequesterModifierNode {
    private boolean isFocused;
    private SemanticsConfiguration semanticsConfigurationCache = new SemanticsConfiguration();

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        AbstractC3292y.i(semanticsPropertyReceiver, "<this>");
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.isFocused);
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new FocusableSemanticsNode$applySemantics$1(this), 1, null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return h.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return h.b(this);
    }

    public final void setFocus(boolean z8) {
        this.isFocused = z8;
    }
}
