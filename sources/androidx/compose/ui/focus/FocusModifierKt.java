package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: classes.dex */
public final class FocusModifierKt {
    public static final Modifier focusModifier(Modifier modifier) {
        return focusTarget(modifier);
    }

    public static final Modifier focusTarget(Modifier modifier) {
        return modifier.then(FocusTargetNode.FocusTargetElement.INSTANCE);
    }
}
