package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    @Composable
    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1301colorsq0g_0yA(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i8, int i9, int i10) {
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        composer.startReplaceableGroup(436017687);
        if ((i10 & 1) != 0) {
            j18 = MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU();
        } else {
            j18 = j8;
        }
        if ((i10 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j19 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(materialTheme.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j19 = j9;
        }
        if ((i10 & 4) != 0) {
            j20 = MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU();
        } else {
            j20 = j10;
        }
        if ((i10 & 8) != 0) {
            j21 = Color.m2947copywmQWz5c$default(j20, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j11;
        }
        if ((i10 & 16) != 0) {
            j22 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j12;
        }
        if ((i10 & 32) != 0) {
            j23 = Color.m2947copywmQWz5c$default(j22, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j13;
        }
        if ((i10 & 64) != 0) {
            j24 = Color.m2947copywmQWz5c$default(ColorsKt.m1173contentColorForek8zF_U(j20, composer, (i8 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j14;
        }
        if ((i10 & 128) != 0) {
            j25 = Color.m2947copywmQWz5c$default(j20, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j25 = j15;
        }
        if ((i10 & 256) != 0) {
            j26 = Color.m2947copywmQWz5c$default(j24, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j26 = j16;
        }
        if ((i10 & 512) != 0) {
            j27 = Color.m2947copywmQWz5c$default(j23, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j27 = j17;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(436017687, i8, i9, "androidx.compose.material.SliderDefaults.colors (Slider.kt:479)");
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
