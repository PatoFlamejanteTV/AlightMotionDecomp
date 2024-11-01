package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private final LayoutNode layoutNode;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private LookaheadPassDelegate lookaheadPassDelegate;
    private boolean measurePending;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate();
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final Function0 performMeasureBlock = new LayoutNodeLayoutDelegate$performMeasureBlock$1(this);

    /* loaded from: classes.dex */
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private Function1 lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private Constraints lookaheadConstraints;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.Companion.m5289getZeronOccac();
        private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);
        private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private boolean parentDataDirty = true;
        private Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i8].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                    int i9 = lookaheadPassDelegate$ui_release.previousPlaceOrder;
                    int i10 = lookaheadPassDelegate$ui_release.placeOrder;
                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            int i8 = 0;
            LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i8].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.previousPlaceOrder = lookaheadPassDelegate$ui_release.placeOrder;
                    lookaheadPassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        private final void forEachChildDelegate(Function1 function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i8].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                    function1.invoke(lookaheadPassDelegate$ui_release);
                    i8++;
                } while (i8 < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced(true);
            int i8 = 0;
            if (!isPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, true, false, 2, null);
            }
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode = content[i8];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i8 = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i8].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                        i8++;
                    } while (i8 < size);
                }
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LayoutNode layoutNode2 = content[i8];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                        Constraints m4248getLastLookaheadConstraintsDWUhwKw = layoutNode2.getLayoutDelegate$ui_release().m4248getLastLookaheadConstraintsDWUhwKw();
                        AbstractC3292y.f(m4248getLastLookaheadConstraintsDWUhwKw);
                        if (lookaheadPassDelegate$ui_release.m4251remeasureBRTryo0(m4248getLastLookaheadConstraintsDWUhwKw.m5129unboximpl())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                        }
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                int i8 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i8 != 2) {
                    if (i8 != 3) {
                        usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i8 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i8 != 1 && i8 != 2) {
                    if (i8 != 3 && i8 != 4) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(Function1 function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i8].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    AbstractC3292y.f(lookaheadAlignmentLinesOwner$ui_release);
                    function1.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i8++;
                } while (i8 < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            int i8 = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i8;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            if (this.childDelegatesDirty) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i8 = 0;
                    do {
                        LayoutNode layoutNode2 = content[i8];
                        if (mutableVector.getSize() <= i8) {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                            mutableVector.add(lookaheadPassDelegate$ui_release);
                        } else {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            AbstractC3292y.f(lookaheadPassDelegate$ui_release2);
                            mutableVector.set(i8, lookaheadPassDelegate$ui_release2);
                        }
                        i8++;
                    } while (i8 < size);
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.childDelegatesDirty = false;
                return this._childDelegates.asMutableList();
            }
            return this._childDelegates.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m4249getLastConstraintsDWUhwKw() {
            return this.lookaheadConstraints;
        }

        public final Function1 getLastLayerBlock$ui_release() {
            return this.lastLayerBlock;
        }

        /* renamed from: getLastPosition-nOcc-ac$ui_release, reason: not valid java name */
        public final long m4250getLastPositionnOccac$ui_release() {
            return this.lastPosition;
        }

        public final float getLastZIndex$ui_release() {
            return this.lastZIndex;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate$ui_release();
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) != null) {
                return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
            }
            return null;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        public final boolean getPlacedOnce$ui_release() {
            return this.placedOnce;
        }

        public final void invalidateIntrinsicsParent(boolean z8) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i8 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                            parent$ui_release2.requestLookaheadRelayout$ui_release(z8);
                            return;
                        } else {
                            parent$ui_release2.requestRelayout$ui_release(z8);
                            return;
                        }
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, z8, false, 2, null);
                } else {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z8, false, 2, null);
                }
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, lookaheadDelegate, LayoutNodeLayoutDelegate.this), 2, null);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i8) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i8) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(i8);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:            if (r1 == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;     */
        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.compose.ui.layout.Placeable mo4108measureBRTryo0(long r4) {
            /*
                r3 = this;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                r1 = 0
                if (r0 == 0) goto L12
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
                goto L13
            L12:
                r0 = r1
            L13:
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
                if (r0 == r2) goto L2b
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                if (r0 == 0) goto L27
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.getLayoutState$ui_release()
            L27:
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                r1 = 0
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$setDetachedFromParentLookaheadPass$p(r0, r1)
            L31:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r3.trackLookaheadMeasurementByParent(r0)
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r0.getIntrinsicsUsageByParent$ui_release()
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
                if (r0 != r1) goto L51
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r0.clearSubtreeIntrinsicsUsage$ui_release()
            L51:
                r3.m4251remeasureBRTryo0(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.mo4108measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i8) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i8) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(i8);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0 && (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LayoutNode layoutNode = content[i8];
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                    if (lookaheadPassDelegate$ui_release != null) {
                        lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced(false);
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (!isPlaced()) {
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder;
                        parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4109placeAtf8xVGno(long j8, float f8, Function1 function1) {
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                this.placedOnce = true;
                this.onNodePlacedCalled = false;
                if (!IntOffset.m5278equalsimpl0(j8, this.lastPosition)) {
                    if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                    }
                    notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                if (!LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release() && isPlaced()) {
                    LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                    AbstractC3292y.f(lookaheadDelegate);
                    lookaheadDelegate.m4265placeSelfApparentToRealOffsetgyyYBs$ui_release(j8);
                    onNodePlaced$ui_release();
                } else {
                    LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                    getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                    OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2(LayoutNodeLayoutDelegate.this, requireOwner, j8), 2, null);
                }
                this.lastPosition = j8;
                this.lastZIndex = f8;
                this.lastLayerBlock = function1;
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
                return;
            }
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }

        /* renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m4251remeasureBRTryo0(long j8) {
            boolean z8;
            long IntSize;
            boolean z9;
            boolean m5116equalsimpl0;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure$ui_release())) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                layoutNode.setCanMultiMeasure$ui_release(z8);
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getLookaheadMeasurePending$ui_release()) {
                    Constraints constraints = this.lookaheadConstraints;
                    if (constraints == null) {
                        m5116equalsimpl0 = false;
                    } else {
                        m5116equalsimpl0 = Constraints.m5116equalsimpl0(constraints.m5129unboximpl(), j8);
                    }
                    if (m5116equalsimpl0) {
                        Owner owner$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getOwner$ui_release();
                        if (owner$ui_release != null) {
                            owner$ui_release.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.layoutNode, true);
                        }
                        LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                        return false;
                    }
                }
                this.lookaheadConstraints = Constraints.m5111boximpl(j8);
                m4145setMeasurementConstraintsBRTryo0(j8);
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2.INSTANCE);
                if (this.measuredOnce) {
                    IntSize = m4142getMeasuredSizeYbymL2g();
                } else {
                    IntSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                this.measuredOnce = true;
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    LayoutNodeLayoutDelegate.this.m4245performLookaheadMeasureBRTryo0(j8);
                    m4144setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
                    if (IntSize.m5321getWidthimpl(IntSize) != lookaheadDelegate.getWidth() || IntSize.m5320getHeightimpl(IntSize) != lookaheadDelegate.getHeight()) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (this.placedOnce) {
                    this.onNodePlacedCalled = false;
                    boolean isPlaced = isPlaced();
                    mo4109placeAtf8xVGno(this.lastPosition, 0.0f, null);
                    if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                        LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                    }
                    return;
                }
                throw new IllegalStateException("replace() called on item that was not placed".toString());
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z8) {
            this.childDelegatesDirty = z8;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z8) {
            this.duringAlignmentLinesQuery = z8;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public final void setPlaceOrder$ui_release(int i8) {
            this.placeOrder = i8;
        }

        public void setPlaced(boolean z8) {
            this.isPlaced = z8;
        }

        public final void setPlacedOnce$ui_release(boolean z8) {
            this.placedOnce = z8;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                AbstractC3292y.f(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            AbstractC3292y.f(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private final MutableVector<MeasurePassDelegate> _childDelegates;
        private final AlignmentLines alignmentLines;
        private boolean childDelegatesDirty;
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private boolean isPlacedByParent;
        private Function1 lastLayerBlock;
        private long lastPosition;
        private float lastZIndex;
        private boolean layingOutChildren;
        private final Function0 layoutChildrenBlock;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private Object parentData;
        private boolean parentDataDirty;
        private final Function0 placeOuterCoordinatorBlock;
        private Function1 placeOuterCoordinatorLayerBlock;
        private long placeOuterCoordinatorPosition;
        private float placeOuterCoordinatorZIndex;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private float zIndex;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MeasurePassDelegate() {
            IntOffset.Companion companion = IntOffset.Companion;
            this.lastPosition = companion.m5289getZeronOccac();
            this.parentDataDirty = true;
            this.alignmentLines = new LayoutNodeAlignmentLines(this);
            this._childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1(this);
            this.placeOuterCoordinatorPosition = companion.m5289getZeronOccac();
            this.placeOuterCoordinatorBlock = new LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1(LayoutNodeLayoutDelegate.this, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LayoutNode layoutNode2 = content[i8];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i8].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    measurePassDelegate$ui_release.isPlacedByParent = false;
                    if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        private final void forEachChildDelegate(Function1 function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    function1.invoke(content[i8].getMeasurePassDelegate$ui_release());
                    i8++;
                } while (i8 < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i8 = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !AbstractC3292y.d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode2 = content[i8];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i8 = 0;
                setPlaced$ui_release(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i8].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i8++;
                    } while (i8 < size);
                }
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LayoutNode layoutNode2 = content[i8];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m4228remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                    }
                    i8++;
                } while (i8 < size);
            }
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                int i8 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        /* renamed from: placeOuterCoordinator-f8xVGno, reason: not valid java name */
        private final void m4254placeOuterCoordinatorf8xVGno(long j8, float f8, Function1 function1) {
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                this.lastPosition = j8;
                this.lastZIndex = f8;
                this.lastLayerBlock = function1;
                this.placedOnce = true;
                this.onNodePlacedCalled = false;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                if (!LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release() && isPlaced()) {
                    LayoutNodeLayoutDelegate.this.getOuterCoordinator().m4304placeSelfApparentToRealOffsetf8xVGno(j8, f8, function1);
                    onNodePlaced$ui_release();
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                    LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                    this.placeOuterCoordinatorLayerBlock = function1;
                    this.placeOuterCoordinatorPosition = j8;
                    this.placeOuterCoordinatorZIndex = f8;
                    requireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.layoutNode, false, this.placeOuterCoordinatorBlock);
                    this.placeOuterCoordinatorLayerBlock = null;
                }
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
                return;
            }
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }

        private final void trackMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i8 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(Function1 function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    function1.invoke(content[i8].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    i8++;
                } while (i8 < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int i8 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i8;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (this.childDelegatesDirty) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i8 = 0;
                    do {
                        LayoutNode layoutNode2 = content[i8];
                        if (mutableVector.getSize() <= i8) {
                            mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        } else {
                            mutableVector.set(i8, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        }
                        i8++;
                    } while (i8 < size);
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.childDelegatesDirty = false;
                return this._childDelegates.asMutableList();
            }
            return this._childDelegates.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m4255getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return Constraints.m5111boximpl(m4143getMeasurementConstraintsmsEJaDk());
            }
            return null;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) != null) {
                return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
            }
            return null;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        public final int getPreviousPlaceOrder$ui_release() {
            return this.previousPlaceOrder;
        }

        public final float getZIndex$ui_release() {
            return this.zIndex;
        }

        public final void invalidateIntrinsicsParent(boolean z8) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i8 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        parent$ui_release2.requestRelayout$ui_release(z8);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z8, false, 2, null);
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public final boolean isPlacedByParent() {
            return this.isPlacedByParent;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = true;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i8) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i8) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(i8);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4108measureBRTryo0(long j8) {
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent$ui_release == usageByParent) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                lookaheadPassDelegate$ui_release.mo4108measureBRTryo0(j8);
            }
            trackMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            m4256remeasureBRTryo0(j8);
            return this;
        }

        public final void measureBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (lookaheadPassDelegate$ui_release != null) {
                    if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                        Constraints m4249getLastConstraintsDWUhwKw = lookaheadPassDelegate$ui_release.m4249getLastConstraintsDWUhwKw();
                        AbstractC3292y.f(m4249getLastConstraintsDWUhwKw);
                        mo4108measureBRTryo0(m4249getLastConstraintsDWUhwKw.m5129unboximpl());
                        return;
                    } else {
                        if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                            Constraints m4249getLastConstraintsDWUhwKw2 = lookaheadPassDelegate$ui_release.m4249getLastConstraintsDWUhwKw();
                            AbstractC3292y.f(m4249getLastConstraintsDWUhwKw2);
                            mo4108measureBRTryo0(m4249getLastConstraintsDWUhwKw2.m5129unboximpl());
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException("invalid lookaheadDelegate".toString());
            }
            throw new IllegalStateException("layoutNode parent is not set".toString());
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i8) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i8) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(i8);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0 && (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i8 = 0;
                do {
                    LayoutNode layoutNode = content[i8];
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                    i8++;
                } while (i8 < size);
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                AbstractC3292y.g(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!isPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder;
                        parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4109placeAtf8xVGno(long j8, float f8, Function1 function1) {
            Placeable.PlacementScope placementScope;
            this.isPlacedByParent = true;
            if (!IntOffset.m5278equalsimpl0(j8, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.layoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            boolean z8 = false;
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                NodeCoordinator wrappedBy$ui_release = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui_release();
                AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate$ui_release.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate$ui_release, IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(j8), 0.0f, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release2 != null && !lookaheadPassDelegate$ui_release2.getPlacedOnce$ui_release()) {
                z8 = true;
            }
            if (true ^ z8) {
                m4254placeOuterCoordinatorf8xVGno(j8, f8, function1);
                return;
            }
            throw new IllegalArgumentException("Error: Placement happened before lookahead.".toString());
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                mo4109placeAtf8xVGno(lookaheadPassDelegate$ui_release.m4250getLastPositionnOccac$ui_release(), lookaheadPassDelegate$ui_release.getLastZIndex$ui_release(), lookaheadPassDelegate$ui_release.getLastLayerBlock$ui_release());
                return;
            }
            throw new IllegalStateException("invalid lookaheadDelegate".toString());
        }

        /* renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m4256remeasureBRTryo0(long j8) {
            boolean z8;
            boolean z9 = true;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure$ui_release())) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                layoutNode.setCanMultiMeasure$ui_release(z8);
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() && Constraints.m5116equalsimpl0(m4143getMeasurementConstraintsmsEJaDk(), j8)) {
                    e.b(requireOwner, LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                    LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2.INSTANCE);
                this.measuredOnce = true;
                long mo4115getSizeYbymL2g = LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo4115getSizeYbymL2g();
                m4145setMeasurementConstraintsBRTryo0(j8);
                LayoutNodeLayoutDelegate.this.m4246performMeasureBRTryo0(j8);
                if (IntSize.m5319equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo4115getSizeYbymL2g(), mo4115getSizeYbymL2g) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                    z9 = false;
                }
                m4144setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
                return z9;
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (this.placedOnce) {
                    boolean isPlaced = isPlaced();
                    m4254placeOuterCoordinatorf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
                    if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                        LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                    }
                    return;
                }
                throw new IllegalStateException("replace called on unplaced item".toString());
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z8) {
            this.childDelegatesDirty = z8;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z8) {
            this.duringAlignmentLinesQuery = z8;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public void setPlaced$ui_release(boolean z8) {
            this.isPlaced = z8;
        }

        public final void setPlacedByParent$ui_release(boolean z8) {
            this.isPlacedByParent = z8;
        }

        public final boolean updateParentData() {
            if ((getParentData() == null && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
            return true;
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookaheadMeasure-BRTryo0, reason: not valid java name */
    public final void m4245performLookaheadMeasureBRTryo0(long j8) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(this, j8), 2, null);
        markLookaheadLayoutPending$ui_release();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performMeasure-BRTryo0, reason: not valid java name */
    public final void m4246performMeasureBRTryo0(long j8) {
        LayoutNode.LayoutState layoutState = this.layoutState;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState == layoutState2) {
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
            this.layoutState = layoutState3;
            this.measurePending = false;
            this.performMeasureConstraints = j8;
            LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, this.performMeasureBlock);
            if (this.layoutState == layoutState3) {
                markLayoutPending$ui_release();
                this.layoutState = layoutState2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.detachedFromParentLookaheadPass;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m4247getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m4255getLastConstraintsDWUhwKw();
    }

    /* renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m4248getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m4249getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null && (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) != null) {
            alignmentLines.reset$ui_release();
        }
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i8) {
        boolean z8;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        int i9 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i8;
        boolean z9 = false;
        if (i9 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i8 == 0) {
            z9 = true;
        }
        if (z8 != z9) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                layoutNodeLayoutDelegate = parent$ui_release.getLayoutDelegate$ui_release();
            } else {
                layoutNodeLayoutDelegate = null;
            }
            if (layoutNodeLayoutDelegate != null) {
                if (i8 == 0) {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z8) {
        if (this.coordinatesAccessedDuringModifierPlacement != z8) {
            this.coordinatesAccessedDuringModifierPlacement = z8;
            if (z8 && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (!z8 && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z8) {
        if (this.coordinatesAccessedDuringPlacement != z8) {
            this.coordinatesAccessedDuringPlacement = z8;
            if (z8 && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (!z8 && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void updateParentData() {
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, 3, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.updateParentData()) {
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, 3, null);
                    return;
                }
                return;
            }
            LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release3 != null) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, 3, null);
            }
        }
    }
}
