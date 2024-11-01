package androidx.activity.compose;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PredictiveBackHandlerKt$PredictiveBackHandler$1 extends l implements InterfaceC2072n {
    final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 $backCallBack;
    final /* synthetic */ boolean $enabled;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$1(PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, boolean z8, d dVar) {
        super(2, dVar);
        this.$backCallBack = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
        this.$enabled = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new PredictiveBackHandlerKt$PredictiveBackHandler$1(this.$backCallBack, this.$enabled, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            setEnabled(this.$enabled);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((PredictiveBackHandlerKt$PredictiveBackHandler$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
