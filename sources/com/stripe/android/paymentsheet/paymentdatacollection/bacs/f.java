package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f implements I3.c {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f27480a;

    public f(ActivityResultLauncher activityResultLauncher) {
        AbstractC3292y.i(activityResultLauncher, "activityResultLauncher");
        this.f27480a = activityResultLauncher;
    }

    @Override // I3.c
    public void a(I3.e data, w.b appearance) {
        AbstractC3292y.i(data, "data");
        AbstractC3292y.i(appearance, "appearance");
        this.f27480a.launch(new BacsMandateConfirmationContract.a(data.b(), data.c(), data.d(), data.a(), appearance));
    }
}
