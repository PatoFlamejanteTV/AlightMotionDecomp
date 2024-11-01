package K;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c0.AbstractC2004a;
import c0.AbstractC2007d;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class u extends AbstractC2004a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void k(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel h8 = h();
        AbstractC2007d.d(h8, tVar);
        AbstractC2007d.c(h8, googleSignInOptions);
        i(103, h8);
    }

    public final void s0(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel h8 = h();
        AbstractC2007d.d(h8, tVar);
        AbstractC2007d.c(h8, googleSignInOptions);
        i(102, h8);
    }
}
