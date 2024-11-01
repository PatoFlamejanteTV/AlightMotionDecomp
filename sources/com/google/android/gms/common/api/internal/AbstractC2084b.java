package com.google.android.gms.common.api.internal;

import O.a;
import Q.AbstractC1396p;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2084b extends BasePendingResult {

    /* renamed from: n, reason: collision with root package name */
    private final a.c f16098n;

    /* renamed from: o, reason: collision with root package name */
    private final O.a f16099o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2084b(O.a aVar, O.f fVar) {
        super((O.f) AbstractC1396p.m(fVar, "GoogleApiClient must not be null"));
        AbstractC1396p.m(aVar, "Api must not be null");
        this.f16098n = aVar.b();
        this.f16099o = aVar;
    }

    private void n(RemoteException remoteException) {
        o(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void k(a.b bVar);

    public final void m(a.b bVar) {
        try {
            k(bVar);
        } catch (DeadObjectException e8) {
            n(e8);
            throw e8;
        } catch (RemoteException e9) {
            n(e9);
        }
    }

    public final void o(Status status) {
        AbstractC1396p.b(!status.I(), "Failed result must not be success");
        O.j c8 = c(status);
        f(c8);
        l(c8);
    }

    protected void l(O.j jVar) {
    }
}
