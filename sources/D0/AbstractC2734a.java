package d0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2734a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f31279a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31280b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2734a(IBinder iBinder, String str) {
        this.f31279a = iBinder;
        this.f31280b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31279a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31280b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f31279a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i8, Parcel parcel) {
        try {
            this.f31279a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
