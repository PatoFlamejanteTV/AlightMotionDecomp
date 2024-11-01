package androidx.compose.material;

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
    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final RadioButtonColors m1296colorsRGew2ao(long j8, long j9, long j10, Composer composer, int i8, int i9) {
        long j11;
        long j12;
        long j13;
        composer.startReplaceableGroup(1370708026);
        if ((i9 & 1) != 0) {
            j11 = MaterialTheme.INSTANCE.getColors(composer, 6).m1157getSecondary0d7_KjU();
        } else {
            j11 = j8;
        }
        if ((i9 & 2) != 0) {
            j12 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j9;
        }
        if ((i9 & 4) != 0) {
            j13 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370708026, i8, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        Color m2938boximpl = Color.m2938boximpl(j11);
        Color m2938boximpl2 = Color.m2938boximpl(j12);
        Color m2938boximpl3 = Color.m2938boximpl(j13);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m2938boximpl) | composer.changed(m2938boximpl2) | composer.changed(m2938boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultRadioButtonColors(j11, j12, j13, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultRadioButtonColors;
    }
}
