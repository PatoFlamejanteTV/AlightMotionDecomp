package K;

import Q.AbstractC1396p;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f4525c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static c f4526d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f4527a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f4528b;

    c(Context context) {
        this.f4528b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        AbstractC1396p.l(context);
        Lock lock = f4525c;
        lock.lock();
        try {
            if (f4526d == null) {
                f4526d = new c(context.getApplicationContext());
            }
            c cVar = f4526d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f4525c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f4527a.lock();
        try {
            this.f4528b.edit().clear().apply();
        } finally {
            this.f4527a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g8;
        String g9 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g9) || (g8 = g(i("googleSignInAccount", g9))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.X(g8);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g8;
        String g9 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g9) || (g8 = g(i("googleSignInOptions", g9))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.W(g8);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC1396p.l(googleSignInAccount);
        AbstractC1396p.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.Y());
        AbstractC1396p.l(googleSignInAccount);
        AbstractC1396p.l(googleSignInOptions);
        String Y8 = googleSignInAccount.Y();
        h(i("googleSignInAccount", Y8), googleSignInAccount.Z());
        h(i("googleSignInOptions", Y8), googleSignInOptions.a0());
    }

    protected final String g(String str) {
        this.f4527a.lock();
        try {
            return this.f4528b.getString(str, null);
        } finally {
            this.f4527a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f4527a.lock();
        try {
            this.f4528b.edit().putString(str, str2).apply();
        } finally {
            this.f4527a.unlock();
        }
    }
}
