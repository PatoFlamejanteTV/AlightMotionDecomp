package u0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        long j8 = 0;
        String str = null;
        String str2 = null;
        double d8 = 0.0d;
        int i8 = 0;
        int i9 = -1;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 2:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 3:
                    str = R.b.f(parcel, r8);
                    break;
                case 4:
                    d8 = R.b.o(parcel, r8);
                    break;
                case 5:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 6:
                    j8 = R.b.u(parcel, r8);
                    break;
                case 7:
                    i9 = R.b.t(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new d(i8, str, d8, str2, j8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new d[i8];
    }
}
