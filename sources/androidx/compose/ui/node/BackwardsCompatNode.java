package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public static final int $stable = 8;
    private BackwardsCompatLocalMap _providedValues;
    private Modifier.Element element;
    private boolean invalidateCache;
    private LayoutCoordinates lastOnPlacedCoordinates;
    private HashSet<ModifierLocal<?>> readValues;

    public BackwardsCompatNode(Modifier.Element element) {
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void initializeModifier(boolean z8) {
        if (isAttached()) {
            Modifier.Element element = this.element;
            if ((NodeKind.m4320constructorimpl(32) & getKindSet$ui_release()) != 0) {
                if (element instanceof ModifierLocalConsumer) {
                    sideEffect(new BackwardsCompatNode$initializeModifier$2(this));
                }
                if (element instanceof ModifierLocalProvider) {
                    updateModifierLocalProvider((ModifierLocalProvider) element);
                }
            }
            if ((NodeKind.m4320constructorimpl(4) & getKindSet$ui_release()) != 0) {
                if (element instanceof DrawCacheModifier) {
                    this.invalidateCache = true;
                }
                if (!z8) {
                    LayoutModifierNodeKt.invalidateLayer(this);
                }
            }
            if ((NodeKind.m4320constructorimpl(2) & getKindSet$ui_release()) != 0) {
                if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                    NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
                    AbstractC3292y.f(coordinator$ui_release);
                    ((LayoutModifierNodeCoordinator) coordinator$ui_release).setLayoutModifierNode$ui_release(this);
                    coordinator$ui_release.onLayoutModifierNodeChanged();
                }
                if (!z8) {
                    LayoutModifierNodeKt.invalidateLayer(this);
                    DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
            }
            if (element instanceof RemeasurementModifier) {
                ((RemeasurementModifier) element).onRemeasurementAvailable(DelegatableNodeKt.requireLayoutNode(this));
            }
            if ((NodeKind.m4320constructorimpl(128) & getKindSet$ui_release()) != 0) {
                if ((element instanceof OnRemeasuredModifier) && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                    DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
                if (element instanceof OnPlacedModifier) {
                    this.lastOnPlacedCoordinates = null;
                    if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                        DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                            @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                            public void onLayoutComplete() {
                                LayoutCoordinates layoutCoordinates;
                                layoutCoordinates = BackwardsCompatNode.this.lastOnPlacedCoordinates;
                                if (layoutCoordinates == null) {
                                    BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                                    backwardsCompatNode.onPlaced(DelegatableNodeKt.m4203requireCoordinator64DMado(backwardsCompatNode, NodeKind.m4320constructorimpl(128)));
                                }
                            }
                        });
                    }
                }
            }
            if ((NodeKind.m4320constructorimpl(256) & getKindSet$ui_release()) != 0 && (element instanceof OnGloballyPositionedModifier) && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
            if (element instanceof FocusRequesterModifier) {
                ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
            }
            if ((NodeKind.m4320constructorimpl(16) & getKindSet$ui_release()) != 0 && (element instanceof PointerInputModifier)) {
                ((PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator$ui_release());
            }
            if ((NodeKind.m4320constructorimpl(8) & getKindSet$ui_release()) != 0) {
                DelegatableNodeKt.requireOwner(this).onSemanticsChange();
                return;
            }
            return;
        }
        throw new IllegalStateException("initializeModifier called on unattached node".toString());
    }

    private final void unInitializeModifier() {
        if (isAttached()) {
            Modifier.Element element = this.element;
            if ((NodeKind.m4320constructorimpl(32) & getKindSet$ui_release()) != 0) {
                if (element instanceof ModifierLocalProvider) {
                    DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider) element).getKey());
                }
                if (element instanceof ModifierLocalConsumer) {
                    ((ModifierLocalConsumer) element).onModifierLocalsUpdated(BackwardsCompatNodeKt.access$getDetachedModifierLocalReadScope$p());
                }
            }
            if ((NodeKind.m4320constructorimpl(8) & getKindSet$ui_release()) != 0) {
                DelegatableNodeKt.requireOwner(this).onSemanticsChange();
            }
            if (element instanceof FocusRequesterModifier) {
                ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("unInitializeModifier called on unattached node".toString());
    }

    private final void updateDrawCache() {
        Modifier.Element element = this.element;
        if (element instanceof DrawCacheModifier) {
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.access$getOnDrawCacheReadsChanged$p(), new BackwardsCompatNode$updateDrawCache$1(element, this));
        }
        this.invalidateCache = false;
    }

    private final void updateModifierLocalProvider(ModifierLocalProvider<?> modifierLocalProvider) {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap != null && backwardsCompatLocalMap.contains$ui_release(modifierLocalProvider.getKey())) {
            backwardsCompatLocalMap.setElement(modifierLocalProvider);
            DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, modifierLocalProvider.getKey());
        } else {
            this._providedValues = new BackwardsCompatLocalMap(modifierLocalProvider);
            if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, modifierLocalProvider.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Modifier.Element element = this.element;
        if (element instanceof FocusOrderModifier) {
            ((FocusOrderModifier) element).populateFocusOrder(new FocusOrder(focusProperties));
            return;
        }
        throw new IllegalStateException("applyFocusProperties called on wrong node".toString());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfiguration = ((SemanticsModifier) element).getSemanticsConfiguration();
        AbstractC3292y.g(semanticsPropertyReceiver, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) semanticsPropertyReceiver).collapsePeer$ui_release(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.invalidateCache && (element instanceof DrawCacheModifier)) {
            updateDrawCache();
        }
        drawModifier.draw(contentDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui_release;
        this.readValues.add(modifierLocal);
        int m4320constructorimpl = NodeKind.m4320constructorimpl(32);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            ?? r52 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof ModifierLocalModifierNode) {
                                    ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                    if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                        return (T) modifierLocalModifierNode.getProvidedValues().get$ui_release(modifierLocal);
                                    }
                                } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i8 = 0;
                                    delegatingNode = delegatingNode;
                                    r52 = r52;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            r52 = r52;
                                            if (i8 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    r52.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r52.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                        r52 = r52;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(r52);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return (T) modifierLocal.getDefaultFactory$ui_release().invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    public final Modifier.Element getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap == null) {
            return ModifierLocalModifierNodeKt.modifierLocalMapOf();
        }
        return backwardsCompatLocalMap;
    }

    public final HashSet<ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return h.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return h.b(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo2614getSizeNHjbRc() {
        return IntSizeKt.m5331toSizeozmzZPI(DelegatableNodeKt.m4203requireCoordinator64DMado(this, NodeKind.m4320constructorimpl(128)).mo4115getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).mo133measure3p2s80s(measureScope, measurable, j8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        initializeModifier(true);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        f.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        unInitializeModifier();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Modifier.Element element = this.element;
        if (element instanceof FocusEventModifier) {
            ((FocusEventModifier) element).onFocusEvent(focusState);
            return;
        }
        throw new IllegalStateException("onFocusEvent called on wrong node".toString());
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.lastOnPlacedCoordinates = layoutCoordinates;
        Modifier.Element element = this.element;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).onPlaced(layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j8) {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getPointerInputFilter().mo4017onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j8);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo314onRemeasuredozmzZPI(long j8) {
        Modifier.Element element = this.element;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).mo353onRemeasuredozmzZPI(j8);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        f.c(this);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        androidx.compose.ui.modifier.b.c(this, modifierLocal, obj);
    }

    public final void setElement(Modifier.Element element) {
        if (isAttached()) {
            unInitializeModifier();
        }
        this.element = element;
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        if (isAttached()) {
            initializeModifier(false);
        }
    }

    public final void setReadValues(HashSet<ModifierLocal<?>> hashSet) {
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        Modifier.Element element = this.element;
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getPointerInputFilter().getShareWithSiblings();
    }

    public String toString() {
        return this.element.toString();
    }

    public final void updateModifierLocalConsumer() {
        if (isAttached()) {
            this.readValues.clear();
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.access$getUpdateModifierLocalConsumer$p(), new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }
}
