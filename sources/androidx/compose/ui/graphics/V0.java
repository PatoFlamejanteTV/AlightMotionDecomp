package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes.dex */
public abstract /* synthetic */ class V0 {
    static {
        Path.Companion companion = Path.Companion;
    }

    public static void a(Path path, Rect rect, float f8, float f9, boolean z8) {
        path.arcTo(rect, DegreesKt.degrees(f8), DegreesKt.degrees(f9), z8);
    }

    public static void b(Path path) {
        path.reset();
    }

    public static /* synthetic */ void g(Path path, Path path2, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                j8 = Offset.Companion.m2728getZeroF1C5BW0();
            }
            path.mo2844addPathUv8p0NA(path2, j8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    public static void c(Path path, float[] fArr) {
    }
}
