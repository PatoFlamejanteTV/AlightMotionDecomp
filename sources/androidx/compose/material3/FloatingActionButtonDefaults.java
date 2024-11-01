package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();
    private static final float LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m2070getIconSizeD9Ej5fM();

    private FloatingActionButtonDefaults() {
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m1627bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5155constructorimpl(0);
        }
        return floatingActionButtonDefaults.m1628bottomAppBarFabElevationa9UjIt4(f8, f9, f10, f11);
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final FloatingActionButtonElevation m1628bottomAppBarFabElevationa9UjIt4(float f8, float f9, float f10, float f11) {
        return new FloatingActionButtonElevation(f8, f9, f10, f11, null);
    }

    @Composable
    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1629elevationxZ9QkE(float f8, float f9, float f10, float f11, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-241106249);
        if ((i9 & 1) != 0) {
            f8 = FabPrimaryTokens.INSTANCE.m2087getContainerElevationD9Ej5fM();
        }
        float f12 = f8;
        if ((i9 & 2) != 0) {
            f9 = FabPrimaryTokens.INSTANCE.m2097getPressedContainerElevationD9Ej5fM();
        }
        float f13 = f9;
        if ((i9 & 4) != 0) {
            f10 = FabPrimaryTokens.INSTANCE.m2090getFocusContainerElevationD9Ej5fM();
        }
        float f14 = f10;
        if ((i9 & 8) != 0) {
            f11 = FabPrimaryTokens.INSTANCE.m2091getHoverContainerElevationD9Ej5fM();
        }
        float f15 = f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i8, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:421)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f12, f13, f14, f15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }

    @Composable
    public final long getContainerColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1855656391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i8, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:407)");
        }
        long color = ColorSchemeKt.toColor(FabPrimaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final Shape getExtendedFabShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-536021915);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i8, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:403)");
        }
        Shape shape = ShapesKt.toShape(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1630getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    @Composable
    public final Shape getLargeShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-1835912187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835912187, i8, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:400)");
        }
        Shape shape = ShapesKt.toShape(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-53247565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i8, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:394)");
        }
        Shape shape = ShapesKt.toShape(FabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getSmallShape(Composer composer, int i8) {
        composer.startReplaceableGroup(394933381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394933381, i8, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:397)");
        }
        Shape shape = ShapesKt.toShape(FabPrimarySmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1631loweredElevationxZ9QkE(float f8, float f9, float f10, float f11, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-285065125);
        if ((i9 & 1) != 0) {
            f8 = FabPrimaryTokens.INSTANCE.m2093getLoweredContainerElevationD9Ej5fM();
        }
        float f12 = f8;
        if ((i9 & 2) != 0) {
            f9 = FabPrimaryTokens.INSTANCE.m2096getLoweredPressedContainerElevationD9Ej5fM();
        }
        float f13 = f9;
        if ((i9 & 4) != 0) {
            f10 = FabPrimaryTokens.INSTANCE.m2094getLoweredFocusContainerElevationD9Ej5fM();
        }
        float f14 = f10;
        if ((i9 & 8) != 0) {
            f11 = FabPrimaryTokens.INSTANCE.m2095getLoweredHoverContainerElevationD9Ej5fM();
        }
        float f15 = f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285065125, i8, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:444)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f12, f13, f14, f15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }
}
