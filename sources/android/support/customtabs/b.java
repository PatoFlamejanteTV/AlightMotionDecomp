package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.a;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f14225d = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        /* renamed from: android.support.customtabs.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0281a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14226a;

            C0281a(IBinder iBinder) {
                this.f14226a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14226a;
            }

            @Override // android.support.customtabs.b
            public Bundle extraCommand(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeString(str);
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0282b.d(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean isEngagementSignalsApiAvailable(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean mayLaunchUrl(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    C0282b.f(obtain, uri, 0);
                    C0282b.f(obtain, bundle, 0);
                    C0282b.e(obtain, list, 0);
                    this.f14226a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean newSession(android.support.customtabs.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    this.f14226a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean newSessionWithExtras(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public int postMessage(android.support.customtabs.a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean receiveFile(android.support.customtabs.a aVar, Uri uri, int i8, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    C0282b.f(obtain, uri, 0);
                    obtain.writeInt(i8);
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean requestPostMessageChannel(android.support.customtabs.a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    C0282b.f(obtain, uri, 0);
                    this.f14226a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean requestPostMessageChannelWithExtras(android.support.customtabs.a aVar, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    C0282b.f(obtain, uri, 0);
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean setEngagementSignalsCallback(android.support.customtabs.a aVar, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeStrongBinder(iBinder);
                    boolean z8 = false;
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean updateVisuals(android.support.customtabs.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    boolean z8 = false;
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean validateRelationship(android.support.customtabs.a aVar, int i8, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeInt(i8);
                    boolean z8 = false;
                    C0282b.f(obtain, uri, 0);
                    C0282b.f(obtain, bundle, 0);
                    this.f14226a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean warmup(long j8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14225d);
                    obtain.writeLong(j8);
                    boolean z8 = false;
                    this.f14226a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z8 = true;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.f14225d);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f14225d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0281a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            String str = b.f14225d;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i8) {
                case 2:
                    boolean warmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(warmup ? 1 : 0);
                    return true;
                case 3:
                    boolean newSession = newSession(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSession ? 1 : 0);
                    return true;
                case 4:
                    android.support.customtabs.a asInterface = a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) C0282b.d(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean mayLaunchUrl = mayLaunchUrl(asInterface, uri, (Bundle) C0282b.d(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(mayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0282b.f(parcel2, extraCommand, 1);
                    return true;
                case 6:
                    boolean updateVisuals = updateVisuals(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(updateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean requestPostMessageChannel = requestPostMessageChannel(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), (Uri) C0282b.d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int postMessage = postMessage(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(postMessage);
                    return true;
                case 9:
                    boolean validateRelationship = validateRelationship(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) C0282b.d(parcel, Uri.CREATOR), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(validateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean newSessionWithExtras = newSessionWithExtras(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean requestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), (Uri) C0282b.d(parcel, Uri.CREATOR), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean receiveFile = receiveFile(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), (Uri) C0282b.d(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(receiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean isEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(isEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(a.AbstractBinderC0279a.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) C0282b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
            }
        }
    }

    /* renamed from: android.support.customtabs.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0282b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(Parcel parcel, List list, int i8) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i9 = 0; i9 < size; i9++) {
                f(parcel, (Parcelable) list.get(i9), i8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(Parcel parcel, Parcelable parcelable, int i8) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i8);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    Bundle extraCommand(String str, Bundle bundle);

    boolean isEngagementSignalsApiAvailable(android.support.customtabs.a aVar, Bundle bundle);

    boolean mayLaunchUrl(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List list);

    boolean newSession(android.support.customtabs.a aVar);

    boolean newSessionWithExtras(android.support.customtabs.a aVar, Bundle bundle);

    int postMessage(android.support.customtabs.a aVar, String str, Bundle bundle);

    boolean receiveFile(android.support.customtabs.a aVar, Uri uri, int i8, Bundle bundle);

    boolean requestPostMessageChannel(android.support.customtabs.a aVar, Uri uri);

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.a aVar, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(android.support.customtabs.a aVar, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(android.support.customtabs.a aVar, Bundle bundle);

    boolean validateRelationship(android.support.customtabs.a aVar, int i8, Uri uri, Bundle bundle);

    boolean warmup(long j8);
}
