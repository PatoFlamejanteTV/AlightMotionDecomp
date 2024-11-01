package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldGestureModifiersKt {
    public static final Modifier longPressDragGestureFilter(Modifier modifier, TextDragObserver observer, boolean z8) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(observer, "observer");
        if (z8) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, observer, new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(observer, null));
        }
        return modifier;
    }

    public static final Modifier mouseDragGestureDetector(Modifier modifier, MouseSelectionObserver observer, boolean z8) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(observer, "observer");
        if (z8) {
            return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, observer, new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(observer, null));
        }
        return modifier;
    }

    public static final Modifier textFieldFocusModifier(Modifier modifier, boolean z8, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, Function1 onFocusChanged) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(focusRequester, "focusRequester");
        AbstractC3292y.i(onFocusChanged, "onFocusChanged");
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), onFocusChanged), z8, mutableInteractionSource);
    }
}
