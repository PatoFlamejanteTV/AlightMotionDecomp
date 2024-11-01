package i0;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* loaded from: classes3.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            R.b.x(parcel, r8);
                        } else {
                            bArr = R.b.b(parcel, r8);
                        }
                    } else {
                        remoteViews = (RemoteViews) R.b.e(parcel, r8, RemoteViews.CREATOR);
                    }
                } else {
                    iArr = R.b.c(parcel, r8);
                }
            } else {
                strArr = R.b.g(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new m(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new m[i8];
    }
}
