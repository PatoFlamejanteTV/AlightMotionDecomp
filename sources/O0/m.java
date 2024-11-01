package o0;

import N.C1339b;
import Q.O;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        C1339b c1339b = null;
        O o8 = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        R.b.x(parcel, r8);
                    } else {
                        o8 = (O) R.b.e(parcel, r8, O.CREATOR);
                    }
                } else {
                    c1339b = (C1339b) R.b.e(parcel, r8, C1339b.CREATOR);
                }
            } else {
                i8 = R.b.t(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new l(i8, c1339b, o8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new l[i8];
    }
}
