package N;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    str = R.b.f(parcel, r8);
                    break;
                case 2:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 3:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 4:
                    iBinder = R.b.s(parcel, r8);
                    break;
                case 5:
                    z10 = R.b.m(parcel, r8);
                    break;
                case 6:
                    z11 = R.b.m(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new E(str, z8, z9, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new E[i8];
    }
}
