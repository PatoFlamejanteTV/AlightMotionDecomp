package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: g, reason: collision with root package name */
    public static final String f14231g = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    /* renamed from: android.support.customtabs.trusted.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0285a extends Binder implements a {
        static final int TRANSACTION_onExtraCallback = 2;

        /* renamed from: android.support.customtabs.trusted.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0286a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14232a;

            C0286a(IBinder iBinder) {
                this.f14232a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14232a;
            }

            @Override // android.support.customtabs.trusted.a
            public void onExtraCallback(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14231g);
                    obtain.writeString(str);
                    b.d(obtain, bundle, 0);
                    this.f14232a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0285a() {
            attachInterface(this, a.f14231g);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f14231g);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0286a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            String str = a.f14231g;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i8 != 2) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            onExtraCallback(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i8) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i8);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    void onExtraCallback(String str, Bundle bundle);
}
