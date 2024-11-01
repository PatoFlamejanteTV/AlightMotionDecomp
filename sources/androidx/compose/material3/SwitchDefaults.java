package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = Dp.m5155constructorimpl(16);

    private SwitchDefaults() {
    }

    @Composable
    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m1792colorsV1nXRL4(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i8, int i9, int i10) {
        composer.startReplaceableGroup(1937926421);
        long color = (i10 & 1) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j8;
        long color2 = (i10 & 2) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j9;
        long m2983getTransparent0d7_KjU = (i10 & 4) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j10;
        long color3 = (i10 & 8) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j11;
        long color4 = (i10 & 16) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j12;
        long color5 = (i10 & 32) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j13;
        long color6 = (i10 & 64) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j14;
        long color7 = (i10 & 128) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j15;
        long m2993compositeOverOWjLjI = (i10 & 256) != 0 ? ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU()) : j16;
        long m2993compositeOverOWjLjI2 = (i10 & 512) != 0 ? ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU()) : j17;
        long m2983getTransparent0d7_KjU2 = (i10 & 1024) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j18;
        long m2993compositeOverOWjLjI3 = (i10 & 2048) != 0 ? ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU()) : j19;
        long m2993compositeOverOWjLjI4 = (i10 & 4096) != 0 ? ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU()) : j20;
        long m2993compositeOverOWjLjI5 = (i10 & 8192) != 0 ? ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU()) : j21;
        long m2993compositeOverOWjLjI6 = (i10 & 16384) != 0 ? ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU()) : j22;
        long m2993compositeOverOWjLjI7 = (i10 & 32768) != 0 ? ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU()) : j23;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i8, i9, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:279)");
        }
        SwitchColors switchColors = new SwitchColors(color, color2, m2983getTransparent0d7_KjU, color3, color4, color5, color6, color7, m2993compositeOverOWjLjI, m2993compositeOverOWjLjI2, m2983getTransparent0d7_KjU2, m2993compositeOverOWjLjI3, m2993compositeOverOWjLjI4, m2993compositeOverOWjLjI5, m2993compositeOverOWjLjI6, m2993compositeOverOWjLjI7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1793getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
