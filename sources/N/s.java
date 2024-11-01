package N;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        long j8 = -1;
        int i8 = 0;
        String str = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        R.b.x(parcel, r8);
                    } else {
                        j8 = R.b.u(parcel, r8);
                    }
                } else {
                    i8 = R.b.t(parcel, r8);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C1341d(str, i8, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1341d[i8];
    }
}
