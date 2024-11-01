package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnchoredDraggableKt$rememberAnchoredDraggableState$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmValueChange;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ Function1 $positionalThreshold;
    final /* synthetic */ Function0 $velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$rememberAnchoredDraggableState$2(T t8, Function1 function1, Function0 function0, AnimationSpec<Float> animationSpec, Function1 function12) {
        super(0);
        this.$initialValue = t8;
        this.$positionalThreshold = function1;
        this.$velocityThreshold = function0;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnchoredDraggableState<T> invoke() {
        return new AnchoredDraggableState<>(this.$initialValue, this.$positionalThreshold, this.$velocityThreshold, this.$animationSpec, this.$confirmValueChange);
    }
}
