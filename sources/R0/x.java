package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes3.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        C3864b c3864b = null;
        UserAddress userAddress = null;
        C3873k c3873k = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    str = R.b.f(parcel, r8);
                    break;
                case 2:
                    c3864b = (C3864b) R.b.e(parcel, r8, C3864b.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 4:
                    c3873k = (C3873k) R.b.e(parcel, r8, C3873k.CREATOR);
                    break;
                case 5:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 6:
                    bundle = R.b.a(parcel, r8);
                    break;
                case 7:
                    str3 = R.b.f(parcel, r8);
                    break;
                case 8:
                    bundle2 = R.b.a(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C3871i(str, c3864b, userAddress, c3873k, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3871i[i8];
    }
}
