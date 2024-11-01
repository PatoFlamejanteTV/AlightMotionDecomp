package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3941c implements Parcelable.Creator {
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
        int i8 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    str = R.b.f(parcel, r8);
                    break;
                case 2:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 3:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 4:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 5:
                    str3 = R.b.f(parcel, r8);
                    break;
                case 6:
                    str4 = R.b.f(parcel, r8);
                    break;
                case 7:
                    str5 = R.b.f(parcel, r8);
                    break;
                case 8:
                    str6 = R.b.f(parcel, r8);
                    break;
                case 9:
                    str7 = R.b.f(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C3940b(str, i8, z8, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3940b[i8];
    }
}
