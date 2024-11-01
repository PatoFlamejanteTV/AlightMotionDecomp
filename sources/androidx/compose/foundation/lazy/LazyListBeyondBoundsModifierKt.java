package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListBeyondBoundsModifierKt {
    @Composable
    public static final Modifier lazyListBeyondBoundsModifier(Modifier modifier, LazyListState state, int i8, boolean z8, Orientation orientation, Composer composer, int i9) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        composer.startReplaceableGroup(1452310458);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1452310458, i9, -1, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)");
        }
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Object valueOf = Integer.valueOf(i8);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListBeyondBoundsState(state, i8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyListBeyondBoundsState lazyListBeyondBoundsState = (LazyListBeyondBoundsState) rememberedValue;
        LazyLayoutBeyondBoundsInfo beyondBoundsInfo$foundation_release = state.getBeyondBoundsInfo$foundation_release();
        Object[] objArr = {lazyListBeyondBoundsState, beyondBoundsInfo$foundation_release, Boolean.valueOf(z8), layoutDirection, orientation};
        composer.startReplaceableGroup(-568225417);
        boolean z9 = false;
        for (int i10 = 0; i10 < 5; i10++) {
            z9 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LazyLayoutBeyondBoundsModifierLocal(lazyListBeyondBoundsState, beyondBoundsInfo$foundation_release, z8, layoutDirection, orientation);
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
