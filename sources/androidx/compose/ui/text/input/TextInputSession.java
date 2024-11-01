package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextInputSession {
    public static final int $stable = 8;
    private final PlatformTextInputService platformTextInputService;
    private final TextInputService textInputService;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    private final boolean ensureOpenSession(Function0 function0) {
        boolean isOpen = isOpen();
        if (isOpen) {
            function0.invoke();
        }
        return isOpen;
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean isOpen() {
        return AbstractC3292y.d(this.textInputService.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(Rect rect) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.notifyFocusedRect(rect);
        }
        return isOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateState(textFieldValue, textFieldValue2);
        }
        return isOpen;
    }

    public final boolean updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, function1, rect, rect2);
        }
        return isOpen;
    }
}
