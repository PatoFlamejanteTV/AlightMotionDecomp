package a0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1642a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f14036a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14037b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1642a(IBinder iBinder, String str) {
        this.f14036a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14036a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14037b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f14036a.transact(i8, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }
}
