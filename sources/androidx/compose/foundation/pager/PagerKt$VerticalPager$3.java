package androidx.compose.foundation.pager;

import Q5.I;
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
public final class PagerKt$VerticalPager$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ SnapFlingBehavior $flingBehavior;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Function1 $key;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC2074p $pageContent;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ NestedScrollConnection $pageNestedScrollConnection;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$VerticalPager$3(int i8, Modifier modifier, PagerState pagerState, PaddingValues paddingValues, PageSize pageSize, int i9, float f8, Alignment.Horizontal horizontal, SnapFlingBehavior snapFlingBehavior, boolean z8, boolean z9, Function1 function1, NestedScrollConnection nestedScrollConnection, InterfaceC2074p interfaceC2074p, int i10, int i11, int i12) {
        super(2);
        this.$pageCount = i8;
        this.$modifier = modifier;
        this.$state = pagerState;
        this.$contentPadding = paddingValues;
        this.$pageSize = pageSize;
        this.$beyondBoundsPageCount = i9;
        this.$pageSpacing = f8;
        this.$horizontalAlignment = horizontal;
        this.$flingBehavior = snapFlingBehavior;
        this.$userScrollEnabled = z8;
        this.$reverseLayout = z9;
        this.$key = function1;
        this.$pageNestedScrollConnection = nestedScrollConnection;
        this.$pageContent = interfaceC2074p;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        PagerKt.m787VerticalPagerAlbwjTQ(this.$pageCount, this.$modifier, this.$state, this.$contentPadding, this.$pageSize, this.$beyondBoundsPageCount, this.$pageSpacing, this.$horizontalAlignment, this.$flingBehavior, this.$userScrollEnabled, this.$reverseLayout, this.$key, this.$pageNestedScrollConnection, this.$pageContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
