package androidx.compose.ui.input.pointer;

import R5.AbstractC1435t;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(AbstractC1435t.m());
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(InterfaceC2072n interfaceC2072n) {
        return new SuspendingPointerInputModifierNodeImpl(interfaceC2072n);
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    public static final Modifier pointerInput(Modifier modifier, InterfaceC2072n interfaceC2072n) {
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, InterfaceC2072n interfaceC2072n) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, interfaceC2072n, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, InterfaceC2072n interfaceC2072n) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, interfaceC2072n, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, InterfaceC2072n interfaceC2072n) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, interfaceC2072n, 3, null));
    }
}
