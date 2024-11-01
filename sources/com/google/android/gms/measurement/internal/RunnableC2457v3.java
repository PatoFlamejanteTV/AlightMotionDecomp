package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2457v3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f18088a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f18089b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f18090c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f18091d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f18092e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2457v3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, String str, String str2, boolean z8) {
        this.f18088a = u02;
        this.f18089b = str;
        this.f18090c = str2;
        this.f18091d = z8;
        this.f18092e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18092e.f17136a.J().G(this.f18088a, this.f18089b, this.f18090c, this.f18091d);
    }
}
