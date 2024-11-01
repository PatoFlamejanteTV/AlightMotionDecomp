package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(DragAndDropNodeKt$DragAndDropModifierNode$1.INSTANCE);
    }

    /* renamed from: access$contains-Uv8p0NA */
    public static final /* synthetic */ boolean m2599access$containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j8) {
        return m2600containsUv8p0NA(dragAndDropModifierNode, j8);
    }

    /* renamed from: contains-Uv8p0NA */
    public static final boolean m2600containsUv8p0NA(DragAndDropModifierNode dragAndDropModifierNode, long j8) {
        if (!dragAndDropModifierNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropModifierNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long mo4115getSizeYbymL2g = coordinates.mo4115getSizeYbymL2g();
        int m5321getWidthimpl = IntSize.m5321getWidthimpl(mo4115getSizeYbymL2g);
        int m5320getHeightimpl = IntSize.m5320getHeightimpl(mo4115getSizeYbymL2g);
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float m2702component1impl = Offset.m2702component1impl(positionInRoot);
        float m2703component2impl = Offset.m2703component2impl(positionInRoot);
        float f8 = m5321getWidthimpl + m2702component1impl;
        float f9 = m5320getHeightimpl + m2703component2impl;
        float m2712getXimpl = Offset.m2712getXimpl(j8);
        if (m2702component1impl > m2712getXimpl || m2712getXimpl > f8) {
            return false;
        }
        float m2713getYimpl = Offset.m2713getYimpl(j8);
        if (m2703component2impl > m2713getYimpl || m2713getYimpl > f9) {
            return false;
        }
        return true;
    }

    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    public static final DragAndDropModifierNode DragAndDropModifierNode(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(new DragAndDropNodeKt$DragAndDropModifierNode$2(function1, dragAndDropTarget));
    }
}
