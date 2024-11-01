package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, Function1 function1) {
        function1.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int i8;
        int width = bitmap.getWidth();
        int i9 = point.x;
        return i9 >= 0 && i9 < width && (i8 = point.y) >= 0 && i8 < bitmap.getHeight();
    }

    public static final Bitmap createBitmap(int i8, int i9, Bitmap.Config config) {
        return Bitmap.createBitmap(i8, i9, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i8, int i9, Bitmap.Config config, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i8, i9, config);
    }

    public static final int get(Bitmap bitmap, int i8, int i9) {
        return bitmap.getPixel(i8, i9);
    }

    public static final Bitmap scale(Bitmap bitmap, int i8, int i9, boolean z8) {
        return Bitmap.createScaledBitmap(bitmap, i8, i9, z8);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z8 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i8, i9, z8);
    }

    public static final void set(Bitmap bitmap, int i8, int i9, @ColorInt int i10) {
        bitmap.setPixel(i8, i9, i10);
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        float f8 = pointF.x;
        if (f8 >= 0.0f && f8 < bitmap.getWidth()) {
            float f9 = pointF.y;
            if (f9 >= 0.0f && f9 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Bitmap createBitmap(int i8, int i9, Bitmap.Config config, boolean z8, ColorSpace colorSpace) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap(i8, i9, config, z8, colorSpace);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i8, int i9, Bitmap.Config config, boolean z8, ColorSpace colorSpace, int i10, Object obj) {
        Bitmap createBitmap;
        ColorSpace.Named named;
        if ((i10 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i10 & 8) != 0) {
            z8 = true;
        }
        if ((i10 & 16) != 0) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
        }
        createBitmap = Bitmap.createBitmap(i8, i9, config, z8, colorSpace);
        return createBitmap;
    }
}
