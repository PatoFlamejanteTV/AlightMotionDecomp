package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $height$inlined;
    final /* synthetic */ float $width$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(float f8, float f9) {
        super(1);
        this.$width$inlined = f8;
        this.$height$inlined = f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredSize");
        inspectorInfo.getProperties().set("width", Dp.m5153boximpl(this.$width$inlined));
        inspectorInfo.getProperties().set("height", Dp.m5153boximpl(this.$height$inlined));
    }
}
