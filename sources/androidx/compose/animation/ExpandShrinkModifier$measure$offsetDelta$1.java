package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExpandShrinkModifier$measure$offsetDelta$1 extends AbstractC3293z implements Function1 {
    public static final ExpandShrinkModifier$measure$offsetDelta$1 INSTANCE = new ExpandShrinkModifier$measure$offsetDelta$1();

    ExpandShrinkModifier$measure$offsetDelta$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> animate) {
        SpringSpec springSpec;
        AbstractC3292y.i(animate, "$this$animate");
        springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
        return springSpec;
    }
}
