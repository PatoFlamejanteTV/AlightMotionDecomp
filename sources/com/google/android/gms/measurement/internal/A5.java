package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class A5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        long j8 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        R.b.x(parcel, r8);
                    } else {
                        i8 = R.b.t(parcel, r8);
                    }
                } else {
                    j8 = R.b.u(parcel, r8);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new B5(str, j8, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new B5[i8];
    }
}
