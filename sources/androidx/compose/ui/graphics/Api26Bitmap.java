package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

@RequiresApi(26)
/* loaded from: classes.dex */
public final class Api26Bitmap {
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    @DoNotInline
    public static final ColorSpace composeColorSpace$ui_graphics_release(Bitmap bitmap) {
        android.graphics.ColorSpace colorSpace;
        ColorSpace composeColorSpace;
        colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (composeColorSpace = AndroidColorSpace_androidKt.toComposeColorSpace(colorSpace)) == null) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        return composeColorSpace;
    }

    @DoNotInline
    /* renamed from: createBitmap-x__-hDU$ui_graphics_release */
    public static final Bitmap m2861createBitmapx__hDU$ui_graphics_release(int i8, int i9, int i10, boolean z8, ColorSpace colorSpace) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i8, i9, AndroidImageBitmap_androidKt.m2823toBitmapConfig1JJdX4A(i10), z8, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        return createBitmap;
    }
}
