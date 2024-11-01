package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $targetOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1 function1) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
        this.$targetOffset = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i8) {
        long m127calculateOffsetemnUabE;
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
        long m5325unboximpl = state != null ? ((IntSize) state.getValue()).m5325unboximpl() : IntSize.Companion.m5326getZeroYbymL2g();
        Function1 function1 = this.$targetOffset;
        m127calculateOffsetemnUabE = this.this$0.m127calculateOffsetemnUabE(IntSizeKt.IntSize(i8, i8), m5325unboximpl);
        return (Integer) function1.invoke(Integer.valueOf((-IntOffset.m5280getYimpl(m127calculateOffsetemnUabE)) - i8));
    }
}
