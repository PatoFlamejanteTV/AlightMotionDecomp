package Q;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes3.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            R.b.x(parcel, r8);
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) R.b.e(parcel, r8, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        i9 = R.b.t(parcel, r8);
                    }
                } else {
                    account = (Account) R.b.e(parcel, r8, Account.CREATOR);
                }
            } else {
                i8 = R.b.t(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new M(i8, account, i9, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new M[i8];
    }
}
