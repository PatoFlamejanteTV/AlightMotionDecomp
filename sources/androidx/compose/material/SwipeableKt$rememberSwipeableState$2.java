package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableState$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ T $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableState$2(T t8, AnimationSpec<Float> animationSpec, Function1 function1) {
        super(0);
        this.$initialValue = t8;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SwipeableState<T> invoke() {
        return new SwipeableState<>(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
