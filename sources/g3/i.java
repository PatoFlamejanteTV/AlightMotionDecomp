package G3;

import D3.f;
import Q5.x;
import R5.Q;
import com.stripe.android.model.a;
import com.stripe.android.paymentsheet.w;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;

/* loaded from: classes4.dex */
public abstract class i {
    public static final com.stripe.android.model.a a(w.a aVar) {
        AbstractC3292y.i(aVar, "<this>");
        String f8 = aVar.f();
        String h8 = aVar.h();
        return new com.stripe.android.model.a(aVar.a(), aVar.b(), f8, h8, aVar.i(), aVar.l());
    }

    public static final Map b(com.stripe.android.model.a aVar) {
        AbstractC3292y.i(aVar, "<this>");
        G.b bVar = G.Companion;
        return Q.k(x.a(bVar.p(), aVar.f()), x.a(bVar.q(), aVar.h()), x.a(bVar.k(), aVar.a()), x.a(bVar.z(), aVar.l()), x.a(bVar.l(), aVar.b()), x.a(bVar.u(), aVar.i()));
    }

    public static final f.a c(boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                return f.a.f1246b;
            }
            return f.a.f1247c;
        }
        return f.a.f1248d;
    }

    public static final com.stripe.android.model.a d(a.b bVar, Map formFieldValues) {
        AbstractC3292y.i(bVar, "<this>");
        AbstractC3292y.i(formFieldValues, "formFieldValues");
        G.b bVar2 = G.Companion;
        String str = (String) formFieldValues.get(bVar2.p());
        String str2 = (String) formFieldValues.get(bVar2.q());
        return new com.stripe.android.model.a((String) formFieldValues.get(bVar2.k()), (String) formFieldValues.get(bVar2.l()), str, str2, (String) formFieldValues.get(bVar2.u()), (String) formFieldValues.get(bVar2.z()));
    }
}
