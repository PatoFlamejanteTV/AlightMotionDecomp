package com.google.android.gms.measurement.internal;

import l0.InterfaceC3306f;

/* renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2327c5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3306f f17757a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2334d5 f17758b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2327c5(ServiceConnectionC2334d5 serviceConnectionC2334d5, InterfaceC3306f interfaceC3306f) {
        this.f17757a = interfaceC3306f;
        this.f17758b = serviceConnectionC2334d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17758b) {
            try {
                this.f17758b.f17768a = false;
                if (!this.f17758b.f17770c.g0()) {
                    this.f17758b.f17770c.a().K().a("Connected to service");
                    this.f17758b.f17770c.S(this.f17757a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
