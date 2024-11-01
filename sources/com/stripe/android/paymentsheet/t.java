package com.stripe.android.paymentsheet;

import R5.AbstractC1435t;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import v3.C4127g;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f27676a = new t();

    private t() {
    }

    public final v3.o a(List paymentMethods, boolean z8, boolean z9, D3.f fVar, Function1 nameProvider, boolean z10, boolean z11) {
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(nameProvider, "nameProvider");
        List b9 = b(paymentMethods, z8, z9, nameProvider, z10, z11);
        return new v3.o(b9, c(b9, fVar));
    }

    public final List b(List paymentMethods, boolean z8, boolean z9, Function1 nameProvider, boolean z10, boolean z11) {
        String str;
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(nameProvider, "nameProvider");
        r.b bVar = r.b.f27655a;
        if (!z8) {
            bVar = null;
        }
        r.c cVar = r.c.f27658a;
        if (!z9) {
            cVar = null;
        }
        List r8 = AbstractC1435t.r(r.a.f27652a, bVar, cVar);
        List<com.stripe.android.model.o> list = paymentMethods;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        for (com.stripe.android.model.o oVar : list) {
            o.p pVar = oVar.f25635e;
            if (pVar != null) {
                str = pVar.f25773a;
            } else {
                str = null;
            }
            arrayList.add(new r.d(new C4127g((C2.c) nameProvider.invoke(str), oVar, z11), z10));
        }
        return AbstractC1435t.G0(r8, arrayList);
    }

    public final r c(List items, D3.f fVar) {
        r b9;
        AbstractC3292y.i(items, "items");
        if (fVar != null) {
            b9 = u.b(items, fVar);
            return b9;
        }
        return null;
    }
}
