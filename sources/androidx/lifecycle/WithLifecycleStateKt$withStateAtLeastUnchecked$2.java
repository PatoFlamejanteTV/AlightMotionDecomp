package androidx.lifecycle;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(Function0 function0) {
        super(0);
        this.$block = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final R invoke() {
        return this.$block.invoke();
    }
}
