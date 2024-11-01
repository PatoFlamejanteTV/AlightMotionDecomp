package androidx.compose.ui.node;

import Q5.p;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public PostponedRequest(LayoutNode layoutNode, boolean z8, boolean z9) {
            this.node = layoutNode;
            this.isLookahead = z8;
            this.isForced = z9;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        this.root = layoutNode;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        if (companion.getEnableExtraAssertions()) {
            layoutTreeConsistencyChecker = new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList());
        } else {
            layoutTreeConsistencyChecker = null;
        }
        this.consistencyChecker = layoutTreeConsistencyChecker;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                content[i8].onLayoutComplete();
                i8++;
            } while (i8 < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z8);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA */
    private final boolean m4268doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m4227lookaheadRemeasure_Sx5XlM$ui_release$default;
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        if (constraints != null) {
            m4227lookaheadRemeasure_Sx5XlM$ui_release$default = layoutNode.m4231lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            m4227lookaheadRemeasure_Sx5XlM$ui_release$default = LayoutNode.m4227lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m4227lookaheadRemeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m4227lookaheadRemeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: doRemeasure-sdFAvZA */
    private final boolean m4269doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m4228remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            m4228remeasure_Sx5XlM$ui_release$default = layoutNode.m4232remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m4228remeasure_Sx5XlM$ui_release$default = LayoutNode.m4228remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m4228remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m4228remeasure_Sx5XlM$ui_release$default;
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z8) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode2 = content[i8];
                if ((!z8 && getMeasureAffectsParent(layoutNode2)) || (z8 && getMeasureAffectsParentLookahead(layoutNode2))) {
                    if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z8) {
                        if (layoutNode2.getLookaheadMeasurePending$ui_release() && this.relayoutNodes.contains(layoutNode2, true)) {
                            remeasureAndRelayoutIfNeeded(layoutNode2, true, false);
                        } else {
                            forceMeasureTheSubtree(layoutNode2, true);
                        }
                    }
                    onlyRemeasureIfScheduled(layoutNode2, z8);
                    if (!measurePending(layoutNode2, z8)) {
                        forceMeasureTheSubtreeInternal(layoutNode2, z8);
                    }
                }
                i8++;
            } while (i8 < size);
        }
        onlyRemeasureIfScheduled(layoutNode, z8);
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        if (layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode)) {
            return true;
        }
        return false;
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(layoutNode)) {
            return true;
        }
        return false;
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        if (layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock && !layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return false;
        }
        return true;
    }

    private final boolean getMeasureAffectsParentLookahead(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        if (lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z8) {
        if (z8) {
            return layoutNode.getLookaheadMeasurePending$ui_release();
        }
        return layoutNode.getMeasurePending$ui_release();
    }

    private final void onlyRemeasureIfScheduled(LayoutNode layoutNode, boolean z8) {
        if (measurePending(layoutNode, z8) && this.relayoutNodes.contains(layoutNode, z8)) {
            remeasureAndRelayoutIfNeeded(layoutNode, z8, false);
        }
    }

    private final void performMeasureAndLayout(Function0 function0) {
        if (this.root.isAttached()) {
            if (this.root.isPlaced()) {
                if (!this.duringMeasureLayout) {
                    if (this.rootConstraints != null) {
                        this.duringMeasureLayout = true;
                        try {
                            function0.invoke();
                            AbstractC3290w.b(1);
                            this.duringMeasureLayout = false;
                            AbstractC3290w.a(1);
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.assertConsistent();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            AbstractC3290w.b(1);
                            this.duringMeasureLayout = false;
                            AbstractC3290w.a(1);
                            throw th;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
    }

    private final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z8, boolean z9) {
        Constraints constraints;
        boolean z10;
        boolean m4269doRemeasuresdFAvZA;
        LayoutNode parent$ui_release;
        int i8 = 0;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (!layoutNode.isPlaced() && !layoutNode.isPlacedByParent() && !getCanAffectParent(layoutNode) && !AbstractC3292y.d(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (!layoutNode.getLookaheadMeasurePending$ui_release() && !layoutNode.getMeasurePending$ui_release()) {
            m4269doRemeasuresdFAvZA = false;
            z10 = false;
        } else {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                AbstractC3292y.f(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release() && z8) {
                z10 = m4268doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
            } else {
                z10 = false;
            }
            m4269doRemeasuresdFAvZA = m4269doRemeasuresdFAvZA(layoutNode, constraints);
        }
        if (z9) {
            if ((z10 || layoutNode.getLookaheadLayoutPending$ui_release()) && AbstractC3292y.d(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && z8) {
                layoutNode.lookaheadReplace$ui_release();
            }
            if (layoutNode.getLayoutPending$ui_release() && (layoutNode == this.root || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.isPlaced() && layoutNode.isPlacedByParent()))) {
                if (layoutNode == this.root) {
                    layoutNode.place$ui_release(0, 0);
                } else {
                    layoutNode.replace$ui_release();
                }
                this.onPositionedDispatcher.onNodePositioned(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
        if (this.postponedMeasureRequests.isNotEmpty()) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            int size = mutableVector.getSize();
            if (size > 0) {
                PostponedRequest[] content = mutableVector.getContent();
                do {
                    PostponedRequest postponedRequest = content[i8];
                    if (postponedRequest.getNode().isAttached()) {
                        if (!postponedRequest.isLookahead()) {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        } else {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        }
                    }
                    i8++;
                } while (i8 < size);
            }
            this.postponedMeasureRequests.clear();
        }
        return m4269doRemeasuresdFAvZA;
    }

    static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        if ((i8 & 4) != 0) {
            z9 = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z8, z9);
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode2 = content[i8];
                if (getMeasureAffectsParent(layoutNode2)) {
                    if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                        remeasureOnly(layoutNode2, true);
                    } else {
                        remeasureLookaheadRootsInSubtree(layoutNode2);
                    }
                }
                i8++;
            } while (i8 < size);
        }
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z8) {
        Constraints constraints;
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            AbstractC3292y.f(constraints);
        } else {
            constraints = null;
        }
        if (z8) {
            m4268doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m4269doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z8);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z8);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z8);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z8);
    }

    public final void dispatchOnPositionedCallbacks(boolean z8) {
        if (z8) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z8) {
        if (this.relayoutNodes.isEmpty(z8)) {
            return;
        }
        if (this.duringMeasureLayout) {
            if (!measurePending(layoutNode, z8)) {
                forceMeasureTheSubtreeInternal(layoutNode, z8);
                return;
            }
            throw new IllegalArgumentException("node not yet measured".toString());
        }
        throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass".toString());
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean measureAndLayout(Function0 function0) {
        boolean z8;
        if (this.root.isAttached()) {
            if (this.root.isPlaced()) {
                if (!this.duringMeasureLayout) {
                    boolean z9 = false;
                    if (this.rootConstraints != null) {
                        this.duringMeasureLayout = true;
                        try {
                            if (this.relayoutNodes.isNotEmpty()) {
                                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                                z8 = false;
                                while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                                    boolean z10 = !depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                                    LayoutNode pop = (z10 ? depthSortedSetsForDifferentPasses.lookaheadSet : depthSortedSetsForDifferentPasses.set).pop();
                                    boolean remeasureAndRelayoutIfNeeded$default = remeasureAndRelayoutIfNeeded$default(this, pop, z10, false, 4, null);
                                    if (pop == this.root && remeasureAndRelayoutIfNeeded$default) {
                                        z8 = true;
                                    }
                                }
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            } else {
                                z8 = false;
                            }
                            this.duringMeasureLayout = false;
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.assertConsistent();
                            }
                            z9 = z8;
                        } catch (Throwable th) {
                            this.duringMeasureLayout = false;
                            throw th;
                        }
                    }
                    callOnLayoutCompletedListeners();
                    return z9;
                }
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* renamed from: measureAndLayout-0kLqBqw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4270measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3.isDeactivated()
            if (r0 == 0) goto L7
            return
        L7:
            androidx.compose.ui.node.LayoutNode r0 = r2.root
            boolean r0 = kotlin.jvm.internal.AbstractC3292y.d(r3, r0)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto La4
            androidx.compose.ui.node.LayoutNode r0 = r2.root
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L98
            androidx.compose.ui.node.LayoutNode r0 = r2.root
            boolean r0 = r0.isPlaced()
            if (r0 == 0) goto L8c
            boolean r0 = r2.duringMeasureLayout
            r0 = r0 ^ r1
            if (r0 == 0) goto L80
            androidx.compose.ui.unit.Constraints r0 = r2.rootConstraints
            if (r0 == 0) goto L7c
            r2.duringMeasureLayout = r1
            r0 = 0
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r1 = r2.relayoutNodes     // Catch: java.lang.Throwable -> L4a
            r1.remove(r3)     // Catch: java.lang.Throwable -> L4a
            androidx.compose.ui.unit.Constraints r1 = androidx.compose.ui.unit.Constraints.m5111boximpl(r4)     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r2.m4268doLookaheadRemeasuresdFAvZA(r3, r1)     // Catch: java.lang.Throwable -> L4a
            androidx.compose.ui.unit.Constraints r4 = androidx.compose.ui.unit.Constraints.m5111boximpl(r4)     // Catch: java.lang.Throwable -> L4a
            r2.m4269doRemeasuresdFAvZA(r3, r4)     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L4c
            boolean r4 = r3.getLookaheadLayoutPending$ui_release()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L5b
            goto L4c
        L4a:
            r3 = move-exception
            goto L79
        L4c:
            java.lang.Boolean r4 = r3.isPlacedInLookahead()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4a
            boolean r4 = kotlin.jvm.internal.AbstractC3292y.d(r4, r5)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L5b
            r3.lookaheadReplace$ui_release()     // Catch: java.lang.Throwable -> L4a
        L5b:
            boolean r4 = r3.getLayoutPending$ui_release()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L6f
            boolean r4 = r3.isPlaced()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L6f
            r3.replace$ui_release()     // Catch: java.lang.Throwable -> L4a
            androidx.compose.ui.node.OnPositionedDispatcher r4 = r2.onPositionedDispatcher     // Catch: java.lang.Throwable -> L4a
            r4.onNodePositioned(r3)     // Catch: java.lang.Throwable -> L4a
        L6f:
            r2.duringMeasureLayout = r0
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r3 = r2.consistencyChecker
            if (r3 == 0) goto L7c
            r3.assertConsistent()
            goto L7c
        L79:
            r2.duringMeasureLayout = r0
            throw r3
        L7c:
            r2.callOnLayoutCompletedListeners()
            return
        L80:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "performMeasureAndLayout called during measure layout"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L8c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "performMeasureAndLayout called with unplaced root"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L98:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "performMeasureAndLayout called with unattached root"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        La4:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "measureAndLayout called on root"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.m4270measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode, long):void");
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (this.root.isAttached()) {
                if (this.root.isPlaced()) {
                    if (!this.duringMeasureLayout) {
                        if (this.rootConstraints != null) {
                            this.duringMeasureLayout = true;
                            try {
                                if (!this.relayoutNodes.isEmpty(true)) {
                                    if (this.root.getLookaheadRoot$ui_release() != null) {
                                        remeasureOnly(this.root, true);
                                    } else {
                                        remeasureLookaheadRootsInSubtree(this.root);
                                    }
                                }
                                remeasureOnly(this.root, false);
                                this.duringMeasureLayout = false;
                                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                                if (layoutTreeConsistencyChecker != null) {
                                    layoutTreeConsistencyChecker.assertConsistent();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                this.duringMeasureLayout = false;
                                throw th;
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
                }
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
    }

    public final void onNodeDetached(LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean z8) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4 && i8 != 5) {
                        throw new p();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z8) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker == null) {
                    return false;
                }
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (AbstractC3292y.d(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, true);
            } else if (layoutNode.isPlaced() && ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, false);
            }
            if (this.duringMeasureLayout) {
                return false;
            }
            return true;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 == null) {
            return false;
        }
        layoutTreeConsistencyChecker2.assertConsistent();
        return false;
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean z8) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            int i8 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
            if (i8 == 1) {
                return false;
            }
            if (i8 != 2 && i8 != 3 && i8 != 4) {
                if (i8 == 5) {
                    if (layoutNode.getLookaheadMeasurePending$ui_release() && !z8) {
                        return false;
                    }
                    layoutNode.markLookaheadMeasurePending$ui_release();
                    layoutNode.markMeasurePending$ui_release();
                    if (layoutNode.isDeactivated()) {
                        return false;
                    }
                    if ((!AbstractC3292y.d(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode)) || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                        if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release2 = layoutNode.getParent$ui_release()) == null || !parent$ui_release2.getMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                    } else {
                        this.relayoutNodes.add(layoutNode, true);
                    }
                    if (this.duringMeasureLayout) {
                        return false;
                    }
                    return true;
                }
                throw new p();
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z8));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope".toString());
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z8) {
        LayoutNode parent$ui_release;
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i8 != 1 && i8 != 2 && i8 != 3 && i8 != 4) {
            if (i8 == 5) {
                if (!z8 && layoutNode.isPlaced() == layoutNode.isPlacedByParent() && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } else {
                    layoutNode.markLayoutPending$ui_release();
                    if (!layoutNode.isDeactivated()) {
                        if (layoutNode.isPlacedByParent() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                        if (!this.duringMeasureLayout) {
                            return true;
                        }
                    }
                }
            } else {
                throw new p();
            }
        } else {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
        }
        return false;
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z8) {
        LayoutNode parent$ui_release;
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3 && i8 != 4) {
                if (i8 == 5) {
                    if (!layoutNode.getMeasurePending$ui_release() || z8) {
                        layoutNode.markMeasurePending$ui_release();
                        if (!layoutNode.isDeactivated()) {
                            if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending$ui_release())) {
                                this.relayoutNodes.add(layoutNode, false);
                            }
                            if (!this.duringMeasureLayout) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new p();
                }
            } else {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z8));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
        return false;
    }

    /* renamed from: updateRootConstraints-BRTryo0 */
    public final void m4271updateRootConstraintsBRTryo0(long j8) {
        boolean m5116equalsimpl0;
        Constraints constraints = this.rootConstraints;
        boolean z8 = false;
        if (constraints == null) {
            m5116equalsimpl0 = false;
        } else {
            m5116equalsimpl0 = Constraints.m5116equalsimpl0(constraints.m5129unboximpl(), j8);
        }
        if (!m5116equalsimpl0) {
            if (!this.duringMeasureLayout) {
                this.rootConstraints = Constraints.m5111boximpl(j8);
                if (this.root.getLookaheadRoot$ui_release() != null) {
                    this.root.markLookaheadMeasurePending$ui_release();
                }
                this.root.markMeasurePending$ui_release();
                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                LayoutNode layoutNode = this.root;
                if (layoutNode.getLookaheadRoot$ui_release() != null) {
                    z8 = true;
                }
                depthSortedSetsForDifferentPasses.add(layoutNode, z8);
                return;
            }
            throw new IllegalArgumentException("updateRootConstraints called while measuring".toString());
        }
    }
}
