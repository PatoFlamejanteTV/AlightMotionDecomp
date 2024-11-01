package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class U2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17584a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17585b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02) {
        this.f17584a = u02;
        this.f17585b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17585b.f17136a.J().D(this.f17584a);
    }
}
