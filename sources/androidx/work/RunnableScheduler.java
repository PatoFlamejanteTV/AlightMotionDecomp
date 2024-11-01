package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface RunnableScheduler {
    void cancel(@NonNull Runnable runnable);

    void scheduleWithDelay(@IntRange(from = 0) long j8, @NonNull Runnable runnable);
}
