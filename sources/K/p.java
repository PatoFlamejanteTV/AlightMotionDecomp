package K;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    private static p f4538d;

    /* renamed from: a, reason: collision with root package name */
    final c f4539a;

    /* renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f4540b;

    /* renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f4541c;

    private p(Context context) {
        c b9 = c.b(context);
        this.f4539a = b9;
        this.f4540b = b9.c();
        this.f4541c = b9.d();
    }

    public static synchronized p a(Context context) {
        p d8;
        synchronized (p.class) {
            d8 = d(context.getApplicationContext());
        }
        return d8;
    }

    private static synchronized p d(Context context) {
        synchronized (p.class) {
            p pVar = f4538d;
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p(context);
            f4538d = pVar2;
            return pVar2;
        }
    }

    public final synchronized void b() {
        this.f4539a.a();
        this.f4540b = null;
        this.f4541c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f4539a.f(googleSignInAccount, googleSignInOptions);
        this.f4540b = googleSignInAccount;
        this.f4541c = googleSignInOptions;
    }
}
