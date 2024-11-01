package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class O3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17491a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ E f17492b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17493c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17494d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, E e8, String str) {
        this.f17491a = u02;
        this.f17492b = e8;
        this.f17493c = str;
        this.f17494d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17494d.f17136a.J().E(this.f17491a, this.f17492b, this.f17493c);
    }
}
