package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Bundle;
import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17409a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17410b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ M5 f17411c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f17412d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17413e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ F4 f17414f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I4(F4 f42, String str, String str2, M5 m52, boolean z8, com.google.android.gms.internal.measurement.U0 u02) {
        this.f17409a = str;
        this.f17410b = str2;
        this.f17411c = m52;
        this.f17412d = z8;
        this.f17413e = u02;
        this.f17414f = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        Bundle bundle = new Bundle();
        try {
            interfaceC3306f = this.f17414f.f17223d;
            if (interfaceC3306f == null) {
                this.f17414f.a().G().c("Failed to get user properties; not connected to service", this.f17409a, this.f17410b);
                return;
            }
            AbstractC1396p.l(this.f17411c);
            Bundle G8 = d6.G(interfaceC3306f.f0(this.f17409a, this.f17410b, this.f17412d, this.f17411c));
            this.f17414f.m0();
            this.f17414f.g().R(this.f17413e, G8);
        } catch (RemoteException e8) {
            this.f17414f.a().G().c("Failed to get user properties; remote exception", this.f17409a, e8);
        } finally {
            this.f17414f.g().R(this.f17413e, bundle);
        }
    }
}
