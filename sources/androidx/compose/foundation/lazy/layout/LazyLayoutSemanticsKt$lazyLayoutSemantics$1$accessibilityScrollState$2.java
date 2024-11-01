package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(0);
        this.$itemProviderLambda = function0;
        this.$state = lazyLayoutSemanticState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float currentPosition;
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.$itemProviderLambda.invoke();
        if (this.$state.getCanScrollForward()) {
            currentPosition = lazyLayoutItemProvider.getItemCount() + 1.0f;
        } else {
            currentPosition = this.$state.getCurrentPosition();
        }
        return Float.valueOf(currentPosition);
    }
}
