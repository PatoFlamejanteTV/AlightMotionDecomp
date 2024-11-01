package G3;

import Q5.p;
import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import v3.w;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3047a = new j();

    private j() {
    }

    private final String c(boolean z8) {
        if (z8) {
            return "https://link.com/terms/ach-authorization";
        }
        if (!z8) {
            return "https://stripe.com/ach-payments/authorization";
        }
        throw new p();
    }

    public final C2.c a(String merchantName, boolean z8, boolean z9, boolean z10, boolean z11) {
        AbstractC3292y.i(merchantName, "merchantName");
        C2.c b9 = b(merchantName, z9, z10, z11);
        C2.c cVar = null;
        if (z8) {
            cVar = C2.d.g(w.f40587K, new Object[]{merchantName}, null, 4, null);
        }
        if (cVar != null) {
            return C2.d.d(C2.d.d(cVar, C2.d.b(" ")), b9);
        }
        return b9;
    }

    public final C2.c b(String merchantName, boolean z8, boolean z9, boolean z10) {
        AbstractC3292y.i(merchantName, "merchantName");
        List p8 = AbstractC1435t.p(new D2.a("<terms>", "<a href=\"" + c(z9) + "\">"), new D2.a("</terms>", "</a>"));
        if (!z8 && !z10) {
            return C2.d.e(w.f40619i, new Object[0], p8);
        }
        return C2.d.e(w.f40621j, new Object[]{merchantName}, p8);
    }
}
