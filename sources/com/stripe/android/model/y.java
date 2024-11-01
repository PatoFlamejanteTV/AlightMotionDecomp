package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.a0;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f26028a = a0.d(o.p.f25733C);

    public static final int a(StripeIntent stripeIntent) {
        AbstractC3292y.i(stripeIntent, "<this>");
        return com.stripe.android.b.f24705q.b(stripeIntent);
    }

    public static final boolean b(StripeIntent stripeIntent) {
        o.p pVar;
        AbstractC3292y.i(stripeIntent, "<this>");
        if (stripeIntent instanceof n) {
            Set set = f26028a;
            o r8 = stripeIntent.r();
            if (r8 != null) {
                pVar = r8.f25635e;
            } else {
                pVar = null;
            }
            if (AbstractC1435t.d0(set, pVar) && stripeIntent.t()) {
                return true;
            }
        }
        return false;
    }
}
