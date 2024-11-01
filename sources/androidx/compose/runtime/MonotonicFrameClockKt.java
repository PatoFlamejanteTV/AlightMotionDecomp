package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock getMonotonicFrameClock(U5.g gVar) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) gVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, Function1 function1, U5.d dVar) {
        return monotonicFrameClock.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(function1), dVar);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, Function1 function1, U5.d dVar) {
        MonotonicFrameClockKt$withFrameMillis$2 monotonicFrameClockKt$withFrameMillis$2 = new MonotonicFrameClockKt$withFrameMillis$2(function1);
        AbstractC3290w.c(0);
        Object withFrameNanos = monotonicFrameClock.withFrameNanos(monotonicFrameClockKt$withFrameMillis$2, dVar);
        AbstractC3290w.c(1);
        return withFrameNanos;
    }

    public static final <R> Object withFrameNanos(Function1 function1, U5.d dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(function1, dVar);
    }

    public static final <R> Object withFrameMillis(Function1 function1, U5.d dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(function1), dVar);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(U5.g gVar) {
    }
}
