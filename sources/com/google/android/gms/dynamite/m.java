package com.google.android.gms.dynamite;

import Y.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f0.AbstractC2836a;
import f0.AbstractC2838c;

/* loaded from: classes3.dex */
public final class m extends AbstractC2836a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int k() {
        Parcel h8 = h(6, i());
        int readInt = h8.readInt();
        h8.recycle();
        return readInt;
    }

    public final int s0(Y.a aVar, String str, boolean z8) {
        Parcel i8 = i();
        AbstractC2838c.d(i8, aVar);
        i8.writeString(str);
        i8.writeInt(z8 ? 1 : 0);
        Parcel h8 = h(3, i8);
        int readInt = h8.readInt();
        h8.recycle();
        return readInt;
    }

    public final int t0(Y.a aVar, String str, boolean z8) {
        Parcel i8 = i();
        AbstractC2838c.d(i8, aVar);
        i8.writeString(str);
        i8.writeInt(z8 ? 1 : 0);
        Parcel h8 = h(5, i8);
        int readInt = h8.readInt();
        h8.recycle();
        return readInt;
    }

    public final Y.a u0(Y.a aVar, String str, int i8) {
        Parcel i9 = i();
        AbstractC2838c.d(i9, aVar);
        i9.writeString(str);
        i9.writeInt(i8);
        Parcel h8 = h(2, i9);
        Y.a i10 = a.AbstractBinderC0258a.i(h8.readStrongBinder());
        h8.recycle();
        return i10;
    }

    public final Y.a v0(Y.a aVar, String str, int i8, Y.a aVar2) {
        Parcel i9 = i();
        AbstractC2838c.d(i9, aVar);
        i9.writeString(str);
        i9.writeInt(i8);
        AbstractC2838c.d(i9, aVar2);
        Parcel h8 = h(8, i9);
        Y.a i10 = a.AbstractBinderC0258a.i(h8.readStrongBinder());
        h8.recycle();
        return i10;
    }

    public final Y.a w0(Y.a aVar, String str, int i8) {
        Parcel i9 = i();
        AbstractC2838c.d(i9, aVar);
        i9.writeString(str);
        i9.writeInt(i8);
        Parcel h8 = h(4, i9);
        Y.a i10 = a.AbstractBinderC0258a.i(h8.readStrongBinder());
        h8.recycle();
        return i10;
    }

    public final Y.a x0(Y.a aVar, String str, boolean z8, long j8) {
        Parcel i8 = i();
        AbstractC2838c.d(i8, aVar);
        i8.writeString(str);
        i8.writeInt(z8 ? 1 : 0);
        i8.writeLong(j8);
        Parcel h8 = h(7, i8);
        Y.a i9 = a.AbstractBinderC0258a.i(h8.readStrongBinder());
        h8.recycle();
        return i9;
    }
}
