package Q;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes3.dex */
public final class M extends R.a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    final int f8160a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f8161b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8162c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f8163d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(int i8, Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this.f8160a = i8;
        this.f8161b = account;
        this.f8162c = i9;
        this.f8163d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f8160a;
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.p(parcel, 2, this.f8161b, i8, false);
        R.c.k(parcel, 3, this.f8162c);
        R.c.p(parcel, 4, this.f8163d, i8, false);
        R.c.b(parcel, a9);
    }

    public M(Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i8, googleSignInAccount);
    }
}
