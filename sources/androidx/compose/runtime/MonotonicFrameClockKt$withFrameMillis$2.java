package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $onFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonotonicFrameClockKt$withFrameMillis$2(Function1 function1) {
        super(1);
        this.$onFrame = function1;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
    public final R invoke(long j8) {
        return this.$onFrame.invoke(Long.valueOf(j8 / 1000000));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
