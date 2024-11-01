package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeableState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1 function1) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SwipeableState$Companion$Saver$2) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SwipeableState<T> invoke(T it) {
        AbstractC3292y.i(it, "it");
        return new SwipeableState<>(it, this.$animationSpec, this.$confirmStateChange);
    }
}
