package Q;

import N.C1341d;
import Q.InterfaceC1390j;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* renamed from: Q.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1386f extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1386f> CREATOR = new k0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f8238o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C1341d[] f8239p = new C1341d[0];

    /* renamed from: a, reason: collision with root package name */
    final int f8240a;

    /* renamed from: b, reason: collision with root package name */
    final int f8241b;

    /* renamed from: c, reason: collision with root package name */
    final int f8242c;

    /* renamed from: d, reason: collision with root package name */
    String f8243d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f8244e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f8245f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f8246g;

    /* renamed from: h, reason: collision with root package name */
    Account f8247h;

    /* renamed from: i, reason: collision with root package name */
    C1341d[] f8248i;

    /* renamed from: j, reason: collision with root package name */
    C1341d[] f8249j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f8250k;

    /* renamed from: l, reason: collision with root package name */
    final int f8251l;

    /* renamed from: m, reason: collision with root package name */
    boolean f8252m;

    /* renamed from: n, reason: collision with root package name */
    private final String f8253n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1386f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1341d[] c1341dArr, C1341d[] c1341dArr2, boolean z8, int i11, boolean z9, String str2) {
        scopeArr = scopeArr == null ? f8238o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1341dArr = c1341dArr == null ? f8239p : c1341dArr;
        c1341dArr2 = c1341dArr2 == null ? f8239p : c1341dArr2;
        this.f8240a = i8;
        this.f8241b = i9;
        this.f8242c = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f8243d = "com.google.android.gms";
        } else {
            this.f8243d = str;
        }
        if (i8 < 2) {
            this.f8247h = iBinder != null ? AbstractBinderC1381a.k(InterfaceC1390j.a.i(iBinder)) : null;
        } else {
            this.f8244e = iBinder;
            this.f8247h = account;
        }
        this.f8245f = scopeArr;
        this.f8246g = bundle;
        this.f8248i = c1341dArr;
        this.f8249j = c1341dArr2;
        this.f8250k = z8;
        this.f8251l = i11;
        this.f8252m = z9;
        this.f8253n = str2;
    }

    public final String s() {
        return this.f8253n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        k0.a(this, parcel, i8);
    }
}
