package Q;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z8 = false;
        boolean z9 = false;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    rVar = (r) R.b.e(parcel, r8, r.CREATOR);
                    break;
                case 2:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 3:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 4:
                    iArr = R.b.c(parcel, r8);
                    break;
                case 5:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 6:
                    iArr2 = R.b.c(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C1385e(rVar, z8, z9, iArr, i8, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1385e[i8];
    }
}
