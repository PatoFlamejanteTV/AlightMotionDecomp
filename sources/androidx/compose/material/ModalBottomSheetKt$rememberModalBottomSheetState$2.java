package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$rememberModalBottomSheetState$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmValueChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ ModalBottomSheetValue $initialValue;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$rememberModalBottomSheetState$2(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec<Float> animationSpec, Function1 function1, boolean z8) {
        super(0);
        this.$initialValue = modalBottomSheetValue;
        this.$density = density;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
        this.$skipHalfExpanded = z8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ModalBottomSheetState invoke() {
        return ModalBottomSheetKt.ModalBottomSheetState(this.$initialValue, this.$density, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
