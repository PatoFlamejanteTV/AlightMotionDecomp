package androidx.compose.foundation;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", l = {892}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickablePointerInputNode$pointerInput$2 extends l implements InterfaceC2073o {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode$pointerInput$2(ClickablePointerInputNode clickablePointerInputNode, d dVar) {
        super(3, dVar);
        this.this$0 = clickablePointerInputNode;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m302invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m2722unboximpl(), (d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m302invoked4ec7I(PressGestureScope pressGestureScope, long j8, d dVar) {
        ClickablePointerInputNode$pointerInput$2 clickablePointerInputNode$pointerInput$2 = new ClickablePointerInputNode$pointerInput$2(this.this$0, dVar);
        clickablePointerInputNode$pointerInput$2.L$0 = pressGestureScope;
        clickablePointerInputNode$pointerInput$2.J$0 = j8;
        return clickablePointerInputNode$pointerInput$2.invokeSuspend(I.f8786a);
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
            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
            long j8 = this.J$0;
            if (this.this$0.getEnabled()) {
                ClickablePointerInputNode clickablePointerInputNode = this.this$0;
                this.label = 1;
                if (clickablePointerInputNode.m247handlePressInteractiond4ec7I(pressGestureScope, j8, this) == e8) {
                    return e8;
                }
            }
        }
        return I.f8786a;
    }
}
