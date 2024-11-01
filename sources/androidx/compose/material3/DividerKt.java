package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class DividerKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public static final void m1580Divider9IZ8Weo(Modifier modifier, float f8, long j8, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1562471785);
        int i14 = i9 & 1;
        if (i14 != 0) {
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
        int i15 = i9 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(f8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i8 & 896) == 0) {
            if ((i9 & 4) == 0 && startRestartGroup.changed(j8)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i8 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i14 != 0) {
                    modifier = Modifier.Companion;
                }
                if (i15 != 0) {
                    f8 = DividerDefaults.INSTANCE.m1579getThicknessD9Ej5fM();
                }
                if ((i9 & 4) != 0) {
                    j8 = DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562471785, i8, -1, "androidx.compose.material3.Divider (Divider.kt:43)");
            }
            startRestartGroup.startReplaceableGroup(1232935509);
            if (Dp.m5160equalsimpl0(f8, Dp.Companion.m5173getHairlineD9Ej5fM())) {
                f9 = Dp.m5155constructorimpl(1.0f / ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            } else {
                f9 = f8;
            }
            startRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m259backgroundbw27NRU$default(SizeKt.m610height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f9), j8, null, 2, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        float f10 = f8;
        long j9 = j8;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DividerKt$Divider$1(modifier2, f10, j9, i8, i9));
        }
    }
}
