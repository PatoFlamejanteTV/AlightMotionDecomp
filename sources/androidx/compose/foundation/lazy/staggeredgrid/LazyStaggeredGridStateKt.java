package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LazyStaggeredGridStateKt {
    @Composable
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(int i8, int i9, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(161145796);
        if ((i11 & 1) != 0) {
            i8 = 0;
        }
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(161145796, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:64)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyStaggeredGridState, Object> saver = LazyStaggeredGridState.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i8);
        Integer valueOf2 = Integer.valueOf(i9);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1(i8, i9);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridState;
    }
}
