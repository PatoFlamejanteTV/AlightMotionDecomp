package androidx.compose.ui.layout;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;
    private CompositionContext compositionContext;
    private int currentIndex;
    private int currentPostLookaheadIndex;
    private int precomposedCount;
    private int reusableCount;
    private final LayoutNode root;
    private SubcomposeSlotReusePolicy slotReusePolicy;
    private final HashMap<LayoutNode, NodeState> nodeToNodeState = new HashMap<>();
    private final HashMap<Object, LayoutNode> slotIdToNode = new HashMap<>();
    private final Scope scope = new Scope();
    private final PostLookaheadMeasureScopeImpl postLookaheadMeasureScope = new PostLookaheadMeasureScopeImpl();
    private final HashMap<Object, LayoutNode> precomposeMap = new HashMap<>();
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, 0 == true ? 1 : 0);
    private final Map<Object, SubcomposeLayoutState.PrecomposedSlotHandle> postLookaheadPrecomposeSlotHandleMap = new LinkedHashMap();
    private final MutableVector<Object> postLookaheadComposedSlotIds = new MutableVector<>(new Object[16], 0);
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class PostLookaheadMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public PostLookaheadMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i8, int i9, Map<AlignmentLine, Integer> map, Function1 function1) {
            return this.$$delegate_0.layout(i8, i9, map, function1);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo418roundToPxR2X_6o(long j8) {
            return this.$$delegate_0.mo418roundToPxR2X_6o(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo419roundToPx0680j_4(float f8) {
            return this.$$delegate_0.mo419roundToPx0680j_4(f8);
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, InterfaceC2072n interfaceC2072n) {
            List<Measurable> list;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(obj);
            if (layoutNode != null) {
                list = layoutNode.getChildMeasurables$ui_release();
            } else {
                list = null;
            }
            if (list == null) {
                return LayoutNodeSubcompositionsState.this.postLookaheadSubcompose(obj, interfaceC2072n);
            }
            return list;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo420toDpGaN1DYA(long j8) {
            return this.$$delegate_0.mo420toDpGaN1DYA(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo421toDpu2uoSUM(float f8) {
            return this.$$delegate_0.mo421toDpu2uoSUM(f8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo423toDpSizekrfVVM(long j8) {
            return this.$$delegate_0.mo423toDpSizekrfVVM(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo424toPxR2X_6o(long j8) {
            return this.$$delegate_0.mo424toPxR2X_6o(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo425toPx0680j_4(float f8) {
            return this.$$delegate_0.mo425toPx0680j_4(f8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo426toSizeXkaWNTQ(long j8) {
            return this.$$delegate_0.mo426toSizeXkaWNTQ(j8);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo427toSp0xMU5do(float f8) {
            return this.$$delegate_0.mo427toSp0xMU5do(f8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo428toSpkPz2Gy4(float f8) {
            return this.$$delegate_0.mo428toSpkPz2Gy4(f8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo422toDpu2uoSUM(int i8) {
            return this.$$delegate_0.mo422toDpu2uoSUM(i8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo429toSpkPz2Gy4(int i8) {
            return this.$$delegate_0.mo429toSpkPz2Gy4(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            if (LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadLayingOut && LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadMeasuring) {
                return false;
            }
            return true;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i8, final int i9, final Map<AlignmentLine, Integer> map, final Function1 function1) {
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return i9;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return i8;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadDelegate lookaheadDelegate;
                    if (this.isLookingAhead() && (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) != null) {
                        function1.invoke(lookaheadDelegate.getPlacementScope());
                    } else {
                        function1.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                    }
                }
            };
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo418roundToPxR2X_6o(long j8) {
            return androidx.compose.ui.unit.a.a(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo419roundToPx0680j_4(float f8) {
            return androidx.compose.ui.unit.a.b(this, f8);
        }

        public void setDensity(float f8) {
            this.density = f8;
        }

        public void setFontScale(float f8) {
            this.fontScale = f8;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, InterfaceC2072n interfaceC2072n) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, interfaceC2072n);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo420toDpGaN1DYA(long j8) {
            return androidx.compose.ui.unit.b.a(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo421toDpu2uoSUM(float f8) {
            return androidx.compose.ui.unit.a.c(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo423toDpSizekrfVVM(long j8) {
            return androidx.compose.ui.unit.a.e(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo424toPxR2X_6o(long j8) {
            return androidx.compose.ui.unit.a.f(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo425toPx0680j_4(float f8) {
            return androidx.compose.ui.unit.a.g(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return androidx.compose.ui.unit.a.h(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo426toSizeXkaWNTQ(long j8) {
            return androidx.compose.ui.unit.a.i(this, j8);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo427toSp0xMU5do(float f8) {
            return androidx.compose.ui.unit.b.b(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo428toSpkPz2Gy4(float f8) {
            return androidx.compose.ui.unit.a.j(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo422toDpu2uoSUM(int i8) {
            return androidx.compose.ui.unit.a.d(this, i8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo429toSpkPz2Gy4(int i8) {
            return androidx.compose.ui.unit.a.k(this, i8);
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    private final MeasureResult createMeasureResult(final MeasureResult measureResult, final Function0 function0) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasureResult$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                function0.invoke();
            }
        };
    }

    private final LayoutNode createNodeAt(int i8) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
        this.root.insertAt$ui_release(i8, layoutNode);
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
        return layoutNode;
    }

    private final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            ReusableComposition composition = ((NodeState) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.removeAll$ui_release();
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInPostLookahead() {
        AbstractC1435t.I(this.postLookaheadPrecomposeSlotHandleMap.entrySet(), new LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1(this));
    }

    private final Object getSlotIdAtIndex(int i8) {
        NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i8));
        AbstractC3292y.f(nodeState);
        return nodeState.getSlotId();
    }

    private final void ignoreRemeasureRequests(Function0 function0) {
        LayoutNode layoutNode = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        function0.invoke();
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
    }

    private final void markActiveNodesAsReused(boolean z8) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                for (int i8 = 0; i8 < size; i8++) {
                    try {
                        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i8);
                        NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                        if (nodeState != null && nodeState.getActive()) {
                            resetLayoutState(layoutNode);
                            if (z8) {
                                ReusableComposition composition = nodeState.getComposition();
                                if (composition != null) {
                                    composition.deactivate();
                                }
                                nodeState.setActiveState(SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null));
                            } else {
                                nodeState.setActive(false);
                            }
                            nodeState.setSlotId(SubcomposeLayoutKt.access$getReusedSlotId$p());
                        }
                    } catch (Throwable th) {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        throw th;
                    }
                }
                I i9 = I.f8786a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                this.slotIdToNode.clear();
            } catch (Throwable th2) {
                createNonObservableSnapshot.dispose();
                throw th2;
            }
        }
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int i8, int i9, int i10) {
        LayoutNode layoutNode = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        this.root.move$ui_release(i8, i9, i10);
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        layoutNodeSubcompositionsState.move(i8, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> postLookaheadSubcompose(Object obj, InterfaceC2072n interfaceC2072n) {
        if (this.postLookaheadComposedSlotIds.getSize() >= this.currentPostLookaheadIndex) {
            int size = this.postLookaheadComposedSlotIds.getSize();
            int i8 = this.currentPostLookaheadIndex;
            if (size == i8) {
                this.postLookaheadComposedSlotIds.add(obj);
            } else {
                this.postLookaheadComposedSlotIds.set(i8, obj);
            }
            this.currentPostLookaheadIndex++;
            if (!this.precomposeMap.containsKey(obj)) {
                this.postLookaheadPrecomposeSlotHandleMap.put(obj, precompose(obj, interfaceC2072n));
                if (this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    this.root.requestLookaheadRelayout$ui_release(true);
                } else {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, 2, null);
                }
            }
            LayoutNode layoutNode = this.precomposeMap.get(obj);
            if (layoutNode != null) {
                List<LayoutNodeLayoutDelegate.MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
                int size2 = childDelegates$ui_release.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    childDelegates$ui_release.get(i9).markDetachedFromParentLookaheadPass$ui_release();
                }
                return childDelegates$ui_release;
            }
            return AbstractC1435t.m();
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final ReusableComposition subcomposeInto(ReusableComposition reusableComposition, LayoutNode layoutNode, boolean z8, CompositionContext compositionContext, InterfaceC2072n interfaceC2072n) {
        if (reusableComposition == null || reusableComposition.isDisposed()) {
            reusableComposition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext);
        }
        if (!z8) {
            reusableComposition.setContent(interfaceC2072n);
        } else {
            reusableComposition.setContentWithReuse(interfaceC2072n);
        }
        return reusableComposition;
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i8;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i9 = size - this.reusableCount;
        int i10 = size - 1;
        int i11 = i10;
        while (true) {
            if (i11 >= i9) {
                if (AbstractC3292y.d(getSlotIdAtIndex(i11), obj)) {
                    i8 = i11;
                    break;
                }
                i11--;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 == -1) {
            while (i10 >= i9) {
                NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i10));
                AbstractC3292y.f(nodeState);
                NodeState nodeState2 = nodeState;
                if (nodeState2.getSlotId() != SubcomposeLayoutKt.access$getReusedSlotId$p() && !this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    i10--;
                } else {
                    nodeState2.setSlotId(obj);
                    i11 = i10;
                    i8 = i11;
                    break;
                }
            }
            i11 = i10;
        }
        if (i8 == -1) {
            return null;
        }
        if (i11 != i9) {
            move(i11, i9, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i9);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        AbstractC3292y.f(nodeState3);
        NodeState nodeState4 = nodeState3;
        nodeState4.setActiveState(SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null));
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    public final MeasurePolicy createMeasurePolicy(final InterfaceC2072n interfaceC2072n) {
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo109measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j8) {
                final int i8;
                LayoutNodeSubcompositionsState.PostLookaheadMeasureScopeImpl postLookaheadMeasureScopeImpl;
                final int i9;
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui_release() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult measureResult = (MeasureResult) interfaceC2072n.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m5111boximpl(j8));
                    i8 = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return measureResult.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return measureResult.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return measureResult.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            int i10;
                            layoutNodeSubcompositionsState.currentIndex = i8;
                            measureResult.placeChildren();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            i10 = layoutNodeSubcompositionsState2.currentIndex;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(i10);
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex = 0;
                InterfaceC2072n interfaceC2072n2 = interfaceC2072n;
                postLookaheadMeasureScopeImpl = LayoutNodeSubcompositionsState.this.postLookaheadMeasureScope;
                final MeasureResult measureResult2 = (MeasureResult) interfaceC2072n2.invoke(postLookaheadMeasureScopeImpl, Constraints.m5111boximpl(j8));
                i9 = LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResult2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResult2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResult2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentPostLookaheadIndex = i9;
                        measureResult2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInPostLookahead();
                    }
                };
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int i8) {
        boolean z8 = false;
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (i8 <= size) {
            this.reusableSlotIdsSet.clear();
            if (i8 <= size) {
                int i9 = i8;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i9));
                    if (i9 == size) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                boolean z9 = false;
                while (size >= i8) {
                    try {
                        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(size);
                        NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                        AbstractC3292y.f(nodeState);
                        NodeState nodeState2 = nodeState;
                        Object slotId = nodeState2.getSlotId();
                        if (this.reusableSlotIdsSet.contains(slotId)) {
                            this.reusableCount++;
                            if (nodeState2.getActive()) {
                                resetLayoutState(layoutNode);
                                nodeState2.setActive(false);
                                z9 = true;
                            }
                        } else {
                            LayoutNode layoutNode2 = this.root;
                            LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
                            this.nodeToNodeState.remove(layoutNode);
                            ReusableComposition composition = nodeState2.getComposition();
                            if (composition != null) {
                                composition.dispose();
                            }
                            this.root.removeAt$ui_release(size, 1);
                            LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
                        }
                        this.slotIdToNode.remove(slotId);
                        size--;
                    } catch (Throwable th) {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        throw th;
                    }
                }
                I i10 = I.f8786a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                z8 = z9;
            } catch (Throwable th2) {
                createNonObservableSnapshot.dispose();
                throw th2;
            }
        }
        if (z8) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui_release().size()) {
            Iterator<Map.Entry<LayoutNode, NodeState>> it = this.nodeToNodeState.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().setForceRecompose(true);
            }
            if (!this.root.getMeasurePending$ui_release()) {
                LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
            }
        }
    }

    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.nodeToNodeState.size() == size) {
            if ((size - this.reusableCount) - this.precomposedCount >= 0) {
                if (this.precomposeMap.size() == this.precomposedCount) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(final Object obj, InterfaceC2072n interfaceC2072n) {
        if (!this.root.isAttached()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public /* synthetic */ int getPlaceablesCount() {
                    return o.a(this);
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
                public /* synthetic */ void mo4124premeasure0kLqBqw(int i8, long j8) {
                    o.b(this, i8, j8);
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            this.postLookaheadPrecomposeSlotHandleMap.remove(obj);
            HashMap<Object, LayoutNode> hashMap = this.precomposeMap;
            LayoutNode layoutNode = hashMap.get(obj);
            if (layoutNode == null) {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNode), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNode = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                hashMap.put(obj, layoutNode);
            }
            subcompose(layoutNode, obj, interfaceC2072n);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                HashMap hashMap2;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.remove(obj);
                if (layoutNode2 != null) {
                    i8 = LayoutNodeSubcompositionsState.this.precomposedCount;
                    if (i8 > 0) {
                        int indexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
                        int size = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                        i9 = LayoutNodeSubcompositionsState.this.precomposedCount;
                        if (indexOf >= size - i9) {
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                            i10 = layoutNodeSubcompositionsState.reusableCount;
                            layoutNodeSubcompositionsState.reusableCount = i10 + 1;
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                            i11 = layoutNodeSubcompositionsState2.precomposedCount;
                            layoutNodeSubcompositionsState2.precomposedCount = i11 - 1;
                            int size2 = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                            i12 = LayoutNodeSubcompositionsState.this.precomposedCount;
                            int i14 = size2 - i12;
                            i13 = LayoutNodeSubcompositionsState.this.reusableCount;
                            int i15 = i14 - i13;
                            LayoutNodeSubcompositionsState.this.move(indexOf, i15, 1);
                            LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(i15);
                            return;
                        }
                        throw new IllegalStateException("Item is not in pre-composed item range".toString());
                    }
                    throw new IllegalStateException("No pre-composed items to dispose".toString());
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                HashMap hashMap2;
                List<LayoutNode> children$ui_release;
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.get(obj);
                if (layoutNode2 != null && (children$ui_release = layoutNode2.getChildren$ui_release()) != null) {
                    return children$ui_release.size();
                }
                return 0;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw */
            public void mo4124premeasure0kLqBqw(int i8, long j8) {
                HashMap hashMap2;
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.get(obj);
                if (layoutNode2 != null && layoutNode2.isAttached()) {
                    int size = layoutNode2.getChildren$ui_release().size();
                    if (i8 >= 0 && i8 < size) {
                        if (!layoutNode2.isPlaced()) {
                            LayoutNode layoutNode3 = LayoutNodeSubcompositionsState.this.root;
                            layoutNode3.ignoreRemeasureRequests = true;
                            LayoutNodeKt.requireOwner(layoutNode2).mo4376measureAndLayout0kLqBqw(layoutNode2.getChildren$ui_release().get(i8), j8);
                            layoutNode3.ignoreRemeasureRequests = false;
                            return;
                        }
                        throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
                    }
                    throw new IndexOutOfBoundsException("Index (" + i8 + ") is out of bound of [0, " + size + ')');
                }
            }
        };
    }

    public final void setCompositionContext(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
        }
    }

    public final List<Measurable> subcompose(Object obj, InterfaceC2072n interfaceC2072n) {
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (layoutState$ui_release != layoutState && layoutState$ui_release != LayoutNode.LayoutState.LayingOut && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui_release != LayoutNode.LayoutState.LookaheadLayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        HashMap<Object, LayoutNode> hashMap = this.slotIdToNode;
        LayoutNode layoutNode = hashMap.get(obj);
        if (layoutNode == null) {
            layoutNode = this.precomposeMap.remove(obj);
            if (layoutNode != null) {
                int i8 = this.precomposedCount;
                if (i8 > 0) {
                    this.precomposedCount = i8 - 1;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode == null) {
                    layoutNode = createNodeAt(this.currentIndex);
                }
            }
            hashMap.put(obj, layoutNode);
        }
        LayoutNode layoutNode2 = layoutNode;
        if (AbstractC1435t.p0(this.root.getFoldedChildren$ui_release(), this.currentIndex) != layoutNode2) {
            int indexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
            int i9 = this.currentIndex;
            if (indexOf < i9) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i9 != indexOf) {
                move$default(this, indexOf, i9, 0, 4, null);
            }
        }
        this.currentIndex++;
        subcompose(layoutNode2, obj, interfaceC2072n);
        if (layoutState$ui_release != layoutState && layoutState$ui_release != LayoutNode.LayoutState.LayingOut) {
            return layoutNode2.getChildLookaheadMeasurables$ui_release();
        }
        return layoutNode2.getChildMeasurables$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class NodeState {
        private MutableState<Boolean> activeState;
        private ReusableComposition composition;
        private InterfaceC2072n content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private Object slotId;

        public NodeState(Object obj, InterfaceC2072n interfaceC2072n, ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = interfaceC2072n;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        public final ReusableComposition getComposition() {
            return this.composition;
        }

        public final InterfaceC2072n getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActive(boolean z8) {
            this.activeState.setValue(Boolean.valueOf(z8));
        }

        public final void setActiveState(MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposition(ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(InterfaceC2072n interfaceC2072n) {
            this.content = interfaceC2072n;
        }

        public final void setForceRecompose(boolean z8) {
            this.forceRecompose = z8;
        }

        public final void setForceReuse(boolean z8) {
            this.forceReuse = z8;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, InterfaceC2072n interfaceC2072n, ReusableComposition reusableComposition, int i8, AbstractC3284p abstractC3284p) {
            this(obj, interfaceC2072n, (i8 & 4) != 0 ? null : reusableComposition);
        }
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, InterfaceC2072n interfaceC2072n) {
        HashMap<LayoutNode, NodeState> hashMap = this.nodeToNodeState;
        NodeState nodeState = hashMap.get(layoutNode);
        if (nodeState == null) {
            nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m4098getLambda1$ui_release(), null, 4, null);
            hashMap.put(layoutNode, nodeState);
        }
        NodeState nodeState2 = nodeState;
        ReusableComposition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState2.getContent() != interfaceC2072n || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(interfaceC2072n);
            subcompose(layoutNode, nodeState2);
            nodeState2.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode layoutNode, NodeState nodeState) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                LayoutNode layoutNode2 = this.root;
                LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
                InterfaceC2072n content = nodeState.getContent();
                ReusableComposition composition = nodeState.getComposition();
                CompositionContext compositionContext = this.compositionContext;
                if (compositionContext != null) {
                    nodeState.setComposition(subcomposeInto(composition, layoutNode, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new LayoutNodeSubcompositionsState$subcompose$3$1$1(nodeState, content))));
                    nodeState.setForceReuse(false);
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
                    I i8 = I.f8786a;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }
}
