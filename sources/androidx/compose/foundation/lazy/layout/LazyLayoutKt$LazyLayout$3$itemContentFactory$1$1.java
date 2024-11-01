package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<Function0> $currentItemProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1(State<? extends Function0> state) {
        super(0);
        this.$currentItemProvider = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyLayoutItemProvider invoke() {
        return (LazyLayoutItemProvider) this.$currentItemProvider.getValue().invoke();
    }
}
