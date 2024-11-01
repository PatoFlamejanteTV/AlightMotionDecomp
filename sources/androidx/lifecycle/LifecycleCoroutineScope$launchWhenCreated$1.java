package androidx.lifecycle;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LifecycleCoroutineScope$launchWhenCreated$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = interfaceC2072n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.this$0, this.$block, dVar);
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
            Lifecycle lifecycle$lifecycle_common = this.this$0.getLifecycle$lifecycle_common();
            InterfaceC2072n interfaceC2072n = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, interfaceC2072n, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
