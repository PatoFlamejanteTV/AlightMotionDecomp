package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17587a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F4 f17588b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U4(F4 f42, M5 m52) {
        this.f17587a = m52;
        this.f17588b = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        interfaceC3306f = this.f17588b.f17223d;
        if (interfaceC3306f == null) {
            this.f17588b.a().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            AbstractC1396p.l(this.f17587a);
            interfaceC3306f.n0(this.f17587a);
            this.f17588b.m0();
        } catch (RemoteException e8) {
            this.f17588b.a().G().b("Failed to send measurementEnabled to the service", e8);
        }
    }
}
