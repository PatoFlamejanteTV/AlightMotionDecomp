package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 2:
                    arrayList = R.b.j(parcel, r8, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) R.b.e(parcel, r8, Account.CREATOR);
                    break;
                case 4:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 5:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 6:
                    z10 = R.b.m(parcel, r8);
                    break;
                case 7:
                    str = R.b.f(parcel, r8);
                    break;
                case 8:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 9:
                    arrayList2 = R.b.j(parcel, r8, K.a.CREATOR);
                    break;
                case 10:
                    str3 = R.b.f(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new GoogleSignInOptions(i8, arrayList, account, z8, z9, z10, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new GoogleSignInOptions[i8];
    }
}
