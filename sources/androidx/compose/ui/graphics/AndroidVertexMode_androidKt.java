package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.VertexMode;

/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m2860toAndroidVertexModeJOOmi9M(int i8) {
        VertexMode.Companion companion = VertexMode.Companion;
        if (VertexMode.m3320equalsimpl0(i8, companion.m3326getTrianglesc2xauaI())) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if (VertexMode.m3320equalsimpl0(i8, companion.m3325getTriangleStripc2xauaI())) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        if (VertexMode.m3320equalsimpl0(i8, companion.m3324getTriangleFanc2xauaI())) {
            return Canvas.VertexMode.TRIANGLE_FAN;
        }
        return Canvas.VertexMode.TRIANGLES;
    }
}
