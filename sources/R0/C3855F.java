package r0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3855F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        int i8 = 0;
        String str = null;
        String str2 = null;
        int i9 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 4) {
                        if (l8 != 5) {
                            R.b.x(parcel, r8);
                        } else {
                            i9 = R.b.t(parcel, r8);
                        }
                    } else {
                        i8 = R.b.t(parcel, r8);
                    }
                } else {
                    str2 = R.b.f(parcel, r8);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C3854E(str, str2, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3854E[i8];
    }
}
