package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e6.AbstractC2829a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureNode extends Modifier.Node implements GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    private Function1 exclusion;
    private Rect rect;

    public ExcludeFromSystemGestureNode(Function1 function1) {
        this.exclusion = function1;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        long mo4116localPositionOfR5De75A = findRoot.mo4116localPositionOfR5De75A(layoutCoordinates, rect.m2747getTopLeftF1C5BW0());
        long mo4116localPositionOfR5De75A2 = findRoot.mo4116localPositionOfR5De75A(layoutCoordinates, rect.m2748getTopRightF1C5BW0());
        long mo4116localPositionOfR5De75A3 = findRoot.mo4116localPositionOfR5De75A(layoutCoordinates, rect.m2740getBottomLeftF1C5BW0());
        long mo4116localPositionOfR5De75A4 = findRoot.mo4116localPositionOfR5De75A(layoutCoordinates, rect.m2741getBottomRightF1C5BW0());
        return new Rect(AbstractC2829a.d(T5.a.d(Offset.m2712getXimpl(mo4116localPositionOfR5De75A), Offset.m2712getXimpl(mo4116localPositionOfR5De75A2), Offset.m2712getXimpl(mo4116localPositionOfR5De75A3), Offset.m2712getXimpl(mo4116localPositionOfR5De75A4))), AbstractC2829a.d(T5.a.d(Offset.m2713getYimpl(mo4116localPositionOfR5De75A), Offset.m2713getYimpl(mo4116localPositionOfR5De75A2), Offset.m2713getYimpl(mo4116localPositionOfR5De75A3), Offset.m2713getYimpl(mo4116localPositionOfR5De75A4))), AbstractC2829a.d(T5.a.b(Offset.m2712getXimpl(mo4116localPositionOfR5De75A), Offset.m2712getXimpl(mo4116localPositionOfR5De75A2), Offset.m2712getXimpl(mo4116localPositionOfR5De75A3), Offset.m2712getXimpl(mo4116localPositionOfR5De75A4))), AbstractC2829a.d(T5.a.b(Offset.m2713getYimpl(mo4116localPositionOfR5De75A), Offset.m2713getYimpl(mo4116localPositionOfR5De75A2), Offset.m2713getYimpl(mo4116localPositionOfR5De75A3), Offset.m2713getYimpl(mo4116localPositionOfR5De75A4))));
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates != null) {
                parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
            } else {
                return layoutCoordinates3;
            }
        }
    }

    private final View getView() {
        return (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView());
    }

    public final Function1 getExclusion() {
        return this.exclusion;
    }

    public final Rect getRect() {
        return this.rect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Rect calcBounds;
        AbstractC3292y.i(coordinates, "coordinates");
        Function1 function1 = this.exclusion;
        if (function1 == null) {
            androidx.compose.ui.geometry.Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
            calcBounds = new Rect(AbstractC2829a.d(boundsInRoot.getLeft()), AbstractC2829a.d(boundsInRoot.getTop()), AbstractC2829a.d(boundsInRoot.getRight()), AbstractC2829a.d(boundsInRoot.getBottom()));
        } else {
            AbstractC3292y.f(function1);
            calcBounds = calcBounds(coordinates, (androidx.compose.ui.geometry.Rect) function1.invoke(coordinates));
        }
        replaceRect(calcBounds);
    }

    public final void replaceRect(Rect rect) {
        List systemGestureExclusionRects;
        MutableVector mutableVector = new MutableVector(new Rect[16], 0);
        systemGestureExclusionRects = getView().getSystemGestureExclusionRects();
        AbstractC3292y.h(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        Rect rect2 = this.rect;
        if (rect2 != null) {
            mutableVector.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            mutableVector.add(rect);
        }
        getView().setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = rect;
    }

    public final void setExclusion(Function1 function1) {
        this.exclusion = function1;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }
}
