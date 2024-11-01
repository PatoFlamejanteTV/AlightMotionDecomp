package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ProgressSemanticsKt$progressSemantics$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f8, InterfaceC2977e interfaceC2977e, int i8) {
        super(1);
        this.$value = f8;
        this.$valueRange = interfaceC2977e;
        this.$steps = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, new ProgressBarRangeInfo(((Number) m.o(Float.valueOf(this.$value), this.$valueRange)).floatValue(), this.$valueRange, this.$steps));
    }
}
