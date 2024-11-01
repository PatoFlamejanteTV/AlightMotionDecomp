package Q3;

import com.stripe.android.model.o;
import d3.C2752d;
import h4.InterfaceC2949a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import v3.C4127g;

/* loaded from: classes4.dex */
public abstract class q {
    public static final C4127g a(com.stripe.android.model.o oVar, Function1 providePaymentMethodName, C2752d c2752d) {
        String str;
        AbstractC3292y.i(oVar, "<this>");
        AbstractC3292y.i(providePaymentMethodName, "providePaymentMethodName");
        o.p pVar = oVar.f25635e;
        InterfaceC2949a interfaceC2949a = null;
        if (pVar != null) {
            str = pVar.f25773a;
        } else {
            str = null;
        }
        C2.c cVar = (C2.c) providePaymentMethodName.invoke(str);
        if (c2752d != null) {
            interfaceC2949a = c2752d.w();
        }
        return new C4127g(cVar, oVar, interfaceC2949a instanceof InterfaceC2949a.b);
    }
}
