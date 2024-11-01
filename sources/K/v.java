package K;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class v extends q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4542a;

    public v(Context context) {
        this.f4542a = context;
    }

    private final void i() {
        if (V.o.a(this.f4542a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // K.r
    public final void C() {
        i();
        c b9 = c.b(this.f4542a);
        GoogleSignInAccount c8 = b9.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f16013l;
        if (c8 != null) {
            googleSignInOptions = b9.d();
        }
        com.google.android.gms.auth.api.signin.b a9 = com.google.android.gms.auth.api.signin.a.a(this.f4542a, googleSignInOptions);
        if (c8 != null) {
            a9.t();
        } else {
            a9.u();
        }
    }

    @Override // K.r
    public final void q() {
        i();
        p.a(this.f4542a).b();
    }
}
