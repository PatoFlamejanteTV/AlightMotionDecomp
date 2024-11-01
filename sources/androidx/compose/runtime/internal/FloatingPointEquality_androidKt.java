package androidx.compose.runtime.internal;

import android.os.Build;

/* loaded from: classes.dex */
public final class FloatingPointEquality_androidKt {
    public static final boolean equalsWithNanFix(float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (f8 != f9) {
                return false;
            }
        } else if (isNan(f8) || isNan(f9) || f8 != f9) {
            return false;
        }
        return true;
    }

    public static final boolean isNan(float f8) {
        return (Float.floatToRawIntBits(f8) & Integer.MAX_VALUE) > 2139095040;
    }

    public static final boolean isNan(double d8) {
        return (Double.doubleToRawLongBits(d8) & Long.MAX_VALUE) > 9218868437227405312L;
    }

    public static final boolean equalsWithNanFix(double d8, double d9) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (d8 != d9) {
                return false;
            }
        } else if (isNan(d8) || isNan(d9) || d8 != d9) {
            return false;
        }
        return true;
    }
}
