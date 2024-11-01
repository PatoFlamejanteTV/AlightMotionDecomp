package androidx.compose.foundation.pager;

import Q5.I;
import R5.AbstractC1435t;
import U5.d;
import V5.b;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import c6.InterfaceC2072n;
import i6.i;
import i6.m;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private final MutableIntState animationTargetPage$delegate;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final State currentPageOffsetFraction$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int indexToPrefetch;
    private final int initialPage;
    private final float initialPageOffsetFraction;
    private final MutableInteractionSource internalInteractionSource;
    private int numMeasurePasses;
    private MutableState<PagerLayoutInfo> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private final State settledPage$delegate;
    private final MutableIntState settledPageState$delegate;
    private final MutableFloatState snapRemainingScrollOffset$delegate;
    private final State targetPage$delegate;
    private final MutableState upDownDifference$delegate;
    private boolean wasScrollingForward;

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i8, float f8, AnimationSpec animationSpec, d dVar, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                f8 = 0.0f;
            }
            if ((i9 & 4) != 0) {
                animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
            }
            return pagerState.animateScrollToPage(i8, f8, animationSpec, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(d dVar) {
        Object waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(dVar);
        if (waitForFirstLayout == b.e()) {
            return waitForFirstLayout;
        }
        return I.f8786a;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        int index;
        if (this.indexToPrefetch != -1 && (!pagerLayoutInfo.getVisiblePagesInfo().isEmpty())) {
            if (this.wasScrollingForward) {
                index = ((PageInfo) AbstractC1435t.y0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + 1;
            } else {
                index = ((PageInfo) AbstractC1435t.m0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - 1;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i8) {
        if (getPageCount() <= 0) {
            return 0;
        }
        return m.k(i8, 0, getPageCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAnimationTargetPage() {
        return this.animationTargetPage$delegate.getIntValue();
    }

    private final float getDistanceToSnapPosition() {
        PageInfo closestPageToSnapPosition = getLayoutInfo$foundation_release().getClosestPageToSnapPosition();
        if (closestPageToSnapPosition != null) {
            return SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(this.density, PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo$foundation_release()), getLayoutInfo$foundation_release().getBeforeContentPadding(), getLayoutInfo$foundation_release().getAfterContentPadding(), getLayoutInfo$foundation_release().getPageSize(), closestPageToSnapPosition.getOffset(), closestPageToSnapPosition.getIndex(), PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageAvailableSpace() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPositionThresholdFraction() {
        return Math.min(this.density.mo425toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final List<PageInfo> getVisiblePages() {
        return this.pagerLayoutInfoState.getValue().getVisiblePagesInfo();
    }

    private final void notifyPrefetch(float f8) {
        boolean z8;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (!this.prefetchingEnabled) {
            return;
        }
        PagerLayoutInfo layoutInfo$foundation_release = getLayoutInfo$foundation_release();
        if (!layoutInfo$foundation_release.getVisiblePagesInfo().isEmpty()) {
            if (f8 < 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                index = ((PageInfo) AbstractC1435t.y0(layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() + 1;
            } else {
                index = ((PageInfo) AbstractC1435t.m0(layoutInfo$foundation_release.getVisiblePagesInfo())).getIndex() - 1;
            }
            if (index != this.indexToPrefetch && index >= 0 && index < layoutInfo$foundation_release.getPagesCount()) {
                if (this.wasScrollingForward != z8 && (prefetchHandle = this.currentPrefetchHandle) != null) {
                    prefetchHandle.cancel();
                }
                this.wasScrollingForward = z8;
                this.indexToPrefetch = index;
                this.currentPrefetchHandle = this.prefetchState.m734schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f8) {
        if ((f8 < 0.0f && !getCanScrollForward()) || (f8 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            float f9 = this.scrollToBeConsumed + f8;
            this.scrollToBeConsumed = f9;
            if (Math.abs(f9) > 0.5f) {
                float f10 = this.scrollToBeConsumed;
                Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
                if (remeasurement$foundation_release != null) {
                    remeasurement$foundation_release.forceRemeasure();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, c6.InterfaceC2072n r7, U5.d r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            c6.n r7 = (c6.InterfaceC2072n) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            Q5.t.b(r8)
            goto L58
        L46:
            Q5.t.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            androidx.compose.foundation.gestures.ScrollableState r5 = r5.scrollableState
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r5 = r5.scroll(r6, r7, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            Q5.I r5 = Q5.I.f8786a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, c6.n, U5.d):java.lang.Object");
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i8, float f8, d dVar, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                f8 = 0.0f;
            }
            return pagerState.scrollToPage(i8, f8, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
    }

    private final void setAnimationTargetPage(int i8) {
        this.animationTargetPage$delegate.setIntValue(i8);
    }

    private final void setCanScrollBackward(boolean z8) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z8));
    }

    private final void setCanScrollForward(boolean z8) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    private final void setSettledPageState(int i8) {
        this.settledPageState$delegate.setIntValue(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateScrollToPage(int r11, float r12, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r13, U5.d r14) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, U5.d):java.lang.Object");
    }

    public final void applyMeasureResult$foundation_release(PagerMeasureResult result) {
        int i8;
        AbstractC3292y.i(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.pagerLayoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        boolean z8 = false;
        if (firstVisiblePage != null) {
            i8 = firstVisiblePage.getIndex();
        } else {
            i8 = 0;
        }
        if (i8 != 0 || result.getFirstVisiblePageOffset() != 0) {
            z8 = true;
        }
        setCanScrollBackward(z8);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(result);
        if (!isScrollInProgress()) {
            setSettledPageState(getCurrentPage());
        }
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
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction$delegate.getValue()).floatValue();
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.scrollPosition.getFirstVisiblePage();
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.scrollPosition.getScrollOffset();
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final PagerLayoutInfo getLayoutInfo$foundation_release() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final i getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    public final float getOffsetFractionForPage(int i8) {
        if (i8 >= 0 && i8 <= getPageCount()) {
            return (getCurrentPage() - i8) + getCurrentPageOffsetFraction();
        }
        throw new IllegalArgumentException(("page " + i8 + " is not within the range 0 to pageCount").toString());
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.pinnedPages;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m795getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return this.snapRemainingScrollOffset$delegate.getFloatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m796getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m2722unboximpl();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, d dVar) {
        return scroll$suspendImpl(this, mutatePriority, interfaceC2072n, dVar);
    }

    public final Object scrollToPage(int i8, float f8, d dVar) {
        Object e8 = c.e(this, null, new PagerState$scrollToPage$2(this, f8, i8, null), dVar, 1, null);
        if (e8 == b.e()) {
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
    public final void m797setPremeasureConstraintsBRTryo0$foundation_release(long j8) {
        this.premeasureConstraints = j8;
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f8) {
        this.snapRemainingScrollOffset$delegate.setFloatValue(f8);
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m798setUpDownDifferencek4lQ0M$foundation_release(long j8) {
        this.upDownDifference$delegate.setValue(Offset.m2701boximpl(j8));
    }

    public PagerState(int i8, float f8) {
        MutableState mutableStateOf$default;
        MutableState<PagerLayoutInfo> mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        this.initialPage = i8;
        this.initialPageOffsetFraction = f8;
        double d8 = f8;
        if (-0.5d <= d8 && d8 <= 0.5d) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2701boximpl(Offset.Companion.m2728getZeroF1C5BW0()), null, 2, null);
            this.upDownDifference$delegate = mutableStateOf$default;
            this.snapRemainingScrollOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i8, 0);
            this.scrollPosition = pagerScrollPosition;
            this.scrollableState = ScrollableStateKt.ScrollableState(new PagerState$scrollableState$1(this));
            this.prefetchingEnabled = true;
            this.indexToPrefetch = -1;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PagerStateKt.getEmptyLayoutInfo(), null, 2, null);
            this.pagerLayoutInfoState = mutableStateOf$default2;
            this.density = PagerStateKt.access$getUnitDensity$p();
            this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
            this.animationTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
            this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i8);
            this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$settledPage$2(this));
            this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$targetPage$2(this));
            this.currentPageOffsetFraction$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$currentPageOffsetFraction$2(this));
            this.prefetchState = new LazyLayoutPrefetchState();
            this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
            this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.remeasurement$delegate = mutableStateOf$default3;
            this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
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
                    PagerState.this.setRemeasurement(remeasurement);
                }

                @Override // androidx.compose.ui.Modifier
                public /* synthetic */ Modifier then(Modifier modifier) {
                    return a.a(this, modifier);
                }
            };
            this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            this.pinnedPages = new LazyLayoutPinnedItemList();
            pagerScrollPosition.getNearestRangeState();
            Boolean bool = Boolean.FALSE;
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            this.canScrollForward$delegate = mutableStateOf$default4;
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            this.canScrollBackward$delegate = mutableStateOf$default5;
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f8 + " is not within the range -0.5 to 0.5").toString());
    }

    public /* synthetic */ PagerState(int i8, float f8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? 0.0f : f8);
    }
}
