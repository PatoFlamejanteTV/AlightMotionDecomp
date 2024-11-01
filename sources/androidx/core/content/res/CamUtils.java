package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CamUtils {
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private CamUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int intFromLStar(float f8) {
        float f9;
        boolean z8;
        float f10;
        if (f8 < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f11 = (f8 + 16.0f) / 116.0f;
        if (f8 > 8.0f) {
            f9 = f11 * f11 * f11;
        } else {
            f9 = f8 / 903.2963f;
        }
        float f12 = f11 * f11 * f11;
        if (f12 > 0.008856452f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            f10 = f12;
        } else {
            f10 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z8) {
            f12 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f10 * fArr[0], f9 * fArr[1], f12 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float lStarFromInt(int i8) {
        return lStarFromY(yFromInt(i8));
    }

    static float lStarFromY(float f8) {
        float f9 = f8 / 100.0f;
        if (f9 <= 0.008856452f) {
            return f9 * 903.2963f;
        }
        return (((float) Math.cbrt(f9)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float lerp(float f8, float f9, float f10) {
        return f8 + ((f9 - f8) * f10);
    }

    static float linearized(int i8) {
        float pow;
        float f8 = i8 / 255.0f;
        if (f8 <= 0.04045f) {
            pow = f8 / 12.92f;
        } else {
            pow = (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void xyzFromInt(int i8, @NonNull float[] fArr) {
        float linearized = linearized(Color.red(i8));
        float linearized2 = linearized(Color.green(i8));
        float linearized3 = linearized(Color.blue(i8));
        float[][] fArr2 = SRGB_TO_XYZ;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * linearized) + (fArr3[1] * linearized2) + (fArr3[2] * linearized3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * linearized) + (fArr4[1] * linearized2) + (fArr4[2] * linearized3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (linearized * fArr5[0]) + (linearized2 * fArr5[1]) + (linearized3 * fArr5[2]);
    }

    static float yFromInt(int i8) {
        float linearized = linearized(Color.red(i8));
        float linearized2 = linearized(Color.green(i8));
        float linearized3 = linearized(Color.blue(i8));
        float[] fArr = SRGB_TO_XYZ[1];
        return (linearized * fArr[0]) + (linearized2 * fArr[1]) + (linearized3 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float yFromLStar(float f8) {
        float f9;
        if (f8 > 8.0f) {
            f9 = (float) Math.pow((f8 + 16.0d) / 116.0d, 3.0d);
        } else {
            f9 = f8 / 903.2963f;
        }
        return f9 * 100.0f;
    }
}
