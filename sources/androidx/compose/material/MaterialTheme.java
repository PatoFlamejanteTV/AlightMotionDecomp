package androidx.compose.material;

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
    public final Colors getColors(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1462282791, i8, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:102)");
        }
        Colors colors = (Colors) composer.consume(ColorsKt.getLocalColors());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colors;
    }

    @Composable
    @ReadOnlyComposable
    public final Shapes getShapes(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1586253541, i8, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:120)");
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
            ComposerKt.traceEventStart(-1630198856, i8, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:112)");
        }
        Typography typography = (Typography) composer.consume(TypographyKt.getLocalTypography());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography;
    }
}
