package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollExtensionsKt$stopScroll$2 extends l implements InterfaceC2072n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollExtensionsKt$stopScroll$2(U5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new ScrollExtensionsKt$stopScroll$2(dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, U5.d dVar) {
        return ((ScrollExtensionsKt$stopScroll$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
