package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface c extends IInterface {

    /* renamed from: e, reason: collision with root package name */
    public static final String f14227e = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
        static final int TRANSACTION_onSessionEnded = 4;
        static final int TRANSACTION_onVerticalScrollEvent = 2;

        /* renamed from: android.support.customtabs.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0283a implements c {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14228a;

            C0283a(IBinder iBinder) {
                this.f14228a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14228a;
            }

            @Override // android.support.customtabs.c
            public void onGreatestScrollPercentageIncreased(int i8, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.f14227e);
                    obtain.writeInt(i8);
                    b.d(obtain, bundle, 0);
                    this.f14228a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public void onSessionEnded(boolean z8, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.f14227e);
                    obtain.writeInt(z8 ? 1 : 0);
                    b.d(obtain, bundle, 0);
                    this.f14228a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public void onVerticalScrollEvent(boolean z8, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.f14227e);
                    obtain.writeInt(z8 ? 1 : 0);
                    b.d(obtain, bundle, 0);
                    this.f14228a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, c.f14227e);
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(c.f14227e);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0283a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            String str = c.f14227e;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            boolean z8 = false;
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return super.onTransact(i8, parcel, parcel2, i9);
                    }
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    }
                    onSessionEnded(z8, (Bundle) b.c(parcel, Bundle.CREATOR));
                } else {
                    onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                }
            } else {
                if (parcel.readInt() != 0) {
                    z8 = true;
                }
                onVerticalScrollEvent(z8, (Bundle) b.c(parcel, Bundle.CREATOR));
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

    void onGreatestScrollPercentageIncreased(int i8, Bundle bundle);

    void onSessionEnded(boolean z8, Bundle bundle);

    void onVerticalScrollEvent(boolean z8, Bundle bundle);
}
