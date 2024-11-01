package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollDraggableState implements DraggableState, DragScope {
    private ScrollScope latestScrollScope;
    private final State<ScrollingLogic> scrollLogic;

    public ScrollDraggableState(State<ScrollingLogic> scrollLogic) {
        ScrollScope scrollScope;
        AbstractC3292y.i(scrollLogic, "scrollLogic");
        this.scrollLogic = scrollLogic;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.latestScrollScope = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f8) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m439performRawScrollMKHz9U(value.m445toOffsettuRUvjQ(f8));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object scroll = this.scrollLogic.getValue().getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, interfaceC2072n, null), dVar);
        if (scroll == V5.b.e()) {
            return scroll;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f8) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m436dispatchScroll3eAAhYA(this.latestScrollScope, value.m445toOffsettuRUvjQ(f8), NestedScrollSource.Companion.m3900getDragWNlRxjI());
    }

    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    public final State<ScrollingLogic> getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(ScrollScope scrollScope) {
        AbstractC3292y.i(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }
}
