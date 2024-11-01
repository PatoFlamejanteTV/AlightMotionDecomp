package s0;

import Y.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wallet.button.ButtonOptions;
import i0.AbstractC2962a;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3942d extends AbstractC2962a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3942d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final Y.a s0(Y.a aVar, ButtonOptions buttonOptions) {
        Parcel h8 = h();
        i0.d.d(h8, aVar);
        i0.d.c(h8, buttonOptions);
        Parcel i8 = i(1, h8);
        Y.a i9 = a.AbstractBinderC0258a.i(i8.readStrongBinder());
        i8.recycle();
        return i9;
    }
}
