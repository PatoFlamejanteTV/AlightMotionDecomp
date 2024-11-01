package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExpandShrinkModifier$sizeTransitionSpec$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$sizeTransitionSpec$1(ExpandShrinkModifier expandShrinkModifier) {
        super(1);
        this.this$0 = expandShrinkModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        AbstractC3292y.i(segment, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        FiniteAnimationSpec<IntSize> finiteAnimationSpec = null;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            ChangeSize value = this.this$0.getExpand().getValue();
            if (value != null) {
                finiteAnimationSpec = value.getAnimationSpec();
            }
        } else if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            finiteAnimationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
        } else {
            ChangeSize value2 = this.this$0.getShrink().getValue();
            if (value2 != null) {
                finiteAnimationSpec = value2.getAnimationSpec();
            }
        }
        if (finiteAnimationSpec != null) {
            return finiteAnimationSpec;
        }
        springSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
        return springSpec;
    }
}
