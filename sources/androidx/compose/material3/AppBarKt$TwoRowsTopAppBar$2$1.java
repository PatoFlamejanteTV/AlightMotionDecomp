package androidx.compose.material3;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ P $maxHeightPx;
    final /* synthetic */ P $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, P p8, P p9) {
        super(0);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$pinnedHeightPx = p8;
        this.$maxHeightPx = p9;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1441invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1441invoke() {
        TopAppBarState state;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        if (AbstractC3292y.b((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), this.$pinnedHeightPx.f34570a - this.$maxHeightPx.f34570a)) {
            return;
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = this.$scrollBehavior;
        TopAppBarState state2 = topAppBarScrollBehavior2 != null ? topAppBarScrollBehavior2.getState() : null;
        if (state2 == null) {
            return;
        }
        state2.setHeightOffsetLimit(this.$pinnedHeightPx.f34570a - this.$maxHeightPx.f34570a);
    }
}
