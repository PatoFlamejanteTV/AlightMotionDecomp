package androidx.compose.material.pullrefresh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(boolean z8, PullRefreshState pullRefreshState) {
        super(0);
        this.$refreshing = z8;
        this.$state = pullRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$refreshing || this.$state.getPosition$material_release() > 0.5f);
    }
}
