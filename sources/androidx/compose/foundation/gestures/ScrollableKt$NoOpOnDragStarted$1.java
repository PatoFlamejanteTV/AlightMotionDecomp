package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollableKt$NoOpOnDragStarted$1 extends l implements InterfaceC2073o {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollableKt$NoOpOnDragStarted$1(U5.d dVar) {
        super(3, dVar);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m430invoked4ec7I((M) obj, ((Offset) obj2).m2722unboximpl(), (U5.d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m430invoked4ec7I(M m8, long j8, U5.d dVar) {
        return new ScrollableKt$NoOpOnDragStarted$1(dVar).invokeSuspend(I.f8786a);
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
