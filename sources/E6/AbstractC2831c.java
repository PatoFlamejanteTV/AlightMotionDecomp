package e6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2831c extends AbstractC2830b {
    public static int a(int i8) {
        return Integer.signum(i8);
    }

    public static int b(long j8) {
        return Long.signum(j8);
    }

    public static int c(double d8) {
        if (!Double.isNaN(d8)) {
            if (d8 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d8 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d8);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int d(float f8) {
        if (!Float.isNaN(f8)) {
            return Math.round(f8);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long e(double d8) {
        if (!Double.isNaN(d8)) {
            return Math.round(d8);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long f(float f8) {
        return AbstractC2829a.e(f8);
    }
}
