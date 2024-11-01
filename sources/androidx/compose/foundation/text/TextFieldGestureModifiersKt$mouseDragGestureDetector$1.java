package androidx.compose.foundation.text;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", f = "TextFieldGestureModifiers.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TextFieldGestureModifiersKt$mouseDragGestureDetector$1 extends l implements InterfaceC2072n {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldGestureModifiersKt$mouseDragGestureDetector$1(MouseSelectionObserver mouseSelectionObserver, d dVar) {
        super(2, dVar);
        this.$observer = mouseSelectionObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        TextFieldGestureModifiersKt$mouseDragGestureDetector$1 textFieldGestureModifiersKt$mouseDragGestureDetector$1 = new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(this.$observer, dVar);
        textFieldGestureModifiersKt$mouseDragGestureDetector$1.L$0 = obj;
        return textFieldGestureModifiersKt$mouseDragGestureDetector$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((TextFieldGestureModifiersKt$mouseDragGestureDetector$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            MouseSelectionObserver mouseSelectionObserver = this.$observer;
            this.label = 1;
            if (TextSelectionMouseDetectorKt.mouseSelectionDetector(pointerInputScope, mouseSelectionObserver, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
