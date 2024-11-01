package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        boolean z8 = true;
        boolean z9 = false;
        int i8 = 0;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = false;
        int i9 = 100;
        int i10 = 0;
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
                    j8 = R.b.u(parcel, r8);
                    break;
                case 7:
                    j9 = R.b.u(parcel, r8);
                    break;
                case 8:
                    str5 = R.b.f(parcel, r8);
                    break;
                case 9:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 10:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 11:
                    j15 = R.b.u(parcel, r8);
                    break;
                case 12:
                    str6 = R.b.f(parcel, r8);
                    break;
                case 13:
                    j10 = R.b.u(parcel, r8);
                    break;
                case 14:
                    j11 = R.b.u(parcel, r8);
                    break;
                case 15:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 16:
                    z10 = R.b.m(parcel, r8);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    R.b.x(parcel, r8);
                    break;
                case 18:
                    z11 = R.b.m(parcel, r8);
                    break;
                case 19:
                    str7 = R.b.f(parcel, r8);
                    break;
                case 21:
                    bool = R.b.n(parcel, r8);
                    break;
                case 22:
                    j12 = R.b.u(parcel, r8);
                    break;
                case 23:
                    arrayList = R.b.h(parcel, r8);
                    break;
                case 24:
                    str8 = R.b.f(parcel, r8);
                    break;
                case 25:
                    str11 = R.b.f(parcel, r8);
                    break;
                case 26:
                    str12 = R.b.f(parcel, r8);
                    break;
                case 27:
                    str9 = R.b.f(parcel, r8);
                    break;
                case 28:
                    z12 = R.b.m(parcel, r8);
                    break;
                case 29:
                    j13 = R.b.u(parcel, r8);
                    break;
                case 30:
                    i9 = R.b.t(parcel, r8);
                    break;
                case 31:
                    str13 = R.b.f(parcel, r8);
                    break;
                case 32:
                    i10 = R.b.t(parcel, r8);
                    break;
                case 34:
                    j14 = R.b.u(parcel, r8);
                    break;
                case 35:
                    str10 = R.b.f(parcel, r8);
                    break;
                case 36:
                    str14 = R.b.f(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new M5(str, str2, str3, str4, j8, j9, str5, z8, z9, j15, str6, j10, j11, i8, z10, z11, str7, bool, j12, arrayList, str8, str11, str12, str9, z12, j13, i9, str13, i10, j14, str10, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new M5[i8];
    }
}
