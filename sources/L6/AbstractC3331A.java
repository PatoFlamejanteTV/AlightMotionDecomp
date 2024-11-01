package l6;

/* renamed from: l6.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3331A {
    public static /* synthetic */ long a(long j8, long j9) {
        if (j9 < 0) {
            if ((j8 ^ Long.MIN_VALUE) < (j9 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j8 >= 0) {
            return j8 / j9;
        }
        int i8 = 1;
        long j10 = ((j8 >>> 1) / j9) << 1;
        if (((j8 - (j10 * j9)) ^ Long.MIN_VALUE) < (j9 ^ Long.MIN_VALUE)) {
            i8 = 0;
        }
        return j10 + i8;
    }
}
