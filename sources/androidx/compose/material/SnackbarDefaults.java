package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnackbarDefaults {
    public static final int $stable = 0;
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();
    private static final float SnackbarOverlayAlpha = 0.8f;

    private SnackbarDefaults() {
    }

    @Composable
    public final long getBackgroundColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1630911716);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630911716, i8, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:200)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        long m2993compositeOverOWjLjI = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(materialTheme.getColors(composer, 6).m1154getOnSurface0d7_KjU(), SnackbarOverlayAlpha, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1159getSurface0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2993compositeOverOWjLjI;
    }

    @Composable
    public final long getPrimaryActionColor(Composer composer, int i8) {
        long m1156getPrimaryVariant0d7_KjU;
        composer.startReplaceableGroup(-810329402);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810329402, i8, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (colors.isLight()) {
            m1156getPrimaryVariant0d7_KjU = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(colors.m1159getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colors.m1155getPrimary0d7_KjU());
        } else {
            m1156getPrimaryVariant0d7_KjU = colors.m1156getPrimaryVariant0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1156getPrimaryVariant0d7_KjU;
    }
}
