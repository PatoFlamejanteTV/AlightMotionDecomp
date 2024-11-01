package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.f;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MouseWheelScrollNode extends DelegatingNode implements PointerInputModifierNode {
    private ScrollConfig mouseWheelScrollConfig;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private State<ScrollingLogic> scrollingLogicState;

    public MouseWheelScrollNode(State<ScrollingLogic> scrollingLogicState, ScrollConfig mouseWheelScrollConfig) {
        AbstractC3292y.i(scrollingLogicState, "scrollingLogicState");
        AbstractC3292y.i(mouseWheelScrollConfig, "mouseWheelScrollConfig");
        this.scrollingLogicState = scrollingLogicState;
        this.mouseWheelScrollConfig = mouseWheelScrollConfig;
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new MouseWheelScrollNode$pointerInputNode$1(this, null)));
    }

    public final ScrollConfig getMouseWheelScrollConfig() {
        return this.mouseWheelScrollConfig;
    }

    public final State<ScrollingLogic> getScrollingLogicState() {
        return this.scrollingLogicState;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return f.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        f.b(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j8) {
        AbstractC3292y.i(pointerEvent, "pointerEvent");
        AbstractC3292y.i(pass, "pass");
        this.pointerInputNode.mo242onPointerEventH0pRuoY(pointerEvent, pass, j8);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        f.c(this);
    }

    public final void setMouseWheelScrollConfig(ScrollConfig scrollConfig) {
        AbstractC3292y.i(scrollConfig, "<set-?>");
        this.mouseWheelScrollConfig = scrollConfig;
    }

    public final void setScrollingLogicState(State<ScrollingLogic> state) {
        AbstractC3292y.i(state, "<set-?>");
        this.scrollingLogicState = state;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return f.d(this);
    }
}
