package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.a;

/* loaded from: classes.dex */
public interface d extends IInterface {

    /* renamed from: f, reason: collision with root package name */
    public static final String f14229f = "android$support$customtabs$IPostMessageService".replace('$', '.');

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements d {
        static final int TRANSACTION_onMessageChannelReady = 2;
        static final int TRANSACTION_onPostMessage = 3;

        /* renamed from: android.support.customtabs.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0284a implements d {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14230a;

            C0284a(IBinder iBinder) {
                this.f14230a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14230a;
            }

            @Override // android.support.customtabs.d
            public void onMessageChannelReady(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(d.f14229f);
                    obtain.writeStrongInterface(aVar);
                    b.d(obtain, bundle, 0);
                    this.f14230a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.d
            public void onPostMessage(android.support.customtabs.a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(d.f14229f);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    b.d(obtain, bundle, 0);
                    this.f14230a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, d.f14229f);
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(d.f14229f);
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new C0284a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            String str = d.f14229f;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i8 != 2) {
                if (i8 != 3) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                onPostMessage(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                onMessageChannelReady(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), (Bundle) b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
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

    void onMessageChannelReady(android.support.customtabs.a aVar, Bundle bundle);

    void onPostMessage(android.support.customtabs.a aVar, String str, Bundle bundle);
}
