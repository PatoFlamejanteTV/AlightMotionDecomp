package androidx.room;

import Q5.I;
import Q5.s;
import c6.InterfaceC2072n;
import java.util.concurrent.Callable;
import n6.InterfaceC3470o;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC3470o $continuation;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC3470o interfaceC3470o, U5.d dVar) {
        super(2, dVar);
        this.$callable = callable;
        this.$continuation = interfaceC3470o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            Q5.t.b(obj);
            try {
                this.$continuation.resumeWith(Q5.s.b(this.$callable.call()));
            } catch (Throwable th) {
                InterfaceC3470o interfaceC3470o = this.$continuation;
                s.a aVar = Q5.s.f8810b;
                interfaceC3470o.resumeWith(Q5.s.b(Q5.t.a(th)));
            }
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
