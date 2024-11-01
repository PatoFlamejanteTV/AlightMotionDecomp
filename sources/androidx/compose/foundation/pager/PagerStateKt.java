package androidx.compose.foundation.pager;

import Q5.I;
import R5.AbstractC1435t;
import U5.d;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.a;
import androidx.compose.ui.unit.b;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    private static final float MinPageOffset = -0.5f;
    private static final float DefaultPositionThreshold = Dp.m5155constructorimpl(56);
    private static final PagerLayoutInfo EmptyLayoutInfo = new PagerLayoutInfo() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final int afterContentPadding;
        private final int beforeContentPadding;
        private final PageInfo closestPageToSnapPosition;
        private final int pageSize;
        private final int pageSpacing;
        private final int pagesCount;
        private final boolean reverseLayout;
        private final int viewportEndOffset;
        private final int viewportStartOffset;
        private final List<PageInfo> visiblePagesInfo = AbstractC1435t.m();
        private final long viewportSize = IntSize.Companion.m5326getZeroYbymL2g();
        private final Orientation orientation = Orientation.Horizontal;

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getAfterContentPadding() {
            return this.afterContentPadding;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getBeforeContentPadding() {
            return this.beforeContentPadding;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public PageInfo getClosestPageToSnapPosition() {
            return this.closestPageToSnapPosition;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public Orientation getOrientation() {
            return this.orientation;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSize() {
            return this.pageSize;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSpacing() {
            return this.pageSpacing;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPagesCount() {
            return this.pagesCount;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public boolean getReverseLayout() {
            return this.reverseLayout;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportEndOffset() {
            return this.viewportEndOffset;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        /* renamed from: getViewportSize-YbymL2g */
        public long mo789getViewportSizeYbymL2g() {
            return this.viewportSize;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportStartOffset() {
            return this.viewportStartOffset;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public List<PageInfo> getVisiblePagesInfo() {
            return this.visiblePagesInfo;
        }
    };
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo418roundToPxR2X_6o(long j8) {
            return a.a(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo419roundToPx0680j_4(float f8) {
            return a.b(this, f8);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo420toDpGaN1DYA(long j8) {
            return b.a(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo421toDpu2uoSUM(float f8) {
            return a.c(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo423toDpSizekrfVVM(long j8) {
            return a.e(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo424toPxR2X_6o(long j8) {
            return a.f(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo425toPx0680j_4(float f8) {
            return a.g(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return a.h(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo426toSizeXkaWNTQ(long j8) {
            return a.i(this, j8);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo427toSp0xMU5do(float f8) {
            return b.b(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo428toSpkPz2Gy4(float f8) {
            return a.j(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo422toDpu2uoSUM(int i8) {
            return a.d(this, i8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo429toSpkPz2Gy4(int i8) {
            return a.k(this, i8);
        }
    };
    private static final SnapPositionInLayout SnapAlignmentStartToStart = new SnapPositionInLayout() { // from class: androidx.compose.foundation.pager.PagerStateKt$SnapAlignmentStartToStart$1
        @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
        public final int position(Density SnapPositionInLayout, int i8, int i9, int i10) {
            AbstractC3292y.i(SnapPositionInLayout, "$this$SnapPositionInLayout");
            return 0;
        }
    };

    public static final Object animateToNextPage(PagerState pagerState, d dVar) {
        if (pagerState.getCurrentPage() + 1 < pagerState.getPageCount()) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, dVar, 6, null);
            if (animateScrollToPage$default == V5.b.e()) {
                return animateScrollToPage$default;
            }
            return I.f8786a;
        }
        return I.f8786a;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, d dVar) {
        if (pagerState.getCurrentPage() - 1 >= 0) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, dVar, 6, null);
            if (animateScrollToPage$default == V5.b.e()) {
                return animateScrollToPage$default;
            }
            return I.f8786a;
        }
        return I.f8786a;
    }

    private static final void debugLog(Function0 function0) {
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerLayoutInfo getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    public static /* synthetic */ void getEmptyLayoutInfo$annotations() {
    }

    public static final SnapPositionInLayout getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }

    public static /* synthetic */ void getSnapAlignmentStartToStart$annotations() {
    }

    @Composable
    @ExperimentalFoundationApi
    public static final PagerState rememberPagerState(int i8, float f8, Function0 pageCount, Composer composer, int i9, int i10) {
        AbstractC3292y.i(pageCount, "pageCount");
        composer.startReplaceableGroup(-1210768637);
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            f8 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i9, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:73)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i8);
        Float valueOf2 = Float.valueOf(f8);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(pageCount);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerStateKt$rememberPagerState$1$1(i8, f8, pageCount);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        pagerStateImpl.getPageCountState().setValue(pageCount);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }

    @Composable
    @ExperimentalFoundationApi
    public static final PagerState rememberPagerState(int i8, float f8, Composer composer, int i9, int i10) {
        composer.startReplaceableGroup(144687223);
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            f8 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(144687223, i9, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:113)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i8);
        Float valueOf2 = Float.valueOf(f8);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerStateKt$rememberPagerState$3$1(i8, f8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }
}
