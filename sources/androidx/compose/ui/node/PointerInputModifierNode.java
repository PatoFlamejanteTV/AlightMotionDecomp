package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;

/* loaded from: classes.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    boolean interceptOutOfBoundsChildEvents();

    void onCancelPointerInput();

    void onDensityChange();

    /* renamed from: onPointerEvent-H0pRuoY */
    void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j8);

    void onViewConfigurationChange();

    boolean sharePointerInputWithSiblings();
}
