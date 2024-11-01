package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class Y implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f16482a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16483b;

    /* JADX INFO: Access modifiers changed from: protected */
    public Y(IBinder iBinder, String str) {
        this.f16482a = iBinder;
        this.f16483b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f16482a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16483b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f16482a.transact(i8, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16482a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
