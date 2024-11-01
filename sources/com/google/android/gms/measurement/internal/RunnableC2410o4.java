package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2410o4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17989a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17990b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17991c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17992d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2410o4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        this.f17989a = u02;
        this.f17990b = str;
        this.f17991c = str2;
        this.f17992d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17992d.f17136a.J().F(this.f17989a, this.f17990b, this.f17991c);
    }
}
