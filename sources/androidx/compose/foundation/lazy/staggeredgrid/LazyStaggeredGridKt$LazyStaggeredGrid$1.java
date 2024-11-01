package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridKt$LazyStaggeredGrid$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1 $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ InterfaceC2072n $slots;
    final /* synthetic */ LazyStaggeredGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridKt$LazyStaggeredGrid$1(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, InterfaceC2072n interfaceC2072n, Modifier modifier, PaddingValues paddingValues, boolean z8, FlingBehavior flingBehavior, boolean z9, float f8, float f9, Function1 function1, int i8, int i9, int i10) {
        super(2);
        this.$state = lazyStaggeredGridState;
        this.$orientation = orientation;
        this.$slots = interfaceC2072n;
        this.$modifier = modifier;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z9;
        this.$mainAxisSpacing = f8;
        this.$crossAxisSpacing = f9;
        this.$content = function1;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyStaggeredGridKt.m751LazyStaggeredGridLJWHXA8(this.$state, this.$orientation, this.$slots, this.$modifier, this.$contentPadding, this.$reverseLayout, this.$flingBehavior, this.$userScrollEnabled, this.$mainAxisSpacing, this.$crossAxisSpacing, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
