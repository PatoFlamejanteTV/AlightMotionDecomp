package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<PagerLayoutIntervalContent> $intervalContentState;
    final /* synthetic */ PagerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(State<PagerLayoutIntervalContent> state, PagerState pagerState) {
        super(0);
        this.$intervalContentState = state;
        this.$state = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PagerLazyLayoutItemProvider invoke() {
        PagerLayoutIntervalContent value = this.$intervalContentState.getValue();
        return new PagerLazyLayoutItemProvider(this.$state, value, new NearestRangeKeyIndexMap(this.$state.getNearestRange$foundation_release(), value));
    }
}
