package Q;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f0.AbstractBinderC2837b;
import f0.AbstractC2838c;

/* loaded from: classes3.dex */
public abstract class v0 extends AbstractBinderC2837b implements S {
    public v0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static S i(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof S) {
            return (S) queryLocalInterface;
        }
        return new u0(iBinder);
    }

    @Override // f0.AbstractBinderC2837b
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            int b9 = b();
            parcel2.writeNoException();
            parcel2.writeInt(b9);
        } else {
            Y.a y8 = y();
            parcel2.writeNoException();
            AbstractC2838c.d(parcel2, y8);
        }
        return true;
    }
}
