package com.google.android.gms.measurement.internal;

import Q.AbstractC1400u;
import Q.C1393m;
import Q.C1399t;
import Q.C1402w;
import Q.InterfaceC1401v;
import android.content.Context;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import q0.InterfaceC3621g;

/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2387l2 {

    /* renamed from: d, reason: collision with root package name */
    private static C2387l2 f17920d;

    /* renamed from: e, reason: collision with root package name */
    private static final Duration f17921e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    private final S2 f17922a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1401v f17923b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f17924c = new AtomicLong(-1);

    private C2387l2(Context context, S2 s22) {
        this.f17923b = AbstractC1400u.b(context, C1402w.a().b("measurement:api").a());
        this.f17922a = s22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2387l2 a(S2 s22) {
        if (f17920d == null) {
            f17920d = new C2387l2(s22.w(), s22);
        }
        return f17920d;
    }

    public final synchronized void b(int i8, int i9, long j8, long j9, int i10) {
        final long elapsedRealtime = this.f17922a.x().elapsedRealtime();
        if (this.f17924c.get() != -1 && elapsedRealtime - this.f17924c.get() <= f17921e.toMillis()) {
            return;
        }
        this.f17923b.a(new C1399t(0, Arrays.asList(new C1393m(36301, i9, 0, j8, j9, null, null, 0, i10)))).e(new InterfaceC3621g() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // q0.InterfaceC3621g
            public final void d(Exception exc) {
                C2387l2.this.c(elapsedRealtime, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(long j8, Exception exc) {
        this.f17924c.set(j8);
    }
}
