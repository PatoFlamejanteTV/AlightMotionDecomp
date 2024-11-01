package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import j6.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.I;

/* loaded from: classes.dex */
public final class LazyGridItemProviderKt {
    @Composable
    @ExperimentalFoundationApi
    public static final Function0 rememberLazyGridItemProviderLambda(LazyGridState state, Function1 content, Composer composer, int i8) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(-1898306282);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1898306282, i8, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:37)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composer, (i8 >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1(rememberUpdatedState)), state));
            rememberedValue = new I(derivedStateOf) { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1
                @Override // j6.j
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        j jVar = (j) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jVar;
    }
}
