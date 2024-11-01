package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import q0.C3626l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class u extends P.t {

    /* renamed from: b, reason: collision with root package name */
    protected final C3626l f16173b;

    public u(int i8, C3626l c3626l) {
        super(i8);
        this.f16173b = c3626l;
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        this.f16173b.d(new O.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        this.f16173b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(n nVar) {
        try {
            h(nVar);
        } catch (DeadObjectException e8) {
            a(y.e(e8));
            throw e8;
        } catch (RemoteException e9) {
            a(y.e(e9));
        } catch (RuntimeException e10) {
            this.f16173b.d(e10);
        }
    }

    protected abstract void h(n nVar);
}
