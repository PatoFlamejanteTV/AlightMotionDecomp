package com.google.android.gms.common.api.internal;

import N.C1341d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import q0.C3626l;

/* loaded from: classes3.dex */
public final class w extends P.t {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2086d f16175b;

    /* renamed from: c, reason: collision with root package name */
    private final C3626l f16176c;

    /* renamed from: d, reason: collision with root package name */
    private final P.k f16177d;

    public w(int i8, AbstractC2086d abstractC2086d, C3626l c3626l, P.k kVar) {
        super(i8);
        this.f16176c = c3626l;
        this.f16175b = abstractC2086d;
        this.f16177d = kVar;
        if (i8 == 2 && abstractC2086d.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        this.f16176c.d(this.f16177d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        this.f16176c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(n nVar) {
        try {
            this.f16175b.b(nVar.v(), this.f16176c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(y.e(e9));
        } catch (RuntimeException e10) {
            this.f16176c.d(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void d(g gVar, boolean z8) {
        gVar.d(this.f16176c, z8);
    }

    @Override // P.t
    public final boolean f(n nVar) {
        return this.f16175b.c();
    }

    @Override // P.t
    public final C1341d[] g(n nVar) {
        return this.f16175b.e();
    }
}
