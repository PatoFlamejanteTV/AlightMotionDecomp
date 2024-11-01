package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
final class M4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f17449a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M4(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f17449a = aVar;
        this.f17450b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17450b.f17136a.H().o0(this.f17449a);
    }
}
