package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class WindowInfoKt {
    @Composable
    public static final void WindowFocusObserver(Function1 function1, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(127829799);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127829799, i9, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:53)");
            }
            WindowInfo windowInfo = (WindowInfo) startRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, i9 & 14);
            startRestartGroup.startReplaceableGroup(1439092530);
            boolean changed = startRestartGroup.changed(windowInfo) | startRestartGroup.changed(rememberUpdatedState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(windowInfo, (InterfaceC2072n) rememberedValue, startRestartGroup, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new WindowInfoKt$WindowFocusObserver$2(function1, i8));
        }
    }
}
