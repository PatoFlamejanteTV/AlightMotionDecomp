package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2073o;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableKt$snapTo$2 extends l implements InterfaceC2073o {
    final /* synthetic */ T $targetValue;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$snapTo$2(T t8, d dVar) {
        super(3, dVar);
        this.$targetValue = t8;
    }

    @Override // c6.InterfaceC2073o
    public final Object invoke(AnchoredDragScope anchoredDragScope, Map<T, Float> map, d dVar) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(this.$targetValue, dVar);
        anchoredDraggableKt$snapTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.L$1 = map;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            Float f8 = (Float) ((Map) this.L$1).get(this.$targetValue);
            if (f8 != null) {
                a.a(anchoredDragScope, f8.floatValue(), 0.0f, 2, null);
            }
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
