package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ D3 f17639a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ S2 f17640b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y2(S2 s22, D3 d32) {
        this.f17639a = d32;
        this.f17640b = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S2.e(this.f17640b, this.f17639a);
        this.f17640b.c(this.f17639a.f17182g);
    }
}
