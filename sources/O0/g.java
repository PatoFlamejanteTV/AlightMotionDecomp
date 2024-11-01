package o0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d0.AbstractC2734a;
import d0.AbstractC2736c;

/* loaded from: classes3.dex */
public final class g extends AbstractC2734a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void s0(j jVar, f fVar) {
        Parcel h8 = h();
        AbstractC2736c.c(h8, jVar);
        AbstractC2736c.d(h8, fVar);
        i(12, h8);
    }
}
