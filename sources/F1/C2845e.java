package f1;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2845e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f31842d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f31843e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final i f31844a = i.c();

    /* renamed from: b, reason: collision with root package name */
    private long f31845b;

    /* renamed from: c, reason: collision with root package name */
    private int f31846c;

    private synchronized long a(int i8) {
        if (!c(i8)) {
            return f31842d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f31846c) + this.f31844a.e(), f31843e);
    }

    private static boolean c(int i8) {
        if (i8 != 429 && (i8 < 500 || i8 >= 600)) {
            return false;
        }
        return true;
    }

    private static boolean d(int i8) {
        if ((i8 < 200 || i8 >= 300) && i8 != 401 && i8 != 404) {
            return false;
        }
        return true;
    }

    private synchronized void e() {
        this.f31846c = 0;
    }

    public synchronized boolean b() {
        boolean z8;
        if (this.f31846c != 0) {
            if (this.f31844a.a() <= this.f31845b) {
                z8 = false;
            }
        }
        z8 = true;
        return z8;
    }

    public synchronized void f(int i8) {
        if (d(i8)) {
            e();
            return;
        }
        this.f31846c++;
        this.f31845b = this.f31844a.a() + a(i8);
    }
}
