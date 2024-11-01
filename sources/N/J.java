package N;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        boolean z8 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z9 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            R.b.x(parcel, r8);
                        } else {
                            z9 = R.b.m(parcel, r8);
                        }
                    } else {
                        z8 = R.b.m(parcel, r8);
                    }
                } else {
                    iBinder = R.b.s(parcel, r8);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new I(str, iBinder, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new I[i8];
    }
}
