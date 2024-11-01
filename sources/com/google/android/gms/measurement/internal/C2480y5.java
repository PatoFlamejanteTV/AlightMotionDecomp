package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2480y5 {

    /* renamed from: a, reason: collision with root package name */
    private final V.d f18136a;

    /* renamed from: b, reason: collision with root package name */
    private long f18137b;

    public C2480y5(V.d dVar) {
        AbstractC1396p.l(dVar);
        this.f18136a = dVar;
    }

    public final void a() {
        this.f18137b = 0L;
    }

    public final boolean b(long j8) {
        if (this.f18137b == 0 || this.f18136a.elapsedRealtime() - this.f18137b >= 3600000) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.f18137b = this.f18136a.elapsedRealtime();
    }
}
