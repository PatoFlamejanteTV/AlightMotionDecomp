package androidx.compose.foundation.lazy;

import Q5.I;
import R5.AbstractC1435t;
import U5.d;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import c6.InterfaceC2072n;
import i6.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(LazyListState$Companion$Saver$1.INSTANCE, LazyListState$Companion$Saver$2.INSTANCE);
    private final LazyListAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<LazyListLayoutInfo> layoutInfoState;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final LazyListItemPlacementAnimator placementAnimator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private boolean wasScrollingForward;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LazyListState() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.<init>():void");
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i8, int i9, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return lazyListState.animateScrollToItem(i8, i9, dVar);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyListLayoutInfo lazyListLayoutInfo) {
        int index;
        if (this.indexToPrefetch != -1 && (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (this.wasScrollingForward) {
                index = ((LazyListItemInfo) AbstractC1435t.y0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                index = ((LazyListItemInfo) AbstractC1435t.m0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (this.indexToPrefetch != index) {
                this.indexToPrefetch = -1;
                LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
                if (prefetchHandle != null) {
                    prefetchHandle.cancel();
                }
                this.currentPrefetchHandle = null;
            }
        }
    }

    private final void notifyPrefetch(float f8) {
        boolean z8;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (!this.prefetchingEnabled) {
            return;
        }
        LazyListLayoutInfo layoutInfo = getLayoutInfo();
        if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
            if (f8 < 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                index = ((LazyListItemInfo) AbstractC1435t.y0(layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                index = ((LazyListItemInfo) AbstractC1435t.m0(layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (index != this.indexToPrefetch && index >= 0 && index < layoutInfo.getTotalItemsCount()) {
                if (this.wasScrollingForward != z8 && (prefetchHandle = this.currentPrefetchHandle) != null) {
                    prefetchHandle.cancel();
                }
                this.wasScrollingForward = z8;
                this.indexToPrefetch = index;
                this.currentPrefetchHandle = this.prefetchState.m734schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
            }
        }
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i8, int i9, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return lazyListState.scrollToItem(i8, i9, dVar);
    }

    private void setCanScrollBackward(boolean z8) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z8));
    }

    private void setCanScrollForward(boolean z8) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z8));
    }

    public static /* synthetic */ int updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(LazyListState lazyListState, LazyListItemProvider lazyListItemProvider, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    int index = lazyListState.scrollPosition.getIndex();
                    createNonObservableSnapshot.dispose();
                    i8 = index;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        return lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider, i8);
    }

    public final Object animateScrollToItem(int i8, int i9, d dVar) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i8, i9, dVar);
        if (animateScrollToItem == V5.b.e()) {
            return animateScrollToItem;
        }
        return I.f8786a;
    }

    public final void applyMeasureResult$foundation_release(LazyListMeasureResult result) {
        int i8;
        AbstractC3292y.i(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        LazyListMeasuredItem firstVisibleItem = result.getFirstVisibleItem();
        boolean z8 = false;
        if (firstVisibleItem != null) {
            i8 = firstVisibleItem.getIndex();
        } else {
            i8 = 0;
        }
        if (i8 != 0 || result.getFirstVisibleItemScrollOffset() != 0) {
            z8 = true;
        }
        setCanScrollBackward(z8);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(result);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f8) {
        return this.scrollableState.dispatchRawDelta(f8);
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final i getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final LazyListItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.placementAnimator;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m687getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f8) {
        if ((f8 < 0.0f && !getCanScrollForward()) || (f8 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            float f9 = this.scrollToBeConsumed + f8;
            this.scrollToBeConsumed = f9;
            if (Math.abs(f9) > 0.5f) {
                float f10 = this.scrollToBeConsumed;
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                if (this.prefetchingEnabled) {
                    notifyPrefetch(f10 - this.scrollToBeConsumed);
                }
            }
            if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
                return f8;
            }
            float f11 = f8 - this.scrollToBeConsumed;
            this.scrollToBeConsumed = 0.0f;
            return f11;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, c6.InterfaceC2072n r7, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            c6.n r7 = (c6.InterfaceC2072n) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            Q5.t.b(r8)
            goto L5a
        L45:
            Q5.t.b(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(androidx.compose.foundation.MutatePriority, c6.n, U5.d):java.lang.Object");
    }

    public final Object scrollToItem(int i8, int i9, d dVar) {
        Object e8 = androidx.compose.foundation.gestures.c.e(this, null, new LazyListState$scrollToItem$2(this, i8, i9, null), dVar, 1, null);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    public final void setDensity$foundation_release(Density density) {
        AbstractC3292y.i(density, "<set-?>");
        this.density = density;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z8) {
        this.prefetchingEnabled = z8;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m688setPremeasureConstraintsBRTryo0$foundation_release(long j8) {
        this.premeasureConstraints = j8;
    }

    public final void snapToItemIndexInternal$foundation_release(int i8, int i9) {
        this.scrollPosition.requestPosition(i8, i9);
        this.placementAnimator.reset();
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyListItemProvider itemProvider, int i8) {
        AbstractC3292y.i(itemProvider, "itemProvider");
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, i8);
    }

    public LazyListState(int i8, int i9) {
        MutableState<LazyListLayoutInfo> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i8, i9);
        this.scrollPosition = lazyListScrollPosition;
        this.animateScrollScope = new LazyListAnimateScrollScope(this);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyListLayoutInfo.INSTANCE, null, 2, null);
        this.layoutInfoState = mutableStateOf$default;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyListState$scrollableState$1(this));
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean all(Function1 function1) {
                return androidx.compose.ui.b.a(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean any(Function1 function1) {
                return androidx.compose.ui.b.b(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
                return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
                return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                AbstractC3292y.i(remeasurement, "remeasurement");
                LazyListState.this.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return androidx.compose.ui.a.a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.placementAnimator = new LazyListItemPlacementAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default3;
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyListState(int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
