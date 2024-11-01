package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LookaheadDelegate $lookaheadDelegate;
    final /* synthetic */ LayoutNodeLayoutDelegate.LookaheadPassDelegate this$0;
    final /* synthetic */ LayoutNodeLayoutDelegate this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AlignmentLinesOwner) obj);
            return I.f8786a;
        }

        public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AlignmentLinesOwner) obj);
            return I.f8786a;
        }

        public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate, LookaheadDelegate lookaheadDelegate, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
        this.$lookaheadDelegate = lookaheadDelegate;
        this.this$1 = layoutNodeLayoutDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4252invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4252invoke() {
        this.this$0.clearPlaceOrder();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass1.INSTANCE);
        LookaheadDelegate lookaheadDelegate = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            boolean isPlacingForAlignment$ui_release = lookaheadDelegate.isPlacingForAlignment$ui_release();
            List<LayoutNode> children$ui_release = this.this$1.layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i8 = 0; i8 < size; i8++) {
                LookaheadDelegate lookaheadDelegate2 = children$ui_release.get(i8).getOuterCoordinator$ui_release().getLookaheadDelegate();
                if (lookaheadDelegate2 != null) {
                    lookaheadDelegate2.setPlacingForAlignment$ui_release(isPlacingForAlignment$ui_release);
                }
            }
        }
        this.$lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
        LookaheadDelegate lookaheadDelegate3 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate3 != null) {
            lookaheadDelegate3.isPlacingForAlignment$ui_release();
            List<LayoutNode> children$ui_release2 = this.this$1.layoutNode.getChildren$ui_release();
            int size2 = children$ui_release2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                LookaheadDelegate lookaheadDelegate4 = children$ui_release2.get(i9).getOuterCoordinator$ui_release().getLookaheadDelegate();
                if (lookaheadDelegate4 != null) {
                    lookaheadDelegate4.setPlacingForAlignment$ui_release(false);
                }
            }
        }
        this.this$0.checkChildrenPlaceOrderForUpdates();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass4.INSTANCE);
    }
}
