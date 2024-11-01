package C3;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import k4.InterfaceC3244b;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;
import x3.C4216c;
import x3.InterfaceC4215b;

/* renamed from: C3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0981b {
    public final InterfaceC4215b a(C4216c defaultAddressLauncherEventReporter) {
        AbstractC3292y.i(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
        return defaultAddressLauncherEventReporter;
    }

    public final InterfaceC3244b b(Context context, AddressElementActivityContract.a args) {
        String p8;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(args, "args");
        w3.e a9 = args.a();
        if (a9 == null || (p8 = a9.p()) == null) {
            return null;
        }
        return InterfaceC3244b.a.b(InterfaceC3244b.f34501a, context, p8, null, null, null, i.a.b(p3.i.f36196a, context, null, 2, null), 28, null);
    }
}
