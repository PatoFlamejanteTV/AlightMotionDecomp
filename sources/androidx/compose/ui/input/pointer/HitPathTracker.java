package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class HitPathTracker {
    public static final int $stable = MutableVector.$stable;
    private final NodeParent root = new NodeParent();
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z8);
    }

    /* renamed from: addHitPath-KNwqfcY, reason: not valid java name */
    public final void m3921addHitPathKNwqfcY(long j8, List<? extends Modifier.Node> list) {
        Node node;
        NodeParent nodeParent = this.root;
        int size = list.size();
        boolean z8 = true;
        for (int i8 = 0; i8 < size; i8++) {
            Modifier.Node node2 = list.get(i8);
            if (z8) {
                MutableVector<Node> children = nodeParent.getChildren();
                int size2 = children.getSize();
                if (size2 > 0) {
                    Node[] content = children.getContent();
                    int i9 = 0;
                    do {
                        node = content[i9];
                        if (AbstractC3292y.d(node.getModifierNode(), node2)) {
                            break;
                        } else {
                            i9++;
                        }
                    } while (i9 < size2);
                }
                node = null;
                Node node3 = node;
                if (node3 != null) {
                    node3.markIsIn();
                    node3.getPointerIds().m4075add0FcD4WY(j8);
                    nodeParent = node3;
                } else {
                    z8 = false;
                }
            }
            Node node4 = new Node(node2);
            node4.getPointerIds().m4075add0FcD4WY(j8);
            nodeParent.getChildren().add(node4);
            nodeParent = node4;
        }
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean z8) {
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z8)) {
            return false;
        }
        boolean dispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z8);
        if (!this.root.dispatchFinalEventPass(internalPointerEvent) && !dispatchMainEventPass) {
            return false;
        }
        return true;
    }

    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }
}
