package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LookaheadScopeKt$LookaheadScope$2$2 extends AbstractC3293z implements InterfaceC2072n {
    public static final LookaheadScopeKt$LookaheadScope$2$2 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$2();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ LayoutNode $this_set;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LayoutNode layoutNode) {
            super(0);
            this.$this_set = layoutNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutCoordinates invoke() {
            LayoutNode parent$ui_release = this.$this_set.getParent$ui_release();
            AbstractC3292y.f(parent$ui_release);
            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
        }
    }

    LookaheadScopeKt$LookaheadScope$2$2() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LookaheadScopeImpl) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
        lookaheadScopeImpl.setScopeCoordinates(new AnonymousClass1(layoutNode));
    }
}
