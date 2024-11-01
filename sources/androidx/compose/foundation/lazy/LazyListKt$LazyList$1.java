package androidx.compose.foundation.lazy;

import Q5.I;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyListKt$LazyList$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ Function1 $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt$LazyList$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z8, boolean z9, FlingBehavior flingBehavior, boolean z10, int i8, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, Function1 function1, int i9, int i10, int i11) {
        super(2);
        this.$modifier = modifier;
        this.$state = lazyListState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$isVertical = z9;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z10;
        this.$beyondBoundsItemCount = i8;
        this.$horizontalAlignment = horizontal;
        this.$verticalArrangement = vertical;
        this.$verticalAlignment = vertical2;
        this.$horizontalArrangement = horizontal2;
        this.$content = function1;
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
        LazyListKt.LazyList(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$isVertical, this.$flingBehavior, this.$userScrollEnabled, this.$beyondBoundsItemCount, this.$horizontalAlignment, this.$verticalArrangement, this.$verticalAlignment, this.$horizontalArrangement, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
