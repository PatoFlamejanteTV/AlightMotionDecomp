package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(ScrollState scrollState) {
        super(0);
        this.$state = scrollState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$state.getMaxValue());
    }
}
