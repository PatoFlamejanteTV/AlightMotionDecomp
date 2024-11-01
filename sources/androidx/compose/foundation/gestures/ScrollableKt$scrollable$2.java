package androidx.compose.foundation.gestures;

import U5.h;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollableKt$scrollable$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ OverscrollEffect $overscrollEffect;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ ScrollableState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$2(Orientation orientation, ScrollableState scrollableState, boolean z8, MutableInteractionSource mutableInteractionSource, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z9) {
        super(3);
        this.$orientation = orientation;
        this.$state = scrollableState;
        this.$reverseDirection = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$flingBehavior = flingBehavior;
        this.$overscrollEffect = overscrollEffect;
        this.$enabled = z9;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        Modifier pointerScrollable;
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-629830927);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-629830927, i8, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:161)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f10149a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {coroutineScope, this.$orientation, this.$state, Boolean.valueOf(this.$reverseDirection)};
        Orientation orientation = this.$orientation;
        ScrollableState scrollableState = this.$state;
        boolean z8 = this.$reverseDirection;
        composer.startReplaceableGroup(-568225417);
        boolean z9 = false;
        for (int i9 = 0; i9 < 4; i9++) {
            z9 |= composer.changed(objArr[i9]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ContentInViewModifier(coroutineScope, orientation, scrollableState, z8);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier modifier = Modifier.Companion;
        pointerScrollable = ScrollableKt.pointerScrollable(FocusableKt.focusGroup(modifier).then(((ContentInViewModifier) rememberedValue2).getModifier()), this.$interactionSource, this.$orientation, this.$reverseDirection, this.$state, this.$flingBehavior, this.$overscrollEffect, this.$enabled, composer, 0);
        if (this.$enabled) {
            modifier = ModifierLocalScrollableContainerProvider.INSTANCE;
        }
        Modifier then = pointerScrollable.then(modifier);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
