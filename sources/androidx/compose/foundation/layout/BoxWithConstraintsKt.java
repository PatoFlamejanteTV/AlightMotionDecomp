package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BoxWithConstraintsKt {
    @Composable
    @UiComposable
    public static final void BoxWithConstraints(Modifier modifier, Alignment alignment, boolean z8, InterfaceC2073o content, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1781813501);
        int i15 = i9 & 1;
        if (i15 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i16 = i9 & 2;
        if (i16 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(alignment)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i17 = i9 & 4;
        if (i17 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(content)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i15 != 0) {
                modifier = Modifier.Companion;
            }
            if (i16 != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            if (i17 != 0) {
                z8 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781813501, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, z8, startRestartGroup, (i10 >> 3) & 126);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(content) | startRestartGroup.changed(rememberBoxMeasurePolicy);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BoxWithConstraintsKt$BoxWithConstraints$1$1(rememberBoxMeasurePolicy, content, i10);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (InterfaceC2072n) rememberedValue, startRestartGroup, i10 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Alignment alignment2 = alignment;
        boolean z9 = z8;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BoxWithConstraintsKt$BoxWithConstraints$2(modifier2, alignment2, z9, content, i8, i9));
        }
    }
}
