package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2360h3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2335e f17839a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f17840b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2360h3(X2 x22, C2335e c2335e) {
        this.f17839a = c2335e;
        this.f17840b = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        H5 h54;
        h52 = this.f17840b.f17618a;
        h52.z0();
        if (this.f17839a.f17781c.s() == null) {
            h54 = this.f17840b.f17618a;
            h54.q(this.f17839a);
        } else {
            h53 = this.f17840b.f17618a;
            h53.W(this.f17839a);
        }
    }
}
