package Q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import f0.AbstractBinderC2837b;
import f0.AbstractC2838c;

/* loaded from: classes3.dex */
public abstract class T extends AbstractBinderC2837b implements InterfaceC1391k {
    public T() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // f0.AbstractBinderC2837b
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                h0 h0Var = (h0) AbstractC2838c.a(parcel, h0.CREATOR);
                AbstractC2838c.b(parcel);
                N(readInt, readStrongBinder, h0Var);
            } else {
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC2838c.a(parcel, Bundle.CREATOR);
                AbstractC2838c.b(parcel);
                F(readInt2, bundle);
            }
        } else {
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) AbstractC2838c.a(parcel, Bundle.CREATOR);
            AbstractC2838c.b(parcel);
            U(readInt3, readStrongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
