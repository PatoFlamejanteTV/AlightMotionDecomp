package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private Function1 onFocusChanged;

    public FocusChangedNode(Function1 function1) {
        this.onFocusChanged = function1;
    }

    public final Function1 getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (!AbstractC3292y.d(this.focusState, focusState)) {
            this.focusState = focusState;
            this.onFocusChanged.invoke(focusState);
        }
    }

    public final void setOnFocusChanged(Function1 function1) {
        this.onFocusChanged = function1;
    }
}
