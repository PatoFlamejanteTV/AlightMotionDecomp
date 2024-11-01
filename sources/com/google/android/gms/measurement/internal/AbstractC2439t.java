package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2439t {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f18048d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2478y3 f18049a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f18050b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f18051c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2439t(InterfaceC2478y3 interfaceC2478y3) {
        AbstractC1396p.l(interfaceC2478y3);
        this.f18049a = interfaceC2478y3;
        this.f18050b = new RunnableC2460w(this, interfaceC2478y3);
    }

    private final Handler f() {
        Handler handler;
        if (f18048d != null) {
            return f18048d;
        }
        synchronized (AbstractC2439t.class) {
            try {
                if (f18048d == null) {
                    f18048d = new com.google.android.gms.internal.measurement.N0(this.f18049a.w().getMainLooper());
                }
                handler = f18048d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f18051c = 0L;
        f().removeCallbacks(this.f18050b);
    }

    public final void b(long j8) {
        a();
        if (j8 >= 0) {
            this.f18051c = this.f18049a.x().currentTimeMillis();
            if (!f().postDelayed(this.f18050b, j8)) {
                this.f18049a.a().G().b("Failed to schedule delayed post. time", Long.valueOf(j8));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        if (this.f18051c != 0) {
            return true;
        }
        return false;
    }
}
