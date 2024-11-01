package Y;

import android.os.IBinder;
import android.os.IInterface;
import f0.AbstractBinderC2837b;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: Y.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0258a extends AbstractBinderC2837b implements a {
        public AbstractBinderC0258a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new c(iBinder);
        }
    }
}
