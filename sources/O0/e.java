package o0;

import android.os.Parcel;
import d0.AbstractBinderC2735b;
import d0.AbstractC2736c;

/* loaded from: classes3.dex */
public abstract class e extends AbstractBinderC2735b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // d0.AbstractBinderC2735b
    protected final boolean s0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 3:
                AbstractC2736c.b(parcel);
                break;
            case 4:
                AbstractC2736c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC2736c.b(parcel);
                break;
            case 7:
                AbstractC2736c.b(parcel);
                break;
            case 8:
                l lVar = (l) AbstractC2736c.a(parcel, l.CREATOR);
                AbstractC2736c.b(parcel);
                g0(lVar);
                break;
            case 9:
                AbstractC2736c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
