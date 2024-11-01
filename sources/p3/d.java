package P3;

import D3.f;
import Q5.p;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class d {
    public static final boolean a(f.e eVar, w.l initializationMode) {
        boolean z8;
        AbstractC3292y.i(eVar, "<this>");
        AbstractC3292y.i(initializationMode, "initializationMode");
        if (eVar.f() == f.a.f1246b) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (initializationMode instanceof w.l.b) {
            return z8;
        }
        if (!(initializationMode instanceof w.l.c)) {
            if (initializationMode instanceof w.l.a) {
                if (((w.l.a) initializationMode).b().a().a() == null && !z8) {
                    return false;
                }
            } else {
                throw new p();
            }
        }
        return true;
    }
}
