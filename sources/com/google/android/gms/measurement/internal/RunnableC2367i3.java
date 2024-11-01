package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2367i3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2335e f17850a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f17851b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f17852c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2367i3(X2 x22, C2335e c2335e, M5 m52) {
        this.f17850a = c2335e;
        this.f17851b = m52;
        this.f17852c = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        H5 h54;
        h52 = this.f17852c.f17618a;
        h52.z0();
        if (this.f17850a.f17781c.s() == null) {
            h54 = this.f17852c.f17618a;
            h54.r(this.f17850a, this.f17851b);
        } else {
            h53 = this.f17852c.f17618a;
            h53.X(this.f17850a, this.f17851b);
        }
    }
}
