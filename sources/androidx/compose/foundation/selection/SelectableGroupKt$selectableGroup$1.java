package androidx.compose.foundation.selection;

import Q5.I;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SelectableGroupKt$selectableGroup$1 extends AbstractC3293z implements Function1 {
    public static final SelectableGroupKt$selectableGroup$1 INSTANCE = new SelectableGroupKt$selectableGroup$1();

    SelectableGroupKt$selectableGroup$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.selectableGroup(semantics);
    }
}
