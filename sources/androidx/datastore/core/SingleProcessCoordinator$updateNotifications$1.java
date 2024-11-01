package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SingleProcessCoordinator$updateNotifications$1 extends l implements InterfaceC2072n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleProcessCoordinator$updateNotifications$1(d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SingleProcessCoordinator$updateNotifications$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(InterfaceC3822g interfaceC3822g, d dVar) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(interfaceC3822g, dVar)).invokeSuspend(I.f8786a);
    }
}
