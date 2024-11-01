package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.P;

@f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollExtensionsKt$scrollBy$2 extends l implements InterfaceC2072n {
    final /* synthetic */ P $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(P p8, float f8, U5.d dVar) {
        super(2, dVar);
        this.$consumed = p8;
        this.$value = f8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.$consumed, this.$value, dVar);
        scrollExtensionsKt$scrollBy$2.L$0 = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, U5.d dVar) {
        return ((ScrollExtensionsKt$scrollBy$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.$consumed.f34570a = scrollScope.scrollBy(this.$value);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
