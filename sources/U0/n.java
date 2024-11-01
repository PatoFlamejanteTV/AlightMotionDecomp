package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        d dVar = null;
        f fVar = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 5) {
                        R.b.x(parcel, r8);
                    } else {
                        fVar = (f) R.b.e(parcel, r8, f.CREATOR);
                    }
                } else {
                    dVar = (d) R.b.e(parcel, r8, d.CREATOR);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new c(str, dVar, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new c[i8];
    }
}
