package androidx.compose.ui.text.input;

import Q5.InterfaceC1416k;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    private final InterfaceC1416k imm$delegate = Q5.l.a(Q5.o.f8805c, new InputMethodManagerImpl$imm$2(this));
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;
    private final View view;

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int i8, ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i8, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int i8, int i9, int i10, int i11) {
        getImm().updateSelection(this.view, i8, i9, i10, i11);
    }
}
