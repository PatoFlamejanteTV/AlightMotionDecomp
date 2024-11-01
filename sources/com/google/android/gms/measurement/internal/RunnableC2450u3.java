package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2450u3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Y5 f18068a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f18069b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f18070c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2450u3(X2 x22, Y5 y52, M5 m52) {
        this.f18068a = y52;
        this.f18069b = m52;
        this.f18070c = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        H5 h54;
        h52 = this.f18070c.f17618a;
        h52.z0();
        if (this.f18068a.s() == null) {
            h54 = this.f18070c.f17618a;
            h54.H(this.f18068a.f17650b, this.f18069b);
        } else {
            h53 = this.f18070c.f17618a;
            h53.z(this.f18068a, this.f18069b);
        }
    }
}
