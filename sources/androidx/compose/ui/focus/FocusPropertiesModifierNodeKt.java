package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;

/* loaded from: classes.dex */
public final class FocusPropertiesModifierNodeKt {
    public static final void invalidateFocusProperties(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
    }
}
