package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2332d3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17760a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f17761b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2332d3(X2 x22, M5 m52) {
        this.f17760a = m52;
        this.f17761b = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        h52 = this.f17761b.f17618a;
        h52.z0();
        h53 = this.f17761b.f17618a;
        h53.h0(this.f17760a);
    }
}
