package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2416p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E f18004a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f18005b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f18006c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2416p3(X2 x22, E e8, M5 m52) {
        this.f18004a = e8;
        this.f18005b = m52;
        this.f18006c = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18006c.y0(this.f18006c.u0(this.f18004a, this.f18005b), this.f18005b);
    }
}
