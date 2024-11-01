package androidx.compose.material3;

import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    @Composable
    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final RadioButtonColors m1729colorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-351083046);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(RadioButtonTokens.INSTANCE.getSelectedIconColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.toColor(RadioButtonTokens.INSTANCE.getUnselectedIconColor(), composer, 6);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(RadioButtonTokens.INSTANCE.getDisabledSelectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(RadioButtonTokens.INSTANCE.getDisabledUnselectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-351083046, i8, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:144)");
        }
        RadioButtonColors radioButtonColors = new RadioButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return radioButtonColors;
    }
}
