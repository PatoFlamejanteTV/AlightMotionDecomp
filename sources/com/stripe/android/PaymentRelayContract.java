package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stripe.android.a;
import com.stripe.android.view.PaymentRelayActivity;
import k3.C3237c;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentRelayContract extends ActivityResultContract<a.AbstractC0445a, C3237c> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a.AbstractC0445a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        C3237c b9 = input.b();
        if (b9 == null) {
            b9 = new C3237c(null, 0, null, false, null, null, null, ModuleDescriptor.MODULE_VERSION, null);
        }
        Intent putExtras = new Intent(context, (Class<?>) PaymentRelayActivity.class).putExtras(b9.u());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3237c parseResult(int i8, Intent intent) {
        return C3237c.f34404h.b(intent);
    }
}
