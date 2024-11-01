package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.PointerInputModifierNode;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    InterfaceC2072n getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputHandler(InterfaceC2072n interfaceC2072n);
}
