package K;

import android.os.Parcel;
import c0.AbstractBinderC2006c;
import c0.AbstractC2007d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class s extends AbstractBinderC2006c implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // c0.AbstractBinderC2006c
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) AbstractC2007d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) AbstractC2007d.a(parcel, Status.CREATOR);
                AbstractC2007d.b(parcel);
                T(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) AbstractC2007d.a(parcel, Status.CREATOR);
                AbstractC2007d.b(parcel);
                Y(status2);
                break;
            case 103:
                Status status3 = (Status) AbstractC2007d.a(parcel, Status.CREATOR);
                AbstractC2007d.b(parcel);
                S(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
