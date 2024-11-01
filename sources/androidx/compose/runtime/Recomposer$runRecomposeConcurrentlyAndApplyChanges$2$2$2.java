package androidx.compose.runtime;

import Q5.I;
import Q5.s;
import Q5.t;
import c6.InterfaceC2072n;
import java.util.List;
import n6.InterfaceC3470o;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ ControlledComposition $composition;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(Recomposer recomposer, ControlledComposition controlledComposition, U5.d dVar) {
        super(2, dVar);
        this.this$0 = recomposer;
        this.$composition = controlledComposition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(this.this$0, this.$composition, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ControlledComposition performRecompose;
        List list;
        int i8;
        InterfaceC3470o deriveStateLocked;
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            performRecompose = this.this$0.performRecompose(this.$composition, null);
            Object obj2 = this.this$0.stateLock;
            Recomposer recomposer = this.this$0;
            synchronized (obj2) {
                if (performRecompose != null) {
                    try {
                        list = recomposer.compositionsAwaitingApply;
                        list.add(performRecompose);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                i8 = recomposer.concurrentCompositionsOutstanding;
                recomposer.concurrentCompositionsOutstanding = i8 - 1;
                deriveStateLocked = recomposer.deriveStateLocked();
            }
            if (deriveStateLocked != null) {
                s.a aVar = s.f8810b;
                deriveStateLocked.resumeWith(s.b(I.f8786a));
            }
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
