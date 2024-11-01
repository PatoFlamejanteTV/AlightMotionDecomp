package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.W0;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import c6.InterfaceC2072n;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private SemanticsConfiguration _collapsedSemantics;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private CompositionLocalMap compositionLocalMap;
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private final IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isDeactivated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;
    private final NodeChain nodes;
    private Function1 onAttach;
    private Function1 onDetach;
    private Owner owner;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo109measure3p2s80s(MeasureScope measureScope, List list, long j8) {
            return (MeasureResult) m4234measure3p2s80s(measureScope, (List<? extends Measurable>) list, j8);
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m4234measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j8) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };
    private static final Function0 Constructor = LayoutNode$Companion$Constructor$1.INSTANCE;
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public /* synthetic */ float getMaximumFlingVelocity() {
            return W0.a(this);
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo4233getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m5263getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int ZComparator$lambda$39;
            ZComparator$lambda$39 = LayoutNode.ZComparator$lambda$39((LayoutNode) obj, (LayoutNode) obj2);
            return ZComparator$lambda$39;
        }
    };

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Function0 getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return ((Number) m4235maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i8)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return ((Number) m4236maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i8)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return ((Number) m4237minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i8)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return ((Number) m4238minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i8)).intValue();
        }

        /* renamed from: maxIntrinsicHeight */
        public Void m4235maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: maxIntrinsicWidth */
        public Void m4236maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicHeight */
        public Void m4237minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicWidth */
        public Void m4238minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* loaded from: classes.dex */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    public static final int ZComparator$lambda$39(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode.getZIndex() == layoutNode2.getZIndex()) {
            return AbstractC3292y.k(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release());
        }
        return Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    public static final /* synthetic */ void access$setIgnoreRemeasureRequests$p(LayoutNode layoutNode, boolean z8) {
        layoutNode.ignoreRemeasureRequests = z8;
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode = content[i8];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i8++;
            } while (i8 < size);
        }
    }

    private final String debugTreeToString(int i8) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                sb.append(content[i10].debugTreeToString(i8 + 1));
                i10++;
            } while (i10 < size);
        }
        String sb2 = sb.toString();
        if (i8 == 0) {
            String substring = sb2.substring(0, sb2.length() - 1);
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return sb2;
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return layoutNode.debugTreeToString(i8);
    }

    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        OwnedLayer ownedLayer;
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this._innerLayerCoordinator = null;
            while (true) {
                if (AbstractC3292y.d(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if (innerCoordinator$ui_release != null) {
                    ownedLayer = innerCoordinator$ui_release.getLayer();
                } else {
                    ownedLayer = null;
                }
                if (ownedLayer != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                if (innerCoordinator$ui_release != null) {
                    innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy$ui_release();
                } else {
                    innerCoordinator$ui_release = null;
                }
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator != null && nodeCoordinator.getLayer() == null) {
            throw new IllegalStateException("layer was not set".toString());
        }
        return nodeCoordinator;
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m4225hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j8, HitTestResult hitTestResult, boolean z8, boolean z9, int i8, Object obj) {
        boolean z10;
        boolean z11;
        if ((i8 & 4) != 0) {
            z10 = false;
        } else {
            z10 = z8;
        }
        if ((i8 & 8) != 0) {
            z11 = true;
        } else {
            z11 = z9;
        }
        layoutNode.m4229hitTestM_7yMNQ$ui_release(j8, hitTestResult, z10, z11);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m4226hitTestSemanticsM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j8, HitTestResult hitTestResult, boolean z8, boolean z9, int i8, Object obj) {
        boolean z10;
        boolean z11;
        if ((i8 & 4) != 0) {
            z10 = true;
        } else {
            z10 = z8;
        }
        if ((i8 & 8) != 0) {
            z11 = true;
        } else {
            z11 = z9;
        }
        layoutNode.m4230hitTestSemanticsM_7yMNQ$ui_release(j8, hitTestResult, z10, z11);
    }

    private final void invalidateFocusOnAttach() {
        boolean z8;
        boolean z9;
        if (this.nodes.has$ui_release(NodeKind.m4320constructorimpl(1024) | NodeKind.m4320constructorimpl(2048) | NodeKind.m4320constructorimpl(4096))) {
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                boolean z10 = false;
                if ((NodeKind.m4320constructorimpl(1024) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((NodeKind.m4320constructorimpl(2048) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z11 = z8 | z9;
                if ((NodeKind.m4320constructorimpl(4096) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z10 = true;
                }
                if (z11 | z10) {
                    NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
                }
            }
        }
    }

    private final void invalidateFocusOnDetach() {
        NodeChain nodeChain = this.nodes;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
        if ((nodeChain.getAggregateChildKindSet() & m4320constructorimpl) != 0) {
            for (Modifier.Node tail$ui_release = nodeChain.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                    Modifier.Node node = tail$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                            if (focusTargetNode.getFocusState().isFocused()) {
                                LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                                focusTargetNode.scheduleInvalidationForFocusEvents$ui_release();
                            }
                        } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i8 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        layoutNode.invalidateSubtree(z8);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (this.isVirtual && (layoutNode = this._foldedParent) != null) {
            layoutNode.invalidateUnfoldedVirtualChildren();
        }
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m4227lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m4248getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m4231lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                int i8 = 0;
                do {
                    content[i8].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i8++;
                } while (i8 < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i8 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = content[i8];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i8++;
                } while (i8 < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m4228remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m4247getLastConstraintsDWUhwKw();
        }
        return layoutNode.m4232remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z8);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z8, z9);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        layoutNode.requestRelayout$ui_release(z8);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        layoutNode.requestRemeasure$ui_release(z8, z9);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (!AbstractC3292y.d(layoutNode, this.lookaheadRoot)) {
            this.lookaheadRoot = layoutNode;
            if (layoutNode != null) {
                this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
                NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
                for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !AbstractC3292y.d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                    outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
                }
            }
            invalidateMeasurements$ui_release();
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        if (this.nodes.m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(4)) && !this.nodes.m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((NodeKind.m4320constructorimpl(2) & head$ui_release.getKindSet$ui_release()) != 0 && DelegatableNodeKt.m4203requireCoordinator64DMado(head$ui_release, NodeKind.m4320constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m4320constructorimpl(4) & head$ui_release.getKindSet$ui_release()) != 0) {
                return true;
            }
        }
        return true;
    }

    public final void attach$ui_release(Owner owner) {
        int i8;
        LayoutNode layoutNode;
        Owner owner2;
        Owner owner3;
        int i9 = 0;
        NodeCoordinator nodeCoordinator = null;
        String str = null;
        if (this.owner == null) {
            LayoutNode layoutNode2 = this._foldedParent;
            if (layoutNode2 != null) {
                if (layoutNode2 != null) {
                    owner2 = layoutNode2.owner;
                } else {
                    owner2 = null;
                }
                if (!AbstractC3292y.d(owner2, owner)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attaching to a different owner(");
                    sb.append(owner);
                    sb.append(") than the parent's owner(");
                    LayoutNode parent$ui_release = getParent$ui_release();
                    if (parent$ui_release != null) {
                        owner3 = parent$ui_release.owner;
                    } else {
                        owner3 = null;
                    }
                    sb.append(owner3);
                    sb.append("). This tree: ");
                    sb.append(debugTreeToString$default(this, 0, 1, null));
                    sb.append(" Parent tree: ");
                    LayoutNode layoutNode3 = this._foldedParent;
                    if (layoutNode3 != null) {
                        str = debugTreeToString$default(layoutNode3, 0, 1, null);
                    }
                    sb.append(str);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            LayoutNode parent$ui_release2 = getParent$ui_release();
            if (parent$ui_release2 == null) {
                getMeasurePassDelegate$ui_release().setPlaced$ui_release(true);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
                if (lookaheadPassDelegate$ui_release != null) {
                    lookaheadPassDelegate$ui_release.setPlaced(true);
                }
            }
            NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
            if (parent$ui_release2 != null) {
                nodeCoordinator = parent$ui_release2.getInnerCoordinator$ui_release();
            }
            outerCoordinator$ui_release.setWrappedBy$ui_release(nodeCoordinator);
            this.owner = owner;
            if (parent$ui_release2 != null) {
                i8 = parent$ui_release2.depth;
            } else {
                i8 = -1;
            }
            this.depth = i8 + 1;
            if (this.nodes.m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(8))) {
                invalidateSemantics$ui_release();
            }
            owner.onAttach(this);
            if (this.isVirtualLookaheadRoot) {
                setLookaheadRoot(this);
            } else {
                LayoutNode layoutNode4 = this._foldedParent;
                if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                    layoutNode = this.lookaheadRoot;
                }
                setLookaheadRoot(layoutNode);
            }
            if (!isDeactivated()) {
                this.nodes.markAsAttached();
            }
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                do {
                    content[i9].attach$ui_release(owner);
                    i9++;
                } while (i9 < size);
            }
            if (!isDeactivated()) {
                this.nodes.runAttachLifecycle();
            }
            invalidateMeasurements$ui_release();
            if (parent$ui_release2 != null) {
                parent$ui_release2.invalidateMeasurements$ui_release();
            }
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release2 = getOuterCoordinator$ui_release(); !AbstractC3292y.d(outerCoordinator$ui_release2, wrapped$ui_release) && outerCoordinator$ui_release2 != null; outerCoordinator$ui_release2 = outerCoordinator$ui_release2.getWrapped$ui_release()) {
                outerCoordinator$ui_release2.onLayoutNodeAttach();
            }
            Function1 function1 = this.onAttach;
            if (function1 != null) {
                function1.invoke(owner);
            }
            this.layoutDelegate.updateParentData();
            if (!isDeactivated()) {
                invalidateFocusOnAttach();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null)).toString());
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode = content[i8];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i8++;
            } while (i8 < size);
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        String str = null;
        if (owner == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                str = debugTreeToString$default(parent$ui_release, 0, 1, null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        invalidateFocusOnDetach();
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1 function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (this.nodes.m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i8 = 0;
            do {
                content[i8].detach$ui_release();
                i8++;
            } while (i8 < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || isDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & m4320constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNode;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m4203requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m4320constructorimpl(256)));
                        } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i8 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i8 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(Canvas canvas) {
        getOuterCoordinator$ui_release().draw(canvas);
    }

    public final void forEachChild(Function1 function1) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                function1.invoke(content[i8]);
                i8++;
            } while (i8 < size);
        }
    }

    public final void forEachChildIndexed(InterfaceC2072n interfaceC2072n) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                interfaceC2072n.invoke(Integer.valueOf(i8), content[i8]);
                i8++;
            } while (i8 < size);
        }
    }

    public final void forEachCoordinator$ui_release(Function1 function1) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            AbstractC3292y.g(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            function1.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(Function1 function1) {
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !AbstractC3292y.d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            function1.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 1, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 1, null);
        }
        Constraints m4247getLastConstraintsDWUhwKw = this.layoutDelegate.m4247getLastConstraintsDWUhwKw();
        if (m4247getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo4376measureAndLayout0kLqBqw(this, m4247getLastConstraintsDWUhwKw.m5129unboximpl());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            e.f(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        if (lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release()) {
            return true;
        }
        return false;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        AbstractC3292y.f(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (this.nodes.m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(8)) && this._collapsedSemantics == null) {
            T t8 = new T();
            t8.f34573a = new SemanticsConfiguration();
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new LayoutNode$collapsedSemantics$1(this, t8));
            Object obj = t8.f34573a;
            this._collapsedSemantics = (SemanticsConfiguration) obj;
            return (SemanticsConfiguration) obj;
        }
        return this._collapsedSemantics;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long m4298getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m4298getLastMeasurementConstraintsmsEJaDk$ui_release();
        if (Constraints.m5121getHasFixedWidthimpl(m4298getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m5120getHasFixedHeightimpl(m4298getLastMeasurementConstraintsmsEJaDk$ui_release)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    public final IntrinsicsPolicy getIntrinsicsPolicy$ui_release() {
        return this.intrinsicsPolicy;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.lookaheadRoot;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    public final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) {
            return UsageByParent.NotUsed;
        }
        return measuredByParent$ui_release;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    public final Function1 getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final Function1 getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        AbstractC3292y.f(mutableVector);
        return mutableVector;
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release */
    public final void m4229hitTestM_7yMNQ$ui_release(long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
        getOuterCoordinator$ui_release().m4301hitTestYqVAtuI(NodeCoordinator.Companion.getPointerInputSource(), getOuterCoordinator$ui_release().m4297fromParentPositionMKHz9U(j8), hitTestResult, z8, z9);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release */
    public final void m4230hitTestSemanticsM_7yMNQ$ui_release(long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
        getOuterCoordinator$ui_release().m4301hitTestYqVAtuI(NodeCoordinator.Companion.getSemanticsSource(), getOuterCoordinator$ui_release().m4297fromParentPositionMKHz9U(j8), hitTestResult, true, z9);
    }

    public final void ignoreRemeasureRequests$ui_release(Function0 function0) {
        this.ignoreRemeasureRequests = true;
        function0.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int i8, LayoutNode layoutNode) {
        String str = null;
        if (layoutNode._foldedParent == null) {
            if (layoutNode.owner == null) {
                layoutNode._foldedParent = this;
                this._foldedChildren.add(i8, layoutNode);
                onZSortedChildrenInvalidated$ui_release();
                if (layoutNode.isVirtual) {
                    this.virtualChildrenCount++;
                }
                invalidateUnfoldedVirtualChildren();
                Owner owner = this.owner;
                if (owner != null) {
                    layoutNode.attach$ui_release(owner);
                }
                if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(layoutNode, 0, 1, null)).toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(layoutNode);
        sb.append(" because it already has a parent. This tree: ");
        sb.append(debugTreeToString$default(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode._foldedParent;
        if (layoutNode2 != null) {
            str = debugTreeToString$default(layoutNode2, 0, 1, null);
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            AbstractC3292y.g(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 3, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 3, null);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        this._collapsedSemantics = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    public final void invalidateSubtree(boolean z8) {
        LayoutNode parent$ui_release;
        if (z8 && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, 3, null);
        NodeChain nodeChain = this.nodes;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & m4320constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m4203requireCoordinator64DMado((LayoutModifierNode) delegatingNode, NodeKind.m4320constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i8 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i8 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i9 = 0;
            do {
                content[i9].invalidateSubtree(false);
                i9++;
            } while (i9 < size);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        if (this.owner != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.isVirtualLookaheadRoot;
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release */
    public final boolean m4231lookaheadRemeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints != null && this.lookaheadRoot != null) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            AbstractC3292y.f(lookaheadPassDelegate$ui_release);
            return lookaheadPassDelegate$ui_release.m4251remeasureBRTryo0(constraints.m5129unboximpl());
        }
        return false;
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        AbstractC3292y.f(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void move$ui_release(int i8, int i9, int i10) {
        int i11;
        if (i8 == i9) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            if (i8 > i9) {
                i11 = i8 + i12;
            } else {
                i11 = i8;
            }
            this._foldedChildren.add(i8 > i9 ? i9 + i12 : (i9 + i10) - 2, this._foldedChildren.removeAt(i11));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            invalidateSemantics$ui_release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int m4320constructorimpl = NodeKind.m4320constructorimpl(128);
        boolean m4329getIncludeSelfInTraversalH91voCI = NodeKindKt.m4329getIncludeSelfInTraversalH91voCI(m4320constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (m4329getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = innerCoordinator$ui_release.headNode(m4329getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) delegatingNode).onPlaced(getInnerCoordinator$ui_release());
                        } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i8 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i8 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !AbstractC3292y.d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (isAttached()) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onReuse();
            }
            if (isDeactivated()) {
                this.isDeactivated = false;
                invalidateSemantics$ui_release();
            } else {
                resetModifierState();
            }
            setSemanticsId(SemanticsModifierKt.generateSemanticsId());
            this.nodes.markAsAttached();
            this.nodes.runAttachLifecycle();
            rescheduleRemeasureOrRelayout$ui_release(this);
            return;
        }
        throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.isVirtual) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                return;
            }
            return;
        }
        this.zSortedChildrenInvalidated = true;
    }

    public final void place$ui_release(int i8, int i9) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), i8, i9, 0.0f, 4, null);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release */
    public final boolean m4232remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints != null) {
            if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
                clearSubtreeIntrinsicsUsage$ui_release();
            }
            return getMeasurePassDelegate$ui_release().m4256remeasureBRTryo0(constraints.m5129unboximpl());
        }
        return false;
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                onChildRemoved(this._foldedChildren.get(size));
            } else {
                this._foldedChildren.clear();
                return;
            }
        }
    }

    public final void removeAt$ui_release(int i8, int i9) {
        if (i9 >= 0) {
            int i10 = (i9 + i8) - 1;
            if (i8 > i10) {
                return;
            }
            while (true) {
                onChildRemoved(this._foldedChildren.removeAt(i10));
                if (i10 != i8) {
                    i10--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i9 + ") must be greater than 0").toString());
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestLookaheadRelayout$ui_release(boolean z8) {
        Owner owner;
        if (!this.isVirtual && (owner = this.owner) != null) {
            owner.onRequestRelayout(this, true, z8);
        }
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z8, boolean z9) {
        if (this.lookaheadRoot != null) {
            Owner owner = this.owner;
            if (owner != null && !this.ignoreRemeasureRequests && !this.isVirtual) {
                owner.onRequestMeasure(this, true, z8, z9);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
                AbstractC3292y.f(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(z8);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope".toString());
    }

    public final void requestRelayout$ui_release(boolean z8) {
        Owner owner;
        if (!this.isVirtual && (owner = this.owner) != null) {
            e.h(owner, this, false, z8, 2, null);
        }
    }

    public final void requestRemeasure$ui_release(boolean z8, boolean z9) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        e.g(owner, this, false, z8, z9, 2, null);
        getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z8);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()] == 1) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                return;
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release()) {
                layoutNode.requestLookaheadRelayout$ui_release(true);
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                return;
            } else {
                if (layoutNode.getLayoutPending$ui_release()) {
                    layoutNode.requestRelayout$ui_release(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + layoutNode.getLayoutState$ui_release());
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode = content[i8];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i8++;
            } while (i8 < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z8) {
        this.canMultiMeasure = z8;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public void setCompositeKeyHash(int i8) {
        this.compositeKeyHash = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(32768);
        if ((nodeChain.getAggregateChildKindSet() & m4320constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) delegatingNode).getNode();
                            if (node.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i8 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i8 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(Density density) {
        if (!AbstractC3292y.d(this.density, density)) {
            this.density = density;
            onDensityOrLayoutDirectionChanged();
            NodeChain nodeChain = this.nodes;
            int m4320constructorimpl = NodeKind.m4320constructorimpl(16);
            if ((nodeChain.getAggregateChildKindSet() & m4320constructorimpl) != 0) {
                for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                        DelegatingNode delegatingNode = head$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) delegatingNode).onDensityChange();
                            } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i8 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i8 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void setDepth$ui_release(int i8) {
        this.depth = i8;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z8) {
        this.innerLayerCoordinatorIsDirty = z8;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy measurePolicy) {
        if (!AbstractC3292y.d(this.measurePolicy, measurePolicy)) {
            this.measurePolicy = measurePolicy;
            this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
            invalidateMeasurements$ui_release();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(Modifier modifier) {
        if (this.isVirtual && getModifier() != Modifier.Companion) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        if (!isDeactivated()) {
            this.modifier = modifier;
            this.nodes.updateFrom$ui_release(modifier);
            this.layoutDelegate.updateParentData();
            if (this.nodes.m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(512)) && this.lookaheadRoot == null) {
                setLookaheadRoot(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("modifier is updated when deactivated".toString());
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z8) {
        this.needsOnPositionedDispatch = z8;
    }

    public final void setOnAttach$ui_release(Function1 function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(Function1 function1) {
        this.onDetach = function1;
    }

    public void setSemanticsId(int i8) {
        this.semanticsId = i8;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (!AbstractC3292y.d(this.viewConfiguration, viewConfiguration)) {
            this.viewConfiguration = viewConfiguration;
            NodeChain nodeChain = this.nodes;
            int m4320constructorimpl = NodeKind.m4320constructorimpl(16);
            if ((nodeChain.getAggregateChildKindSet() & m4320constructorimpl) != 0) {
                for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                        DelegatingNode delegatingNode = head$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) delegatingNode).onViewConfigurationChange();
                            } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i8 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i8 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z8) {
        this.isVirtualLookaheadRoot = z8;
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public LayoutNode(boolean z8, int i8) {
        Density density;
        this.isVirtual = z8;
        this.semanticsId = i8;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        density = LayoutNodeKt.DefaultDensity;
        this.density = density;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.Companion.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.Companion;
    }

    public /* synthetic */ LayoutNode(boolean z8, int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? false : z8, (i9 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i8);
    }
}
