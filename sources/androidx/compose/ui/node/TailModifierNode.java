package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TailModifierNode extends Modifier.Node {
    public static final int $stable = 8;
    private boolean attachHasBeenRun;

    public TailModifierNode() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.attachHasBeenRun = false;
    }

    public final void setAttachHasBeenRun(boolean z8) {
        this.attachHasBeenRun = z8;
    }

    public String toString() {
        return "<tail>";
    }
}
