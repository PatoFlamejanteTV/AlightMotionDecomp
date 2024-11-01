package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static long a(DrawTransform drawTransform) {
        float f8 = 2;
        return OffsetKt.Offset(Size.m2781getWidthimpl(drawTransform.mo3402getSizeNHjbRc()) / f8, Size.m2778getHeightimpl(drawTransform.mo3402getSizeNHjbRc()) / f8);
    }

    public static /* synthetic */ void c(DrawTransform drawTransform, Path path, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = ClipOp.Companion.m2937getIntersectrtfAjoo();
            }
            drawTransform.mo3399clipPathmtrdDE(path, i8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    public static /* synthetic */ void d(DrawTransform drawTransform, float f8, float f9, float f10, float f11, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                f8 = 0.0f;
            }
            if ((i9 & 2) != 0) {
                f9 = 0.0f;
            }
            if ((i9 & 4) != 0) {
                f10 = Size.m2781getWidthimpl(drawTransform.mo3402getSizeNHjbRc());
            }
            if ((i9 & 8) != 0) {
                f11 = Size.m2778getHeightimpl(drawTransform.mo3402getSizeNHjbRc());
            }
            if ((i9 & 16) != 0) {
                i8 = ClipOp.Companion.m2937getIntersectrtfAjoo();
            }
            drawTransform.mo3400clipRectN_I0leg(f8, f9, f10, f11, i8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    public static /* synthetic */ void e(DrawTransform drawTransform, float f8, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                j8 = drawTransform.mo3401getCenterF1C5BW0();
            }
            drawTransform.mo3403rotateUv8p0NA(f8, j8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
    }

    public static /* synthetic */ void f(DrawTransform drawTransform, float f8, float f9, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 4) != 0) {
                j8 = drawTransform.mo3401getCenterF1C5BW0();
            }
            drawTransform.mo3404scale0AR0LA0(f8, f9, j8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
    }

    public static /* synthetic */ void g(DrawTransform drawTransform, float f8, float f9, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                f8 = 0.0f;
            }
            if ((i8 & 2) != 0) {
                f9 = 0.0f;
            }
            drawTransform.translate(f8, f9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }
}
