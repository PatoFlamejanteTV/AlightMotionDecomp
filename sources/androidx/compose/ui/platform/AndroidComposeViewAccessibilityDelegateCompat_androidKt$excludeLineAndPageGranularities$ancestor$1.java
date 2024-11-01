package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 extends AbstractC3293z implements Function1 {
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1();

    AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:            if (r3.contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText()) != false) goto L10;     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r3) {
        /*
            r2 = this;
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getCollapsedSemantics$ui_release()
            if (r3 == 0) goto L1a
            boolean r0 = r3.isMergingSemanticsOfDescendants()
            r1 = 1
            if (r0 != r1) goto L1a
            androidx.compose.ui.semantics.SemanticsActions r0 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getSetText()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
    }
}
