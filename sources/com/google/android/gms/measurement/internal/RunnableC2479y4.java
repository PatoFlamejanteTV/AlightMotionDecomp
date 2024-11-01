package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2479y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2472x4 f18131a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2472x4 f18132b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f18133c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f18134d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2465w4 f18135e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2479y4(C2465w4 c2465w4, C2472x4 c2472x4, C2472x4 c2472x42, long j8, boolean z8) {
        this.f18131a = c2472x4;
        this.f18132b = c2472x42;
        this.f18133c = j8;
        this.f18134d = z8;
        this.f18135e = c2465w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18135e.N(this.f18131a, this.f18132b, this.f18133c, this.f18134d, null);
    }
}
