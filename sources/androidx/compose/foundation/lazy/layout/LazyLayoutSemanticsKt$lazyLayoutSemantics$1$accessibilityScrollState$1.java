package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1(LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(0);
        this.$state = lazyLayoutSemanticState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$state.getCurrentPosition());
    }
}
