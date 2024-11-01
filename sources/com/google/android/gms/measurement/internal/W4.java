package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import android.text.TextUtils;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17611a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f17612b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f17613c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ E f17614d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f17615e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ F4 f17616f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W4(F4 f42, boolean z8, M5 m52, boolean z9, E e8, String str) {
        this.f17611a = z8;
        this.f17612b = m52;
        this.f17613c = z9;
        this.f17614d = e8;
        this.f17615e = str;
        this.f17616f = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        long j8;
        long j9;
        long j10;
        E e8;
        interfaceC3306f = this.f17616f.f17223d;
        if (interfaceC3306f == null) {
            this.f17616f.a().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f17611a) {
            AbstractC1396p.l(this.f17612b);
            F4 f42 = this.f17616f;
            if (this.f17613c) {
                e8 = null;
            } else {
                e8 = this.f17614d;
            }
            f42.T(interfaceC3306f, e8, this.f17612b);
        } else {
            boolean q8 = this.f17616f.b().q(G.f17241F0);
            try {
                if (TextUtils.isEmpty(this.f17615e)) {
                    AbstractC1396p.l(this.f17612b);
                    if (q8) {
                        j10 = this.f17616f.f18099a.x().currentTimeMillis();
                        try {
                            j8 = this.f17616f.f18099a.x().elapsedRealtime();
                        } catch (RemoteException e9) {
                            e = e9;
                            j8 = 0;
                            j9 = j10;
                            this.f17616f.a().G().b("Failed to send event to the service", e);
                            if (q8) {
                                C2387l2.a(this.f17616f.f18099a).b(36301, 13, j9, this.f17616f.f18099a.x().currentTimeMillis(), (int) (this.f17616f.f18099a.x().elapsedRealtime() - j8));
                            }
                            this.f17616f.m0();
                        }
                    } else {
                        j10 = 0;
                        j8 = 0;
                    }
                    try {
                        interfaceC3306f.p0(this.f17614d, this.f17612b);
                        if (q8) {
                            this.f17616f.a().K().a("Logging telemetry for logEvent");
                            C2387l2.a(this.f17616f.f18099a).b(36301, 0, j10, this.f17616f.f18099a.x().currentTimeMillis(), (int) (this.f17616f.f18099a.x().elapsedRealtime() - j8));
                        }
                    } catch (RemoteException e10) {
                        e = e10;
                        j9 = j10;
                        this.f17616f.a().G().b("Failed to send event to the service", e);
                        if (q8 && j9 != 0) {
                            C2387l2.a(this.f17616f.f18099a).b(36301, 13, j9, this.f17616f.f18099a.x().currentTimeMillis(), (int) (this.f17616f.f18099a.x().elapsedRealtime() - j8));
                        }
                        this.f17616f.m0();
                    }
                } else {
                    interfaceC3306f.X(this.f17614d, this.f17615e, this.f17616f.a().O());
                }
            } catch (RemoteException e11) {
                e = e11;
                j8 = 0;
                j9 = 0;
            }
        }
        this.f17616f.m0();
    }
}
