package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmValueChange;
    final /* synthetic */ Function1 $positionalThreshold;
    final /* synthetic */ Function0 $velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$Companion$Saver$2(Function1 function1, Function0 function0, AnimationSpec<Float> animationSpec, Function1 function12) {
        super(1);
        this.$positionalThreshold = function1;
        this.$velocityThreshold = function0;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AnchoredDraggableState$Companion$Saver$2) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AnchoredDraggableState<T> invoke(T it) {
        AbstractC3292y.i(it, "it");
        return new AnchoredDraggableState<>(it, this.$positionalThreshold, this.$velocityThreshold, this.$animationSpec, this.$confirmValueChange);
    }
}
