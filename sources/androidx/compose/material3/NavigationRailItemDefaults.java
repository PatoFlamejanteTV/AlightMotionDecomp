package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final NavigationRailItemDefaults INSTANCE = new NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    @Composable
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final NavigationRailItemColors m1700colorszjMxDiM(long j8, long j9, long j10, long j11, long j12, Composer composer, int i8, int i9) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        composer.startReplaceableGroup(1621601574);
        if ((i9 & 1) != 0) {
            j13 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i9 & 2) != 0) {
            j14 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        } else {
            j14 = j9;
        }
        if ((i9 & 4) != 0) {
            j15 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        } else {
            j15 = j10;
        }
        if ((i9 & 8) != 0) {
            j16 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer, 6);
        } else {
            j16 = j11;
        }
        if ((i9 & 16) != 0) {
            j17 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6);
        } else {
            j17 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621601574, i8, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:288)");
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(j13, j14, j15, j16, j17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationRailItemColors;
    }
}
