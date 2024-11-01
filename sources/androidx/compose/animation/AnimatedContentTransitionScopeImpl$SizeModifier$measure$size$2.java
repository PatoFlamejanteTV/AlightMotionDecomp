package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5313boximpl(m134invokeYEO4UFw(obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m134invokeYEO4UFw(S s8) {
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(s8);
        if (state != null) {
            return ((IntSize) state.getValue()).m5325unboximpl();
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }
}
