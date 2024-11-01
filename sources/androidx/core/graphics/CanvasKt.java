package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes3.dex */
public final class CanvasKt {
    public static final void withClip(Canvas canvas, Rect rect, Function1 function1) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, Function1 function1) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withRotation(Canvas canvas, float f8, float f9, float f10, Function1 function1) {
        int save = canvas.save();
        canvas.rotate(f8, f9, f10);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f8, float f9, float f10, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f8, f9, f10);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withSave(Canvas canvas, Function1 function1) {
        int save = canvas.save();
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withScale(Canvas canvas, float f8, float f9, float f10, float f11, Function1 function1) {
        int save = canvas.save();
        canvas.scale(f8, f9, f10, f11);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f8, float f9, float f10, float f11, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 1.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i8 & 8) != 0) {
            f11 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f8, f9, f10, f11);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withSkew(Canvas canvas, float f8, float f9, Function1 function1) {
        int save = canvas.save();
        canvas.skew(f8, f9);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f8, float f9, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f8, f9);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withTranslation(Canvas canvas, float f8, float f9, Function1 function1) {
        int save = canvas.save();
        canvas.translate(f8, f9);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f8, float f9, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f8, f9);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, Function1 function1) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withClip(Canvas canvas, int i8, int i9, int i10, int i11, Function1 function1) {
        int save = canvas.save();
        canvas.clipRect(i8, i9, i10, i11);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withClip(Canvas canvas, float f8, float f9, float f10, float f11, Function1 function1) {
        int save = canvas.save();
        canvas.clipRect(f8, f9, f10, f11);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }

    public static final void withClip(Canvas canvas, Path path, Function1 function1) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            function1.invoke(canvas);
        } finally {
            AbstractC3290w.b(1);
            canvas.restoreToCount(save);
            AbstractC3290w.a(1);
        }
    }
}
