package androidx.compose.material3;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderKt$SliderImpl$gestureEndAction$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ Function0 $onValueChangeFinished;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$gestureEndAction$1(SliderDraggableState sliderDraggableState, Function0 function0) {
        super(0);
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1742invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1742invoke() {
        Function0 function0;
        if (this.$draggableState.isDragging() || (function0 = this.$onValueChangeFinished) == null) {
            return;
        }
        function0.invoke();
    }
}
