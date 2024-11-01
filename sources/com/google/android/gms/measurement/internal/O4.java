package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17495a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F4 f17496b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O4(F4 f42, M5 m52) {
        this.f17495a = m52;
        this.f17496b = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        interfaceC3306f = this.f17496b.f17223d;
        if (interfaceC3306f == null) {
            this.f17496b.a().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC1396p.l(this.f17495a);
            interfaceC3306f.p(this.f17495a);
            this.f17496b.n().J();
            this.f17496b.T(interfaceC3306f, null, this.f17495a);
            this.f17496b.m0();
        } catch (RemoteException e8) {
            this.f17496b.a().G().b("Failed to send app launch to the service", e8);
        }
    }
}
