package androidx.compose.material.pullrefresh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(PullRefreshState pullRefreshState) {
        super(0);
        this.$state = pullRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$state.getProgress() < 1.0f ? 0.3f : 1.0f);
    }
}
