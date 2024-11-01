package androidx.compose.foundation.pager;

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
public final class PagerBeyondBoundsModifierKt {
    @Composable
    public static final Modifier pagerBeyondBoundsModifier(Modifier modifier, PagerState state, int i8, boolean z8, Orientation orientation, Composer composer, int i9) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        composer.startReplaceableGroup(633480912);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(633480912, i9, -1, "androidx.compose.foundation.pager.pagerBeyondBoundsModifier (PagerBeyondBoundsModifier.kt:33)");
        }
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Object[] objArr = {state, Integer.valueOf(i8), Boolean.valueOf(z8), layoutDirection, orientation};
        composer.startReplaceableGroup(-568225417);
        boolean z9 = false;
        for (int i10 = 0; i10 < 5; i10++) {
            z9 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutBeyondBoundsModifierLocal(new PagerBeyondBoundsState(state, i8), state.getBeyondBoundsInfo$foundation_release(), z8, layoutDirection, orientation);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then((Modifier) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
