package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2098b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        long j8 = 0;
        long j9 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    j8 = R.b.u(parcel, r8);
                    break;
                case 2:
                    j9 = R.b.u(parcel, r8);
                    break;
                case 3:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 4:
                    str = R.b.f(parcel, r8);
                    break;
                case 5:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 6:
                    str3 = R.b.f(parcel, r8);
                    break;
                case 7:
                    bundle = R.b.a(parcel, r8);
                    break;
                case 8:
                    str4 = R.b.f(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C2107c1(j8, j9, z8, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2107c1[i8];
    }
}
