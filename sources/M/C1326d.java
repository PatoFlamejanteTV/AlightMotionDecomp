package M;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: M.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1326d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            if (R.b.l(r8) != 1) {
                R.b.x(parcel, r8);
            } else {
                intent = (Intent) R.b.e(parcel, r8, Intent.CREATOR);
            }
        }
        R.b.k(parcel, y8);
        return new C1323a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1323a[i8];
    }
}
