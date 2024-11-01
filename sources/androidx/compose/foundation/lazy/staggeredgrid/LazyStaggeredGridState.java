package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import c6.InterfaceC2072n;
import i6.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    private final LazyStaggeredGridAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private Density density;
    private final State firstVisibleItemIndex$delegate;
    private final State firstVisibleItemScrollOffset$delegate;
    private boolean isVertical;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final MutableState<LazyStaggeredGridLayoutInfo> layoutInfoState;
    private int measurePassCount;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final LazyStaggeredGridItemPlacementAnimator placementAnimator;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private LazyStaggeredGridSlots slots;
    private LazyStaggeredGridSpanProvider spanProvider;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(LazyStaggeredGridState$Companion$Saver$1.INSTANCE, LazyStaggeredGridState$Companion$Saver$2.INSTANCE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, AbstractC3284p abstractC3284p) {
        this(iArr, iArr2);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i8, int i9, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i8, i9, dVar);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != -1 && (!visibleItemsInfo.isEmpty())) {
            int index = ((LazyStaggeredGridItemInfo) AbstractC1435t.m0(visibleItemsInfo)).getIndex();
            int index2 = ((LazyStaggeredGridItemInfo) AbstractC1435t.y0(visibleItemsInfo)).getIndex();
            int i8 = this.prefetchBaseIndex;
            if (index > i8 || i8 > index2) {
                this.prefetchBaseIndex = -1;
                Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
                while (it.hasNext()) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
                }
                this.currentItemPrefetchHandles.clear();
            }
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i8, int i9) {
        int min;
        int[] iArr = new int[i9];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
        if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(i8)) {
            AbstractC1428l.v(iArr, i8, 0, 0, 6, null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i8 + i9);
        int lane = this.laneInfo.getLane(i8);
        if (lane == -1) {
            min = 0;
        } else {
            min = Math.min(lane, i9);
        }
        int i10 = min - 1;
        int i11 = i8;
        while (true) {
            if (-1 >= i10) {
                break;
            }
            i11 = this.laneInfo.findPreviousItemIndex(i11, i10);
            iArr[i10] = i11;
            if (i11 == -1) {
                AbstractC1428l.v(iArr, -1, 0, i10, 2, null);
                break;
            }
            i10--;
        }
        iArr[min] = i8;
        for (int i12 = min + 1; i12 < i9; i12++) {
            i8 = this.laneInfo.findNextItemIndex(i8, i12);
            iArr[i12] = i8;
        }
        return iArr;
    }

    private final void notifyPrefetch(float f8) {
        boolean z8;
        int index;
        boolean z9;
        int i8;
        int i9;
        int i10;
        long m5132fixedHeightOenEA2s;
        LazyStaggeredGridLayoutInfo value = this.layoutInfoState.getValue();
        if (!value.getVisibleItemsInfo().isEmpty()) {
            if (f8 < 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                index = ((LazyStaggeredGridItemInfo) AbstractC1435t.y0(value.getVisibleItemsInfo())).getIndex();
            } else {
                index = ((LazyStaggeredGridItemInfo) AbstractC1435t.m0(value.getVisibleItemsInfo())).getIndex();
            }
            if (index == this.prefetchBaseIndex) {
                return;
            }
            this.prefetchBaseIndex = index;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int laneCount$foundation_release = getLaneCount$foundation_release();
            for (int i11 = 0; i11 < laneCount$foundation_release; i11++) {
                if (z8) {
                    index = this.laneInfo.findNextItemIndex(index, i11);
                } else {
                    index = this.laneInfo.findPreviousItemIndex(index, i11);
                }
                if (index < 0 || index >= value.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(index));
                if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                    LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
                    if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    } else {
                        i8 = i11;
                    }
                    if (z9) {
                        i9 = getLaneCount$foundation_release();
                    } else {
                        i9 = 1;
                    }
                    LazyStaggeredGridSlots lazyStaggeredGridSlots = this.slots;
                    if (lazyStaggeredGridSlots == null) {
                        i10 = 0;
                    } else if (i9 == 1) {
                        i10 = lazyStaggeredGridSlots.getSizes()[i8];
                    } else {
                        int i12 = lazyStaggeredGridSlots.getPositions()[i8];
                        int i13 = (i8 + i9) - 1;
                        i10 = (lazyStaggeredGridSlots.getPositions()[i13] + lazyStaggeredGridSlots.getSizes()[i13]) - i12;
                    }
                    if (this.isVertical) {
                        m5132fixedHeightOenEA2s = Constraints.Companion.m5133fixedWidthOenEA2s(i10);
                    } else {
                        m5132fixedHeightOenEA2s = Constraints.Companion.m5132fixedHeightOenEA2s(i10);
                    }
                    this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m734schedulePrefetch0kLqBqw(index, m5132fixedHeightOenEA2s));
                }
            }
            clearLeftoverPrefetchHandles(linkedHashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float f8) {
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

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i8, int i9, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i8, i9, dVar);
    }

    private void setCanScrollBackward(boolean z8) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z8));
    }

    private void setCanScrollForward(boolean z8) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z8));
    }

    public static /* synthetic */ int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState, LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    int[] indices = lazyStaggeredGridState.scrollPosition.getIndices();
                    createNonObservableSnapshot.dispose();
                    iArr = indices;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        return lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyLayoutItemProvider, iArr);
    }

    public final Object animateScrollToItem(int i8, int i9, d dVar) {
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i8, i9, dVar);
        if (animateScrollToItem == b.e()) {
            return animateScrollToItem;
        }
        return I.f8786a;
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult result) {
        AbstractC3292y.i(result, "result");
        this.scrollToBeConsumed -= result.getConsumedScroll();
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        this.layoutInfoState.setValue(result);
        cancelPrefetchIfVisibleItemsChanged(result);
        this.scrollPosition.updateFromMeasureResult(result);
        this.measurePassCount++;
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
        return ((Number) this.firstVisibleItemIndex$delegate.getValue()).intValue();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return ((Number) this.firstVisibleItemScrollOffset$delegate.getValue()).intValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final int getLaneCount$foundation_release() {
        int[] sizes;
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.slots;
        if (lazyStaggeredGridSlots != null && (sizes = lazyStaggeredGridSlots.getSizes()) != null) {
            return sizes.length;
        }
        return 0;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.laneInfo;
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.measurePassCount;
    }

    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.mutableInteractionSource;
    }

    public final i getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final LazyStaggeredGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.placementAnimator;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final LazyStaggeredGridSlots getSlots$foundation_release() {
        return this.slots;
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider$foundation_release() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final boolean isVertical$foundation_release() {
        return this.isVertical;
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, c6.n, U5.d):java.lang.Object");
    }

    public final Object scrollToItem(int i8, int i9, d dVar) {
        Object e8 = c.e(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i8, i9, null), dVar, 1, null);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    public final void setDensity$foundation_release(Density density) {
        AbstractC3292y.i(density, "<set-?>");
        this.density = density;
    }

    public final void setMeasurePassCount$foundation_release(int i8) {
        this.measurePassCount = i8;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z8) {
        this.prefetchingEnabled = z8;
    }

    public final void setSlots$foundation_release(LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.slots = lazyStaggeredGridSlots;
    }

    public final void setSpanProvider$foundation_release(LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z8) {
        this.isVertical = z8;
    }

    public final void snapToItemInternal$foundation_release(ScrollScope scrollScope, int i8, int i9) {
        int m5279getXimpl;
        AbstractC3292y.i(scrollScope, "<this>");
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i8);
        if (findVisibleItem != null) {
            boolean z8 = this.isVertical;
            long mo749getOffsetnOccac = findVisibleItem.mo749getOffsetnOccac();
            if (z8) {
                m5279getXimpl = IntOffset.m5280getYimpl(mo749getOffsetnOccac);
            } else {
                m5279getXimpl = IntOffset.m5279getXimpl(mo749getOffsetnOccac);
            }
            scrollScope.scrollBy(m5279getXimpl + i9);
            return;
        }
        this.scrollPosition.requestPosition(i8, i9);
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider itemProvider, int[] firstItemIndex) {
        AbstractC3292y.i(itemProvider, "itemProvider");
        AbstractC3292y.i(firstItemIndex, "firstItemIndex");
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        MutableState<LazyStaggeredGridLayoutInfo> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        this.firstVisibleItemIndex$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new LazyStaggeredGridState$firstVisibleItemIndex$2(this));
        this.firstVisibleItemScrollOffset$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new LazyStaggeredGridState$firstVisibleItemScrollOffset$2(this));
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyStaggeredGridLayoutInfo.INSTANCE, null, 2, null);
        this.layoutInfoState = mutableStateOf$default;
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default3;
        this.animateScrollScope = new LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
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
                LazyStaggeredGridState.this.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return androidx.compose.ui.a.a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState();
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyStaggeredGridState$scrollableState$1(this));
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.placementAnimator = new LazyStaggeredGridItemPlacementAnimator();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
    }

    public /* synthetic */ LazyStaggeredGridState(int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }

    public LazyStaggeredGridState(int i8, int i9) {
        this(new int[]{i8}, new int[]{i9});
    }
}
