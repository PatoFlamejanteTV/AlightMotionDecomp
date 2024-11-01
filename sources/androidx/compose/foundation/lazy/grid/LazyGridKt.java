package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyGrid(androidx.compose.ui.Modifier r31, androidx.compose.foundation.lazy.grid.LazyGridState r32, c6.InterfaceC2072n r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, boolean r36, androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, androidx.compose.foundation.layout.Arrangement.Vertical r39, androidx.compose.foundation.layout.Arrangement.Horizontal r40, kotlin.jvm.functions.Function1 r41, androidx.compose.runtime.Composer r42, int r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, c6.n, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(Function0 function0, LazyGridState lazyGridState, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-649335720);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(lazyGridState)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649335720, i8, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:138)");
            }
            LazyGridItemProvider lazyGridItemProvider = (LazyGridItemProvider) function0.invoke();
            if (lazyGridItemProvider.getItemCount() > 0) {
                LazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyGridState, lazyGridItemProvider, 0, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridKt$ScrollPositionUpdater$1(function0, lazyGridState, i8));
        }
    }

    @Composable
    private static final InterfaceC2072n rememberLazyGridMeasurePolicy(Function0 function0, LazyGridState lazyGridState, InterfaceC2072n interfaceC2072n, PaddingValues paddingValues, boolean z8, boolean z9, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Composer composer, int i8, int i9) {
        Arrangement.Horizontal horizontal2;
        Arrangement.Vertical vertical2;
        composer.startReplaceableGroup(1292704639);
        if ((i9 & 64) != 0) {
            horizontal2 = null;
        } else {
            horizontal2 = horizontal;
        }
        if ((i9 & 128) != 0) {
            vertical2 = null;
        } else {
            vertical2 = vertical;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1292704639, i8, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
        }
        Object[] objArr = {lazyGridState, interfaceC2072n, paddingValues, Boolean.valueOf(z8), Boolean.valueOf(z9), horizontal2, vertical2};
        composer.startReplaceableGroup(-568225417);
        boolean z10 = false;
        for (int i10 = 0; i10 < 7; i10++) {
            z10 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(z9, paddingValues, z8, function0, interfaceC2072n, lazyGridState, vertical2, horizontal2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InterfaceC2072n interfaceC2072n2 = (InterfaceC2072n) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return interfaceC2072n2;
    }
}
