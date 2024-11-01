package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2404n5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17975a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17976b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2404n5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02) {
        this.f17975a = u02;
        this.f17976b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17976b.f17136a.L().U(this.f17975a, this.f17976b.f17136a.l());
    }
}
