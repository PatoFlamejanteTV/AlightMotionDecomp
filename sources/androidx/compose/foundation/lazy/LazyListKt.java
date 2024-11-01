package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0156  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyList(androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.LazyListState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, boolean r36, androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, int r39, androidx.compose.ui.Alignment.Horizontal r40, androidx.compose.foundation.layout.Arrangement.Vertical r41, androidx.compose.ui.Alignment.Vertical r42, androidx.compose.foundation.layout.Arrangement.Horizontal r43, kotlin.jvm.functions.Function1 r44, androidx.compose.runtime.Composer r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalFoundationApi
    public static final void ScrollPositionUpdater(Function0 function0, LazyListState lazyListState, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-331135862);
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
            if (startRestartGroup.changed(lazyListState)) {
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
                ComposerKt.traceEventStart(-331135862, i8, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:140)");
            }
            LazyListItemProvider lazyListItemProvider = (LazyListItemProvider) function0.invoke();
            if (lazyListItemProvider.getItemCount() > 0) {
                LazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyListState, lazyListItemProvider, 0, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyListKt$ScrollPositionUpdater$1(function0, lazyListState, i8));
        }
    }

    @Composable
    @ExperimentalFoundationApi
    private static final InterfaceC2072n rememberLazyListMeasurePolicy(Function0 function0, LazyListState lazyListState, PaddingValues paddingValues, boolean z8, boolean z9, int i8, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, Composer composer, int i9, int i10) {
        Alignment.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        Arrangement.Horizontal horizontal4;
        Arrangement.Vertical vertical4;
        composer.startReplaceableGroup(183156450);
        if ((i10 & 64) != 0) {
            horizontal3 = null;
        } else {
            horizontal3 = horizontal;
        }
        if ((i10 & 128) != 0) {
            vertical3 = null;
        } else {
            vertical3 = vertical;
        }
        if ((i10 & 256) != 0) {
            horizontal4 = null;
        } else {
            horizontal4 = horizontal2;
        }
        if ((i10 & 512) != 0) {
            vertical4 = null;
        } else {
            vertical4 = vertical2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(183156450, i9, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {lazyListState, paddingValues, Boolean.valueOf(z8), Boolean.valueOf(z9), horizontal3, vertical3, horizontal4, vertical4};
        composer.startReplaceableGroup(-568225417);
        boolean z10 = false;
        for (int i11 = 0; i11 < 8; i11++) {
            z10 |= composer.changed(objArr[i11]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListKt$rememberLazyListMeasurePolicy$1$1(z9, paddingValues, z8, lazyListState, function0, vertical4, horizontal4, i8, horizontal3, vertical3);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InterfaceC2072n interfaceC2072n = (InterfaceC2072n) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return interfaceC2072n;
    }
}
