package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2097b0 extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC2097b0(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected abstract boolean h(int i8, Parcel parcel, Parcel parcel2, int i9);

    @Override // android.os.Binder
    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
        boolean z8;
        if (i8 > 16777215) {
            z8 = super.onTransact(i8, parcel, parcel2, i9);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z8 = false;
        }
        if (z8) {
            return true;
        }
        return h(i8, parcel, parcel2, i9);
    }
}
