package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnackbarDefaults {
    public static final int $stable = 0;
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();

    private SnackbarDefaults() {
    }

    @Composable
    public final long getActionColor(Composer composer, int i8) {
        composer.startReplaceableGroup(743425465);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743425465, i8, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:414)");
        }
        long color = ColorSchemeKt.toColor(SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getActionContentColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-1313141593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1313141593, i8, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:417)");
        }
        long color = ColorSchemeKt.toColor(SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getColor(Composer composer, int i8) {
        composer.startReplaceableGroup(987938253);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(987938253, i8, -1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:408)");
        }
        long color = ColorSchemeKt.toColor(SnackbarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getContentColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1021310823);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1021310823, i8, -1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:411)");
        }
        long color = ColorSchemeKt.toColor(SnackbarTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getDismissActionContentColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-528602817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-528602817, i8, -1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:420)");
        }
        long color = ColorSchemeKt.toColor(SnackbarTokens.INSTANCE.getIconColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-551629101);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-551629101, i8, -1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:405)");
        }
        Shape shape = ShapesKt.toShape(SnackbarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
