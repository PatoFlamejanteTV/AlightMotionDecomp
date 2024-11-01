package androidx.compose.runtime;

import Q5.I;
import Q5.t;
import androidx.compose.runtime.Recomposer;
import c6.InterfaceC2072n;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Recomposer$awaitIdle$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recomposer$awaitIdle$2(U5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        Recomposer$awaitIdle$2 recomposer$awaitIdle$2 = new Recomposer$awaitIdle$2(dVar);
        recomposer$awaitIdle$2.L$0 = obj;
        return recomposer$awaitIdle$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Recomposer.State state, U5.d dVar) {
        return ((Recomposer$awaitIdle$2) create(state, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z8;
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            if (((Recomposer.State) this.L$0).compareTo(Recomposer.State.Idle) > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z8);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
