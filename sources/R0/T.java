package r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 2:
                    arrayList = R.b.d(parcel, r8);
                    break;
                case 3:
                default:
                    R.b.x(parcel, r8);
                    break;
                case 4:
                    str = R.b.f(parcel, r8);
                    break;
                case 5:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 6:
                    arrayList2 = R.b.d(parcel, r8);
                    break;
                case 7:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 8:
                    str3 = R.b.f(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C3867e(arrayList, str, str2, arrayList2, z8, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3867e[i8];
    }
}
