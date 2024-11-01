package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: h, reason: collision with root package name */
    public static final String f14233h = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

        /* renamed from: android.support.customtabs.trusted.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0287a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14234a;

            C0287a(IBinder iBinder) {
                this.f14234a = iBinder;
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle areNotificationsEnabled(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14233h);
                    C0288b.d(obtain, bundle, 0);
                    this.f14234a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0288b.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14234a;
            }

            @Override // android.support.customtabs.trusted.b
            public void cancelNotification(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14233h);
                    C0288b.d(obtain, bundle, 0);
                    this.f14234a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14233h);
                    obtain.writeString(str);
                    C0288b.d(obtain, bundle, 0);
                    obtain.writeStrongBinder(iBinder);
                    this.f14234a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0288b.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle getActiveNotifications() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14233h);
                    this.f14234a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0288b.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle getSmallIconBitmap() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14233h);
                    this.f14234a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0288b.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public int getSmallIconId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14233h);
                    this.f14234a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle notifyNotificationWithChannel(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14233h);
                    C0288b.d(obtain, bundle, 0);
                    this.f14234a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0288b.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.f14233h);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f14233h);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0287a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            String str = b.f14233h;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i8) {
                case 2:
                    Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) C0288b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0288b.d(parcel2, notifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    cancelNotification((Bundle) C0288b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case 5:
                    Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    C0288b.d(parcel2, activeNotifications, 1);
                    return true;
                case 6:
                    Bundle areNotificationsEnabled = areNotificationsEnabled((Bundle) C0288b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0288b.d(parcel2, areNotificationsEnabled, 1);
                    return true;
                case 7:
                    Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    C0288b.d(parcel2, smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
                case 9:
                    Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) C0288b.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    C0288b.d(parcel2, extraCommand, 1);
                    return true;
            }
        }
    }

    /* renamed from: android.support.customtabs.trusted.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0288b {
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

    Bundle areNotificationsEnabled(Bundle bundle);

    void cancelNotification(Bundle bundle);

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder);

    Bundle getActiveNotifications();

    Bundle getSmallIconBitmap();

    int getSmallIconId();

    Bundle notifyNotificationWithChannel(Bundle bundle);
}
