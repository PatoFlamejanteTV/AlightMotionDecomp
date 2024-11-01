package o0;

import N.AbstractC1349l;
import N.C1339b;
import O.f;
import Q.AbstractC1383c;
import Q.AbstractC1387g;
import Q.AbstractC1396p;
import Q.C1384d;
import Q.M;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import n0.InterfaceC3386e;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3508a extends AbstractC1387g implements InterfaceC3386e {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f35823M = 0;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f35824I;

    /* renamed from: J, reason: collision with root package name */
    private final C1384d f35825J;

    /* renamed from: K, reason: collision with root package name */
    private final Bundle f35826K;

    /* renamed from: L, reason: collision with root package name */
    private final Integer f35827L;

    public C3508a(Context context, Looper looper, boolean z8, C1384d c1384d, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, c1384d, aVar, bVar);
        this.f35824I = true;
        this.f35825J = c1384d;
        this.f35826K = bundle;
        this.f35827L = c1384d.i();
    }

    public static Bundle m0(C1384d c1384d) {
        c1384d.h();
        Integer i8 = c1384d.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1384d.a());
        if (i8 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i8.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // Q.AbstractC1383c
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.f35825J.f())) {
            this.f35826K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f35825J.f());
        }
        return this.f35826K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // Q.AbstractC1383c
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // n0.InterfaceC3386e
    public final void a(f fVar) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC1396p.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c8 = this.f35825J.c();
            if ("<<default account>>".equals(c8.name)) {
                googleSignInAccount = K.c.b(y()).c();
            } else {
                googleSignInAccount = null;
            }
            ((g) D()).s0(new j(1, new M(c8, ((Integer) AbstractC1396p.l(this.f35827L)).intValue(), googleSignInAccount)), fVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.g0(new l(1, new C1339b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final int k() {
        return AbstractC1349l.f6370a;
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final boolean o() {
        return this.f35824I;
    }

    @Override // n0.InterfaceC3386e
    public final void p() {
        j(new AbstractC1383c.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new g(iBinder);
    }
}
