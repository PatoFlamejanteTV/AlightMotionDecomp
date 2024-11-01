package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class T implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(S s8, Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.e(parcel, 2, s8.f18563a, false);
        R.c.b(parcel, a9);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public S createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            if (R.b.l(r8) != 2) {
                R.b.x(parcel, r8);
            } else {
                bundle = R.b.a(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new S(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public S[] newArray(int i8) {
        return new S[i8];
    }
}
