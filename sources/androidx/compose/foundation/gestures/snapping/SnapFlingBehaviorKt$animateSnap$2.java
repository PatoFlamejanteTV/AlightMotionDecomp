package androidx.compose.foundation.gestures.snapping;

import Q5.I;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateSnap$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $cancelOffset;
    final /* synthetic */ P $consumedUpToNow;
    final /* synthetic */ Function1 $onAnimationStep;
    final /* synthetic */ ScrollScope $this_animateSnap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehaviorKt$animateSnap$2(float f8, P p8, ScrollScope scrollScope, Function1 function1) {
        super(1);
        this.$cancelOffset = f8;
        this.$consumedUpToNow = p8;
        this.$this_animateSnap = scrollScope;
        this.$onAnimationStep = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) obj);
        return I.f8786a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animateTo) {
        float coerceToTarget;
        AbstractC3292y.i(animateTo, "$this$animateTo");
        coerceToTarget = SnapFlingBehaviorKt.coerceToTarget(animateTo.getValue().floatValue(), this.$cancelOffset);
        float f8 = coerceToTarget - this.$consumedUpToNow.f34570a;
        float scrollBy = this.$this_animateSnap.scrollBy(f8);
        this.$onAnimationStep.invoke(Float.valueOf(scrollBy));
        if (Math.abs(f8 - scrollBy) > 0.5f || coerceToTarget != animateTo.getValue().floatValue()) {
            animateTo.cancelAnimation();
        }
        this.$consumedUpToNow.f34570a += scrollBy;
    }
}
