package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollableStateKt$rememberScrollableState$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Function1> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollableStateKt$rememberScrollableState$1$1(State<? extends Function1> state) {
        super(1);
        this.$lambdaState = state;
    }

    public final Float invoke(float f8) {
        return (Float) this.$lambdaState.getValue().invoke(Float.valueOf(f8));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
