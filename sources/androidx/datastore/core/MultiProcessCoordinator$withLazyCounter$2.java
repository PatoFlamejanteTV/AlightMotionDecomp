package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator$withLazyCounter$2 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $block;
    int label;
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$withLazyCounter$2(InterfaceC2072n interfaceC2072n, MultiProcessCoordinator multiProcessCoordinator, d dVar) {
        super(2, dVar);
        this.$block = interfaceC2072n;
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new MultiProcessCoordinator$withLazyCounter$2(this.$block, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SharedCounter sharedCounter;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            InterfaceC2072n interfaceC2072n = this.$block;
            sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            obj = interfaceC2072n.invoke(sharedCounter, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        SharedCounter sharedCounter;
        InterfaceC2072n interfaceC2072n = this.$block;
        sharedCounter = this.this$0.getSharedCounter();
        return interfaceC2072n.invoke(sharedCounter, this);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((MultiProcessCoordinator$withLazyCounter$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
