package a0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1646e extends AbstractBinderC1643b implements InterfaceC1647f {
    public static InterfaceC1647f h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof InterfaceC1647f) {
            return (InterfaceC1647f) queryLocalInterface;
        }
        return new C1645d(iBinder);
    }
}
