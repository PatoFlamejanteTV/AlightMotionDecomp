package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomSheetState$Companion$Saver$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState$Companion$Saver$4(AnimationSpec<Float> animationSpec, Function1 function1) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BottomSheetState invoke(BottomSheetValue it) {
        AbstractC3292y.i(it, "it");
        return new BottomSheetState(it, this.$animationSpec, this.$confirmStateChange);
    }
}
