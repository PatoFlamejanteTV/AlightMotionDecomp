package j0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3145a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = b.y(parcel);
        double d8 = 0.0d;
        double d9 = 0.0d;
        while (parcel.dataPosition() < y8) {
            int r8 = b.r(parcel);
            int l8 = b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    b.x(parcel, r8);
                } else {
                    d9 = b.o(parcel, r8);
                }
            } else {
                d8 = b.o(parcel, r8);
            }
        }
        b.k(parcel, y8);
        return new LatLng(d8, d9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new LatLng[i8];
    }
}
