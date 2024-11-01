package androidx.compose.material3;

import Q5.I;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$settleAppBar$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TopAppBarState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBar$3(TopAppBarState topAppBarState) {
        super(1);
        this.$state = topAppBarState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) obj);
        return I.f8786a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animateTo) {
        AbstractC3292y.i(animateTo, "$this$animateTo");
        this.$state.setHeightOffset(animateTo.getValue().floatValue());
    }
}
