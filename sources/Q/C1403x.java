package Q;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Q.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1403x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        ArrayList arrayList = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    R.b.x(parcel, r8);
                } else {
                    arrayList = R.b.j(parcel, r8, C1393m.CREATOR);
                }
            } else {
                i8 = R.b.t(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C1399t(i8, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1399t[i8];
    }
}
