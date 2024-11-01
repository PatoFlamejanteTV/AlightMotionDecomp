package com.google.android.gms.measurement.internal;

import N.AbstractC1349l;
import Q.AbstractC1383c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import l0.InterfaceC3306f;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2373j2 extends AbstractC1383c {
    public C2373j2(Context context, Looper looper, AbstractC1383c.a aVar, AbstractC1383c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // Q.AbstractC1383c
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final int k() {
        return AbstractC1349l.f6370a;
    }

    @Override // Q.AbstractC1383c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof InterfaceC3306f) {
            return (InterfaceC3306f) queryLocalInterface;
        }
        return new C2338e2(iBinder);
    }
}
