package com.google.android.gms.dynamite;

import Y.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f0.AbstractC2836a;
import f0.AbstractC2838c;

/* loaded from: classes3.dex */
public final class n extends AbstractC2836a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final Y.a k(Y.a aVar, String str, int i8, Y.a aVar2) {
        Parcel i9 = i();
        AbstractC2838c.d(i9, aVar);
        i9.writeString(str);
        i9.writeInt(i8);
        AbstractC2838c.d(i9, aVar2);
        Parcel h8 = h(2, i9);
        Y.a i10 = a.AbstractBinderC0258a.i(h8.readStrongBinder());
        h8.recycle();
        return i10;
    }

    public final Y.a s0(Y.a aVar, String str, int i8, Y.a aVar2) {
        Parcel i9 = i();
        AbstractC2838c.d(i9, aVar);
        i9.writeString(str);
        i9.writeInt(i8);
        AbstractC2838c.d(i9, aVar2);
        Parcel h8 = h(3, i9);
        Y.a i10 = a.AbstractBinderC0258a.i(h8.readStrongBinder());
        h8.recycle();
        return i10;
    }
}
