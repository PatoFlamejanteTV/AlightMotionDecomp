package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;
    private LayoutCoordinates coordinates;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private boolean wasIn;
    private final PointerIdArray pointerIds = new PointerIdArray();
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;
    private final MutableVector<Long> vec = new MutableVector<>(new Long[16], 0);

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0 function0) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        function0.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!Offset.m2709equalsimpl0(pointerEvent.getChanges().get(i8).m3993getPositionF1C5BW0(), pointerEvent2.getChanges().get(i8).m3993getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean buildCache(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> r36, androidx.compose.ui.layout.LayoutCoordinates r37, androidx.compose.ui.input.pointer.InternalPointerEvent r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.buildCache(androidx.collection.LongSparseArray, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i8 = 0; i8 < size; i8++) {
            PointerInputChange pointerInputChange = changes.get(i8);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m3922issuesEnterExitEvent0FcD4WY(pointerInputChange.m3991getIdJ3iCeTQ()) || !this.isIn)) {
                this.pointerIds.m4078remove0FcD4WY(pointerInputChange.m3991getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m3942equalsimpl0(pointerEvent.m3935getType7fucELk(), PointerEventType.Companion.m3947getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i8 = 0;
            do {
                content[i8].dispatchCancel();
                i8++;
            } while (i8 < size);
        }
        DelegatingNode delegatingNode = this.modifierNode;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).onCancelPointerInput();
            } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                int i9 = 0;
                delegatingNode = delegatingNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                        i9++;
                        if (i9 == 1) {
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
                if (i9 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
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
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        boolean z8 = false;
        int i8 = 0;
        z8 = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            AbstractC3292y.f(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            AbstractC3292y.f(layoutCoordinates);
            long mo4115getSizeYbymL2g = layoutCoordinates.mo4115getSizeYbymL2g();
            DelegatingNode delegatingNode = this.modifierNode;
            int m4320constructorimpl = NodeKind.m4320constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNode).mo242onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, mo4115getSizeYbymL2g);
                } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                    int i9 = 0;
                    delegatingNode = delegatingNode;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            i9++;
                            if (i9 == 1) {
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
                    if (i9 == 1) {
                    }
                }
                delegatingNode = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.modifierNode.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i8].dispatchFinalEventPass(internalPointerEvent);
                    i8++;
                } while (i8 < size);
            }
            z8 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z8) {
        MutableVector<Node> children;
        int size;
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        AbstractC3292y.f(pointerEvent);
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        AbstractC3292y.f(layoutCoordinates2);
        long mo4115getSizeYbymL2g = layoutCoordinates2.mo4115getSizeYbymL2g();
        DelegatingNode delegatingNode = this.modifierNode;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).mo242onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, mo4115getSizeYbymL2g);
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
        if (this.modifierNode.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            int i9 = 0;
            do {
                Node node = content[i9];
                LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                AbstractC3292y.f(layoutCoordinates3);
                node.dispatchMainEventPass(longSparseArray2, layoutCoordinates3, internalPointerEvent, z8);
                i9++;
            } while (i9 < size);
        }
        if (this.modifierNode.isAttached()) {
            DelegatingNode delegatingNode2 = this.modifierNode;
            int m4320constructorimpl2 = NodeKind.m4320constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (delegatingNode2 != 0) {
                if (delegatingNode2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNode2).mo242onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, mo4115getSizeYbymL2g);
                } else if ((delegatingNode2.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (delegatingNode2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release2 = delegatingNode2.getDelegate$ui_release();
                    int i10 = 0;
                    delegatingNode2 = delegatingNode2;
                    while (delegate$ui_release2 != null) {
                        if ((delegate$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                            i10++;
                            if (i10 == 1) {
                                delegatingNode2 = delegate$ui_release2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNode2 != 0) {
                                    mutableVector2.add(delegatingNode2);
                                    delegatingNode2 = 0;
                                }
                                mutableVector2.add(delegate$ui_release2);
                            }
                        }
                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                        delegatingNode2 = delegatingNode2;
                    }
                    if (i10 == 1) {
                    }
                }
                delegatingNode2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final MutableVector<Long> getVec() {
        return this.vec;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
