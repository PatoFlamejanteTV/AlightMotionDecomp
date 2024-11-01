package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridBeyondBoundsModifierKt {
    @Composable
    public static final Modifier lazyStaggeredGridBeyondBoundsModifier(Modifier modifier, LazyStaggeredGridState state, boolean z8, Orientation orientation, Composer composer, int i8) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        composer.startReplaceableGroup(-1763226771);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763226771, i8, -1, "androidx.compose.foundation.lazy.staggeredgrid.lazyStaggeredGridBeyondBoundsModifier (LazyStaggeredGridBeyondBoundsModifier.kt:32)");
        }
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridBeyondBoundsState(state);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridBeyondBoundsState lazyStaggeredGridBeyondBoundsState = (LazyStaggeredGridBeyondBoundsState) rememberedValue;
        Object[] objArr = {lazyStaggeredGridBeyondBoundsState, state, Boolean.valueOf(z8), layoutDirection, orientation};
        composer.startReplaceableGroup(-568225417);
        boolean z9 = false;
        for (int i9 = 0; i9 < 5; i9++) {
            z9 |= composer.changed(objArr[i9]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LazyLayoutBeyondBoundsModifierLocal(lazyStaggeredGridBeyondBoundsState, state.getBeyondBoundsInfo$foundation_release(), z8, layoutDirection, orientation);
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
