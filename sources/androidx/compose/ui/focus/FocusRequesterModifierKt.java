package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class FocusRequesterModifierKt {
    public static final Modifier focusRequester(Modifier modifier, FocusRequester focusRequester) {
        return modifier.then(new FocusRequesterElement(focusRequester));
    }
}
