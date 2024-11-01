package N;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        boolean z8 = false;
        String str = null;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            R.b.x(parcel, r8);
                        } else {
                            i9 = R.b.t(parcel, r8);
                        }
                    } else {
                        i8 = R.b.t(parcel, r8);
                    }
                } else {
                    str = R.b.f(parcel, r8);
                }
            } else {
                z8 = R.b.m(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new G(z8, str, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new G[i8];
    }
}
