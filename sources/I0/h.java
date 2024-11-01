package i0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            if (R.b.l(r8) != 2) {
                R.b.x(parcel, r8);
            } else {
                bArr = R.b.b(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new g(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new g[i8];
    }
}
