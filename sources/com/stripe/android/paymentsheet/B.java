package com.stripe.android.paymentsheet;

import E3.c;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import z3.InterfaceC4267a;

/* loaded from: classes4.dex */
public abstract class B {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f26677a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(A a9) {
            super(0);
            this.f26677a = a9;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f26677a.f().w() != w.n.f28014d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f26678a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(A a9) {
            super(0);
            this.f26678a = a9;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f26678a.f().w() == w.n.f28014d && !(this.f26678a.r().f().getValue() instanceof c.d));
        }
    }

    public static final boolean a(A a9) {
        StripeIntent stripeIntent;
        AbstractC3292y.i(a9, "<this>");
        InterfaceC4267a p02 = a9.p0();
        C2752d c2752d = (C2752d) a9.t().getValue();
        if (c2752d != null) {
            stripeIntent = c2752d.W();
        } else {
            stripeIntent = null;
        }
        return p02.c(stripeIntent, a9.l0().f());
    }

    private static final boolean b(A a9, Function0 function0) {
        StripeIntent stripeIntent;
        InterfaceC4267a p02 = a9.p0();
        C2752d c2752d = (C2752d) a9.t().getValue();
        if (c2752d != null) {
            stripeIntent = c2752d.W();
        } else {
            stripeIntent = null;
        }
        return p02.a(stripeIntent, (D3.f) a9.y().getValue(), a9.l0().f(), function0);
    }

    public static final boolean c(A a9) {
        AbstractC3292y.i(a9, "<this>");
        return b(a9, new a(a9));
    }

    public static final boolean d(A a9) {
        AbstractC3292y.i(a9, "<this>");
        return b(a9, new b(a9));
    }
}
