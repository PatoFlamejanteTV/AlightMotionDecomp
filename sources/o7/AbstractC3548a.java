package o7;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3548a {
    public static long a(long j8, long j9, int i8) {
        long j10 = j9 & ((j8 >>> i8) ^ j8);
        return j8 ^ (j10 ^ (j10 << i8));
    }
}
