package K;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2085c;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final T.a f4537a = new T.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f4537a.a("getFallbackSignInIntent()", new Object[0]);
        Intent c8 = c(context, googleSignInOptions);
        c8.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return c8;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f4537a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent c8 = c(context, googleSignInOptions);
        c8.setAction("com.google.android.gms.auth.NO_IMPL");
        return c8;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f4537a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static J.b d(Intent intent) {
        if (intent == null) {
            return new J.b(null, Status.f16062h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount == null) {
            if (status == null) {
                status = Status.f16062h;
            }
            return new J.b(null, status);
        }
        return new J.b(googleSignInAccount, Status.f16060f);
    }

    public static O.g e(O.f fVar, Context context, boolean z8) {
        f4537a.a("Revoking access", new Object[0]);
        String e8 = c.b(context).e();
        g(context);
        if (z8) {
            return f.a(e8);
        }
        return fVar.a(new m(fVar));
    }

    public static O.g f(O.f fVar, Context context, boolean z8) {
        f4537a.a("Signing out", new Object[0]);
        g(context);
        if (z8) {
            return O.h.b(Status.f16060f, fVar);
        }
        return fVar.a(new k(fVar));
    }

    private static void g(Context context) {
        p.a(context).b();
        Iterator it = O.f.b().iterator();
        while (it.hasNext()) {
            ((O.f) it.next()).e();
        }
        C2085c.a();
    }
}
