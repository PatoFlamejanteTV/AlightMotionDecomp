package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DraggableState $draggableState$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ State $gestureEndAction$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ boolean $isRtl$inlined;
    final /* synthetic */ int $maxPx$inlined;
    final /* synthetic */ MutableState $pressOffset$inlined;
    final /* synthetic */ State $rawOffset$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i8, boolean z8, State state, State state2, MutableState mutableState, boolean z9) {
        super(1);
        this.$draggableState$inlined = draggableState;
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$maxPx$inlined = i8;
        this.$isRtl$inlined = z8;
        this.$rawOffset$inlined = state;
        this.$gestureEndAction$inlined = state2;
        this.$pressOffset$inlined = mutableState;
        this.$enabled$inlined = z9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("sliderTapModifier");
        inspectorInfo.getProperties().set("draggableState", this.$draggableState$inlined);
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("maxPx", Integer.valueOf(this.$maxPx$inlined));
        inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(this.$isRtl$inlined));
        inspectorInfo.getProperties().set("rawOffset", this.$rawOffset$inlined);
        inspectorInfo.getProperties().set("gestureEndAction", this.$gestureEndAction$inlined);
        inspectorInfo.getProperties().set("pressOffset", this.$pressOffset$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
    }
}
