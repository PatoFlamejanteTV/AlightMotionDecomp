package com.google.android.gms.identity.intents.model;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = b.r(parcel);
            switch (b.l(r8)) {
                case 2:
                    str = b.f(parcel, r8);
                    break;
                case 3:
                    str2 = b.f(parcel, r8);
                    break;
                case 4:
                    str3 = b.f(parcel, r8);
                    break;
                case 5:
                    str4 = b.f(parcel, r8);
                    break;
                case 6:
                    str5 = b.f(parcel, r8);
                    break;
                case 7:
                    str6 = b.f(parcel, r8);
                    break;
                case 8:
                    str7 = b.f(parcel, r8);
                    break;
                case 9:
                    str8 = b.f(parcel, r8);
                    break;
                case 10:
                    str9 = b.f(parcel, r8);
                    break;
                case 11:
                    str10 = b.f(parcel, r8);
                    break;
                case 12:
                    str11 = b.f(parcel, r8);
                    break;
                case 13:
                    str12 = b.f(parcel, r8);
                    break;
                case 14:
                    z8 = b.m(parcel, r8);
                    break;
                case 15:
                    str13 = b.f(parcel, r8);
                    break;
                case 16:
                    str14 = b.f(parcel, r8);
                    break;
                default:
                    b.x(parcel, r8);
                    break;
            }
        }
        b.k(parcel, y8);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z8, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new UserAddress[i8];
    }
}
