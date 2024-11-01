package androidx.lifecycle;

import Q5.I;
import Q5.t;
import androidx.lifecycle.Lifecycle;
import c6.InterfaceC2072n;
import n6.AbstractC3458i;
import n6.InterfaceC3488x0;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        super(2, dVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = interfaceC2072n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    t.b(obj);
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) ((M) this.L$0).getCoroutineContext().get(InterfaceC3488x0.f35757n0);
            if (interfaceC3488x0 != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC3488x0);
                try {
                    InterfaceC2072n interfaceC2072n = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = AbstractC3458i.g(pausingDispatcher, interfaceC2072n, this);
                    if (obj == e8) {
                        return e8;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        }
        lifecycleController.finish();
        return obj;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
