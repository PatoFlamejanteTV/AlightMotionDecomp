package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmValueChange;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState$Companion$Saver$4(AnimationSpec<Float> animationSpec, Function1 function1, boolean z8) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
        this.$skipHalfExpanded = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ModalBottomSheetState invoke(ModalBottomSheetValue it) {
        AbstractC3292y.i(it, "it");
        return ModalBottomSheetKt.ModalBottomSheetState(it, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
