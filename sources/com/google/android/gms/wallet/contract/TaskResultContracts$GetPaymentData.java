package com.google.android.gms.wallet.contract;

import android.content.Intent;
import r0.C3871i;

/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentData extends TaskResultContracts$UnpackApiTaskResult<C3871i> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C3871i parseResult(int i8, Intent intent) {
        if (intent != null) {
            return C3871i.s(intent);
        }
        return null;
    }
}
