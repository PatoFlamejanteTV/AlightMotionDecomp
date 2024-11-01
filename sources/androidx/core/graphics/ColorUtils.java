package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.CamColor;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.utilities.Contrast;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    @RequiresApi(26)
    /* loaded from: classes3.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static Color compositeColors(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = color2.alpha() * (1.0f - alpha);
                int componentCount = color2.getComponentCount() - 1;
                float f8 = alpha + alpha2;
                components2[componentCount] = f8;
                if (f8 > 0.0f) {
                    alpha /= f8;
                    alpha2 /= f8;
                }
                for (int i8 = 0; i8 < componentCount; i8++) {
                    components2[i8] = (components[i8] * alpha) + (components2[i8] * alpha2);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
        }
    }

    private ColorUtils() {
    }

    @ColorInt
    public static int HSLToColor(@NonNull float[] fArr) {
        int round;
        int round2;
        int round3;
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float abs = (1.0f - Math.abs((f10 * 2.0f) - 1.0f)) * f9;
        float f11 = f10 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f8 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f8) / 60) {
            case 0:
                round = Math.round((abs + f11) * 255.0f);
                round2 = Math.round((abs2 + f11) * 255.0f);
                round3 = Math.round(f11 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f11) * 255.0f);
                round2 = Math.round((abs + f11) * 255.0f);
                round3 = Math.round(f11 * 255.0f);
                break;
            case 2:
                round = Math.round(f11 * 255.0f);
                round2 = Math.round((abs + f11) * 255.0f);
                round3 = Math.round((abs2 + f11) * 255.0f);
                break;
            case 3:
                round = Math.round(f11 * 255.0f);
                round2 = Math.round((abs2 + f11) * 255.0f);
                round3 = Math.round((abs + f11) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f11) * 255.0f);
                round2 = Math.round(f11 * 255.0f);
                round3 = Math.round((abs + f11) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f11) * 255.0f);
                round2 = Math.round(f11 * 255.0f);
                round3 = Math.round((abs2 + f11) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(constrain(round, 0, 255), constrain(round2, 0, 255), constrain(round3, 0, 255));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, to = 100.0d) double d8, @FloatRange(from = -128.0d, to = 127.0d) double d9, @FloatRange(from = -128.0d, to = 127.0d) double d10) {
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d8, d9, d10, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, to = 100.0d) double d8, @FloatRange(from = -128.0d, to = 127.0d) double d9, @FloatRange(from = -128.0d, to = 127.0d) double d10, @NonNull double[] dArr) {
        double d11;
        double d12 = (d8 + 16.0d) / 116.0d;
        double d13 = (d9 / 500.0d) + d12;
        double d14 = d12 - (d10 / 200.0d);
        double pow = Math.pow(d13, 3.0d);
        if (pow <= XYZ_EPSILON) {
            pow = ((d13 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        if (d8 > 7.9996247999999985d) {
            d11 = Math.pow(d12, 3.0d);
        } else {
            d11 = d8 / XYZ_KAPPA;
        }
        double pow2 = Math.pow(d14, 3.0d);
        if (pow2 <= XYZ_EPSILON) {
            pow2 = ((d14 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = pow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = d11 * 100.0d;
        dArr[2] = pow2 * XYZ_WHITE_REFERENCE_Z;
    }

    @ColorInt
    public static int M3HCTToColor(@FloatRange(from = 0.0d, to = 360.0d, toInclusive = false) float f8, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f9, @FloatRange(from = 0.0d, to = 100.0d) float f10) {
        return CamColor.toColor(f8, f9, f10);
    }

    public static void RGBToHSL(@IntRange(from = 0, to = 255) int i8, @IntRange(from = 0, to = 255) int i9, @IntRange(from = 0, to = 255) int i10, @NonNull float[] fArr) {
        float f8;
        float abs;
        float f9 = i8 / 255.0f;
        float f10 = i9 / 255.0f;
        float f11 = i10 / 255.0f;
        float max = Math.max(f9, Math.max(f10, f11));
        float min = Math.min(f9, Math.min(f10, f11));
        float f12 = max - min;
        float f13 = (max + min) / 2.0f;
        if (max == min) {
            f8 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f9) {
                f8 = ((f10 - f11) / f12) % 6.0f;
            } else if (max == f10) {
                f8 = ((f11 - f9) / f12) + 2.0f;
            } else {
                f8 = 4.0f + ((f9 - f10) / f12);
            }
            abs = f12 / (1.0f - Math.abs((2.0f * f13) - 1.0f));
        }
        float f14 = (f8 * 60.0f) % 360.0f;
        if (f14 < 0.0f) {
            f14 += 360.0f;
        }
        fArr[0] = constrain(f14, 0.0f, 360.0f);
        fArr[1] = constrain(abs, 0.0f, 1.0f);
        fArr[2] = constrain(f13, 0.0f, 1.0f);
    }

    public static void RGBToLAB(@IntRange(from = 0, to = 255) int i8, @IntRange(from = 0, to = 255) int i9, @IntRange(from = 0, to = 255) int i10, @NonNull double[] dArr) {
        RGBToXYZ(i8, i9, i10, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, to = 255) int i8, @IntRange(from = 0, to = 255) int i9, @IntRange(from = 0, to = 255) int i10, @NonNull double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d8 = i8 / 255.0d;
            if (d8 < 0.04045d) {
                pow = d8 / 12.92d;
            } else {
                pow = Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
            }
            double d9 = i9 / 255.0d;
            if (d9 < 0.04045d) {
                pow2 = d9 / 12.92d;
            } else {
                pow2 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            }
            double d10 = i10 / 255.0d;
            if (d10 < 0.04045d) {
                pow3 = d10 / 12.92d;
            } else {
                pow3 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, to = 95.047d) double d8, @FloatRange(from = 0.0d, to = 100.0d) double d9, @FloatRange(from = 0.0d, to = 108.883d) double d10) {
        double d11;
        double d12;
        double d13;
        double d14 = (((3.2406d * d8) + ((-1.5372d) * d9)) + ((-0.4986d) * d10)) / 100.0d;
        double d15 = ((((-0.9689d) * d8) + (1.8758d * d9)) + (0.0415d * d10)) / 100.0d;
        double d16 = (((0.0557d * d8) + ((-0.204d) * d9)) + (1.057d * d10)) / 100.0d;
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = 12.92d * d16;
        }
        return Color.rgb(constrain((int) Math.round(d11 * 255.0d), 0, 255), constrain((int) Math.round(d12 * 255.0d), 0, 255), constrain((int) Math.round(d13 * 255.0d), 0, 255));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, to = 95.047d) double d8, @FloatRange(from = 0.0d, to = 100.0d) double d9, @FloatRange(from = 0.0d, to = 108.883d) double d10, @NonNull double[] dArr) {
        if (dArr.length == 3) {
            double pivotXyzComponent = pivotXyzComponent(d8 / XYZ_WHITE_REFERENCE_X);
            double pivotXyzComponent2 = pivotXyzComponent(d9 / 100.0d);
            double pivotXyzComponent3 = pivotXyzComponent(d10 / XYZ_WHITE_REFERENCE_Z);
            dArr[0] = Math.max(0.0d, (116.0d * pivotXyzComponent2) - 16.0d);
            dArr[1] = (pivotXyzComponent - pivotXyzComponent2) * 500.0d;
            dArr[2] = (pivotXyzComponent2 - pivotXyzComponent3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i8, @ColorInt int i9, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        float f9 = 1.0f - f8;
        return Color.argb((int) ((Color.alpha(i8) * f9) + (Color.alpha(i9) * f8)), (int) ((Color.red(i8) * f9) + (Color.red(i9) * f8)), (int) ((Color.green(i8) * f9) + (Color.green(i9) * f8)), (int) ((Color.blue(i8) * f9) + (Color.blue(i9) * f8)));
    }

    public static void blendHSL(@NonNull float[] fArr, @NonNull float[] fArr2, @FloatRange(from = 0.0d, to = 1.0d) float f8, @NonNull float[] fArr3) {
        if (fArr3.length == 3) {
            float f9 = 1.0f - f8;
            fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f8);
            fArr3[1] = (fArr[1] * f9) + (fArr2[1] * f8);
            fArr3[2] = (fArr[2] * f9) + (fArr2[2] * f8);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    public static void blendLAB(@NonNull double[] dArr, @NonNull double[] dArr2, @FloatRange(from = 0.0d, to = 1.0d) double d8, @NonNull double[] dArr3) {
        if (dArr3.length == 3) {
            double d9 = 1.0d - d8;
            dArr3[0] = (dArr[0] * d9) + (dArr2[0] * d8);
            dArr3[1] = (dArr[1] * d9) + (dArr2[1] * d8);
            dArr3[2] = (dArr[2] * d9) + (dArr2[2] * d8);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    public static double calculateContrast(@ColorInt int i8, @ColorInt int i9) {
        if (Color.alpha(i9) == 255) {
            if (Color.alpha(i8) < 255) {
                i8 = compositeColors(i8, i9);
            }
            double calculateLuminance = calculateLuminance(i8) + 0.05d;
            double calculateLuminance2 = calculateLuminance(i9) + 0.05d;
            return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i9));
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public static double calculateLuminance(@ColorInt int i8) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i8, tempDouble3Array);
        return tempDouble3Array[1] / 100.0d;
    }

    public static int calculateMinimumAlpha(@ColorInt int i8, @ColorInt int i9, float f8) {
        int i10 = 255;
        if (Color.alpha(i9) == 255) {
            double d8 = f8;
            if (calculateContrast(setAlphaComponent(i8, 255), i9) < d8) {
                return -1;
            }
            int i11 = 0;
            for (int i12 = 0; i12 <= 10 && i10 - i11 > 1; i12++) {
                int i13 = (i11 + i10) / 2;
                if (calculateContrast(setAlphaComponent(i8, i13), i9) < d8) {
                    i11 = i13;
                } else {
                    i10 = i13;
                }
            }
            return i10;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i9));
    }

    @VisibleForTesting
    static float circularInterpolate(float f8, float f9, float f10) {
        if (Math.abs(f9 - f8) > 180.0f) {
            if (f9 > f8) {
                f8 += 360.0f;
            } else {
                f9 += 360.0f;
            }
        }
        return (f8 + ((f9 - f8) * f10)) % 360.0f;
    }

    public static void colorToHSL(@ColorInt int i8, @NonNull float[] fArr) {
        RGBToHSL(Color.red(i8), Color.green(i8), Color.blue(i8), fArr);
    }

    public static void colorToLAB(@ColorInt int i8, @NonNull double[] dArr) {
        RGBToLAB(Color.red(i8), Color.green(i8), Color.blue(i8), dArr);
    }

    public static void colorToM3HCT(@ColorInt int i8, @NonNull @Size(3) float[] fArr) {
        CamColor.getM3HCTfromColor(i8, fArr);
    }

    public static void colorToXYZ(@ColorInt int i8, @NonNull double[] dArr) {
        RGBToXYZ(Color.red(i8), Color.green(i8), Color.blue(i8), dArr);
    }

    private static int compositeAlpha(int i8, int i9) {
        return 255 - (((255 - i9) * (255 - i8)) / 255);
    }

    public static int compositeColors(@ColorInt int i8, @ColorInt int i9) {
        int alpha = Color.alpha(i9);
        int alpha2 = Color.alpha(i8);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i8), alpha2, Color.red(i9), alpha, compositeAlpha), compositeComponent(Color.green(i8), alpha2, Color.green(i9), alpha, compositeAlpha), compositeComponent(Color.blue(i8), alpha2, Color.blue(i9), alpha, compositeAlpha));
    }

    private static int compositeComponent(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((i8 * 255) * i9) + ((i10 * i11) * (255 - i9))) / (i12 * 255);
    }

    private static float constrain(float f8, float f9, float f10) {
        return f8 < f9 ? f9 : Math.min(f8, f10);
    }

    public static double distanceEuclidean(@NonNull double[] dArr, @NonNull double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    private static double pivotXyzComponent(double d8) {
        if (d8 > XYZ_EPSILON) {
            return Math.pow(d8, 0.3333333333333333d);
        }
        return ((d8 * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
        if (i9 >= 0 && i9 <= 255) {
            return (i8 & ViewCompat.MEASURED_SIZE_MASK) | (i9 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    private static int constrain(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : Math.min(i8, i10);
    }

    @NonNull
    @RequiresApi(26)
    public static Color compositeColors(@NonNull Color color, @NonNull Color color2) {
        return Api26Impl.compositeColors(color, color2);
    }
}
