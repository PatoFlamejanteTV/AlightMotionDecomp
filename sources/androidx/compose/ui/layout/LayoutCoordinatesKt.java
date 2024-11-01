package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect c8;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || (c8 = c.c(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) {
            return new Rect(0.0f, 0.0f, IntSize.m5321getWidthimpl(layoutCoordinates.mo4115getSizeYbymL2g()), IntSize.m5320getHeightimpl(layoutCoordinates.mo4115getSizeYbymL2g()));
        }
        return c8;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return c.c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m5321getWidthimpl = IntSize.m5321getWidthimpl(findRootCoordinates.mo4115getSizeYbymL2g());
        float m5320getHeightimpl = IntSize.m5320getHeightimpl(findRootCoordinates.mo4115getSizeYbymL2g());
        float j8 = i6.m.j(boundsInRoot.getLeft(), 0.0f, m5321getWidthimpl);
        float j9 = i6.m.j(boundsInRoot.getTop(), 0.0f, m5320getHeightimpl);
        float j10 = i6.m.j(boundsInRoot.getRight(), 0.0f, m5321getWidthimpl);
        float j11 = i6.m.j(boundsInRoot.getBottom(), 0.0f, m5320getHeightimpl);
        if (j8 == j10 || j9 == j11) {
            return Rect.Companion.getZero();
        }
        long mo4118localToWindowMKHz9U = findRootCoordinates.mo4118localToWindowMKHz9U(OffsetKt.Offset(j8, j9));
        long mo4118localToWindowMKHz9U2 = findRootCoordinates.mo4118localToWindowMKHz9U(OffsetKt.Offset(j10, j9));
        long mo4118localToWindowMKHz9U3 = findRootCoordinates.mo4118localToWindowMKHz9U(OffsetKt.Offset(j10, j11));
        long mo4118localToWindowMKHz9U4 = findRootCoordinates.mo4118localToWindowMKHz9U(OffsetKt.Offset(j8, j11));
        return new Rect(T5.a.d(Offset.m2712getXimpl(mo4118localToWindowMKHz9U), Offset.m2712getXimpl(mo4118localToWindowMKHz9U2), Offset.m2712getXimpl(mo4118localToWindowMKHz9U4), Offset.m2712getXimpl(mo4118localToWindowMKHz9U3)), T5.a.d(Offset.m2713getYimpl(mo4118localToWindowMKHz9U), Offset.m2713getYimpl(mo4118localToWindowMKHz9U2), Offset.m2713getYimpl(mo4118localToWindowMKHz9U4), Offset.m2713getYimpl(mo4118localToWindowMKHz9U3)), T5.a.b(Offset.m2712getXimpl(mo4118localToWindowMKHz9U), Offset.m2712getXimpl(mo4118localToWindowMKHz9U2), Offset.m2712getXimpl(mo4118localToWindowMKHz9U4), Offset.m2712getXimpl(mo4118localToWindowMKHz9U3)), T5.a.b(Offset.m2713getYimpl(mo4118localToWindowMKHz9U), Offset.m2713getYimpl(mo4118localToWindowMKHz9U2), Offset.m2713getYimpl(mo4118localToWindowMKHz9U4), Offset.m2713getYimpl(mo4118localToWindowMKHz9U3)));
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        if (layoutCoordinates2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) layoutCoordinates2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
            } else {
                return nodeCoordinator3;
            }
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            return parentLayoutCoordinates.mo4116localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2728getZeroF1C5BW0());
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo4117localToRootMKHz9U(Offset.Companion.m2728getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo4118localToWindowMKHz9U(Offset.Companion.m2728getZeroF1C5BW0());
    }
}
