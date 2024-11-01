package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.p;
import d4.C2757a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.c f28102a;

    /* renamed from: b, reason: collision with root package name */
    private final U5.g f28103b;

    public i(Z3.c errorReporter, U5.g workContext) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        this.f28102a = errorReporter;
        this.f28103b = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.e
    public Object a(c.a aVar, C2757a c2757a, U5.d dVar) {
        return new p.b(aVar).Q(this.f28102a, this.f28103b).a(c2757a, dVar);
    }
}
