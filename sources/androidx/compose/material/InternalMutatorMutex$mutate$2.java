package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import U5.g;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
import c6.InterfaceC2072n;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;
import n6.M;
import w6.InterfaceC4158a;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, 99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InternalMutatorMutex$mutate$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, Function1 function1, d dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, dVar);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [w6.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4158a interfaceC4158a;
        Function1 function1;
        InternalMutatorMutex.Mutator mutator;
        InternalMutatorMutex internalMutatorMutex;
        InternalMutatorMutex.Mutator mutator2;
        Throwable th;
        InternalMutatorMutex internalMutatorMutex2;
        InterfaceC4158a interfaceC4158a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object e8 = V5.b.e();
        ?? r12 = this.label;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                            interfaceC4158a2 = (InterfaceC4158a) this.L$1;
                            mutator2 = (InternalMutatorMutex.Mutator) this.L$0;
                            try {
                                t.b(obj);
                                atomicReference2 = internalMutatorMutex2.currentMutator;
                                androidx.compose.animation.core.d.a(atomicReference2, mutator2, null);
                                interfaceC4158a2.d(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = internalMutatorMutex2.currentMutator;
                                androidx.compose.animation.core.d.a(atomicReference, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.L$3;
                    function1 = (Function1) this.L$2;
                    InterfaceC4158a interfaceC4158a3 = (InterfaceC4158a) this.L$1;
                    mutator = (InternalMutatorMutex.Mutator) this.L$0;
                    t.b(obj);
                    interfaceC4158a = interfaceC4158a3;
                } else {
                    t.b(obj);
                    M m8 = (M) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    g.b bVar = m8.getCoroutineContext().get(InterfaceC3488x0.f35757n0);
                    AbstractC3292y.f(bVar);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(mutatePriority, (InterfaceC3488x0) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    interfaceC4158a = this.this$0.mutex;
                    Function1 function12 = this.$block;
                    InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = interfaceC4158a;
                    this.L$2 = function12;
                    this.L$3 = internalMutatorMutex3;
                    this.label = 1;
                    if (interfaceC4158a.a(null, this) == e8) {
                        return e8;
                    }
                    function1 = function12;
                    mutator = mutator3;
                    internalMutatorMutex = internalMutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = interfaceC4158a;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = function1.invoke(this);
                if (invoke == e8) {
                    return e8;
                }
                internalMutatorMutex2 = internalMutatorMutex;
                interfaceC4158a2 = interfaceC4158a;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = internalMutatorMutex2.currentMutator;
                androidx.compose.animation.core.d.a(atomicReference2, mutator2, null);
                interfaceC4158a2.d(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                internalMutatorMutex2 = internalMutatorMutex;
                atomicReference = internalMutatorMutex2.currentMutator;
                androidx.compose.animation.core.d.a(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.d(null);
            throw th4;
        }
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((InternalMutatorMutex$mutate$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
