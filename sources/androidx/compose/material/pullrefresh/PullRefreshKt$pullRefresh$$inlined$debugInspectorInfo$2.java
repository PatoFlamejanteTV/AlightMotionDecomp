package androidx.compose.material.pullrefresh;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Function1 $onPull$inlined;
    final /* synthetic */ InterfaceC2072n $onRelease$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(Function1 function1, InterfaceC2072n interfaceC2072n, boolean z8) {
        super(1);
        this.$onPull$inlined = function1;
        this.$onRelease$inlined = interfaceC2072n;
        this.$enabled$inlined = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("pullRefresh");
        inspectorInfo.getProperties().set("onPull", this.$onPull$inlined);
        inspectorInfo.getProperties().set("onRelease", this.$onRelease$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
    }
}
