package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 4) {
                if (l8 != 7) {
                    if (l8 != 8) {
                        R.b.x(parcel, r8);
                    } else {
                        str2 = R.b.f(parcel, r8);
                    }
                } else {
                    googleSignInAccount = (GoogleSignInAccount) R.b.e(parcel, r8, GoogleSignInAccount.CREATOR);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new SignInAccount[i8];
    }
}
