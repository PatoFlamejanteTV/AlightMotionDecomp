package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17637a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2474y f17638b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y(C2474y c2474y, long j8) {
        this.f17637a = j8;
        this.f17638b = c2474y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17638b.B(this.f17637a);
    }
}
