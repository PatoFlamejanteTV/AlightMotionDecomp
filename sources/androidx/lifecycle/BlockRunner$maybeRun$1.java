package androidx.lifecycle;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BlockRunner$maybeRun$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BlockRunner<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$maybeRun$1(BlockRunner<T> blockRunner, U5.d dVar) {
        super(2, dVar);
        this.this$0 = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.this$0, dVar);
        blockRunner$maybeRun$1.L$0 = obj;
        return blockRunner$maybeRun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineLiveData coroutineLiveData;
        InterfaceC2072n interfaceC2072n;
        Function0 function0;
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
            coroutineLiveData = ((BlockRunner) this.this$0).liveData;
            LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(coroutineLiveData, m8.getCoroutineContext());
            interfaceC2072n = ((BlockRunner) this.this$0).block;
            this.label = 1;
            if (interfaceC2072n.invoke(liveDataScopeImpl, this) == e8) {
                return e8;
            }
        }
        function0 = ((BlockRunner) this.this$0).onDone;
        function0.invoke();
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((BlockRunner$maybeRun$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
