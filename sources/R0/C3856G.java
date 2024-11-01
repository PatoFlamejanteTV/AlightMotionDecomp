package r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: r0.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3856G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            if (R.b.l(r8) != 1) {
                R.b.x(parcel, r8);
            } else {
                arrayList = R.b.h(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C3881t(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3881t[i8];
    }
}
