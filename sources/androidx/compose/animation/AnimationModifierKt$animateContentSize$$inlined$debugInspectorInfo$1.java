package androidx.compose.animation;

import Q5.I;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.platform.InspectorInfo;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ FiniteAnimationSpec $animationSpec$inlined;
    final /* synthetic */ InterfaceC2072n $finishedListener$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1(FiniteAnimationSpec finiteAnimationSpec, InterfaceC2072n interfaceC2072n) {
        super(1);
        this.$animationSpec$inlined = finiteAnimationSpec;
        this.$finishedListener$inlined = interfaceC2072n;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.$animationSpec$inlined);
        inspectorInfo.getProperties().set("finishedListener", this.$finishedListener$inlined);
    }
}
