package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2396m4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2453v f17948a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17949b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2396m4(F3 f32, C2453v c2453v) {
        this.f17948a = c2453v;
        this.f17949b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17949b.e().A(this.f17948a)) {
            this.f17949b.a().K().b("Setting DMA consent(FE)", this.f17948a);
            if (this.f17949b.q().j0()) {
                this.f17949b.q().e0();
                return;
            } else {
                this.f17949b.q().U(false);
                return;
            }
        }
        this.f17949b.a().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f17948a.a()));
    }
}
