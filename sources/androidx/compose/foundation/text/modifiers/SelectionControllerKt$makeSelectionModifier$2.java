package androidx.compose.foundation.text.modifiers;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$2", f = "SelectionController.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectionControllerKt$makeSelectionModifier$2 extends l implements InterfaceC2072n {
    final /* synthetic */ SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 $mouseSelectionObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionControllerKt$makeSelectionModifier$2(SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1, d dVar) {
        super(2, dVar);
        this.$mouseSelectionObserver = selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SelectionControllerKt$makeSelectionModifier$2 selectionControllerKt$makeSelectionModifier$2 = new SelectionControllerKt$makeSelectionModifier$2(this.$mouseSelectionObserver, dVar);
        selectionControllerKt$makeSelectionModifier$2.L$0 = obj;
        return selectionControllerKt$makeSelectionModifier$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((SelectionControllerKt$makeSelectionModifier$2) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 = this.$mouseSelectionObserver;
            this.label = 1;
            if (TextSelectionMouseDetectorKt.mouseSelectionDetector(pointerInputScope, selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
