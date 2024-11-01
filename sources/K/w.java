package K;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* loaded from: classes3.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 2) {
                if (l8 != 5) {
                    R.b.x(parcel, r8);
                } else {
                    googleSignInOptions = (GoogleSignInOptions) R.b.e(parcel, r8, GoogleSignInOptions.CREATOR);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new SignInConfiguration[i8];
    }
}
