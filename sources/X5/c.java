package X5;

/* loaded from: classes5.dex */
public abstract class c {
    private static final int a(int i8, int i9, int i10) {
        return e(e(i8, i10) - e(i9, i10), i10);
    }

    private static final long b(long j8, long j9, long j10) {
        return f(f(j8, j10) - f(j9, j10), j10);
    }

    public static final int c(int i8, int i9, int i10) {
        if (i10 > 0) {
            if (i8 < i9) {
                return i9 - a(i9, i8, i10);
            }
            return i9;
        }
        if (i10 < 0) {
            if (i8 > i9) {
                return i9 + a(i8, i9, -i10);
            }
            return i9;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long d(long j8, long j9, long j10) {
        if (j10 > 0) {
            if (j8 < j9) {
                return j9 - b(j9, j8, j10);
            }
            return j9;
        }
        if (j10 < 0) {
            if (j8 > j9) {
                return j9 + b(j8, j9, -j10);
            }
            return j9;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int e(int i8, int i9) {
        int i10 = i8 % i9;
        if (i10 < 0) {
            return i10 + i9;
        }
        return i10;
    }

    private static final long f(long j8, long j9) {
        long j10 = j8 % j9;
        if (j10 < 0) {
            return j10 + j9;
        }
        return j10;
    }
}
