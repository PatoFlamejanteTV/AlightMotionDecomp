package androidx.compose.foundation;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", l = {846}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AbstractClickablePointerInputNode$pointerInputNode$1 extends l implements InterfaceC2072n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickablePointerInputNode$pointerInputNode$1(AbstractClickablePointerInputNode abstractClickablePointerInputNode, d dVar) {
        super(2, dVar);
        this.this$0 = abstractClickablePointerInputNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        AbstractClickablePointerInputNode$pointerInputNode$1 abstractClickablePointerInputNode$pointerInputNode$1 = new AbstractClickablePointerInputNode$pointerInputNode$1(this.this$0, dVar);
        abstractClickablePointerInputNode$pointerInputNode$1.L$0 = obj;
        return abstractClickablePointerInputNode$pointerInputNode$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((AbstractClickablePointerInputNode$pointerInputNode$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AbstractClickablePointerInputNode abstractClickablePointerInputNode = this.this$0;
            this.label = 1;
            if (abstractClickablePointerInputNode.pointerInput(pointerInputScope, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
