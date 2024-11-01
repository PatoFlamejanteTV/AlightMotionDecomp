package androidx.compose.foundation;

import U5.h;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollKt$scroll$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ boolean $isScrollable;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ boolean $reverseScrolling;
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2(boolean z8, boolean z9, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior) {
        super(3);
        this.$isVertical = z8;
        this.$reverseScrolling = z9;
        this.$state = scrollState;
        this.$isScrollable = z10;
        this.$flingBehavior = flingBehavior;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(1478351300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1478351300, i8, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:266)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composer, 6);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f10149a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier.Companion companion = Modifier.Companion;
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, new ScrollKt$scroll$2$semantics$1(this.$reverseScrolling, this.$isVertical, this.$isScrollable, this.$state, coroutineScope), 1, null);
        Orientation orientation = this.$isVertical ? Orientation.Vertical : Orientation.Horizontal;
        Modifier then = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(semantics$default, orientation), overscrollEffect).then(ScrollableKt.scrollable(companion, this.$state, orientation, overscrollEffect, this.$isScrollable, scrollableDefaults.reverseDirection((LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, this.$reverseScrolling), this.$flingBehavior, this.$state.getInternalInteractionSource$foundation_release())).then(new ScrollingLayoutElement(this.$state, this.$reverseScrolling, this.$isVertical));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
