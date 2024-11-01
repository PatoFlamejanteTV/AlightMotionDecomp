package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2307a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17667a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f17668b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2474y f17669c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2307a(C2474y c2474y, String str, long j8) {
        this.f17667a = str;
        this.f17668b = j8;
        this.f17669c = c2474y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2474y.v(this.f17669c, this.f17667a, this.f17668b);
    }
}
