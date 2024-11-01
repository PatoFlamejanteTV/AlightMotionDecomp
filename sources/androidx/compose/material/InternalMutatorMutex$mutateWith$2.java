package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import U5.g;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;
import n6.M;
import w6.InterfaceC4158a;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", l = {177, TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InternalMutatorMutex$mutateWith$2 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, InterfaceC2072n interfaceC2072n, T t8, d dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = interfaceC2072n;
        this.$receiver = t8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, dVar);
        internalMutatorMutex$mutateWith$2.L$0 = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [w6.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4158a interfaceC4158a;
        InterfaceC2072n interfaceC2072n;
        Object obj2;
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
                    internalMutatorMutex = (InternalMutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    interfaceC2072n = (InterfaceC2072n) this.L$2;
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
                    interfaceC2072n = this.$block;
                    Object obj3 = this.$receiver;
                    InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = interfaceC4158a;
                    this.L$2 = interfaceC2072n;
                    this.L$3 = obj3;
                    this.L$4 = internalMutatorMutex3;
                    this.label = 1;
                    if (interfaceC4158a.a(null, this) == e8) {
                        return e8;
                    }
                    obj2 = obj3;
                    mutator = mutator3;
                    internalMutatorMutex = internalMutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = interfaceC4158a;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = interfaceC2072n.invoke(obj2, this);
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
        return ((InternalMutatorMutex$mutateWith$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
