package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ProgressSemanticsKt$progressSemantics$2 extends AbstractC3293z implements Function1 {
    public static final ProgressSemanticsKt$progressSemantics$2 INSTANCE = new ProgressSemanticsKt$progressSemantics$2();

    ProgressSemanticsKt$progressSemantics$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, ProgressBarRangeInfo.Companion.getIndeterminate());
    }
}
