package androidx.compose.ui.input.pointer;

import Q5.I;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> $handlerCoroutine;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine) {
        super(1);
        this.$handlerCoroutine = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        this.$handlerCoroutine.cancel(th);
    }
}
