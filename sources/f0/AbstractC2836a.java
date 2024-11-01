package f0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2836a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f31813a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31814b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2836a(IBinder iBinder, String str) {
        this.f31813a = iBinder;
        this.f31814b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31813a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel h(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f31813a.transact(i8, parcel, obtain, 0);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31814b);
        return obtain;
    }
}
