package androidx.core.math;

/* loaded from: classes3.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int i8, int i9) {
        int i10 = i8 + i9;
        if ((i8 >= 0) == (i9 >= 0)) {
            if ((i8 >= 0) != (i10 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i10;
    }

    public static double clamp(double d8, double d9, double d10) {
        return d8 < d9 ? d9 : d8 > d10 ? d10 : d8;
    }

    public static int decrementExact(int i8) {
        if (i8 != Integer.MIN_VALUE) {
            return i8 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i8) {
        if (i8 != Integer.MAX_VALUE) {
            return i8 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i8, int i9) {
        int i10 = i8 * i9;
        if (i8 == 0 || i9 == 0 || (i10 / i8 == i9 && i10 / i9 == i8)) {
            return i10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i8) {
        if (i8 != Integer.MIN_VALUE) {
            return -i8;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i8, int i9) {
        int i10 = i8 - i9;
        if ((i8 < 0) != (i9 < 0)) {
            if ((i8 < 0) != (i10 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i10;
    }

    public static int toIntExact(long j8) {
        if (j8 <= 2147483647L && j8 >= -2147483648L) {
            return (int) j8;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long addExact(long j8, long j9) {
        long j10 = j8 + j9;
        if ((j8 >= 0) == (j9 >= 0)) {
            if ((j8 >= 0) != (j10 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j10;
    }

    public static float clamp(float f8, float f9, float f10) {
        return f8 < f9 ? f9 : f8 > f10 ? f10 : f8;
    }

    public static long decrementExact(long j8) {
        if (j8 != Long.MIN_VALUE) {
            return j8 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j8) {
        if (j8 != Long.MAX_VALUE) {
            return j8 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j8) {
        if (j8 != Long.MIN_VALUE) {
            return -j8;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j8, long j9) {
        long j10 = j8 - j9;
        if ((j8 < 0) != (j9 < 0)) {
            if ((j8 < 0) != (j10 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j10;
    }

    public static int clamp(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
    }

    public static long multiplyExact(long j8, long j9) {
        long j10 = j8 * j9;
        if (j8 == 0 || j9 == 0 || (j10 / j8 == j9 && j10 / j9 == j8)) {
            return j10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long clamp(long j8, long j9, long j10) {
        return j8 < j9 ? j9 : j8 > j10 ? j10 : j8;
    }
}
