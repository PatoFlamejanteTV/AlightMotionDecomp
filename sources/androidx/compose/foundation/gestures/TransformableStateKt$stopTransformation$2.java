package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TransformableStateKt$stopTransformation$2 extends l implements InterfaceC2072n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransformableStateKt$stopTransformation$2(U5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new TransformableStateKt$stopTransformation$2(dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(TransformScope transformScope, U5.d dVar) {
        return ((TransformableStateKt$stopTransformation$2) create(transformScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
