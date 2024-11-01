package androidx.compose.ui.platform;

import android.view.Choreographer;
import c6.InterfaceC2072n;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(U5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            Q5.t.b(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(n6.M m8, U5.d dVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
    }
}
