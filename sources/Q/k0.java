package Q;

import N.C1341d;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C1386f c1386f, Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, c1386f.f8240a);
        R.c.k(parcel, 2, c1386f.f8241b);
        R.c.k(parcel, 3, c1386f.f8242c);
        R.c.q(parcel, 4, c1386f.f8243d, false);
        R.c.j(parcel, 5, c1386f.f8244e, false);
        R.c.t(parcel, 6, c1386f.f8245f, i8, false);
        R.c.e(parcel, 7, c1386f.f8246g, false);
        R.c.p(parcel, 8, c1386f.f8247h, i8, false);
        R.c.t(parcel, 10, c1386f.f8248i, i8, false);
        R.c.t(parcel, 11, c1386f.f8249j, i8, false);
        R.c.c(parcel, 12, c1386f.f8250k);
        R.c.k(parcel, 13, c1386f.f8251l);
        R.c.c(parcel, 14, c1386f.f8252m);
        R.c.q(parcel, 15, c1386f.s(), false);
        R.c.b(parcel, a9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Scope[] scopeArr = C1386f.f8238o;
        Bundle bundle = new Bundle();
        C1341d[] c1341dArr = C1386f.f8239p;
        C1341d[] c1341dArr2 = c1341dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z8 = false;
        int i11 = 0;
        boolean z9 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 2:
                    i9 = R.b.t(parcel, r8);
                    break;
                case 3:
                    i10 = R.b.t(parcel, r8);
                    break;
                case 4:
                    str = R.b.f(parcel, r8);
                    break;
                case 5:
                    iBinder = R.b.s(parcel, r8);
                    break;
                case 6:
                    scopeArr = (Scope[]) R.b.i(parcel, r8, Scope.CREATOR);
                    break;
                case 7:
                    bundle = R.b.a(parcel, r8);
                    break;
                case 8:
                    account = (Account) R.b.e(parcel, r8, Account.CREATOR);
                    break;
                case 9:
                default:
                    R.b.x(parcel, r8);
                    break;
                case 10:
                    c1341dArr = (C1341d[]) R.b.i(parcel, r8, C1341d.CREATOR);
                    break;
                case 11:
                    c1341dArr2 = (C1341d[]) R.b.i(parcel, r8, C1341d.CREATOR);
                    break;
                case 12:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 13:
                    i11 = R.b.t(parcel, r8);
                    break;
                case 14:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 15:
                    str2 = R.b.f(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C1386f(i8, i9, i10, str, iBinder, scopeArr, bundle, account, c1341dArr, c1341dArr2, z8, i11, z9, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1386f[i8];
    }
}
