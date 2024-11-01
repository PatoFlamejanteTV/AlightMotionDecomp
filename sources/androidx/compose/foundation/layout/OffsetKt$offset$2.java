package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class OffsetKt$offset$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $offset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetKt$offset$2(Function1 function1) {
        super(1);
        this.$offset = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo $receiver) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        $receiver.setName(TypedValues.CycleType.S_WAVE_OFFSET);
        $receiver.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, this.$offset);
    }
}
