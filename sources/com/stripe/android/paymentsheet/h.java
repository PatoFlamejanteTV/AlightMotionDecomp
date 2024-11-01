package com.stripe.android.paymentsheet;

import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.n;
import com.stripe.android.paymentsheet.w;
import w3.AbstractC4155b;
import w3.C4154a;

/* loaded from: classes4.dex */
public abstract class h {
    public static final Object a(g gVar, n.d dVar, U5.d dVar2) {
        b.d dVar3 = null;
        if (dVar instanceof n.d.a) {
            w.l D8 = dVar.D();
            n.d.a aVar = (n.d.a) dVar;
            com.stripe.android.model.r b9 = aVar.b();
            com.stripe.android.model.p a9 = aVar.a();
            C4154a q8 = dVar.q();
            if (q8 != null) {
                dVar3 = AbstractC4155b.a(q8);
            }
            return gVar.a(D8, a9, b9, dVar3, aVar.f(), dVar2);
        }
        if (dVar instanceof n.d.b) {
            w.l D9 = dVar.D();
            n.d.b bVar = (n.d.b) dVar;
            com.stripe.android.model.o r8 = bVar.r();
            com.stripe.android.model.r a10 = bVar.a();
            C4154a q9 = dVar.q();
            if (q9 != null) {
                dVar3 = AbstractC4155b.a(q9);
            }
            return gVar.b(D9, r8, a10, dVar3, dVar2);
        }
        throw new Q5.p();
    }
}
