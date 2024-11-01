package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class b6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        Long l8 = null;
        Float f8 = null;
        String str2 = null;
        String str3 = null;
        Double d8 = null;
        long j8 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    i8 = R.b.t(parcel, r8);
                    break;
                case 2:
                    str = R.b.f(parcel, r8);
                    break;
                case 3:
                    j8 = R.b.u(parcel, r8);
                    break;
                case 4:
                    l8 = R.b.v(parcel, r8);
                    break;
                case 5:
                    f8 = R.b.q(parcel, r8);
                    break;
                case 6:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 7:
                    str3 = R.b.f(parcel, r8);
                    break;
                case 8:
                    d8 = R.b.p(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new Y5(i8, str, j8, l8, f8, str2, str3, d8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Y5[i8];
    }
}
