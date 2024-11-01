package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17485a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F4 f17486b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N4(F4 f42, M5 m52) {
        this.f17485a = m52;
        this.f17486b = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        interfaceC3306f = this.f17486b.f17223d;
        if (interfaceC3306f == null) {
            this.f17486b.a().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            AbstractC1396p.l(this.f17485a);
            interfaceC3306f.u(this.f17485a);
        } catch (RemoteException e8) {
            this.f17486b.a().G().b("Failed to reset data on the service: remote exception", e8);
        }
        this.f17486b.m0();
    }
}
