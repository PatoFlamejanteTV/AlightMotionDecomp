package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2431r5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f18034a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2418p5 f18035b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2431r5(C2418p5 c2418p5, long j8) {
        this.f18034a = j8;
        this.f18035b = c2418p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2418p5.I(this.f18035b, this.f18034a);
    }
}
