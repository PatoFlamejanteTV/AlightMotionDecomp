package Q;

import android.os.IBinder;
import android.os.IInterface;
import f0.AbstractBinderC2837b;

/* loaded from: classes3.dex */
public abstract class W extends AbstractBinderC2837b implements X {
    public static X i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof X) {
            return (X) queryLocalInterface;
        }
        return new V(iBinder);
    }
}
