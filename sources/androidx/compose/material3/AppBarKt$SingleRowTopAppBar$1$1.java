package androidx.compose.material3;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ float $heightOffsetLimit;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$1$1(TopAppBarScrollBehavior topAppBarScrollBehavior, float f8) {
        super(0);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$heightOffsetLimit = f8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1440invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1440invoke() {
        TopAppBarState state;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        if (AbstractC3292y.b((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), this.$heightOffsetLimit)) {
            return;
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = this.$scrollBehavior;
        TopAppBarState state2 = topAppBarScrollBehavior2 != null ? topAppBarScrollBehavior2.getState() : null;
        if (state2 == null) {
            return;
        }
        state2.setHeightOffsetLimit(this.$heightOffsetLimit);
    }
}
