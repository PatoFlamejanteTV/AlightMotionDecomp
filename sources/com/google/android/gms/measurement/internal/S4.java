package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Bundle;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17571a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f17572b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ F4 f17573c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S4(F4 f42, M5 m52, Bundle bundle) {
        this.f17571a = m52;
        this.f17572b = bundle;
        this.f17573c = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        interfaceC3306f = this.f17573c.f17223d;
        if (interfaceC3306f == null) {
            this.f17573c.a().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC1396p.l(this.f17571a);
            interfaceC3306f.z(this.f17572b, this.f17571a);
        } catch (RemoteException e8) {
            this.f17573c.a().G().b("Failed to send default event parameters to service", e8);
        }
    }
}
