package androidx.compose.foundation.gestures.snapping;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
final class SnapFlingBehavior$longSnap$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $onAnimationStep;
    final /* synthetic */ P $remainingScrollOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$longSnap$3(P p8, Function1 function1) {
        super(1);
        this.$remainingScrollOffset = p8;
        this.$onAnimationStep = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        P p8 = this.$remainingScrollOffset;
        float f9 = p8.f34570a - f8;
        p8.f34570a = f9;
        this.$onAnimationStep.invoke(Float.valueOf(f9));
    }
}
