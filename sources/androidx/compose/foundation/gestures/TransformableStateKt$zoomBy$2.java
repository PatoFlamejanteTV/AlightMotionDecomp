package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TransformableStateKt$zoomBy$2 extends l implements InterfaceC2072n {
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$zoomBy$2(float f8, U5.d dVar) {
        super(2, dVar);
        this.$zoomFactor = f8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        TransformableStateKt$zoomBy$2 transformableStateKt$zoomBy$2 = new TransformableStateKt$zoomBy$2(this.$zoomFactor, dVar);
        transformableStateKt$zoomBy$2.L$0 = obj;
        return transformableStateKt$zoomBy$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(TransformScope transformScope, U5.d dVar) {
        return ((TransformableStateKt$zoomBy$2) create(transformScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            ((TransformScope) this.L$0).mo355transformByd4ec7I(this.$zoomFactor, Offset.Companion.m2728getZeroF1C5BW0(), 0.0f);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
