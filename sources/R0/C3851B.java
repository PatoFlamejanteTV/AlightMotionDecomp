package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3851B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Bundle bundle = null;
        int i8 = 0;
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
                i8 = R.b.t(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C3874l(i8, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3874l[i8];
    }
}
