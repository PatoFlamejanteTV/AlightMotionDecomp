package Q;

import N.C1339b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        IBinder iBinder = null;
        C1339b c1339b = null;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            if (l8 != 5) {
                                R.b.x(parcel, r8);
                            } else {
                                z9 = R.b.m(parcel, r8);
                            }
                        } else {
                            z8 = R.b.m(parcel, r8);
                        }
                    } else {
                        c1339b = (C1339b) R.b.e(parcel, r8, C1339b.CREATOR);
                    }
                } else {
                    iBinder = R.b.s(parcel, r8);
                }
            } else {
                i8 = R.b.t(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new O(i8, iBinder, c1339b, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new O[i8];
    }
}
