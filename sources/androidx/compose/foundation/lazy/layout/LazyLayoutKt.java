package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void LazyLayout(LazyLayoutItemProvider itemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, InterfaceC2072n measurePolicy, Composer composer, int i8, int i9) {
        int i10;
        AbstractC3292y.i(itemProvider, "itemProvider");
        AbstractC3292y.i(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(852831187);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (startRestartGroup.changed(itemProvider) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i11 = i9 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i12 = i9 & 4;
        if (i12 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= startRestartGroup.changedInstance(measurePolicy) ? 2048 : 1024;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (i12 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852831187, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
            }
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(itemProvider);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LazyLayoutKt$LazyLayout$1$1(itemProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LazyLayout((Function0) rememberedValue, modifier, lazyLayoutPrefetchState, measurePolicy, startRestartGroup, i10 & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new LazyLayoutKt$LazyLayout$2(itemProvider, modifier2, lazyLayoutPrefetchState2, measurePolicy, i8, i9));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0051  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyLayout(kotlin.jvm.functions.Function0 r14, androidx.compose.ui.Modifier r15, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r16, c6.InterfaceC2072n r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }
}
