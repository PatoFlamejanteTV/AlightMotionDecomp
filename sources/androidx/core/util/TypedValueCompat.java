package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(34)
    /* loaded from: classes3.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        public static float deriveDimension(int i8, float f8, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i8, f8, displayMetrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i8, float f8, @NonNull DisplayMetrics displayMetrics) {
        float f9;
        float f10;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i8, f8, displayMetrics);
        }
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5) {
                                float f11 = displayMetrics.xdpi;
                                if (f11 == 0.0f) {
                                    return 0.0f;
                                }
                                f9 = f8 / f11;
                                f10 = INCHES_PER_MM;
                            } else {
                                throw new IllegalArgumentException("Invalid unitToConvertTo " + i8);
                            }
                        } else {
                            float f12 = displayMetrics.xdpi;
                            if (f12 == 0.0f) {
                                return 0.0f;
                            }
                            return f8 / f12;
                        }
                    } else {
                        float f13 = displayMetrics.xdpi;
                        if (f13 == 0.0f) {
                            return 0.0f;
                        }
                        f9 = f8 / f13;
                        f10 = INCHES_PER_PT;
                    }
                    return f9 / f10;
                }
                float f14 = displayMetrics.scaledDensity;
                if (f14 == 0.0f) {
                    return 0.0f;
                }
                return f8 / f14;
            }
            float f15 = displayMetrics.density;
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return f8 / f15;
        }
        return f8;
    }

    public static float dpToPx(float f8, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f8, displayMetrics);
    }

    @SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int i8) {
        return i8 & 15;
    }

    public static float pxToDp(float f8, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(1, f8, displayMetrics);
    }

    public static float pxToSp(float f8, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(2, f8, displayMetrics);
    }

    public static float spToPx(float f8, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f8, displayMetrics);
    }
}
