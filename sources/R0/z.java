package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        C3865c c3865c = null;
        C3881t c3881t = null;
        ArrayList arrayList = null;
        C3874l c3874l = null;
        C3882u c3882u = null;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = true;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 2:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 3:
                    c3865c = (C3865c) R.b.e(parcel, r8, C3865c.CREATOR);
                    break;
                case 4:
                    z10 = R.b.m(parcel, r8);
                    break;
                case 5:
                    c3881t = (C3881t) R.b.e(parcel, r8, C3881t.CREATOR);
                    break;
                case 6:
                    arrayList = R.b.d(parcel, r8);
                    break;
                case 7:
                    c3874l = (C3874l) R.b.e(parcel, r8, C3874l.CREATOR);
                    break;
                case 8:
                    c3882u = (C3882u) R.b.e(parcel, r8, C3882u.CREATOR);
                    break;
                case 9:
                    z11 = R.b.m(parcel, r8);
                    break;
                case 10:
                    str = R.b.f(parcel, r8);
                    break;
                case 11:
                    bundle = R.b.a(parcel, r8);
                    break;
                case 12:
                    bArr = R.b.b(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C3872j(z8, z9, c3865c, z10, c3881t, arrayList, c3874l, c3882u, z11, str, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3872j[i8];
    }
}
