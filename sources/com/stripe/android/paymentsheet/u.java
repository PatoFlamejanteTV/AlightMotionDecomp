package com.stripe.android.paymentsheet;

import D3.f;
import com.stripe.android.paymentsheet.r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final r b(List list, D3.f fVar) {
        Object obj;
        boolean z8;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                r rVar = (r) obj;
                if (fVar instanceof f.c) {
                    z8 = rVar instanceof r.b;
                } else if (fVar instanceof f.d) {
                    z8 = rVar instanceof r.c;
                } else {
                    if (fVar instanceof f.C0023f) {
                        if (rVar instanceof r.d) {
                            z8 = AbstractC3292y.d(((f.C0023f) fVar).r().f25631a, ((r.d) rVar).e().f25631a);
                        }
                    } else if (!(fVar instanceof f.e) && !(fVar instanceof f.b)) {
                        throw new Q5.p();
                    }
                    z8 = false;
                }
                if (z8) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (r) obj;
    }

    public static final D3.f c(r rVar) {
        AbstractC3292y.i(rVar, "<this>");
        if (rVar instanceof r.a) {
            return null;
        }
        if (rVar instanceof r.b) {
            return f.c.f1258a;
        }
        if (rVar instanceof r.c) {
            return f.d.f1259a;
        }
        if (rVar instanceof r.d) {
            return new f.C0023f(((r.d) rVar).e(), null, null, 6, null);
        }
        throw new Q5.p();
    }
}
