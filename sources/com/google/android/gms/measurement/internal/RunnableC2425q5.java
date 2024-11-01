package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2425q5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f18024a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2418p5 f18025b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2425q5(C2418p5 c2418p5, long j8) {
        this.f18024a = j8;
        this.f18025b = c2418p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2418p5.C(this.f18025b, this.f18024a);
    }
}
