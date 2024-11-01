package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class TextInputService {
    public static final int $stable = 8;
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text_release() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    public TextInputSession startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, function1, function12);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(TextInputSession textInputSession) {
        if (androidx.compose.animation.core.d.a(this._currentInputSession, textInputSession, null)) {
            this.platformTextInputService.stopInput();
        }
    }

    @InternalTextApi
    public final void stopInput() {
        this.platformTextInputService.stopInput();
    }

    @InternalTextApi
    public final void startInput() {
        this.platformTextInputService.startInput();
    }
}
