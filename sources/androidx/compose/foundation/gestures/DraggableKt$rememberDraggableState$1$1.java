package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DraggableKt$rememberDraggableState$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Function1> $onDeltaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$rememberDraggableState$1$1(State<? extends Function1> state) {
        super(1);
        this.$onDeltaState = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        this.$onDeltaState.getValue().invoke(Float.valueOf(f8));
    }
}
