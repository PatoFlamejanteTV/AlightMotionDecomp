package androidx.compose.runtime;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$3 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$3(InterfaceC2072n interfaceC2072n, MutableState<T> mutableState, U5.d dVar) {
        super(2, dVar);
        this.$producer = interfaceC2072n;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        SnapshotStateKt__ProduceStateKt$produceState$3 snapshotStateKt__ProduceStateKt$produceState$3 = new SnapshotStateKt__ProduceStateKt$produceState$3(this.$producer, this.$result, dVar);
        snapshotStateKt__ProduceStateKt$produceState$3.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            M m8 = (M) this.L$0;
            InterfaceC2072n interfaceC2072n = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, m8.getCoroutineContext());
            this.label = 1;
            if (interfaceC2072n.invoke(produceStateScopeImpl, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$3) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
