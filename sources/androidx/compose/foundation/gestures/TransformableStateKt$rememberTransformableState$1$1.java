package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TransformableStateKt$rememberTransformableState$1$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ State<InterfaceC2073o> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformableStateKt$rememberTransformableState$1$1(State<? extends InterfaceC2073o> state) {
        super(3);
        this.$lambdaState = state;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m457invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).m2722unboximpl(), ((Number) obj3).floatValue());
        return I.f8786a;
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final void m457invoked4ec7I(float f8, long j8, float f9) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f8), Offset.m2701boximpl(j8), Float.valueOf(f9));
    }
}
