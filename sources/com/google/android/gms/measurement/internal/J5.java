package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ W5 f17426a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ H5 f17427b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J5(H5 h52, W5 w52) {
        this.f17426a = w52;
        this.f17427b = h52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5.v(this.f17427b, this.f17426a);
        this.f17427b.D0();
    }
}
