package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3854E;
import r0.C3866d;
import r0.C3873k;
import r0.C3884w;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        String str2 = null;
        C3854E c3854e = null;
        String str3 = null;
        C3884w c3884w = null;
        C3884w c3884w2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        C3866d[] c3866dArr = null;
        C3873k c3873k = null;
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
                    c3854e = (C3854E) R.b.e(parcel, r8, C3854E.CREATOR);
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
                    strArr = R.b.g(parcel, r8);
                    break;
                case 9:
                    userAddress = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 11:
                    c3866dArr = (C3866d[]) R.b.i(parcel, r8, C3866d.CREATOR);
                    break;
                case 12:
                    c3873k = (C3873k) R.b.e(parcel, r8, C3873k.CREATOR);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new FullWallet(str, str2, c3854e, str3, c3884w, c3884w2, strArr, userAddress, userAddress2, c3866dArr, c3873k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new FullWallet[i8];
    }
}
