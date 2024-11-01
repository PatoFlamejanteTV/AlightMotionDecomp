package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $initialOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideIntoContainer$3(Function1 function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.$initialOffset = function1;
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i8) {
        long m128getCurrentSizeYbymL2g;
        long m128getCurrentSizeYbymL2g2;
        long m127calculateOffsetemnUabE;
        Function1 function1 = this.$initialOffset;
        m128getCurrentSizeYbymL2g = this.this$0.m128getCurrentSizeYbymL2g();
        int m5320getHeightimpl = IntSize.m5320getHeightimpl(m128getCurrentSizeYbymL2g);
        AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.this$0;
        long IntSize = IntSizeKt.IntSize(i8, i8);
        m128getCurrentSizeYbymL2g2 = this.this$0.m128getCurrentSizeYbymL2g();
        m127calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m127calculateOffsetemnUabE(IntSize, m128getCurrentSizeYbymL2g2);
        return (Integer) function1.invoke(Integer.valueOf(m5320getHeightimpl - IntOffset.m5280getYimpl(m127calculateOffsetemnUabE)));
    }
}
