package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
final class DefaultElevationOverlay implements ElevationOverlay {
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    @Composable
    @ReadOnlyComposable
    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo1189apply7g2Lkgo(long j8, float f8, Composer composer, int i8) {
        long m1218calculateForegroundColorCLU3JFs;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i8, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (Dp.m5154compareTo0680j_4(f8, Dp.m5155constructorimpl(0)) > 0 && !colors.isLight()) {
            m1218calculateForegroundColorCLU3JFs = ElevationOverlayKt.m1218calculateForegroundColorCLU3JFs(j8, f8, composer, i8 & 126);
            j8 = ColorKt.m2993compositeOverOWjLjI(m1218calculateForegroundColorCLU3JFs, j8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j8;
    }
}
