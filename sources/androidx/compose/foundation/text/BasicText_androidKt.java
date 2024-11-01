package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BasicText_androidKt {
    public static final Modifier textPointerHoverIcon(Modifier modifier, SelectionRegistrar selectionRegistrar) {
        AbstractC3292y.i(modifier, "<this>");
        if (selectionRegistrar != null) {
            return PointerIconKt.pointerHoverIcon$default(modifier, TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        }
        return modifier;
    }
}
