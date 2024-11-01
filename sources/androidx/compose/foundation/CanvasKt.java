package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class CanvasKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Canvas(Modifier modifier, Function1 onDraw, Composer composer, int i8) {
        int i9;
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(onDraw, "onDraw");
        Composer startRestartGroup = composer.startRestartGroup(-932836462);
        if ((i8 & 14) == 0) {
            i9 = (startRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= startRestartGroup.changedInstance(onDraw) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-932836462, i8, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            SpacerKt.Spacer(DrawModifierKt.drawBehind(modifier, onDraw), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CanvasKt$Canvas$1(modifier, onDraw, i8));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalFoundationApi
    public static final void Canvas(Modifier modifier, String contentDescription, Function1 onDraw, Composer composer, int i8) {
        int i9;
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(contentDescription, "contentDescription");
        AbstractC3292y.i(onDraw, "onDraw");
        Composer startRestartGroup = composer.startRestartGroup(-1162737955);
        if ((i8 & 14) == 0) {
            i9 = (startRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= startRestartGroup.changed(contentDescription) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= startRestartGroup.changedInstance(onDraw) ? 256 : 128;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162737955, i9, -1, "androidx.compose.foundation.Canvas (Canvas.kt:63)");
            }
            Modifier drawBehind = DrawModifierKt.drawBehind(modifier, onDraw);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(contentDescription);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CanvasKt$Canvas$2$1(contentDescription);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SemanticsModifierKt.semantics$default(drawBehind, false, (Function1) rememberedValue, 1, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CanvasKt$Canvas$3(modifier, contentDescription, onDraw, i8));
    }
}
