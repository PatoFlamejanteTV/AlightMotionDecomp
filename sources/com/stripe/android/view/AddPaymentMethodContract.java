package com.stripe.android.view;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AddPaymentMethodContract extends ActivityResultContract<C2644d, AbstractC2646e> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, C2644d input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) AddPaymentMethodActivity.class).putExtra("extra_activity_args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2646e parseResult(int i8, Intent intent) {
        return AbstractC2646e.f28917a.a(intent);
    }
}
