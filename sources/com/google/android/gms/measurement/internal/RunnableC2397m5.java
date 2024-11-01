package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2397m5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ H5 f17950a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f17951b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2397m5(C2390l5 c2390l5, H5 h52, Runnable runnable) {
        this.f17950a = h52;
        this.f17951b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17950a.z0();
        this.f17950a.A(this.f17951b);
        this.f17950a.E0();
    }
}
