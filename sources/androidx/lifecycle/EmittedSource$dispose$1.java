package androidx.lifecycle;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EmittedSource$dispose$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    int label;
    final /* synthetic */ EmittedSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmittedSource$dispose$1(EmittedSource emittedSource, U5.d dVar) {
        super(2, dVar);
        this.this$0 = emittedSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new EmittedSource$dispose$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.removeSource();
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((EmittedSource$dispose$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
