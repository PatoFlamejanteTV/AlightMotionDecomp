package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c, reason: collision with root package name */
    public static final String f14223c = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: android.support.customtabs.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0279a extends Binder implements a {
        static final int TRANSACTION_extraCallback = 3;
        static final int TRANSACTION_extraCallbackWithResult = 7;
        static final int TRANSACTION_onActivityLayout = 10;
        static final int TRANSACTION_onActivityResized = 8;
        static final int TRANSACTION_onMessageChannelReady = 4;
        static final int TRANSACTION_onMinimized = 11;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onPostMessage = 5;
        static final int TRANSACTION_onRelationshipValidationResult = 6;
        static final int TRANSACTION_onUnminimized = 12;
        static final int TRANSACTION_onWarmupCompleted = 9;

        /* renamed from: android.support.customtabs.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0280a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14224a;

            C0280a(IBinder iBinder) {
                this.f14224a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14224a;
            }

            @Override // android.support.customtabs.a
            public void extraCallback(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    obtain.writeString(str);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public Bundle extraCallbackWithResult(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    obtain.writeString(str);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) b.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onActivityLayout(int i8, int i9, int i10, int i11, int i12, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    obtain.writeInt(i8);
                    obtain.writeInt(i9);
                    obtain.writeInt(i10);
                    obtain.writeInt(i11);
                    obtain.writeInt(i12);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onActivityResized(int i8, int i9, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    obtain.writeInt(i8);
                    obtain.writeInt(i9);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onMessageChannelReady(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onMinimized(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onNavigationEvent(int i8, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    obtain.writeInt(i8);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onPostMessage(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    obtain.writeString(str);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onRelationshipValidationResult(int i8, Uri uri, boolean z8, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    obtain.writeInt(i8);
                    b.d(obtain, uri, 0);
                    obtain.writeInt(z8 ? 1 : 0);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onUnminimized(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void onWarmupCompleted(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f14223c);
                    b.d(obtain, bundle, 0);
                    this.f14224a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0279a() {
            attachInterface(this, a.f14223c);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f14223c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0280a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            boolean z8;
            String str = a.f14223c;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i8) {
                case 2:
                    onNavigationEvent(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    extraCallback(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    onMessageChannelReady((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onPostMessage(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    int readInt = parcel.readInt();
                    Uri uri = (Uri) b.c(parcel, Uri.CREATOR);
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    onRelationshipValidationResult(readInt, uri, z8, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle extraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, extraCallbackWithResult, 1);
                    return true;
                case 8:
                    onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    onWarmupCompleted((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    onMinimized((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    onUnminimized((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
            }
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

    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    void onActivityLayout(int i8, int i9, int i10, int i11, int i12, Bundle bundle);

    void onActivityResized(int i8, int i9, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onMinimized(Bundle bundle);

    void onNavigationEvent(int i8, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i8, Uri uri, boolean z8, Bundle bundle);

    void onUnminimized(Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
