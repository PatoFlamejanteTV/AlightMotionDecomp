package androidx.compose.material.pullrefresh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PullRefreshState$adjustedDistancePulled$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PullRefreshState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshState$adjustedDistancePulled$2(PullRefreshState pullRefreshState) {
        super(0);
        this.this$0 = pullRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float distancePulled;
        distancePulled = this.this$0.getDistancePulled();
        return Float.valueOf(distancePulled * 0.5f);
    }
}
