package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    void notifyFocusedRect(Rect rect);

    void showSoftwareKeyboard();

    void startInput();

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2);
}
