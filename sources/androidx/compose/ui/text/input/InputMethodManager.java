package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* loaded from: classes.dex */
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i8, ExtractedText extractedText);

    void updateSelection(int i8, int i9, int i10, int i11);
}
