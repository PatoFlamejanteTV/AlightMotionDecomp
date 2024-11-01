package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    @Composable
    /* renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1637filledIconButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-669858473);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.m1544contentColorForek8zF_U(j12, composer, i8 & 14);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i8, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:608)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    /* renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1638filledIconToggleButtonColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(1887173701);
        if ((i9 & 1) != 0) {
            j14 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6);
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor(), composer, 6);
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = ColorSchemeKt.m1544contentColorForek8zF_U(j18, composer, (i8 >> 12) & 14);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1887173701, i8, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:635)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j14, j15, j16, j17, j18, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    /* renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1639filledTonalIconButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-18532843);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.m1544contentColorForek8zF_U(j12, composer, i8 & 14);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i8, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:666)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1640filledTonalIconToggleButtonColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(-19426557);
        if ((i9 & 1) != 0) {
            j14 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6);
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ColorSchemeKt.m1544contentColorForek8zF_U(j14, composer, i8 & 14);
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor(), composer, 6);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19426557, i8, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:693)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j14, j15, j16, j17, j18, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    public final Shape getFilledShape(Composer composer, int i8) {
        composer.startReplaceableGroup(1265841879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i8, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:539)");
        }
        Shape shape = ShapesKt.toShape(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i8) {
        composer.startReplaceableGroup(1327125527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i8, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:543)");
        }
        Shape shape = ShapesKt.toShape(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1641iconButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(999008085);
        if ((i9 & 1) != 0) {
            j12 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i8, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:555)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1642iconToggleButtonColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(-2020719549);
        if ((i9 & 1) != 0) {
            j14 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.m2947copywmQWz5c$default(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = ColorSchemeKt.toColor(IconButtonTokens.INSTANCE.getSelectedIconColor(), composer, 6);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020719549, i8, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:581)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j14, j15, j16, j17, j18, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    public final BorderStroke outlinedIconButtonBorder(boolean z8, Composer composer, int i8) {
        long m2947copywmQWz5c$default;
        composer.startReplaceableGroup(-511461558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i8, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:789)");
        }
        if (z8) {
            composer.startReplaceableGroup(1252615072);
            m2947copywmQWz5c$default = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1252615127);
            m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceableGroup();
        }
        Color m2938boximpl = Color.m2938boximpl(m2947copywmQWz5c$default);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m2938boximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m286BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m2236getUnselectedOutlineWidthD9Ej5fM(), m2947copywmQWz5c$default);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BorderStroke borderStroke = (BorderStroke) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStroke;
    }

    @Composable
    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1643outlinedIconButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-1030517545);
        if ((i9 & 1) != 0) {
            j12 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i8, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:723)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z8, boolean z9, Composer composer, int i8) {
        composer.startReplaceableGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i8, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:776)");
        }
        if (z9) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }
        BorderStroke outlinedIconButtonBorder = outlinedIconButtonBorder(z8, composer, (i8 & 14) | ((i8 >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return outlinedIconButtonBorder;
    }

    @Composable
    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1644outlinedIconToggleButtonColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(2130592709);
        if ((i9 & 1) != 0) {
            j14 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.m2947copywmQWz5c$default(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = ColorSchemeKt.toColor(OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = ColorSchemeKt.m1544contentColorForek8zF_U(j18, composer, (i8 >> 12) & 14);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130592709, i8, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:749)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j14, j15, j16, j17, j18, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }
}
