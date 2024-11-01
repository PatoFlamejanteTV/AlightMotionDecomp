package c0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2004a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f15178a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15179b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2004a(IBinder iBinder, String str) {
        this.f15178a = iBinder;
        this.f15179b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15178a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15179b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15178a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
