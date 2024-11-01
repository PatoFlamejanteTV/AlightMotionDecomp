package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17432a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f17433b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f17434c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ F4 f17435d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K4(F4 f42, AtomicReference atomicReference, M5 m52, Bundle bundle) {
        this.f17432a = atomicReference;
        this.f17433b = m52;
        this.f17434c = bundle;
        this.f17435d = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        synchronized (this.f17432a) {
            try {
                try {
                    interfaceC3306f = this.f17435d.f17223d;
                } catch (RemoteException e8) {
                    this.f17435d.a().G().b("Failed to get trigger URIs; remote exception", e8);
                }
                if (interfaceC3306f == null) {
                    this.f17435d.a().G().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                AbstractC1396p.l(this.f17433b);
                this.f17432a.set(interfaceC3306f.j0(this.f17433b, this.f17434c));
                this.f17435d.m0();
                this.f17432a.notify();
            } finally {
                this.f17432a.notify();
            }
        }
    }
}
