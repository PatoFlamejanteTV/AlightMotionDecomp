package androidx.compose.ui.input.pointer;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {562}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends l implements InterfaceC2072n {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, U5.d dVar) {
        super(2, dVar);
        this.this$0 = suspendingPointerInputModifierNodeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, dVar);
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
            InterfaceC2072n pointerInputHandler = this.this$0.getPointerInputHandler();
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.this$0;
            this.label = 1;
            if (pointerInputHandler.invoke(suspendingPointerInputModifierNodeImpl, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
