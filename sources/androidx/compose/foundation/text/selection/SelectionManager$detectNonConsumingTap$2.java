package androidx.compose.foundation.text.selection;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", l = {627}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectionManager$detectNonConsumingTap$2 extends k implements InterfaceC2072n {
    final /* synthetic */ Function1 $onTap;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$detectNonConsumingTap$2(Function1 function1, d dVar) {
        super(2, dVar);
        this.$onTap = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SelectionManager$detectNonConsumingTap$2 selectionManager$detectNonConsumingTap$2 = new SelectionManager$detectNonConsumingTap$2(this.$onTap, dVar);
        selectionManager$detectNonConsumingTap$2.L$0 = obj;
        return selectionManager$detectNonConsumingTap$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, d dVar) {
        return ((SelectionManager$detectNonConsumingTap$2) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
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
            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.label = 1;
            obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
            if (obj == e8) {
                return e8;
            }
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            this.$onTap.invoke(Offset.m2701boximpl(pointerInputChange.m3993getPositionF1C5BW0()));
        }
        return I.f8786a;
    }
}
