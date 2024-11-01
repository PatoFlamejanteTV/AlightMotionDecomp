package A0;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class p {
    public static p a(long j8, long j9, long j10) {
        return new a(j8, j9, j10);
    }

    public static p e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
