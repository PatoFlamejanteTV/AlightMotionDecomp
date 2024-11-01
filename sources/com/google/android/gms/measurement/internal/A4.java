package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class A4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17134a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2465w4 f17135b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A4(C2465w4 c2465w4, long j8) {
        this.f17134a = j8;
        this.f17135b = c2465w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17135b.l().s(this.f17134a);
        this.f17135b.f18102e = null;
    }
}
