package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E f17596a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17597b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17598c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ F4 f17599d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V4(F4 f42, E e8, String str, com.google.android.gms.internal.measurement.U0 u02) {
        this.f17596a = e8;
        this.f17597b = str;
        this.f17598c = u02;
        this.f17599d = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        try {
            interfaceC3306f = this.f17599d.f17223d;
            if (interfaceC3306f == null) {
                this.f17599d.a().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] k02 = interfaceC3306f.k0(this.f17596a, this.f17597b);
            this.f17599d.m0();
            this.f17599d.g().V(this.f17598c, k02);
        } catch (RemoteException e8) {
            this.f17599d.a().G().b("Failed to send event to the service to bundle", e8);
        } finally {
            this.f17599d.g().V(this.f17598c, null);
        }
    }
}
