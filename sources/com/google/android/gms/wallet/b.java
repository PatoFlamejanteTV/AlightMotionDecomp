package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3866d;
import r0.C3868f;
import r0.C3869g;
import r0.C3884w;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        C3884w c3884w = null;
        C3884w c3884w2 = null;
        C3868f[] c3868fArr = null;
        C3869g[] c3869gArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        C3866d[] c3866dArr = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 2:
                    str = R.b.f(parcel, r8);
                    break;
                case 3:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 4:
                    strArr = R.b.g(parcel, r8);
                    break;
                case 5:
                    str3 = R.b.f(parcel, r8);
                    break;
                case 6:
                    c3884w = (C3884w) R.b.e(parcel, r8, C3884w.CREATOR);
                    break;
                case 7:
                    c3884w2 = (C3884w) R.b.e(parcel, r8, C3884w.CREATOR);
                    break;
                case 8:
                    c3868fArr = (C3868f[]) R.b.i(parcel, r8, C3868f.CREATOR);
                    break;
                case 9:
                    c3869gArr = (C3869g[]) R.b.i(parcel, r8, C3869g.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 12:
                    c3866dArr = (C3866d[]) R.b.i(parcel, r8, C3866d.CREATOR);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new MaskedWallet(str, str2, strArr, str3, c3884w, c3884w2, c3868fArr, c3869gArr, userAddress, userAddress2, c3866dArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new MaskedWallet[i8];
    }
}
