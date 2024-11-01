package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes.dex */
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(Canvas canvas, float f8, float f9, float f10) {
        if (f8 == 0.0f) {
            return;
        }
        canvas.translate(f9, f10);
        canvas.rotate(f8);
        canvas.translate(-f9, -f10);
    }

    public static final void rotateRad(Canvas canvas, float f8, float f9, float f10) {
        rotate(canvas, DegreesKt.degrees(f8), f9, f10);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        rotateRad(canvas, f8, f9, f10);
    }

    public static final void scale(Canvas canvas, float f8, float f9, float f10, float f11) {
        if (f8 == 1.0f && f9 == 1.0f) {
            return;
        }
        canvas.translate(f10, f11);
        canvas.scale(f8, f9);
        canvas.translate(-f10, -f11);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = f8;
        }
        scale(canvas, f8, f9, f10, f11);
    }

    public static final void withSave(Canvas canvas, Function0 function0) {
        try {
            canvas.save();
            function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            canvas.restore();
            AbstractC3290w.a(1);
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, Function0 function0) {
        try {
            canvas.saveLayer(rect, paint);
            function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            canvas.restore();
            AbstractC3290w.a(1);
        }
    }
}
