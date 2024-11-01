package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(LazyListState state, boolean z8, Composer composer, int i8) {
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(596174919);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(596174919, i8, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:23)");
        }
        Boolean valueOf = Boolean.valueOf(z8);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(state, z8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyLayoutSemanticState;
    }
}
