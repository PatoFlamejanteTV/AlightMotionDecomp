package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SemanticsNode$isUnmergedLeafNode$1 extends AbstractC3293z implements Function1 {
    public static final SemanticsNode$isUnmergedLeafNode$1 INSTANCE = new SemanticsNode$isUnmergedLeafNode$1();

    SemanticsNode$isUnmergedLeafNode$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode layoutNode) {
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        boolean z8 = false;
        if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isMergingSemanticsOfDescendants()) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
