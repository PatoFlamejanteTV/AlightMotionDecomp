package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class ListItemDefaults {
    public static final int $stable = 0;
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();
    private static final float Elevation = ListTokens.INSTANCE.m2180getListItemContainerElevationD9Ej5fM();

    private ListItemDefaults() {
    }

    @Composable
    /* renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m1655colorsJ08w3E(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i8, int i9) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        composer.startReplaceableGroup(-352515689);
        if ((i9 & 1) != 0) {
            j17 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        } else {
            j17 = j8;
        }
        if ((i9 & 2) != 0) {
            j18 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        } else {
            j18 = j9;
        }
        if ((i9 & 4) != 0) {
            j19 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6);
        } else {
            j19 = j10;
        }
        if ((i9 & 8) != 0) {
            j20 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemOverlineColor(), composer, 6);
        } else {
            j20 = j11;
        }
        if ((i9 & 16) != 0) {
            j21 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer, 6);
        } else {
            j21 = j12;
        }
        if ((i9 & 32) != 0) {
            j22 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6);
        } else {
            j22 = j13;
        }
        if ((i9 & 64) != 0) {
            j23 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer, 6), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j14;
        }
        if ((i9 & 128) != 0) {
            j24 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j15;
        }
        if ((i9 & 256) != 0) {
            j25 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j25 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352515689, i8, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:400)");
        }
        ListItemColors listItemColors = new ListItemColors(j17, j18, j19, j20, j21, j22, j23, j24, j25, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return listItemColors;
    }

    @Composable
    public final long getContainerColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-1253579929);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i8, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:377)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getContentColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1076068327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i8, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:380)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1656getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-496871597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i8, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:374)");
        }
        Shape shape = ShapesKt.toShape(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
