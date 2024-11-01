package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class AndroidColorFilter_androidKt {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m2818actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m3028getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m2819actualLightingColorFilterOWjLjI(long j8, long j9) {
        return new android.graphics.LightingColorFilter(ColorKt.m3002toArgb8_81llA(j8), ColorKt.m3002toArgb8_81llA(j9));
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m2820actualTintColorFilterxETnrds(long j8, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BlendModeColorFilterHelper.INSTANCE.m2900BlendModeColorFilterxETnrds(j8, i8);
        }
        return new PorterDuffColorFilter(ColorKt.m3002toArgb8_81llA(j8), AndroidBlendMode_androidKt.m2805toPorterDuffModes9anfk8(i8));
    }

    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics_release();
    }

    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter) {
        ColorFilter colorFilter2;
        int colorMultiply;
        int colorAdd;
        if (29 <= Build.VERSION.SDK_INT && F.a(colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(G.a(colorFilter));
        }
        if ((colorFilter instanceof android.graphics.LightingColorFilter) && supportsLightingColorFilterQuery()) {
            android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
            colorMultiply = lightingColorFilter.getColorMultiply();
            long Color = ColorKt.Color(colorMultiply);
            colorAdd = lightingColorFilter.getColorAdd();
            colorFilter2 = new LightingColorFilter(Color, ColorKt.Color(colorAdd), colorFilter, null);
        } else if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            colorFilter2 = new ColorMatrixColorFilter(null, colorFilter, null);
        } else {
            colorFilter2 = new ColorFilter(colorFilter);
        }
        return colorFilter2;
    }

    public static final boolean supportsColorMatrixQuery() {
        if (26 <= Build.VERSION.SDK_INT) {
            return true;
        }
        return false;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        if (26 <= Build.VERSION.SDK_INT) {
            return true;
        }
        return false;
    }
}
