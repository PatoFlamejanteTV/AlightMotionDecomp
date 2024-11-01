package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2436s3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E f18042a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f18043b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f18044c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2436s3(X2 x22, E e8, String str) {
        this.f18042a = e8;
        this.f18043b = str;
        this.f18044c = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        h52 = this.f18044c.f17618a;
        h52.z0();
        h53 = this.f18044c.f17618a;
        h53.t(this.f18042a, this.f18043b);
    }
}
