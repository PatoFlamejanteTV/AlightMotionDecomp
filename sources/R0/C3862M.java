package r0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3862M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
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
                    z8 = R.b.m(parcel, r8);
                    break;
                case 12:
                    str10 = R.b.f(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C3884w(str, str2, str3, str4, str5, str6, str7, str8, str9, z8, str10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3884w[i8];
    }
}
