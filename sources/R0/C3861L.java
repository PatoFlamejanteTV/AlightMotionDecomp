package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.L, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3861L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    R.b.x(parcel, r8);
                } else {
                    bundle = R.b.a(parcel, r8);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C3860K(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3860K[i8];
    }
}
