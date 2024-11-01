package androidx.compose.foundation.lazy;

import Q5.I;
import R5.Q;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8, int i8, int i9) {
            super(3);
            this.$this_null = lazyLayoutMeasureScope;
            this.$containerConstraints = j8;
            this.$totalHorizontalPadding = i8;
            this.$totalVerticalPadding = i9;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
        }

        public final MeasureResult invoke(int i8, int i9, Function1 placement) {
            AbstractC3292y.i(placement, "placement");
            return this.$this_null.layout(ConstraintsKt.m5137constrainWidthK40F9xA(this.$containerConstraints, i8 + this.$totalHorizontalPadding), ConstraintsKt.m5136constrainHeightK40F9xA(this.$containerConstraints, i9 + this.$totalVerticalPadding), Q.h(), placement);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z8, PaddingValues paddingValues, boolean z9, LazyListState lazyListState, Function0 function0, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i8, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.$isVertical = z8;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z9;
        this.$state = lazyListState;
        this.$itemProviderLambda = function0;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$beyondBoundsItemCount = i8;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m680invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyListMeasureResult m680invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        Orientation orientation;
        int mo419roundToPx0680j_4;
        int mo419roundToPx0680j_42;
        int i8;
        int i9;
        float mo497getSpacingD9Ej5fM;
        int m5123getMaxWidthimpl;
        long IntOffset;
        AbstractC3292y.i(lazyLayoutMeasureScope, "$this$null");
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m287checkScrollableContainerConstraintsK40F9xA(j8, orientation);
        if (this.$isVertical) {
            mo419roundToPx0680j_4 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(this.$contentPadding.mo528calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo419roundToPx0680j_4 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            mo419roundToPx0680j_42 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(this.$contentPadding.mo529calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo419roundToPx0680j_42 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo419roundToPx0680j_43 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(this.$contentPadding.mo530calculateTopPaddingD9Ej5fM());
        int mo419roundToPx0680j_44 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(this.$contentPadding.mo527calculateBottomPaddingD9Ej5fM());
        int i10 = mo419roundToPx0680j_43 + mo419roundToPx0680j_44;
        int i11 = mo419roundToPx0680j_4 + mo419roundToPx0680j_42;
        boolean z8 = this.$isVertical;
        if (z8) {
            i8 = i10;
        } else {
            i8 = i11;
        }
        if (z8 && !this.$reverseLayout) {
            i9 = mo419roundToPx0680j_43;
        } else if (z8 && this.$reverseLayout) {
            i9 = mo419roundToPx0680j_44;
        } else if (!z8 && !this.$reverseLayout) {
            i9 = mo419roundToPx0680j_4;
        } else {
            i9 = mo419roundToPx0680j_42;
        }
        final int i12 = i8 - i9;
        final long m5139offsetNN6EwU = ConstraintsKt.m5139offsetNN6EwU(j8, -i11, -i10);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        final LazyListItemProvider lazyListItemProvider = (LazyListItemProvider) this.$itemProviderLambda.invoke();
        lazyListItemProvider.getItemScope().setMaxSize(Constraints.m5123getMaxWidthimpl(m5139offsetNN6EwU), Constraints.m5122getMaxHeightimpl(m5139offsetNN6EwU));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                mo497getSpacingD9Ej5fM = vertical.mo497getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                mo497getSpacingD9Ej5fM = horizontal.mo497getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        final int mo419roundToPx0680j_45 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(mo497getSpacingD9Ej5fM);
        final int itemCount = lazyListItemProvider.getItemCount();
        if (this.$isVertical) {
            m5123getMaxWidthimpl = Constraints.m5122getMaxHeightimpl(j8) - i10;
        } else {
            m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8) - i11;
        }
        int i13 = m5123getMaxWidthimpl;
        if (this.$reverseLayout && i13 <= 0) {
            boolean z9 = this.$isVertical;
            if (!z9) {
                mo419roundToPx0680j_4 += i13;
            }
            if (z9) {
                mo419roundToPx0680j_43 += i13;
            }
            IntOffset = IntOffsetKt.IntOffset(mo419roundToPx0680j_4, mo419roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo419roundToPx0680j_4, mo419roundToPx0680j_43);
        }
        final long j9 = IntOffset;
        final boolean z10 = this.$isVertical;
        final Alignment.Horizontal horizontal2 = this.$horizontalAlignment;
        final Alignment.Vertical vertical2 = this.$verticalAlignment;
        final boolean z11 = this.$reverseLayout;
        final int i14 = i9;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m5139offsetNN6EwU, z10, lazyListItemProvider, lazyLayoutMeasureScope, itemCount, mo419roundToPx0680j_45, horizontal2, vertical2, z11, i14, i12, j9) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ int $itemsCount;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ int $spaceBetweenItems;
            final /* synthetic */ LazyLayoutMeasureScope $this_null;
            final /* synthetic */ Alignment.Vertical $verticalAlignment;
            final /* synthetic */ long $visualItemOffset;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$isVertical = z10;
                this.$this_null = lazyLayoutMeasureScope;
                this.$itemsCount = itemCount;
                this.$spaceBetweenItems = mo419roundToPx0680j_45;
                this.$horizontalAlignment = horizontal2;
                this.$verticalAlignment = vertical2;
                this.$reverseLayout = z11;
                this.$beforeContentPadding = i14;
                this.$afterContentPadding = i12;
                this.$visualItemOffset = j9;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            public LazyListMeasuredItem createItem(int i15, Object key, Object obj, List<? extends Placeable> placeables) {
                int i16;
                AbstractC3292y.i(key, "key");
                AbstractC3292y.i(placeables, "placeables");
                if (i15 == this.$itemsCount - 1) {
                    i16 = 0;
                } else {
                    i16 = this.$spaceBetweenItems;
                }
                return new LazyListMeasuredItem(i15, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, i16, this.$visualItemOffset, key, obj, null);
            }
        };
        this.$state.m688setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.m686getChildConstraintsmsEJaDk());
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider, lazyListState.getFirstVisibleItemIndex());
                int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
                I i15 = I.f8786a;
                createNonObservableSnapshot.dispose();
                List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProvider, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release());
                LazyListMeasureResult m682measureLazyListCD5nmq0 = LazyListMeasureKt.m682measureLazyListCD5nmq0(itemCount, lazyListMeasuredItemProvider, i13, i9, i12, mo419roundToPx0680j_45, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m5139offsetNN6EwU, this.$isVertical, lazyListItemProvider.getHeaderIndexes(), this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), this.$beyondBoundsItemCount, calculateLazyLayoutPinnedIndices, new AnonymousClass2(lazyLayoutMeasureScope, j8, i11, i10));
                this.$state.applyMeasureResult$foundation_release(m682measureLazyListCD5nmq0);
                return m682measureLazyListCD5nmq0;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
