package androidx.work.multiprocess;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import java.util.Collections;
import java.util.List;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class RemoteWorkContinuation {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected RemoteWorkContinuation() {
    }

    @NonNull
    public static RemoteWorkContinuation combine(@NonNull List<RemoteWorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract RemoteWorkContinuation combineInternal(@NonNull List<RemoteWorkContinuation> list);

    @NonNull
    public abstract InterfaceFutureC4260d enqueue();

    @NonNull
    public final RemoteWorkContinuation then(@NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract RemoteWorkContinuation then(@NonNull List<OneTimeWorkRequest> list);
}
