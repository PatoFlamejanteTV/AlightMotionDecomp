package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MaterialTheme {
    public static final int $stable = 0;
    public static final MaterialTheme INSTANCE = new MaterialTheme();

    private MaterialTheme() {
    }

    @Composable
    @ReadOnlyComposable
    public final ColorScheme getColorScheme(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561618718, i8, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:95)");
        }
        ColorScheme colorScheme = (ColorScheme) composer.consume(ColorSchemeKt.getLocalColorScheme());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorScheme;
    }

    @Composable
    @ReadOnlyComposable
    public final Shapes getShapes(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(419509830, i8, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:111)");
        }
        Shapes shapes = (Shapes) composer.consume(ShapesKt.getLocalShapes());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes;
    }

    @Composable
    @ReadOnlyComposable
    public final Typography getTypography(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942794935, i8, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:103)");
        }
        Typography typography = (Typography) composer.consume(TypographyKt.getLocalTypography());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography;
    }
}
