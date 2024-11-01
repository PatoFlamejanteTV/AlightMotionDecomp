package androidx.compose.material3;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.material3.SliderDraggableState$drag$2", f = "Slider.kt", l = {1404}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SliderDraggableState$drag$2 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ SliderDraggableState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDraggableState$drag$2(SliderDraggableState sliderDraggableState, MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, d dVar) {
        super(2, dVar);
        this.this$0 = sliderDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = interfaceC2072n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SliderDraggableState$drag$2(this.this$0, this.$dragPriority, this.$block, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        DragScope dragScope;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            this.this$0.setDragging(true);
            mutatorMutex = this.this$0.scrollMutex;
            dragScope = this.this$0.dragScope;
            MutatePriority mutatePriority = this.$dragPriority;
            InterfaceC2072n interfaceC2072n = this.$block;
            this.label = 1;
            if (mutatorMutex.mutateWith(dragScope, mutatePriority, interfaceC2072n, this) == e8) {
                return e8;
            }
        }
        this.this$0.setDragging(false);
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SliderDraggableState$drag$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
