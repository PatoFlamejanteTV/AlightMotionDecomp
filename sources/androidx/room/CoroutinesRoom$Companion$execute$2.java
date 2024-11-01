package androidx.room;

import Q5.I;
import c6.InterfaceC2072n;
import java.util.concurrent.Callable;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$execute$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ Callable<R> $callable;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable<R> callable, U5.d dVar) {
        super(2, dVar);
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new CoroutinesRoom$Companion$execute$2(this.$callable, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            Q5.t.b(obj);
            return this.$callable.call();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((CoroutinesRoom$Companion$execute$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
