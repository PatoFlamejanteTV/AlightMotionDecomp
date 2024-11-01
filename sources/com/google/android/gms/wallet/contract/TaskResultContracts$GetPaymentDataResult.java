package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import r0.AbstractC3863a;
import r0.C3871i;
import t0.C4001a;

/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentDataResult extends TaskResultContracts$GetApiTaskResult<C3871i> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    /* renamed from: e */
    public C4001a parseResult(int i8, Intent intent) {
        if (i8 != 1) {
            return super.parseResult(i8, intent);
        }
        Status a9 = AbstractC3863a.a(intent);
        if (a9 == null) {
            a9 = Status.f16062h;
        }
        return new C4001a(a9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3871i f(Intent intent) {
        return C3871i.s(intent);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, androidx.activity.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Object parseResult(int i8, Intent intent) {
        return parseResult(i8, intent);
    }
}
