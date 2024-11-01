package Q;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import f0.AbstractBinderC2837b;

/* renamed from: Q.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1390j extends IInterface {

    /* renamed from: Q.j$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends AbstractBinderC2837b implements InterfaceC1390j {
        public static InterfaceC1390j i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof InterfaceC1390j) {
                return (InterfaceC1390j) queryLocalInterface;
            }
            return new t0(iBinder);
        }
    }

    Account x();
}
