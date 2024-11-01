package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2472x4 f17186a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f17187b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2465w4 f17188c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D4(C2465w4 c2465w4, C2472x4 c2472x4, long j8) {
        this.f17186a = c2472x4;
        this.f17187b = j8;
        this.f17188c = c2465w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17188c.O(this.f17186a, false, this.f17187b);
        C2465w4 c2465w4 = this.f17188c;
        c2465w4.f18102e = null;
        c2465w4.q().J(null);
    }
}
