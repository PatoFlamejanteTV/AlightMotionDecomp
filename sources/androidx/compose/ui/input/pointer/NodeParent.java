package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class NodeParent {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);

    public boolean buildCache(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z8) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i8 = 0;
        boolean z9 = false;
        do {
            if (!content[i8].buildCache(longSparseArray, layoutCoordinates, internalPointerEvent, z8) && !z9) {
                z9 = false;
            } else {
                z9 = true;
            }
            i8++;
        } while (i8 < size);
        return z9;
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                if (this.children.getContent()[size].getPointerIds().isEmpty()) {
                    this.children.removeAt(size);
                }
            } else {
                return;
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                content[i8].dispatchCancel();
                i8++;
            } while (i8 < size);
        }
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        boolean z8 = false;
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i8 = 0;
            boolean z9 = false;
            do {
                if (!content[i8].dispatchFinalEventPass(internalPointerEvent) && !z9) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                i8++;
            } while (i8 < size);
            z8 = z9;
        }
        cleanUpHits(internalPointerEvent);
        return z8;
    }

    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z8) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i8 = 0;
        boolean z9 = false;
        do {
            if (!content[i8].dispatchMainEventPass(longSparseArray, layoutCoordinates, internalPointerEvent, z8) && !z9) {
                z9 = false;
            } else {
                z9 = true;
            }
            i8++;
        } while (i8 < size);
        return z9;
    }

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public final void removeDetachedPointerInputFilters() {
        int i8 = 0;
        while (i8 < this.children.getSize()) {
            Node node = this.children.getContent()[i8];
            if (!node.getModifierNode().isAttached()) {
                this.children.removeAt(i8);
                node.dispatchCancel();
            } else {
                i8++;
                node.removeDetachedPointerInputFilters();
            }
        }
    }
}
