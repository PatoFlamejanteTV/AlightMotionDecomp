package Q;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
final class U implements InterfaceC1392l {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f8172a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(IBinder iBinder) {
        this.f8172a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8172a;
    }

    @Override // Q.InterfaceC1392l
    public final void c0(InterfaceC1391k interfaceC1391k, C1386f c1386f) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC1391k != null) {
                iBinder = interfaceC1391k.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (c1386f != null) {
                obtain.writeInt(1);
                k0.a(c1386f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f8172a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
