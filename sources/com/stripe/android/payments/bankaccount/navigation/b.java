package com.stripe.android.payments.bankaccount.navigation;

import Q5.p;
import com.stripe.android.payments.bankaccount.navigation.a;
import com.stripe.android.payments.bankaccount.navigation.d;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class b {
    public static final a a(d dVar) {
        a cVar;
        AbstractC3292y.i(dVar, "<this>");
        if (dVar instanceof d.a) {
            return a.C0538a.f26321a;
        }
        if (dVar instanceof d.b) {
            d.b bVar = (d.b) dVar;
            if (bVar.a().b() == null) {
                return new a.c(new IllegalArgumentException("StripeIntent not set for this session"));
            }
            if (bVar.a().a() == null) {
                return new a.c(new IllegalArgumentException("instant debits data cannot be null"));
            }
            cVar = new a.b(bVar.a().b(), bVar.a().a().f(), bVar.a().a().b(), bVar.a().a().a());
        } else if (dVar instanceof d.c) {
            cVar = new a.c(((d.c) dVar).a());
        } else {
            throw new p();
        }
        return cVar;
    }
}
