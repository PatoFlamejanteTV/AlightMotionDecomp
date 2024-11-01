package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
final class FocusRequesterNode extends Modifier.Node implements FocusRequesterModifierNode {
    private FocusRequester focusRequester;

    public FocusRequesterNode(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.focusRequester.getFocusRequesterNodes$ui_release().add(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.focusRequester.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }
}
