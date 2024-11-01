package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode {
    private DragAndDropModifierNode lastChildDragAndDropModifierNode;
    private final Function1 onDragAndDropStart;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {

        /* loaded from: classes.dex */
        private static final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        private Companion() {
        }

        private final DragAndDropModifierNode firstChildOrNull(DragAndDropModifierNode dragAndDropModifierNode, Function1 function1) {
            if (!dragAndDropModifierNode.getNode().isAttached()) {
                return null;
            }
            T t8 = new T();
            TraversableNodeKt.traverseDescendants(dragAndDropModifierNode, DragAndDropTraversableKey.INSTANCE, new DragAndDropNode$Companion$firstChildOrNull$1(function1, t8));
            return (DragAndDropModifierNode) t8.f34573a;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public DragAndDropNode(Function1 function1) {
        this.onDragAndDropStart = function1;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent) {
        if (!isAttached()) {
            return false;
        }
        if (this.thisDragAndDropTarget == null) {
            this.thisDragAndDropTarget = (DragAndDropTarget) this.onDragAndDropStart.invoke(dragAndDropEvent);
            O o8 = new O();
            TraversableNodeKt.traverseChildren(this, new DragAndDropNode$acceptDragAndDropTransfer$2(o8, dragAndDropEvent, this));
            if (!o8.f34569a && this.thisDragAndDropTarget == null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    /* renamed from: drag-12SF9DM */
    public void mo2598drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j8, Function1 function1) {
        DelegatableNodeKt.requireOwner(this).getDragAndDropManager().mo2597drag12SF9DM(dragAndDropTransferData, j8, function1);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onChanged(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.onChanged(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode == null) {
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                return dragAndDropTarget.onDrop(dragAndDropEvent);
            }
            return false;
        }
        return dragAndDropModifierNode.onDrop(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(DragAndDropEvent dragAndDropEvent) {
        if (!getNode().isAttached()) {
            return;
        }
        TraversableNodeKt.traverseChildren(this, new DragAndDropNode$onEnded$1(dragAndDropEvent));
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEnded(dragAndDropEvent);
        }
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onEntered(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.onEntered(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMoved(androidx.compose.ui.draganddrop.DragAndDropEvent r5) {
        /*
            r4 = this;
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r0 = r4.lastChildDragAndDropModifierNode
            if (r0 == 0) goto L11
            long r1 = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(r5)
            boolean r1 = androidx.compose.ui.draganddrop.DragAndDropNodeKt.m2599access$containsUv8p0NA(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L30
        L11:
            androidx.compose.ui.Modifier$Node r1 = r4.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L1d
            r1 = 0
            goto L30
        L1d:
            kotlin.jvm.internal.T r1 = new kotlin.jvm.internal.T
            r1.<init>()
            androidx.compose.ui.draganddrop.DragAndDropNode$Companion$DragAndDropTraversableKey r2 = androidx.compose.ui.draganddrop.DragAndDropNode.Companion.DragAndDropTraversableKey.INSTANCE
            androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstChildOrNull$1 r3 = new androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstChildOrNull$1
            r3.<init>(r1, r4, r5)
            androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(r4, r2, r3)
            java.lang.Object r1 = r1.f34573a
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r1 = (androidx.compose.ui.draganddrop.DragAndDropModifierNode) r1
        L30:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L3b
            r0.onExited(r5)
        L3b:
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r1, r5)
            goto L6c
        L3f:
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            r0.onExited(r5)
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r0, r5)
            goto L6c
        L4e:
            boolean r2 = kotlin.jvm.internal.AbstractC3292y.d(r1, r0)
            if (r2 != 0) goto L5f
            if (r0 == 0) goto L59
            r0.onExited(r5)
        L59:
            if (r1 == 0) goto L6c
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r1, r5)
            goto L6c
        L5f:
            if (r1 == 0) goto L65
            r1.onMoved(r5)
            goto L6c
        L65:
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            r0.onMoved(r5)
        L6c:
            r4.lastChildDragAndDropModifierNode = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draganddrop.DragAndDropNode.onMoved(androidx.compose.ui.draganddrop.DragAndDropEvent):void");
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onStarted(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.onStarted(dragAndDropEvent);
    }
}
