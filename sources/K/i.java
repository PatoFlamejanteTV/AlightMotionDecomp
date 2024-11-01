package K;

import N.AbstractC1349l;
import O.f;
import Q.AbstractC1387g;
import Q.C1384d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c0.AbstractC2005b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i extends AbstractC1387g {

    /* renamed from: I, reason: collision with root package name */
    private final GoogleSignInOptions f4534I;

    public i(Context context, Looper looper, C1384d c1384d, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, c1384d, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.a();
        }
        aVar2.g(AbstractC2005b.a());
        if (!c1384d.d().isEmpty()) {
            Iterator it = c1384d.d().iterator();
            while (it.hasNext()) {
                aVar2.f((Scope) it.next(), new Scope[0]);
            }
        }
        this.f4534I = aVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // Q.AbstractC1383c
    protected final String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final int k() {
        return AbstractC1349l.f6370a;
    }

    public final GoogleSignInOptions m0() {
        return this.f4534I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof u) {
            return (u) queryLocalInterface;
        }
        return new u(iBinder);
    }
}
