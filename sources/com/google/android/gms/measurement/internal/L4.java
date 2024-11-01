package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17440a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f17441b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ F4 f17442c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L4(F4 f42, AtomicReference atomicReference, M5 m52) {
        this.f17440a = atomicReference;
        this.f17441b = m52;
        this.f17442c = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        synchronized (this.f17440a) {
            try {
                try {
                } catch (RemoteException e8) {
                    this.f17442c.a().G().b("Failed to get app instance id", e8);
                }
                if (this.f17442c.e().M().z()) {
                    interfaceC3306f = this.f17442c.f17223d;
                    if (interfaceC3306f == null) {
                        this.f17442c.a().G().a("Failed to get app instance id");
                        return;
                    }
                    AbstractC1396p.l(this.f17441b);
                    this.f17440a.set(interfaceC3306f.E(this.f17441b));
                    String str = (String) this.f17440a.get();
                    if (str != null) {
                        this.f17442c.o().a1(str);
                        this.f17442c.e().f18150i.b(str);
                    }
                    this.f17442c.m0();
                    this.f17440a.notify();
                    return;
                }
                this.f17442c.a().M().a("Analytics storage consent denied; will not get app instance id");
                this.f17442c.o().a1(null);
                this.f17442c.e().f18150i.b(null);
                this.f17440a.set(null);
            } finally {
                this.f17440a.notify();
            }
        }
    }
}
