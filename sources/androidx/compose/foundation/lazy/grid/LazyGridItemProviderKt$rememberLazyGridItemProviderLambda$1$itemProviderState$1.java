package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<LazyGridIntervalContent> $intervalContentState;
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1(State<LazyGridIntervalContent> state, LazyGridState lazyGridState) {
        super(0);
        this.$intervalContentState = state;
        this.$state = lazyGridState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyGridItemProviderImpl invoke() {
        LazyGridIntervalContent value = this.$intervalContentState.getValue();
        return new LazyGridItemProviderImpl(this.$state, value, new NearestRangeKeyIndexMap(this.$state.getNearestRange$foundation_release(), value));
    }
}
