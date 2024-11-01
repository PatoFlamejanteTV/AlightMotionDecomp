package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2106c0 extends AbstractBinderC2097b0 implements InterfaceC2115d0 {
    public static InterfaceC2115d0 i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof InterfaceC2115d0) {
            return (InterfaceC2115d0) queryLocalInterface;
        }
        return new C2133f0(iBinder);
    }
}
