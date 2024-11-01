package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MenuDefaults {
    public static final int $stable = 0;
    public static final MenuDefaults INSTANCE = new MenuDefaults();
    private static final PaddingValues DropdownMenuItemContentPadding = PaddingKt.m571PaddingValuesYgX7TsA(MenuKt.access$getDropdownMenuItemHorizontalPadding$p(), Dp.m5155constructorimpl(0));

    private MenuDefaults() {
    }

    public final PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }

    @Composable
    /* renamed from: itemColors-5tl4gsc, reason: not valid java name */
    public final MenuItemColors m1666itemColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(-1278543580);
        if ((i9 & 1) != 0) {
            j14 = ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6);
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6);
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1278543580, i8, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:234)");
        }
        MenuItemColors menuItemColors = new MenuItemColors(j14, j15, j16, j17, j18, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return menuItemColors;
    }
}
