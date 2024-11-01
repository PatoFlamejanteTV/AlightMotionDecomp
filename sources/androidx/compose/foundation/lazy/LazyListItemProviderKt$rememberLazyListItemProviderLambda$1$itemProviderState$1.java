package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<LazyListIntervalContent> $intervalContentState;
    final /* synthetic */ LazyItemScopeImpl $scope;
    final /* synthetic */ LazyListState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1(State<LazyListIntervalContent> state, LazyListState lazyListState, LazyItemScopeImpl lazyItemScopeImpl) {
        super(0);
        this.$intervalContentState = state;
        this.$state = lazyListState;
        this.$scope = lazyItemScopeImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyListItemProviderImpl invoke() {
        LazyListIntervalContent value = this.$intervalContentState.getValue();
        return new LazyListItemProviderImpl(this.$state, value, this.$scope, new NearestRangeKeyIndexMap(this.$state.getNearestRange$foundation_release(), value));
    }
}
