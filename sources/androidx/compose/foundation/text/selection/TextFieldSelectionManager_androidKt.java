package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt {
    public static final boolean isShiftPressed(PointerEvent pointerEvent) {
        AbstractC3292y.i(pointerEvent, "<this>");
        return false;
    }

    public static final Modifier textFieldMagnifier(Modifier modifier, TextFieldSelectionManager manager) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(manager, "manager");
        if (!MagnifierStyle.Companion.getTextDefault().isSupported()) {
            return modifier;
        }
        return ComposedModifierKt.composed$default(modifier, null, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(manager), 1, null);
    }
}
