package F2;

import com.stripe.android.model.o;
import h4.InterfaceC2949a;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class h {
    public static final boolean a(o paymentMethod, InterfaceC2949a cbcEligibility) {
        boolean z8;
        o.g.c cVar;
        Set a9;
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        o.g gVar = paymentMethod.f25638h;
        if (gVar != null && (cVar = gVar.f25708k) != null && (a9 = cVar.a()) != null && a9.size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!(cbcEligibility instanceof InterfaceC2949a.b) || !z8) {
            return false;
        }
        return true;
    }
}
