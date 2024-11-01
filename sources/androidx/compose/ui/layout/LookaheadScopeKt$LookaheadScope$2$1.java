package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LookaheadScopeKt$LookaheadScope$2$1 extends AbstractC3293z implements Function1 {
    public static final LookaheadScopeKt$LookaheadScope$2$1 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$1();

    LookaheadScopeKt$LookaheadScope$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode) {
        layoutNode.setVirtualLookaheadRoot$ui_release(true);
    }
}
