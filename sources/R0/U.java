package r0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class U implements Parcelable.Creator {
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
        String str9 = null;
        String str10 = null;
        u0.f fVar = null;
        String str11 = null;
        String str12 = null;
        u0.c cVar = null;
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
                    str9 = R.b.f(parcel, r8);
                    break;
                case 11:
                    str10 = R.b.f(parcel, r8);
                    break;
                case 12:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 13:
                    arrayList = R.b.j(parcel, r8, u0.h.CREATOR);
                    break;
                case 14:
                    fVar = (u0.f) R.b.e(parcel, r8, u0.f.CREATOR);
                    break;
                case 15:
                    arrayList2 = R.b.j(parcel, r8, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = R.b.f(parcel, r8);
                    break;
                case 17:
                    str12 = R.b.f(parcel, r8);
                    break;
                case 18:
                    arrayList3 = R.b.j(parcel, r8, u0.b.CREATOR);
                    break;
                case 19:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 20:
                    c11 = R.b.j(parcel, r8, u0.g.CREATOR);
                    break;
                case 21:
                    c12 = R.b.j(parcel, r8, u0.e.CREATOR);
                    break;
                case 22:
                    c13 = R.b.j(parcel, r8, u0.g.CREATOR);
                    break;
                case 23:
                    cVar = (u0.c) R.b.e(parcel, r8, u0.c.CREATOR);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C3868f(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i8, arrayList, fVar, arrayList2, str11, str12, arrayList3, z8, c11, c12, c13, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3868f[i8];
    }
}
