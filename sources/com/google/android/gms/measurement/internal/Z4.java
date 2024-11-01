package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import android.text.TextUtils;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17661a = true;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f17662b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f17663c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C2335e f17664d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2335e f17665e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ F4 f17666f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z4(F4 f42, boolean z8, M5 m52, boolean z9, C2335e c2335e, C2335e c2335e2) {
        this.f17662b = m52;
        this.f17663c = z9;
        this.f17664d = c2335e;
        this.f17665e = c2335e2;
        this.f17666f = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        C2335e c2335e;
        interfaceC3306f = this.f17666f.f17223d;
        if (interfaceC3306f == null) {
            this.f17666f.a().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f17661a) {
            AbstractC1396p.l(this.f17662b);
            F4 f42 = this.f17666f;
            if (this.f17663c) {
                c2335e = null;
            } else {
                c2335e = this.f17664d;
            }
            f42.T(interfaceC3306f, c2335e, this.f17662b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f17665e.f17779a)) {
                    AbstractC1396p.l(this.f17662b);
                    interfaceC3306f.H(this.f17664d, this.f17662b);
                } else {
                    interfaceC3306f.Q(this.f17664d);
                }
            } catch (RemoteException e8) {
                this.f17666f.a().G().b("Failed to send conditional user property to the service", e8);
            }
        }
        this.f17666f.m0();
    }
}
