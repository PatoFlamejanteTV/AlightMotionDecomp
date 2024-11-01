package androidx.compose.foundation.pager;

import Q5.I;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt$Pager$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ SnapFlingBehavior $flingBehavior;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Function1 $key;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ InterfaceC2074p $pageContent;
    final /* synthetic */ NestedScrollConnection $pageNestedScrollConnection;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$Pager$2(Modifier modifier, PagerState pagerState, PaddingValues paddingValues, boolean z8, Orientation orientation, SnapFlingBehavior snapFlingBehavior, boolean z9, int i8, float f8, PageSize pageSize, NestedScrollConnection nestedScrollConnection, Function1 function1, Alignment.Horizontal horizontal, Alignment.Vertical vertical, InterfaceC2074p interfaceC2074p, int i9, int i10, int i11) {
        super(2);
        this.$modifier = modifier;
        this.$state = pagerState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$orientation = orientation;
        this.$flingBehavior = snapFlingBehavior;
        this.$userScrollEnabled = z9;
        this.$beyondBoundsPageCount = i8;
        this.$pageSpacing = f8;
        this.$pageSize = pageSize;
        this.$pageNestedScrollConnection = nestedScrollConnection;
        this.$key = function1;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$pageContent = interfaceC2074p;
        this.$$changed = i9;
        this.$$changed1 = i10;
        this.$$default = i11;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyLayoutPagerKt.m780Pagerfs30GE4(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$orientation, this.$flingBehavior, this.$userScrollEnabled, this.$beyondBoundsPageCount, this.$pageSpacing, this.$pageSize, this.$pageNestedScrollConnection, this.$key, this.$horizontalAlignment, this.$verticalAlignment, this.$pageContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
