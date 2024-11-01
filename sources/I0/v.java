package i0;

import N.C1341d;
import O.f;
import Q.AbstractC1387g;
import Q.C1384d;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import q0.C3626l;
import r0.C3867e;
import r0.C3872j;
import r0.P;

/* loaded from: classes3.dex */
public final class v extends AbstractC1387g {

    /* renamed from: I, reason: collision with root package name */
    private final Context f32671I;

    /* renamed from: J, reason: collision with root package name */
    private final int f32672J;

    /* renamed from: K, reason: collision with root package name */
    private final String f32673K;

    /* renamed from: L, reason: collision with root package name */
    private final int f32674L;

    /* renamed from: M, reason: collision with root package name */
    private final boolean f32675M;

    public v(Context context, Looper looper, C1384d c1384d, f.a aVar, f.b bVar, int i8, int i9, boolean z8) {
        super(context, looper, 4, c1384d, aVar, bVar);
        String str;
        this.f32671I = context;
        this.f32672J = i8;
        Account a9 = c1384d.a();
        if (a9 != null) {
            str = a9.name;
        } else {
            str = null;
        }
        this.f32673K = str;
        this.f32674L = i9;
        this.f32675M = z8;
    }

    private final Bundle o0() {
        String packageName = this.f32671I.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f32672J);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f32675M);
        bundle.putString("androidPackageName", packageName);
        String str = this.f32673K;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f32674L);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final String E() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // Q.AbstractC1383c
    protected final String F() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // Q.AbstractC1383c
    public final boolean O() {
        return true;
    }

    @Override // Q.AbstractC1383c
    public final boolean S() {
        return true;
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final int k() {
        return 12600000;
    }

    public final void m0(C3867e c3867e, C3626l c3626l) {
        t tVar = new t(c3626l);
        try {
            ((o) D()).s0(c3867e, o0(), tVar);
        } catch (RemoteException e8) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e8);
            tVar.r(Status.f16062h, false, Bundle.EMPTY);
        }
    }

    public final void n0(C3872j c3872j, C3626l c3626l) {
        Bundle o02 = o0();
        o02.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        u uVar = new u(c3626l);
        try {
            ((o) D()).t0(c3872j, o02, uVar);
        } catch (RemoteException e8) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e8);
            uVar.l(Status.f16062h, null, Bundle.EMPTY);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof o) {
            return (o) queryLocalInterface;
        }
        return new o(iBinder);
    }

    @Override // Q.AbstractC1383c
    public final C1341d[] v() {
        return P.f37681i;
    }
}
