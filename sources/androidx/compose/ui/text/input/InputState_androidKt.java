package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;

/* loaded from: classes.dex */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m4667getMinimpl(textFieldValue.m4906getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m4666getMaximpl(textFieldValue.m4906getSelectiond9O1mEE());
        extractedText.flags = !l6.n.F(textFieldValue.getText(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
