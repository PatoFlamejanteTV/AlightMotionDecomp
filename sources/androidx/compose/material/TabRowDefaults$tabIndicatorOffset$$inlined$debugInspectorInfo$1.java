package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TabPosition $currentTabPosition$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(TabPosition tabPosition) {
        super(1);
        this.$currentTabPosition$inlined = tabPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("tabIndicatorOffset");
        inspectorInfo.setValue(this.$currentTabPosition$inlined);
    }
}
