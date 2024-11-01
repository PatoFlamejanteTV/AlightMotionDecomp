package i0;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import r0.C3870h;
import r0.C3871i;

/* loaded from: classes3.dex */
public interface q extends IInterface {
    void L(int i8, MaskedWallet maskedWallet, Bundle bundle);

    void d0(int i8, Bundle bundle);

    void h0(Status status, C3870h c3870h, Bundle bundle);

    void l(Status status, C3871i c3871i, Bundle bundle);

    void m0(int i8, FullWallet fullWallet, Bundle bundle);

    void r(Status status, boolean z8, Bundle bundle);

    void v(int i8, boolean z8, Bundle bundle);
}
