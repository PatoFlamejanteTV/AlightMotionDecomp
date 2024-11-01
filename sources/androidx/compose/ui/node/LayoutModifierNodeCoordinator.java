package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint modifierBoundsPaint;
    private LayoutModifierNode layoutModifierNode;
    private Constraints lookaheadConstraints;
    private LookaheadDelegate lookaheadDelegate;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int calculateAlignmentAndPlaceChildAsNeeded;
            calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(calculateAlignmentAndPlaceChildAsNeeded));
            return calculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i8) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i8);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i8) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i8);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4108measureBRTryo0(long j8) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LookaheadDelegate.m4262access$setMeasurementConstraintsBRTryo0(this, j8);
            layoutModifierNodeCoordinator.lookaheadConstraints = Constraints.m5111boximpl(j8);
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            LookaheadDelegate.access$set_measureResult(this, layoutModifierNode.mo340measure3p2s80s(this, lookaheadDelegate, j8));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i8) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i8);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i8) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i8);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2833setColor8_81llA(Color.Companion.m2975getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2837setStylek9PVt8s(PaintingStyle.Companion.m3196getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode;
        this.layoutModifierNode = layoutModifierNode;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            lookaheadDelegateForLayoutModifierNode = new LookaheadDelegateForLayoutModifierNode();
        } else {
            lookaheadDelegateForLayoutModifierNode = null;
        }
        this.lookaheadDelegate = lookaheadDelegateForLayoutModifierNode;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        int calculateAlignmentAndPlaceChildAsNeeded;
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            return calculateAlignmentAndPlaceChildAsNeeded;
        }
        return lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui_release = getWrapped$ui_release();
        AbstractC3292y.f(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i8) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), i8);
        }
        return layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i8);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i8) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), i8);
        }
        return layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i8);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo4108measureBRTryo0(long j8) {
        MeasureResult mo340measure3p2s80s;
        m4145setMeasurementConstraintsBRTryo0(j8);
        LayoutModifierNode layoutModifierNode = getLayoutModifierNode();
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
            NodeCoordinator wrappedNonNull = getWrappedNonNull();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
            long IntSize = IntSizeKt.IntSize(measureResult$ui_release.getWidth(), measureResult$ui_release.getHeight());
            Constraints constraints = this.lookaheadConstraints;
            AbstractC3292y.f(constraints);
            mo340measure3p2s80s = intermediateLayoutModifierNode.m4110intermediateMeasureTeuZzU(this, wrappedNonNull, j8, IntSize, constraints.m5129unboximpl());
        } else {
            mo340measure3p2s80s = layoutModifierNode.mo340measure3p2s80s(this, getWrappedNonNull(), j8);
        }
        setMeasureResult$ui_release(mo340measure3p2s80s);
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i8) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), i8);
        }
        return layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i8);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i8) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), i8);
        }
        return layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i8);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas) {
        getWrappedNonNull().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo4109placeAtf8xVGno(long j8, float f8, Function1 function1) {
        super.mo4109placeAtf8xVGno(j8, f8, function1);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        getMeasureResult$ui_release().placeChildren();
    }

    public final void setLayoutModifierNode$ui_release(LayoutModifierNode layoutModifierNode) {
        this.layoutModifierNode = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }
}
