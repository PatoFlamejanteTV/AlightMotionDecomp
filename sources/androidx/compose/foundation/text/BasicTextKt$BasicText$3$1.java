package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BasicTextKt$BasicText$3$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ MutableState<List<Rect>> $measuredPlaceholderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$3$1(MutableState<List<Rect>> mutableState) {
        super(1);
        this.$measuredPlaceholderPositions = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Rect>) obj);
        return I.f8786a;
    }

    public final void invoke(List<Rect> it) {
        AbstractC3292y.i(it, "it");
        this.$measuredPlaceholderPositions.setValue(it);
    }
}
