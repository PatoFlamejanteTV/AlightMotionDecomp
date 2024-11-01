package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableState$draggableState$1$drag$2 extends l implements InterfaceC2073o {
    final /* synthetic */ InterfaceC2072n $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, InterfaceC2072n interfaceC2072n, d dVar) {
        super(3, dVar);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = interfaceC2072n;
    }

    @Override // c6.InterfaceC2073o
    public final Object invoke(AnchoredDragScope anchoredDragScope, Map<T, Float> map, d dVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, dVar).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1;
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
            anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            InterfaceC2072n interfaceC2072n = this.$block;
            this.label = 1;
            if (interfaceC2072n.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
