package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1 $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ float $horizontalItemSpacing;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ StaggeredGridCells $rows;
    final /* synthetic */ LazyStaggeredGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z8, Arrangement.Vertical vertical, float f8, FlingBehavior flingBehavior, boolean z9, Function1 function1, int i8, int i9) {
        super(2);
        this.$rows = staggeredGridCells;
        this.$modifier = modifier;
        this.$state = lazyStaggeredGridState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$verticalArrangement = vertical;
        this.$horizontalItemSpacing = f8;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z9;
        this.$content = function1;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyStaggeredGridDslKt.m745LazyHorizontalStaggeredGridcJHQLPU(this.$rows, this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$verticalArrangement, this.$horizontalItemSpacing, this.$flingBehavior, this.$userScrollEnabled, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
