package androidx.compose.foundation.lazy.layout;

import U5.h;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    @Composable
    public static final Modifier lazyLayoutSemantics(Modifier modifier, Function0 itemProviderLambda, LazyLayoutSemanticState state, Orientation orientation, boolean z8, boolean z9, Composer composer, int i8) {
        boolean z10;
        LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1;
        LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(itemProviderLambda, "itemProviderLambda");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        composer.startReplaceableGroup(1070136913);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i8, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:40)");
        }
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
        Object[] objArr = {itemProviderLambda, state, orientation, Boolean.valueOf(z8)};
        composer.startReplaceableGroup(-568225417);
        boolean z11 = false;
        for (int i9 = 0; i9 < 4; i9++) {
            z11 |= composer.changed(objArr[i9]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
            if (orientation == Orientation.Vertical) {
                z10 = true;
            } else {
                z10 = false;
            }
            LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(itemProviderLambda);
            ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1(state), new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2(itemProviderLambda, state), z9);
            if (z8) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(z10, coroutineScope, state);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = null;
            }
            if (z8) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1(itemProviderLambda, coroutineScope, state);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = null;
            }
            rememberedValue2 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1, z10, scrollAxisRange, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1, state.collectionInfo()), 1, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then((Modifier) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
