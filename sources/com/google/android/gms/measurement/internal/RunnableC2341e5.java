package com.google.android.gms.measurement.internal;

import l0.InterfaceC3306f;

/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2341e5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3306f f17797a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2334d5 f17798b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2341e5(ServiceConnectionC2334d5 serviceConnectionC2334d5, InterfaceC3306f interfaceC3306f) {
        this.f17797a = interfaceC3306f;
        this.f17798b = serviceConnectionC2334d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17798b) {
            try {
                this.f17798b.f17768a = false;
                if (!this.f17798b.f17770c.g0()) {
                    this.f17798b.f17770c.a().F().a("Connected to remote service");
                    this.f17798b.f17770c.S(this.f17797a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
