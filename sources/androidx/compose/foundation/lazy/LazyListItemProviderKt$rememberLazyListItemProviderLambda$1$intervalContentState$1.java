package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<Function1> $latestContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1(State<? extends Function1> state) {
        super(0);
        this.$latestContent = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyListIntervalContent invoke() {
        return new LazyListIntervalContent(this.$latestContent.getValue());
    }
}
