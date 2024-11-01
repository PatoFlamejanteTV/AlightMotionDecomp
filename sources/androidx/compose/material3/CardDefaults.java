package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    @Composable
    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1463cardColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-1589582123);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(FilledCardTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.m1544contentColorForek8zF_U(j12, composer, i8 & 14);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
            j14 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(filledCardTokens.getDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1549surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), filledCardTokens.m2127getDisabledContainerElevationD9Ej5fM()));
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.m1544contentColorForek8zF_U(j12, composer, i8 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i8, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:455)");
        }
        CardColors cardColors = new CardColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1464cardElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(-574898487);
        if ((i9 & 1) != 0) {
            f14 = FilledCardTokens.INSTANCE.m2126getContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = FilledCardTokens.INSTANCE.m2132getPressedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = FilledCardTokens.INSTANCE.m2129getFocusContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = FilledCardTokens.INSTANCE.m2130getHoverContainerElevationD9Ej5fM();
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = FilledCardTokens.INSTANCE.m2128getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = FilledCardTokens.INSTANCE.m2127getDisabledContainerElevationD9Ej5fM();
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i8, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:373)");
        }
        CardElevation cardElevation = new CardElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @Composable
    /* renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1465elevatedCardColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(139558303);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.m1544contentColorForek8zF_U(j12, composer, i8 & 14);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
            j14 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(elevatedCardTokens.getDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1549surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), elevatedCardTokens.m2043getDisabledContainerElevationD9Ej5fM()));
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i8, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:484)");
        }
        CardColors cardColors = new CardColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1466elevatedCardElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(1154241939);
        if ((i9 & 1) != 0) {
            f14 = ElevatedCardTokens.INSTANCE.m2042getContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = ElevatedCardTokens.INSTANCE.m2048getPressedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = ElevatedCardTokens.INSTANCE.m2045getFocusContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = ElevatedCardTokens.INSTANCE.m2046getHoverContainerElevationD9Ej5fM();
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = ElevatedCardTokens.INSTANCE.m2044getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = ElevatedCardTokens.INSTANCE.m2043getDisabledContainerElevationD9Ej5fM();
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i8, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:401)");
        }
        CardElevation cardElevation = new CardElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @Composable
    public final Shape getElevatedShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-133496185);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i8, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:357)");
        }
        Shape shape = ShapesKt.toShape(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i8) {
        composer.startReplaceableGroup(1095404023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i8, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:360)");
        }
        Shape shape = ShapesKt.toShape(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(1266660211);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i8, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:354)");
        }
        Shape shape = ShapesKt.toShape(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final BorderStroke outlinedCardBorder(boolean z8, Composer composer, int i8, int i9) {
        long m2993compositeOverOWjLjI;
        composer.startReplaceableGroup(-392936593);
        if ((i9 & 1) != 0) {
            z8 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i8, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:533)");
        }
        if (z8) {
            composer.startReplaceableGroup(-31428837);
            m2993compositeOverOWjLjI = ColorSchemeKt.toColor(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-31428766);
            OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
            m2993compositeOverOWjLjI = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(outlinedCardTokens.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1549surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), outlinedCardTokens.m2227getDisabledContainerElevationD9Ej5fM()));
            composer.endReplaceableGroup();
        }
        Color m2938boximpl = Color.m2938boximpl(m2993compositeOverOWjLjI);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m2938boximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m286BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m2232getOutlineWidthD9Ej5fM(), m2993compositeOverOWjLjI);
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
    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1467outlinedCardColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-1112362409);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(OutlinedCardTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.m1544contentColorForek8zF_U(j12, composer, i8 & 14);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = j12;
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i8, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:514)");
        }
        CardColors cardColors = new CardColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1468outlinedCardElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(-97678773);
        if ((i9 & 1) != 0) {
            f14 = OutlinedCardTokens.INSTANCE.m2226getContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = f14;
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = f14;
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = f14;
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = OutlinedCardTokens.INSTANCE.m2228getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = OutlinedCardTokens.INSTANCE.m2227getDisabledContainerElevationD9Ej5fM();
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i8, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:429)");
        }
        CardElevation cardElevation = new CardElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }
}
