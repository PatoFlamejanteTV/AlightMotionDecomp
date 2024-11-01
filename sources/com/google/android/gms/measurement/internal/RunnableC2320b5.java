package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import java.util.ArrayList;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2320b5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17703a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17704b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ M5 f17705c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17706d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F4 f17707e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2320b5(F4 f42, String str, String str2, M5 m52, com.google.android.gms.internal.measurement.U0 u02) {
        this.f17703a = str;
        this.f17704b = str2;
        this.f17705c = m52;
        this.f17706d = u02;
        this.f17707e = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        ArrayList arrayList = new ArrayList();
        try {
            interfaceC3306f = this.f17707e.f17223d;
            if (interfaceC3306f == null) {
                this.f17707e.a().G().c("Failed to get conditional properties; not connected to service", this.f17703a, this.f17704b);
                return;
            }
            AbstractC1396p.l(this.f17705c);
            ArrayList t02 = d6.t0(interfaceC3306f.m(this.f17703a, this.f17704b, this.f17705c));
            this.f17707e.m0();
            this.f17707e.g().T(this.f17706d, t02);
        } catch (RemoteException e8) {
            this.f17707e.a().G().d("Failed to get conditional properties; remote exception", this.f17703a, this.f17704b, e8);
        } finally {
            this.f17707e.g().T(this.f17706d, arrayList);
        }
    }
}
