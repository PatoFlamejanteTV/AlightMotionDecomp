package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(Function1 consumeScrollDelta) {
        AbstractC3292y.i(consumeScrollDelta, "consumeScrollDelta");
        return new DefaultScrollableState(consumeScrollDelta);
    }

    @Composable
    public static final ScrollableState rememberScrollableState(Function1 consumeScrollDelta, Composer composer, int i8) {
        AbstractC3292y.i(consumeScrollDelta, "consumeScrollDelta");
        composer.startReplaceableGroup(-180460798);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i8, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(consumeScrollDelta, composer, i8 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ScrollableState(new ScrollableStateKt$rememberScrollableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollableState scrollableState = (ScrollableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollableState;
    }
}
