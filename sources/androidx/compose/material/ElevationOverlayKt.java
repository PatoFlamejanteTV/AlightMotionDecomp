package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ElevationOverlayKt {
    private static final ProvidableCompositionLocal<ElevationOverlay> LocalElevationOverlay = CompositionLocalKt.staticCompositionLocalOf(ElevationOverlayKt$LocalElevationOverlay$1.INSTANCE);
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteElevation = CompositionLocalKt.compositionLocalOf$default(null, ElevationOverlayKt$LocalAbsoluteElevation$1.INSTANCE, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ReadOnlyComposable
    /* renamed from: calculateForegroundColor-CLU3JFs, reason: not valid java name */
    public static final long m1218calculateForegroundColorCLU3JFs(long j8, float f8, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613340891, i8, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(ColorsKt.m1173contentColorForek8zF_U(j8, composer, i8 & 14), ((((float) Math.log(f8 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2947copywmQWz5c$default;
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteElevation() {
        return LocalAbsoluteElevation;
    }

    public static final ProvidableCompositionLocal<ElevationOverlay> getLocalElevationOverlay() {
        return LocalElevationOverlay;
    }
}
