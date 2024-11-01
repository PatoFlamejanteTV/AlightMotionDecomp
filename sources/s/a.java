package S;

import Q.C1399t;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d0.AbstractC2734a;
import d0.AbstractC2736c;

/* loaded from: classes3.dex */
public final class a extends AbstractC2734a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void s0(C1399t c1399t) {
        Parcel h8 = h();
        AbstractC2736c.c(h8, c1399t);
        k(1, h8);
    }
}
