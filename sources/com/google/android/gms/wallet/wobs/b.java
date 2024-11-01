package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import u0.e;
import u0.f;
import u0.g;
import u0.h;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        ArrayList c8 = V.b.c();
        ArrayList c9 = V.b.c();
        ArrayList c10 = V.b.c();
        ArrayList arrayList = c8;
        ArrayList arrayList2 = c9;
        ArrayList arrayList3 = c10;
        ArrayList c11 = V.b.c();
        ArrayList c12 = V.b.c();
        ArrayList c13 = V.b.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        f fVar = null;
        String str9 = null;
        String str10 = null;
        int i8 = 0;
        boolean z8 = false;
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
                    str3 = R.b.f(parcel, r8);
                    break;
                case 5:
                    str4 = R.b.f(parcel, r8);
                    break;
                case 6:
                    str5 = R.b.f(parcel, r8);
                    break;
                case 7:
                    str6 = R.b.f(parcel, r8);
                    break;
                case 8:
                    str7 = R.b.f(parcel, r8);
                    break;
                case 9:
                    str8 = R.b.f(parcel, r8);
                    break;
                case 10:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 11:
                    arrayList = R.b.j(parcel, r8, h.CREATOR);
                    break;
                case 12:
                    fVar = (f) R.b.e(parcel, r8, f.CREATOR);
                    break;
                case 13:
                    arrayList2 = R.b.j(parcel, r8, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = R.b.f(parcel, r8);
                    break;
                case 15:
                    str10 = R.b.f(parcel, r8);
                    break;
                case 16:
                    arrayList3 = R.b.j(parcel, r8, u0.b.CREATOR);
                    break;
                case 17:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 18:
                    c11 = R.b.j(parcel, r8, g.CREATOR);
                    break;
                case 19:
                    c12 = R.b.j(parcel, r8, e.CREATOR);
                    break;
                case 20:
                    c13 = R.b.j(parcel, r8, g.CREATOR);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new CommonWalletObject(str, str2, str3, str4, str5, str6, str7, str8, i8, arrayList, fVar, arrayList2, str9, str10, arrayList3, z8, c11, c12, c13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new CommonWalletObject[i8];
    }
}
