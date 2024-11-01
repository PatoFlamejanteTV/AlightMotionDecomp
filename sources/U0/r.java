package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        String str2 = null;
        f fVar = null;
        g gVar = null;
        g gVar2 = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 4) {
                        if (l8 != 5) {
                            if (l8 != 6) {
                                R.b.x(parcel, r8);
                            } else {
                                gVar2 = (g) R.b.e(parcel, r8, g.CREATOR);
                            }
                        } else {
                            gVar = (g) R.b.e(parcel, r8, g.CREATOR);
                        }
                    } else {
                        fVar = (f) R.b.e(parcel, r8, f.CREATOR);
                    }
                } else {
                    str2 = R.b.f(parcel, r8);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new h(str, str2, fVar, gVar, gVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}
