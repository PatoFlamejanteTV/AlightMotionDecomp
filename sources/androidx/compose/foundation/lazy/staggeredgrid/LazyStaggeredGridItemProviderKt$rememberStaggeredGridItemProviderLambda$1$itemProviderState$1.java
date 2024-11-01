package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<LazyStaggeredGridIntervalContent> $intervalContentState;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1(State<LazyStaggeredGridIntervalContent> state, LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.$intervalContentState = state;
        this.$state = lazyStaggeredGridState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyStaggeredGridItemProviderImpl invoke() {
        LazyStaggeredGridIntervalContent value = this.$intervalContentState.getValue();
        return new LazyStaggeredGridItemProviderImpl(this.$state, value, new NearestRangeKeyIndexMap(this.$state.getNearestRange$foundation_release(), value));
    }
}
