package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint innerBoundsPaint;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int i8;
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            if (num != null) {
                i8 = num.intValue();
            } else {
                i8 = Integer.MIN_VALUE;
            }
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(i8));
            return i8;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i8) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i8) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicWidth(i8);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4108measureBRTryo0(long j8) {
            LookaheadDelegate.m4262access$setMeasurementConstraintsBRTryo0(this, j8);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i8].getLookaheadPassDelegate$ui_release();
                    AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i8++;
                } while (i8 < size);
            }
            LookaheadDelegate.access$set_measureResult(this, getLayoutNode().getMeasurePolicy().mo109measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j8));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i8) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i8) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicWidth(i8);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            AbstractC3292y.f(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2833setColor8_81llA(Color.Companion.m2982getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo2837setStylek9PVt8s(PaintingStyle.Companion.m3196getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        LookaheadDelegateImpl lookaheadDelegateImpl;
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            lookaheadDelegateImpl = new LookaheadDelegateImpl();
        } else {
            lookaheadDelegateImpl = null;
        }
        this.lookaheadDelegate = lookaheadDelegateImpl;
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4224hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator.HitTestSource r17, long r18, androidx.compose.ui.node.HitTestResult r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            androidx.compose.ui.node.LayoutNode r1 = r16.getLayoutNode()
            r10 = r17
            boolean r1 = r10.shouldHitTestChildren(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            boolean r1 = r0.m4308withinLayerBoundsk4lQ0M(r8)
            if (r1 == 0) goto L1c
            r11 = r22
            r3 = 1
            goto L37
        L1c:
            if (r21 == 0) goto L35
            long r4 = r16.m4299getMinimumTouchTargetSizeNHjbRc()
            float r1 = r0.m4296distanceInMinimumTouchTargettz77jQw(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L35
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L35
            r3 = 1
            r11 = 0
            goto L37
        L35:
            r11 = r22
        L37:
            if (r3 == 0) goto L89
            int r12 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r20)
            androidx.compose.ui.node.LayoutNode r1 = r16.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r3 = r1.getSize()
            if (r3 <= 0) goto L7e
            int r3 = r3 - r2
            java.lang.Object[] r13 = r1.getContent()
            r14 = r3
        L51:
            r1 = r13[r14]
            r15 = r1
            androidx.compose.ui.node.LayoutNode r15 = (androidx.compose.ui.node.LayoutNode) r15
            boolean r1 = r15.isPlaced()
            if (r1 == 0) goto L81
            r1 = r17
            r2 = r15
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r11
            r1.mo4309childHitTestYqVAtuI(r2, r3, r5, r6, r7)
            boolean r1 = r20.hasHit()
            if (r1 != 0) goto L70
            goto L81
        L70:
            androidx.compose.ui.node.NodeCoordinator r1 = r15.getOuterCoordinator$ui_release()
            boolean r1 = r1.shouldSharePointerInputWithSiblings()
            if (r1 == 0) goto L7e
            r20.acceptHits()
            goto L81
        L7e:
            r1 = r20
            goto L86
        L81:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L51
            goto L7e
        L86:
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r1, r12)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.mo4224hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i8) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i8) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo4108measureBRTryo0(long j8) {
        m4145setMeasurementConstraintsBRTryo0(j8);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                content[i8].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i8++;
            } while (i8 < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo109measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j8));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i8) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i8) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas) {
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode = content[i8];
                if (layoutNode.isPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i8++;
            } while (i8 < size);
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
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
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public TailModifierNode getTail() {
        return this.tail;
    }
}
