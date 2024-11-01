package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2355g5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2334d5 f17832a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2355g5(ServiceConnectionC2334d5 serviceConnectionC2334d5) {
        this.f17832a = serviceConnectionC2334d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17832a.f17770c.f17223d = null;
        this.f17832a.f17770c.l0();
    }
}
