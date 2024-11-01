package androidx.compose.runtime;

import Q5.I;
import Q5.t;
import android.view.Choreographer;
import c6.InterfaceC2072n;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock$choreographer$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultChoreographerFrameClock$choreographer$1(U5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new DefaultChoreographerFrameClock$choreographer$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((DefaultChoreographerFrameClock$choreographer$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
