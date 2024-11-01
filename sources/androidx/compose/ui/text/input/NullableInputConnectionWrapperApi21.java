package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {
    private InputConnection delegate;
    private final Function0 onConnectionClosed;

    public NullableInputConnectionWrapperApi21(InputConnection inputConnection, Function0 function0) {
        this.onConnectionClosed = function0;
        this.delegate = inputConnection;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.delegate != null) {
            disposeDelegate();
            this.onConnectionClosed.invoke();
        }
    }

    protected void closeDelegate(InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i8, int i9) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i8, i9);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i8, int i9) {
        return false;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapper
    public final void disposeDelegate() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            closeDelegate(inputConnection);
            this.delegate = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i8);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InputConnection getDelegate() {
        return this.delegate;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i8) {
        ExtractedText extractedText;
        InputConnection inputConnection = this.delegate;
        if (inputConnection == null || (extractedText = inputConnection.getExtractedText(extractedTextRequest, i8)) == null) {
            return new ExtractedText();
        }
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i8) {
        CharSequence selectedText;
        InputConnection inputConnection = this.delegate;
        if (inputConnection == null || (selectedText = inputConnection.getSelectedText(i8)) == null) {
            return "";
        }
        return selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i8, int i9) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i8, i9);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i8, int i9) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i8, i9);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i8, int i9) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i8, i9);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i8) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i8, int i9) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setSelection(i8, i9);
        }
        return false;
    }
}
