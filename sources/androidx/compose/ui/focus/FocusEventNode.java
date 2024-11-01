package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    private Function1 onFocusEvent;

    public FocusEventNode(Function1 function1) {
        this.onFocusEvent = function1;
    }

    public final Function1 getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(Function1 function1) {
        this.onFocusEvent = function1;
    }
}
