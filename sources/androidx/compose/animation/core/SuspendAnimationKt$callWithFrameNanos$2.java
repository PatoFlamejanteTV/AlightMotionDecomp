package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$callWithFrameNanos$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $onFrame;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$callWithFrameNanos$2(Function1 function1) {
        super(1);
        this.$onFrame = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
    public final R invoke(long j8) {
        return this.$onFrame.invoke(Long.valueOf(j8));
    }
}
