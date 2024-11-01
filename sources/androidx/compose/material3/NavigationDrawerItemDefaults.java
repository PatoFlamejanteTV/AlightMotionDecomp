package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();
    private static final PaddingValues ItemPadding = PaddingKt.m572PaddingValuesYgX7TsA$default(Dp.m5155constructorimpl(12), 0.0f, 2, null);

    private NavigationDrawerItemDefaults() {
    }

    @Composable
    /* renamed from: colors-oq7We08, reason: not valid java name */
    public final NavigationDrawerItemColors m1688colorsoq7We08(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i8, int i9) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        composer.startReplaceableGroup(-1574983348);
        if ((i9 & 1) != 0) {
            j16 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        } else {
            j16 = j8;
        }
        if ((i9 & 2) != 0) {
            j17 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j17 = j9;
        }
        if ((i9 & 4) != 0) {
            j18 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer, 6);
        } else {
            j18 = j10;
        }
        if ((i9 & 8) != 0) {
            j19 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer, 6);
        } else {
            j19 = j11;
        }
        if ((i9 & 16) != 0) {
            j20 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        } else {
            j20 = j12;
        }
        if ((i9 & 32) != 0) {
            j21 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6);
        } else {
            j21 = j13;
        }
        if ((i9 & 64) != 0) {
            j22 = j20;
        } else {
            j22 = j14;
        }
        if ((i9 & 128) != 0) {
            j23 = j21;
        } else {
            j23 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574983348, i8, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:759)");
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(j18, j19, j20, j21, j16, j17, j22, j23, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDrawerItemsColor;
    }

    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
