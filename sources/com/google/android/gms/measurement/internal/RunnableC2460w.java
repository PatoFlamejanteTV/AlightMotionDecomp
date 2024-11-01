package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2460w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2478y3 f18094a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AbstractC2439t f18095b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2460w(AbstractC2439t abstractC2439t, InterfaceC2478y3 interfaceC2478y3) {
        this.f18094a = interfaceC2478y3;
        this.f18095b = abstractC2439t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18094a.y();
        if (C2321c.a()) {
            this.f18094a.f().D(this);
            return;
        }
        boolean e8 = this.f18095b.e();
        this.f18095b.f18051c = 0L;
        if (e8) {
            this.f18095b.d();
        }
    }
}
