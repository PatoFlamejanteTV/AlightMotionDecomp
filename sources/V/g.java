package V;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final g f10390a = new g();

    private g() {
    }

    public static d b() {
        return f10390a;
    }

    @Override // V.d
    public final long a() {
        return System.nanoTime();
    }

    @Override // V.d
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // V.d
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
