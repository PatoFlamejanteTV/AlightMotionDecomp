package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17643a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17644b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17645c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17646d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ M5 f17647e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ F4 f17648f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y4(F4 f42, AtomicReference atomicReference, String str, String str2, String str3, M5 m52) {
        this.f17643a = atomicReference;
        this.f17644b = str;
        this.f17645c = str2;
        this.f17646d = str3;
        this.f17647e = m52;
        this.f17648f = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        synchronized (this.f17643a) {
            try {
                try {
                    interfaceC3306f = this.f17648f.f17223d;
                } catch (RemoteException e8) {
                    this.f17648f.a().G().d("(legacy) Failed to get conditional properties; remote exception", C2401n2.s(this.f17644b), this.f17645c, e8);
                    this.f17643a.set(Collections.emptyList());
                }
                if (interfaceC3306f == null) {
                    this.f17648f.a().G().d("(legacy) Failed to get conditional properties; not connected to service", C2401n2.s(this.f17644b), this.f17645c, this.f17646d);
                    this.f17643a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f17644b)) {
                    AbstractC1396p.l(this.f17647e);
                    this.f17643a.set(interfaceC3306f.m(this.f17645c, this.f17646d, this.f17647e));
                } else {
                    this.f17643a.set(interfaceC3306f.P(this.f17644b, this.f17645c, this.f17646d));
                }
                this.f17648f.m0();
                this.f17643a.notify();
            } finally {
                this.f17643a.notify();
            }
        }
    }
}
