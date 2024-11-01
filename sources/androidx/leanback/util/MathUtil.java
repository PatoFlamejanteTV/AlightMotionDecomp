package androidx.leanback.util;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class MathUtil {
    private MathUtil() {
    }

    public static int safeLongToInt(long j8) {
        int i8 = (int) j8;
        if (i8 == j8) {
            return i8;
        }
        throw new ArithmeticException("Input overflows int.\n");
    }
}
