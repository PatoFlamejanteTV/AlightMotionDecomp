package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $size$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(float f8) {
        super(1);
        this.$size$inlined = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredSize");
        inspectorInfo.setValue(Dp.m5153boximpl(this.$size$inlined));
    }
}