package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2482z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f18139a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f18140b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2474y f18141c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2482z0(C2474y c2474y, String str, long j8) {
        this.f18139a = str;
        this.f18140b = j8;
        this.f18141c = c2474y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2474y.C(this.f18141c, this.f18139a, this.f18140b);
    }
}
