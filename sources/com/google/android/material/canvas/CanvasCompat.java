package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class CanvasCompat {

    /* loaded from: classes3.dex */
    public interface CanvasOperation {
        void run(@NonNull Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, @Nullable RectF rectF, int i8) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(rectF, i8);
        }
        return canvas.saveLayerAlpha(rectF, i8, 31);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f8, float f9, float f10, float f11, int i8) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f8, f9, f10, f11, i8);
        }
        return canvas.saveLayerAlpha(f8, f9, f10, f11, i8, 31);
    }
}
