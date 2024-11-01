package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2438s5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    long f18045a;

    /* renamed from: b, reason: collision with root package name */
    long f18046b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2445t5 f18047c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2438s5(C2445t5 c2445t5, long j8, long j9) {
        this.f18047c = c2445t5;
        this.f18045a = j8;
        this.f18046b = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18047c.f18061b.f().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2438s5 runnableC2438s5 = RunnableC2438s5.this;
                C2445t5 c2445t5 = runnableC2438s5.f18047c;
                long j8 = runnableC2438s5.f18045a;
                long j9 = runnableC2438s5.f18046b;
                c2445t5.f18061b.k();
                c2445t5.f18061b.a().F().a("Application going to the background");
                c2445t5.f18061b.e().f18162u.a(true);
                c2445t5.f18061b.D(true);
                if (!c2445t5.f18061b.b().V()) {
                    if (c2445t5.f18061b.b().q(G.f17263Q0)) {
                        c2445t5.f18061b.E(false, false, j9);
                        c2445t5.f18061b.f18015f.e(j9);
                    } else {
                        c2445t5.f18061b.f18015f.e(j9);
                        c2445t5.f18061b.E(false, false, j9);
                    }
                }
                c2445t5.f18061b.a().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j8));
                if (c2445t5.f18061b.b().q(G.f17296e1)) {
                    c2445t5.f18061b.o().B0();
                }
            }
        });
    }
}
