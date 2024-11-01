package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;

/* loaded from: classes.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ O $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ State<InterfaceC2072n> $onDrag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(State<? extends InterfaceC2072n> state, O o8, boolean z8) {
        super(1);
        this.$onDrag = state;
        this.$draggingStart = o8;
        this.$isRtl = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PointerInputChange) obj);
        return I.f8786a;
    }

    public final void invoke(PointerInputChange it) {
        AbstractC3292y.i(it, "it");
        float m2712getXimpl = Offset.m2712getXimpl(PointerEventKt.positionChange(it));
        InterfaceC2072n value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.f34569a);
        if (this.$isRtl) {
            m2712getXimpl = -m2712getXimpl;
        }
        value.invoke(valueOf, Float.valueOf(m2712getXimpl));
    }
}
