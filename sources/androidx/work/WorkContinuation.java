package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class WorkContinuation {
    @NonNull
    public static WorkContinuation combine(@NonNull List<WorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract WorkContinuation combineInternal(@NonNull List<WorkContinuation> list);

    @NonNull
    public abstract Operation enqueue();

    @NonNull
    public abstract InterfaceFutureC4260d getWorkInfos();

    @NonNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData();

    @NonNull
    public final WorkContinuation then(@NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract WorkContinuation then(@NonNull List<OneTimeWorkRequest> list);
}
