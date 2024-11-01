package com.stripe.android.view;

import com.stripe.android.view.t0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class R0 implements t0.b {

    /* renamed from: a, reason: collision with root package name */
    private final C2641b0 f28821a;

    public R0(C2641b0 deletePaymentMethodDialogFactory) {
        AbstractC3292y.i(deletePaymentMethodDialogFactory, "deletePaymentMethodDialogFactory");
        this.f28821a = deletePaymentMethodDialogFactory;
    }

    @Override // com.stripe.android.view.t0.b
    public void a(com.stripe.android.model.o paymentMethod) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        this.f28821a.d(paymentMethod).show();
    }
}
