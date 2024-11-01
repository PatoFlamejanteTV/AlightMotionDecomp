package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ModalBottomSheetDefaults {
    public static final int $stable = 0;
    public static final ModalBottomSheetDefaults INSTANCE = new ModalBottomSheetDefaults();
    private static final float Elevation = Dp.m5155constructorimpl(16);

    private ModalBottomSheetDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1253getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    public final long getScrimColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-112572414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-112572414, i8, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:741)");
        }
        long m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2947copywmQWz5c$default;
    }
}
