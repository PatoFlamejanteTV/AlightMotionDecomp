package androidx.compose.material3;

import Q5.p;
import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalColorScheme$1.INSTANCE);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: applyTonalElevation-Hht5A8o, reason: not valid java name */
    public static final long m1542applyTonalElevationHht5A8o(ColorScheme applyTonalElevation, long j8, float f8) {
        AbstractC3292y.i(applyTonalElevation, "$this$applyTonalElevation");
        if (Color.m2949equalsimpl0(j8, applyTonalElevation.m1508getSurface0d7_KjU())) {
            return m1549surfaceColorAtElevation3ABfNKs(applyTonalElevation, f8);
        }
        return j8;
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1543contentColorFor4WTKRHQ(ColorScheme contentColorFor, long j8) {
        AbstractC3292y.i(contentColorFor, "$this$contentColorFor");
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1503getPrimary0d7_KjU())) {
            return contentColorFor.m1493getOnPrimary0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1506getSecondary0d7_KjU())) {
            return contentColorFor.m1495getOnSecondary0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1511getTertiary0d7_KjU())) {
            return contentColorFor.m1499getOnTertiary0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1484getBackground0d7_KjU())) {
            return contentColorFor.m1490getOnBackground0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1485getError0d7_KjU())) {
            return contentColorFor.m1491getOnError0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1508getSurface0d7_KjU())) {
            return contentColorFor.m1497getOnSurface0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1510getSurfaceVariant0d7_KjU())) {
            return contentColorFor.m1498getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1504getPrimaryContainer0d7_KjU())) {
            return contentColorFor.m1494getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1507getSecondaryContainer0d7_KjU())) {
            return contentColorFor.m1496getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1512getTertiaryContainer0d7_KjU())) {
            return contentColorFor.m1500getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1486getErrorContainer0d7_KjU())) {
            return contentColorFor.m1492getOnErrorContainer0d7_KjU();
        }
        if (Color.m2949equalsimpl0(j8, contentColorFor.m1489getInverseSurface0d7_KjU())) {
            return contentColorFor.m1487getInverseOnSurface0d7_KjU();
        }
        return Color.Companion.m2984getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1544contentColorForek8zF_U(long j8, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i8, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long m1543contentColorFor4WTKRHQ = m1543contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j8);
        if (m1543contentColorFor4WTKRHQ == Color.Companion.m2984getUnspecified0d7_KjU()) {
            m1543contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1543contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1545darkColorSchemeG1PFcw(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1546darkColorSchemeG1PFcw$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i8, Object obj) {
        long m1993getPrimary0d7_KjU = (i8 & 1) != 0 ? ColorDarkTokens.INSTANCE.m1993getPrimary0d7_KjU() : j8;
        return m1545darkColorSchemeG1PFcw(m1993getPrimary0d7_KjU, (i8 & 2) != 0 ? ColorDarkTokens.INSTANCE.m1983getOnPrimary0d7_KjU() : j9, (i8 & 4) != 0 ? ColorDarkTokens.INSTANCE.m1994getPrimaryContainer0d7_KjU() : j10, (i8 & 8) != 0 ? ColorDarkTokens.INSTANCE.m1984getOnPrimaryContainer0d7_KjU() : j11, (i8 & 16) != 0 ? ColorDarkTokens.INSTANCE.m1978getInversePrimary0d7_KjU() : j12, (i8 & 32) != 0 ? ColorDarkTokens.INSTANCE.m1996getSecondary0d7_KjU() : j13, (i8 & 64) != 0 ? ColorDarkTokens.INSTANCE.m1985getOnSecondary0d7_KjU() : j14, (i8 & 128) != 0 ? ColorDarkTokens.INSTANCE.m1997getSecondaryContainer0d7_KjU() : j15, (i8 & 256) != 0 ? ColorDarkTokens.INSTANCE.m1986getOnSecondaryContainer0d7_KjU() : j16, (i8 & 512) != 0 ? ColorDarkTokens.INSTANCE.m2001getTertiary0d7_KjU() : j17, (i8 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m1989getOnTertiary0d7_KjU() : j18, (i8 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m2002getTertiaryContainer0d7_KjU() : j19, (i8 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m1990getOnTertiaryContainer0d7_KjU() : j20, (i8 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m1974getBackground0d7_KjU() : j21, (i8 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m1980getOnBackground0d7_KjU() : j22, (i8 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m1998getSurface0d7_KjU() : j23, (i8 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m1987getOnSurface0d7_KjU() : j24, (i8 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m2000getSurfaceVariant0d7_KjU() : j25, (i8 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m1988getOnSurfaceVariant0d7_KjU() : j26, (i8 & 524288) != 0 ? m1993getPrimary0d7_KjU : j27, (i8 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m1979getInverseSurface0d7_KjU() : j28, (i8 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m1977getInverseOnSurface0d7_KjU() : j29, (i8 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m1975getError0d7_KjU() : j30, (i8 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m1981getOnError0d7_KjU() : j31, (i8 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m1976getErrorContainer0d7_KjU() : j32, (i8 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m1982getOnErrorContainer0d7_KjU() : j33, (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m1991getOutline0d7_KjU() : j34, (i8 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m1992getOutlineVariant0d7_KjU() : j35, (i8 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m1995getScrim0d7_KjU() : j36);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens value) {
        AbstractC3292y.i(colorScheme, "<this>");
        AbstractC3292y.i(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return colorScheme.m1484getBackground0d7_KjU();
            case 2:
                return colorScheme.m1485getError0d7_KjU();
            case 3:
                return colorScheme.m1486getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1487getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1488getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1489getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1490getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1491getOnError0d7_KjU();
            case 9:
                return colorScheme.m1492getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1493getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1494getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m1495getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m1496getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m1497getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1498getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1509getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1499getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1500getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1501getOutline0d7_KjU();
            case 20:
                return colorScheme.m1502getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1503getPrimary0d7_KjU();
            case 22:
                return colorScheme.m1504getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1505getScrim0d7_KjU();
            case 24:
                return colorScheme.m1506getSecondary0d7_KjU();
            case 25:
                return colorScheme.m1507getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m1508getSurface0d7_KjU();
            case 27:
                return colorScheme.m1510getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m1511getTertiary0d7_KjU();
            case 29:
                return colorScheme.m1512getTertiaryContainer0d7_KjU();
            default:
                throw new p();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1547lightColorSchemeG1PFcw(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1548lightColorSchemeG1PFcw$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i8, Object obj) {
        long m2022getPrimary0d7_KjU = (i8 & 1) != 0 ? ColorLightTokens.INSTANCE.m2022getPrimary0d7_KjU() : j8;
        return m1547lightColorSchemeG1PFcw(m2022getPrimary0d7_KjU, (i8 & 2) != 0 ? ColorLightTokens.INSTANCE.m2012getOnPrimary0d7_KjU() : j9, (i8 & 4) != 0 ? ColorLightTokens.INSTANCE.m2023getPrimaryContainer0d7_KjU() : j10, (i8 & 8) != 0 ? ColorLightTokens.INSTANCE.m2013getOnPrimaryContainer0d7_KjU() : j11, (i8 & 16) != 0 ? ColorLightTokens.INSTANCE.m2007getInversePrimary0d7_KjU() : j12, (i8 & 32) != 0 ? ColorLightTokens.INSTANCE.m2025getSecondary0d7_KjU() : j13, (i8 & 64) != 0 ? ColorLightTokens.INSTANCE.m2014getOnSecondary0d7_KjU() : j14, (i8 & 128) != 0 ? ColorLightTokens.INSTANCE.m2026getSecondaryContainer0d7_KjU() : j15, (i8 & 256) != 0 ? ColorLightTokens.INSTANCE.m2015getOnSecondaryContainer0d7_KjU() : j16, (i8 & 512) != 0 ? ColorLightTokens.INSTANCE.m2030getTertiary0d7_KjU() : j17, (i8 & 1024) != 0 ? ColorLightTokens.INSTANCE.m2018getOnTertiary0d7_KjU() : j18, (i8 & 2048) != 0 ? ColorLightTokens.INSTANCE.m2031getTertiaryContainer0d7_KjU() : j19, (i8 & 4096) != 0 ? ColorLightTokens.INSTANCE.m2019getOnTertiaryContainer0d7_KjU() : j20, (i8 & 8192) != 0 ? ColorLightTokens.INSTANCE.m2003getBackground0d7_KjU() : j21, (i8 & 16384) != 0 ? ColorLightTokens.INSTANCE.m2009getOnBackground0d7_KjU() : j22, (i8 & 32768) != 0 ? ColorLightTokens.INSTANCE.m2027getSurface0d7_KjU() : j23, (i8 & 65536) != 0 ? ColorLightTokens.INSTANCE.m2016getOnSurface0d7_KjU() : j24, (i8 & 131072) != 0 ? ColorLightTokens.INSTANCE.m2029getSurfaceVariant0d7_KjU() : j25, (i8 & 262144) != 0 ? ColorLightTokens.INSTANCE.m2017getOnSurfaceVariant0d7_KjU() : j26, (i8 & 524288) != 0 ? m2022getPrimary0d7_KjU : j27, (i8 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2008getInverseSurface0d7_KjU() : j28, (i8 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2006getInverseOnSurface0d7_KjU() : j29, (i8 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2004getError0d7_KjU() : j30, (i8 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2010getOnError0d7_KjU() : j31, (i8 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2005getErrorContainer0d7_KjU() : j32, (i8 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2011getOnErrorContainer0d7_KjU() : j33, (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m2020getOutline0d7_KjU() : j34, (i8 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m2021getOutlineVariant0d7_KjU() : j35, (i8 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m2024getScrim0d7_KjU() : j36);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1549surfaceColorAtElevation3ABfNKs(ColorScheme surfaceColorAtElevation, float f8) {
        AbstractC3292y.i(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (Dp.m5160equalsimpl0(f8, Dp.m5155constructorimpl(0))) {
            return surfaceColorAtElevation.m1508getSurface0d7_KjU();
        }
        return ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(surfaceColorAtElevation.m1509getSurfaceTint0d7_KjU(), ((((float) Math.log(f8 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.m1508getSurface0d7_KjU());
    }

    @Composable
    @ReadOnlyComposable
    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i8) {
        AbstractC3292y.i(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i8, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    public static final void updateColorSchemeFrom(ColorScheme colorScheme, ColorScheme other) {
        AbstractC3292y.i(colorScheme, "<this>");
        AbstractC3292y.i(other, "other");
        colorScheme.m1532setPrimary8_81llA$material3_release(other.m1503getPrimary0d7_KjU());
        colorScheme.m1522setOnPrimary8_81llA$material3_release(other.m1493getOnPrimary0d7_KjU());
        colorScheme.m1533setPrimaryContainer8_81llA$material3_release(other.m1504getPrimaryContainer0d7_KjU());
        colorScheme.m1523setOnPrimaryContainer8_81llA$material3_release(other.m1494getOnPrimaryContainer0d7_KjU());
        colorScheme.m1517setInversePrimary8_81llA$material3_release(other.m1488getInversePrimary0d7_KjU());
        colorScheme.m1535setSecondary8_81llA$material3_release(other.m1506getSecondary0d7_KjU());
        colorScheme.m1524setOnSecondary8_81llA$material3_release(other.m1495getOnSecondary0d7_KjU());
        colorScheme.m1536setSecondaryContainer8_81llA$material3_release(other.m1507getSecondaryContainer0d7_KjU());
        colorScheme.m1525setOnSecondaryContainer8_81llA$material3_release(other.m1496getOnSecondaryContainer0d7_KjU());
        colorScheme.m1540setTertiary8_81llA$material3_release(other.m1511getTertiary0d7_KjU());
        colorScheme.m1528setOnTertiary8_81llA$material3_release(other.m1499getOnTertiary0d7_KjU());
        colorScheme.m1541setTertiaryContainer8_81llA$material3_release(other.m1512getTertiaryContainer0d7_KjU());
        colorScheme.m1529setOnTertiaryContainer8_81llA$material3_release(other.m1500getOnTertiaryContainer0d7_KjU());
        colorScheme.m1513setBackground8_81llA$material3_release(other.m1484getBackground0d7_KjU());
        colorScheme.m1519setOnBackground8_81llA$material3_release(other.m1490getOnBackground0d7_KjU());
        colorScheme.m1537setSurface8_81llA$material3_release(other.m1508getSurface0d7_KjU());
        colorScheme.m1526setOnSurface8_81llA$material3_release(other.m1497getOnSurface0d7_KjU());
        colorScheme.m1539setSurfaceVariant8_81llA$material3_release(other.m1510getSurfaceVariant0d7_KjU());
        colorScheme.m1527setOnSurfaceVariant8_81llA$material3_release(other.m1498getOnSurfaceVariant0d7_KjU());
        colorScheme.m1538setSurfaceTint8_81llA$material3_release(other.m1509getSurfaceTint0d7_KjU());
        colorScheme.m1518setInverseSurface8_81llA$material3_release(other.m1489getInverseSurface0d7_KjU());
        colorScheme.m1516setInverseOnSurface8_81llA$material3_release(other.m1487getInverseOnSurface0d7_KjU());
        colorScheme.m1514setError8_81llA$material3_release(other.m1485getError0d7_KjU());
        colorScheme.m1520setOnError8_81llA$material3_release(other.m1491getOnError0d7_KjU());
        colorScheme.m1515setErrorContainer8_81llA$material3_release(other.m1486getErrorContainer0d7_KjU());
        colorScheme.m1521setOnErrorContainer8_81llA$material3_release(other.m1492getOnErrorContainer0d7_KjU());
        colorScheme.m1530setOutline8_81llA$material3_release(other.m1501getOutline0d7_KjU());
        colorScheme.m1531setOutlineVariant8_81llA$material3_release(other.m1502getOutlineVariant0d7_KjU());
        colorScheme.m1534setScrim8_81llA$material3_release(other.m1505getScrim0d7_KjU());
    }
}
