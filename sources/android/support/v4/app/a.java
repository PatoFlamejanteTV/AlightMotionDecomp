package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14235i = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0289a extends Binder implements a {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        /* renamed from: android.support.v4.app.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0290a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14236a;

            C0290a(IBinder iBinder) {
                this.f14236a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14236a;
            }

            @Override // android.support.v4.app.a
            public void cancel(String str, int i8, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14235i);
                    obtain.writeString(str);
                    obtain.writeInt(i8);
                    obtain.writeString(str2);
                    this.f14236a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14235i);
                    obtain.writeString(str);
                    this.f14236a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void notify(String str, int i8, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14235i);
                    obtain.writeString(str);
                    obtain.writeInt(i8);
                    obtain.writeString(str2);
                    b.d(obtain, notification, 0);
                    this.f14236a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0289a() {
            attachInterface(this, a.f14235i);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f14235i);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0290a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            String str = a.f14235i;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        return super.onTransact(i8, parcel, parcel2, i9);
                    }
                    cancelAll(parcel.readString());
                } else {
                    cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                }
            } else {
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) b.c(parcel, Notification.CREATOR));
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

    void cancel(String str, int i8, String str2);

    void cancelAll(String str);

    void notify(String str, int i8, String str2, Notification notification);
}
