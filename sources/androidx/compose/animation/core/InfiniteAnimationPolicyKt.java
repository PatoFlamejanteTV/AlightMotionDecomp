package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object withInfiniteAnimationFrameMillis(Function1 function1, U5.d dVar) {
        return withInfiniteAnimationFrameNanos(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(function1), dVar);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(Function1 function1, U5.d dVar) {
        InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 = new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(function1);
        AbstractC3290w.c(0);
        Object withInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, dVar);
        AbstractC3290w.c(1);
        return withInfiniteAnimationFrameNanos;
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(Function1 function1, U5.d dVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) dVar.getContext().get(InfiniteAnimationPolicy.Key);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.withFrameNanos(function1, dVar);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, null), dVar);
    }
}
