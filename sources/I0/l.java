package i0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            if (R.b.l(r8) != 1) {
                R.b.x(parcel, r8);
            } else {
                pendingIntent = (PendingIntent) R.b.e(parcel, r8, PendingIntent.CREATOR);
            }
        }
        R.b.k(parcel, y8);
        return new k(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new k[i8];
    }
}
