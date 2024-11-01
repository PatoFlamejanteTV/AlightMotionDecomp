package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2472x4 f17523a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F4 f17524b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q4(F4 f42, C2472x4 c2472x4) {
        this.f17523a = c2472x4;
        this.f17524b = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        interfaceC3306f = this.f17524b.f17223d;
        if (interfaceC3306f == null) {
            this.f17524b.a().G().a("Failed to send current screen to service");
            return;
        }
        try {
            C2472x4 c2472x4 = this.f17523a;
            if (c2472x4 == null) {
                interfaceC3306f.J(0L, null, null, this.f17524b.w().getPackageName());
            } else {
                interfaceC3306f.J(c2472x4.f18122c, c2472x4.f18120a, c2472x4.f18121b, this.f17524b.w().getPackageName());
            }
            this.f17524b.m0();
        } catch (RemoteException e8) {
            this.f17524b.a().G().b("Failed to send current screen to the service", e8);
        }
    }
}
