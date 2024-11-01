package com.stripe.android.paymentsheet;

import R5.AbstractC1435t;
import com.stripe.android.paymentsheet.r;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class s {
    public static final String a(r rVar) {
        r.d dVar;
        com.stripe.android.model.o e8;
        AbstractC3292y.i(rVar, "<this>");
        String str = null;
        if (rVar instanceof r.d) {
            dVar = (r.d) rVar;
        } else {
            dVar = null;
        }
        if (dVar != null && (e8 = dVar.e()) != null) {
            str = e8.f25631a;
        }
        return AbstractC1435t.w0(AbstractC1435t.r(rVar.a(), str), "-", null, null, 0, null, null, 62, null);
    }
}
