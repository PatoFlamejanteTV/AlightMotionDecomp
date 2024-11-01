package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2456v2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f18086a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2463w2 f18087b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2456v2(C2463w2 c2463w2, boolean z8) {
        this.f18086a = z8;
        this.f18087b = c2463w2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        h52 = this.f18087b.f18096a;
        h52.K(this.f18086a);
    }
}
