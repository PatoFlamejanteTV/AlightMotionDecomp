package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PaddingKt$padding$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $all;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$3(float f8) {
        super(1);
        this.$all = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo $receiver) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        $receiver.setName("padding");
        $receiver.setValue(Dp.m5153boximpl(this.$all));
    }
}
