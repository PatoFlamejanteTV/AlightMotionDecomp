package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2353g3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17828a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f17829b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2353g3(X2 x22, M5 m52) {
        this.f17828a = m52;
        this.f17829b = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        h52 = this.f17829b.f17618a;
        h52.z0();
        h53 = this.f17829b.f17618a;
        h53.f0(this.f17828a);
    }
}
