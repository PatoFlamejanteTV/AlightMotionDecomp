package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import t0.C4001a;

/* loaded from: classes3.dex */
public abstract class TaskResultContracts$GetApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, C4001a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C4001a c(Task task) {
        if (task.n()) {
            return new C4001a(task.j(), Status.f16060f);
        }
        if (task.l()) {
            return new C4001a(new Status(16, "The task has been canceled."));
        }
        Status status = this.f18208a;
        if (status != null) {
            return new C4001a(status);
        }
        return new C4001a(Status.f16062h);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C4001a parseResult(int i8, Intent intent) {
        Object obj;
        if (i8 != -1) {
            if (i8 != 0) {
                return new C4001a(null, Status.f16062h);
            }
            return new C4001a(null, Status.f16064j);
        }
        if (intent != null) {
            obj = f(intent);
        } else {
            obj = null;
        }
        if (obj != null) {
            return new C4001a(obj, Status.f16060f);
        }
        return new C4001a(null, Status.f16062h);
    }

    protected abstract Object f(Intent intent);
}
