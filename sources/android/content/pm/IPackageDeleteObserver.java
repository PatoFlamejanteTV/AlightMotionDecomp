package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IPackageDeleteObserver extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageDeleteObserver {
        public Stub() {
            throw new RuntimeException("Stub!");
        }

        public static IPackageDeleteObserver asInterface(IBinder iBinder) {
            throw new RuntimeException("Stub!");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            throw new RuntimeException("Stub!");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
    }

    void packageDeleted(String str, int i8) throws RemoteException;
}
