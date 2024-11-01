package com.google.android.gms.common.api;

import N.C1339b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C1339b c1339b = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            R.b.x(parcel, r8);
                        } else {
                            c1339b = (C1339b) R.b.e(parcel, r8, C1339b.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) R.b.e(parcel, r8, PendingIntent.CREATOR);
                    }
                } else {
                    str = R.b.f(parcel, r8);
                }
            } else {
                i8 = R.b.t(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new Status(i8, str, pendingIntent, c1339b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Status[i8];
    }
}
