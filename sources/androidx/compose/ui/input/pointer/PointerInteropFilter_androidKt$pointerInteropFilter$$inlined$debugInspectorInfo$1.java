package androidx.compose.ui.input.pointer;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $onTouchEvent$inlined;
    final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1) {
        super(1);
        this.$requestDisallowInterceptTouchEvent$inlined = requestDisallowInterceptTouchEvent;
        this.$onTouchEvent$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerInteropFilter");
        inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", this.$requestDisallowInterceptTouchEvent$inlined);
        inspectorInfo.getProperties().set("onTouchEvent", this.$onTouchEvent$inlined);
    }
}
