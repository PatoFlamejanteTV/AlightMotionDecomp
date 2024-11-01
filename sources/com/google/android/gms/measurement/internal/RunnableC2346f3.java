package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2346f3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17801a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17802b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17803c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f17804d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ X2 f17805e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2346f3(X2 x22, String str, String str2, String str3, long j8) {
        this.f17801a = str;
        this.f17802b = str2;
        this.f17803c = str3;
        this.f17804d = j8;
        this.f17805e = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        String str = this.f17801a;
        if (str == null) {
            h53 = this.f17805e.f17618a;
            h53.G(this.f17802b, null);
        } else {
            C2472x4 c2472x4 = new C2472x4(this.f17803c, str, this.f17804d);
            h52 = this.f17805e.f17618a;
            h52.G(this.f17802b, c2472x4);
        }
    }
}
