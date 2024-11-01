package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SlideModifier$transitionSpec$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideModifier$transitionSpec$1(SlideModifier slideModifier) {
        super(1);
        this.this$0 = slideModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        FiniteAnimationSpec<IntOffset> animationSpec;
        SpringSpec springSpec3;
        FiniteAnimationSpec<IntOffset> animationSpec2;
        AbstractC3292y.i(segment, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Slide value = this.this$0.getSlideIn().getValue();
            if (value != null && (animationSpec2 = value.getAnimationSpec()) != null) {
                return animationSpec2;
            }
            springSpec3 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            return springSpec3;
        }
        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            return springSpec;
        }
        Slide value2 = this.this$0.getSlideOut().getValue();
        if (value2 != null && (animationSpec = value2.getAnimationSpec()) != null) {
            return animationSpec;
        }
        springSpec2 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
        return springSpec2;
    }
}
