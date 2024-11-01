package o0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    R.b.x(parcel, r8);
                } else {
                    str = R.b.f(parcel, r8);
                }
            } else {
                arrayList = R.b.h(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}
