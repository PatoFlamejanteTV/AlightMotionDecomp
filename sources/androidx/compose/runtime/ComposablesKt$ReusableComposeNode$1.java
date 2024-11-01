package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class ComposablesKt$ReusableComposeNode$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposablesKt$ReusableComposeNode$1(Function0 function0) {
        super(0);
        this.$factory = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return this.$factory.invoke();
    }
}
