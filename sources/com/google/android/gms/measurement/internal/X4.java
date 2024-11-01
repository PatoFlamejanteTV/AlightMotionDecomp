package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17630a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F4 f17631b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X4(F4 f42, M5 m52) {
        this.f17630a = m52;
        this.f17631b = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        interfaceC3306f = this.f17631b.f17223d;
        if (interfaceC3306f == null) {
            this.f17631b.a().G().a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC1396p.l(this.f17630a);
            interfaceC3306f.A(this.f17630a);
            this.f17631b.m0();
        } catch (RemoteException e8) {
            this.f17631b.a().G().b("Failed to send consent settings to the service", e8);
        }
    }
}
