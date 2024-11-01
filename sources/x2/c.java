package X2;

import X2.b;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import x2.C4207a;

/* loaded from: classes4.dex */
public abstract class c {
    public static final b a(Throwable th) {
        AbstractC3292y.i(th, "<this>");
        if (th instanceof C4207a) {
            return new b.a(AbstractC3394E.f35245m0);
        }
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            return new b.C0231b(localizedMessage);
        }
        return new b.a(AbstractC3394E.f35257s0);
    }
}
