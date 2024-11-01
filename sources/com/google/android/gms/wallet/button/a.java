package com.google.android.gms.wallet.button;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = b.y(parcel);
        String str = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = b.r(parcel);
            int l8 = b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            b.x(parcel, r8);
                        } else {
                            str = b.f(parcel, r8);
                        }
                    } else {
                        i10 = b.t(parcel, r8);
                    }
                } else {
                    i9 = b.t(parcel, r8);
                }
            } else {
                i8 = b.t(parcel, r8);
            }
        }
        b.k(parcel, y8);
        return new ButtonOptions(i8, i9, i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new ButtonOptions[i8];
    }
}
