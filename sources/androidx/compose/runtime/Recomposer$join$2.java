package androidx.compose.runtime;

import Q5.I;
import Q5.t;
import androidx.compose.runtime.Recomposer;
import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Recomposer$join$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recomposer$join$2(U5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(dVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Recomposer.State state, U5.d dVar) {
        return ((Recomposer$join$2) create(state, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z8;
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            if (((Recomposer.State) this.L$0) == Recomposer.State.ShutDown) {
                z8 = true;
            } else {
                z8 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z8);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
