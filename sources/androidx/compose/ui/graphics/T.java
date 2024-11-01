package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class T {
    public static void a(Canvas canvas, Rect rect, int i8) {
        canvas.mo2807clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i8);
    }

    public static void b(Canvas canvas, Rect rect, float f8, float f9, boolean z8, Paint paint) {
        canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f8, f9, z8, paint);
    }

    public static void c(Canvas canvas, Rect rect, float f8, float f9, boolean z8, Paint paint) {
        canvas.drawArc(rect, DegreesKt.degrees(f8), DegreesKt.degrees(f9), z8, paint);
    }

    public static void d(Canvas canvas, Rect rect, Paint paint) {
        canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static void e(Canvas canvas, Rect rect, Paint paint) {
        canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static void f(Canvas canvas, float f8, float f9) {
        canvas.skew(DegreesKt.degrees(f8), DegreesKt.degrees(f9));
    }

    public static /* synthetic */ void m(Canvas canvas, Path path, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = ClipOp.Companion.m2937getIntersectrtfAjoo();
            }
            canvas.mo2806clipPathmtrdDE(path, i8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    public static /* synthetic */ void n(Canvas canvas, float f8, float f9, float f10, float f11, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 16) != 0) {
                i8 = ClipOp.Companion.m2937getIntersectrtfAjoo();
            }
            canvas.mo2807clipRectN_I0leg(f8, f9, f10, f11, i8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    public static /* synthetic */ void o(Canvas canvas, Rect rect, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = ClipOp.Companion.m2937getIntersectrtfAjoo();
            }
            canvas.mo2808clipRectmtrdDE(rect, i8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    public static /* synthetic */ void p(Canvas canvas, ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, Paint paint, int i8, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        if (obj == null) {
            if ((i8 & 2) != 0) {
                j12 = IntOffset.Companion.m5289getZeronOccac();
            } else {
                j12 = j8;
            }
            if ((i8 & 4) != 0) {
                j13 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j13 = j9;
            }
            if ((i8 & 8) != 0) {
                j14 = IntOffset.Companion.m5289getZeronOccac();
            } else {
                j14 = j10;
            }
            if ((i8 & 16) != 0) {
                j15 = j13;
            } else {
                j15 = j11;
            }
            canvas.mo2812drawImageRectHPBpro0(imageBitmap, j12, j13, j14, j15, paint);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }

    public static /* synthetic */ void q(Canvas canvas, float f8, float f9, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                f9 = f8;
            }
            canvas.scale(f8, f9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
    }
}
