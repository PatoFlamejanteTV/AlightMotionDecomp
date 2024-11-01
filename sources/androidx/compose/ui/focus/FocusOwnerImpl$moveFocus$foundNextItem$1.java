package androidx.compose.ui.focus;

import Q5.p;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusOwnerImpl$moveFocus$foundNextItem$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ O $isCancelled;
    final /* synthetic */ FocusTargetNode $source;
    final /* synthetic */ FocusOwnerImpl this$0;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$moveFocus$foundNextItem$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, int i8, O o8) {
        super(1);
        this.$source = focusTargetNode;
        this.this$0 = focusOwnerImpl;
        this.$focusDirection = i8;
        this.$isCancelled = o8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        boolean z8;
        NodeChain nodes$ui_release;
        if (AbstractC3292y.d(focusTargetNode, this.$source)) {
            return Boolean.FALSE;
        }
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                node = null;
                z8 = true;
                if (requireLayoutNode == null) {
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            Modifier.Node node2 = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (node2 != null) {
                                if (node2 instanceof FocusTargetNode) {
                                    node = node2;
                                    break loop0;
                                }
                                if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i8 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                node2 = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (node != null) {
                FocusTransactionManager focusTransactionManager = this.this$0.getFocusTransactionManager();
                int i9 = this.$focusDirection;
                O o8 = this.$isCancelled;
                try {
                    if (focusTransactionManager.ongoingTransaction) {
                        focusTransactionManager.cancelTransaction();
                    }
                    focusTransactionManager.beginTransaction();
                    int i10 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2662performCustomRequestFocusMxy_nc0(focusTargetNode, i9).ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            if (i10 != 4) {
                                throw new p();
                            }
                            z8 = FocusTransactionsKt.performRequestFocus(focusTargetNode);
                        } else {
                            o8.f34569a = true;
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z8);
                    focusTransactionManager.commitTransaction();
                    return valueOf;
                } catch (Throwable th) {
                    focusTransactionManager.commitTransaction();
                    throw th;
                }
            }
            throw new IllegalStateException("Focus search landed at the root.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
