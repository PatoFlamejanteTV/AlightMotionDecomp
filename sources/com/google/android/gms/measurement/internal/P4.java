package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17512a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17513b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ F4 f17514c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P4(F4 f42, M5 m52, com.google.android.gms.internal.measurement.U0 u02) {
        this.f17512a = m52;
        this.f17513b = u02;
        this.f17514c = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        try {
            if (this.f17514c.e().M().z()) {
                interfaceC3306f = this.f17514c.f17223d;
                if (interfaceC3306f == null) {
                    this.f17514c.a().G().a("Failed to get app instance id");
                    return;
                }
                AbstractC1396p.l(this.f17512a);
                String E8 = interfaceC3306f.E(this.f17512a);
                if (E8 != null) {
                    this.f17514c.o().a1(E8);
                    this.f17514c.e().f18150i.b(E8);
                }
                this.f17514c.m0();
                this.f17514c.g().S(this.f17513b, E8);
                return;
            }
            this.f17514c.a().M().a("Analytics storage consent denied; will not get app instance id");
            this.f17514c.o().a1(null);
            this.f17514c.e().f18150i.b(null);
        } catch (RemoteException e8) {
            this.f17514c.a().G().b("Failed to get app instance id", e8);
        } finally {
            this.f17514c.g().S(this.f17513b, null);
        }
    }
}
