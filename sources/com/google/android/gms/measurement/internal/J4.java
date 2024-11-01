package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17422a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f17423b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Y5 f17424c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ F4 f17425d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J4(F4 f42, M5 m52, boolean z8, Y5 y52) {
        this.f17422a = m52;
        this.f17423b = z8;
        this.f17424c = y52;
        this.f17425d = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        Y5 y52;
        interfaceC3306f = this.f17425d.f17223d;
        if (interfaceC3306f == null) {
            this.f17425d.a().G().a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC1396p.l(this.f17422a);
        F4 f42 = this.f17425d;
        if (this.f17423b) {
            y52 = null;
        } else {
            y52 = this.f17424c;
        }
        f42.T(interfaceC3306f, y52, this.f17422a);
        this.f17425d.m0();
    }
}
