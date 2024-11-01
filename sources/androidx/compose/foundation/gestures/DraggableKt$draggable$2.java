package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableKt$draggable$2 extends l implements InterfaceC2073o {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DraggableKt$draggable$2(U5.d dVar) {
        super(3, dVar);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((M) obj, ((Number) obj2).floatValue(), (U5.d) obj3);
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

    public final Object invoke(M m8, float f8, U5.d dVar) {
        return new DraggableKt$draggable$2(dVar).invokeSuspend(I.f8786a);
    }
}
