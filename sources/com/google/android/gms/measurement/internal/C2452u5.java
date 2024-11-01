package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2452u5 {

    /* renamed from: a, reason: collision with root package name */
    private long f18076a;

    /* renamed from: b, reason: collision with root package name */
    protected long f18077b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2439t f18078c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2418p5 f18079d;

    public C2452u5(C2418p5 c2418p5) {
        this.f18079d = c2418p5;
        this.f18078c = new C2473x5(this, c2418p5.f18099a);
        long elapsedRealtime = c2418p5.x().elapsedRealtime();
        this.f18076a = elapsedRealtime;
        this.f18077b = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(C2452u5 c2452u5) {
        c2452u5.f18079d.k();
        c2452u5.d(false, false, c2452u5.f18079d.x().elapsedRealtime());
        c2452u5.f18079d.l().s(c2452u5.f18079d.x().elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j8) {
        long j9 = j8 - this.f18077b;
        this.f18077b = j8;
        return j9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f18078c.a();
        if (this.f18079d.b().q(G.f17290c1)) {
            this.f18076a = this.f18079d.x().elapsedRealtime();
        } else {
            this.f18076a = 0L;
        }
        this.f18077b = this.f18076a;
    }

    public final boolean d(boolean z8, boolean z9, long j8) {
        this.f18079d.k();
        this.f18079d.s();
        if (this.f18079d.f18099a.m()) {
            this.f18079d.e().f18159r.b(this.f18079d.x().currentTimeMillis());
        }
        long j9 = j8 - this.f18076a;
        if (!z8 && j9 < 1000) {
            this.f18079d.a().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j9));
            return false;
        }
        if (!z9) {
            j9 = a(j8);
        }
        this.f18079d.a().K().b("Recording user engagement, ms", Long.valueOf(j9));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        d6.X(this.f18079d.p().C(!this.f18079d.b().V()), bundle, true);
        if (!z9) {
            this.f18079d.o().b1("auto", "_e", bundle);
        }
        this.f18076a = j8;
        this.f18078c.a();
        this.f18078c.b(((Long) G.f17292d0.a(null)).longValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j8) {
        this.f18078c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(long j8) {
        this.f18079d.k();
        this.f18078c.a();
        this.f18076a = j8;
        this.f18077b = j8;
    }
}
