package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PagerSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberPagerSemanticState(PagerState state, boolean z8, boolean z9, Composer composer, int i8) {
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(352210115);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(352210115, i8, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:25)");
        }
        Boolean valueOf = Boolean.valueOf(z8);
        Boolean valueOf2 = Boolean.valueOf(z9);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(state) | composer.changed(valueOf2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(state, z9);
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
