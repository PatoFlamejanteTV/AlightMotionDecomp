package Q;

import Y.a;
import android.os.IBinder;
import android.os.Parcel;
import f0.AbstractC2836a;

/* loaded from: classes3.dex */
public final class u0 extends AbstractC2836a implements S {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // Q.S
    public final int b() {
        Parcel h8 = h(2, i());
        int readInt = h8.readInt();
        h8.recycle();
        return readInt;
    }

    @Override // Q.S
    public final Y.a y() {
        Parcel h8 = h(1, i());
        Y.a i8 = a.AbstractBinderC0258a.i(h8.readStrongBinder());
        h8.recycle();
        return i8;
    }
}
