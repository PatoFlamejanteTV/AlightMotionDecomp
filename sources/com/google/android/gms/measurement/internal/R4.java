package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17530a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F4 f17531b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R4(F4 f42, M5 m52) {
        this.f17530a = m52;
        this.f17531b = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        interfaceC3306f = this.f17531b.f17223d;
        if (interfaceC3306f == null) {
            this.f17531b.a().L().a("Failed to send app backgrounded");
            return;
        }
        try {
            AbstractC1396p.l(this.f17530a);
            interfaceC3306f.O(this.f17530a);
            this.f17531b.m0();
        } catch (RemoteException e8) {
            this.f17531b.a().G().b("Failed to send app backgrounded to the service", e8);
        }
    }
}
