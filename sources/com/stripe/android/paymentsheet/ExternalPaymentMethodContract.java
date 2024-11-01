package com.stripe.android.paymentsheet;

import R5.Q;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.provider.FontsContractCompat;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;
import u3.AbstractC4079c;
import v3.AbstractC4129i;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExternalPaymentMethodContract extends ActivityResultContract<AbstractC4129i, AbstractC4079c> {

    /* renamed from: a, reason: collision with root package name */
    private final p3.i f26754a;

    public ExternalPaymentMethodContract(p3.i errorReporter) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f26754a = errorReporter;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, AbstractC4129i input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent().setClass(context, ExternalPaymentMethodProxyActivity.class).putExtra("external_payment_method_type", input.b()).putExtra("external_payment_method_billing_details", input.a());
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC4079c parseResult(int i8, Intent intent) {
        String str;
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    i.b.a(this.f26754a, i.f.f36249t, null, Q.e(Q5.x.a(FontsContractCompat.Columns.RESULT_CODE, String.valueOf(i8))), 2, null);
                    return new AbstractC4079c.d(new IllegalArgumentException("Invalid result code returned by external payment method activity"));
                }
                if (intent != null) {
                    str = intent.getStringExtra("external_payment_method_error_message");
                } else {
                    str = null;
                }
                return new AbstractC4079c.d(new x2.h(str, "externalPaymentMethodFailure"));
            }
            return AbstractC4079c.a.f40269c;
        }
        return AbstractC4079c.C0903c.f40270c;
    }
}
