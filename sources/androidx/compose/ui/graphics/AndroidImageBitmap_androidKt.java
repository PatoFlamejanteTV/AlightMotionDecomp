package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m2822ActualImageBitmapx__hDU(int i8, int i9, int i10, boolean z8, ColorSpace colorSpace) {
        Bitmap createBitmap;
        Bitmap.Config m2823toBitmapConfig1JJdX4A = m2823toBitmapConfig1JJdX4A(i10);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Api26Bitmap.m2861createBitmapx__hDU$ui_graphics_release(i8, i9, i10, z8, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i8, i9, m2823toBitmapConfig1JJdX4A);
            createBitmap.setHasAlpha(z8);
        }
        return new AndroidImageBitmap(createBitmap);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m2823toBitmapConfig1JJdX4A(int i8) {
        Bitmap.Config config;
        Bitmap.Config config2;
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m3144equalsimpl0(i8, companion.m3149getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m3144equalsimpl0(i8, companion.m3148getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m3144equalsimpl0(i8, companion.m3152getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && ImageBitmapConfig.m3144equalsimpl0(i8, companion.m3150getF16_sVssgQ())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i9 >= 26 && ImageBitmapConfig.m3144equalsimpl0(i8, companion.m3151getGpu_sVssgQ())) {
            config = Bitmap.Config.HARDWARE;
            return config;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m3148getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m3152getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m3149getArgb8888_sVssgQ();
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return ImageBitmapConfig.Companion.m3150getF16_sVssgQ();
            }
        }
        if (i8 >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return ImageBitmapConfig.Companion.m3151getGpu_sVssgQ();
            }
        }
        return ImageBitmapConfig.Companion.m3149getArgb8888_sVssgQ();
    }
}
