package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 extends AbstractC3293z implements Function1 {
    public static final AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1();

    AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode layoutNode) {
        return Boolean.valueOf(layoutNode.getNodes$ui_release().m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(8)));
    }
}
