package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $after$inlined;
    final /* synthetic */ AlignmentLine $alignmentLine$inlined;
    final /* synthetic */ long $before$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(AlignmentLine alignmentLine, long j8, long j9) {
        super(1);
        this.$alignmentLine$inlined = alignmentLine;
        this.$before$inlined = j8;
        this.$after$inlined = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("paddingFrom");
        inspectorInfo.getProperties().set("alignmentLine", this.$alignmentLine$inlined);
        inspectorInfo.getProperties().set("before", TextUnit.m5332boximpl(this.$before$inlined));
        inspectorInfo.getProperties().set("after", TextUnit.m5332boximpl(this.$after$inlined));
    }
}
