package K;

import android.os.Parcel;
import c0.AbstractBinderC2006c;

/* loaded from: classes3.dex */
public abstract class q extends AbstractBinderC2006c implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // c0.AbstractBinderC2006c
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            q();
        } else {
            C();
        }
        return true;
    }
}
