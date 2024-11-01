package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m1469colors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(-89536160);
        if ((i9 & 1) != 0) {
            j14 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedContainerColor());
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getUnselectedOutlineColor());
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedIconColor());
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.m2947copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = Color.m2947copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = j17;
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i8, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:195)");
        }
        CheckboxColors checkboxColors = new CheckboxColors(j16, Color.m2947copywmQWz5c$default(j16, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j14, Color.m2947copywmQWz5c$default(j14, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j17, Color.m2947copywmQWz5c$default(j18, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j19, j14, j15, j17, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return checkboxColors;
    }
}
