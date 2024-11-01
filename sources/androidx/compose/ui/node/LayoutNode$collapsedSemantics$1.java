package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNode$collapsedSemantics$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ T $config;
    final /* synthetic */ LayoutNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$collapsedSemantics$1(LayoutNode layoutNode, T t8) {
        super(0);
        this.this$0 = layoutNode;
        this.$config = t8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4240invoke();
        return I.f8786a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4240invoke() {
        NodeChain nodes$ui_release = this.this$0.getNodes$ui_release();
        int m4320constructorimpl = NodeKind.m4320constructorimpl(8);
        T t8 = this.$config;
        if ((nodes$ui_release.getAggregateChildKindSet() & m4320constructorimpl) != 0) {
            for (Modifier.Node tail$ui_release = nodes$ui_release.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                    DelegatingNode delegatingNode = tail$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
                            if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                t8.f34573a = semanticsConfiguration;
                                semanticsConfiguration.setClearingSemantics(true);
                            }
                            if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                ((SemanticsConfiguration) t8.f34573a).setMergingSemanticsOfDescendants(true);
                            }
                            semanticsModifierNode.applySemantics((SemanticsConfiguration) t8.f34573a);
                        } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i8 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i8 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }
}
