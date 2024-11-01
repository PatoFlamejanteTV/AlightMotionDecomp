package androidx.compose.ui.text.input;

import R5.AbstractC1435t;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private TextFieldValue mTextFieldValue;
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z8) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z8;
        this.mTextFieldValue = textFieldValue;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i8 = this.batchDepth - 1;
        this.batchDepth = i8;
        if (i8 == 0 && (!this.editCommands.isEmpty())) {
            this.eventCallback.onEditCommands(AbstractC1435t.Z0(this.editCommands));
            this.editCommands.clear();
        }
        if (this.batchDepth > 0) {
            return true;
        }
        return false;
    }

    private final boolean ensureActive(Function0 function0) {
        boolean z8 = this.isActive;
        if (z8) {
            function0.invoke();
        }
        return z8;
    }

    private final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i8) {
        sendKeyEvent(new KeyEvent(0, i8));
        sendKeyEvent(new KeyEvent(1, i8));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z8 = this.isActive;
        if (z8) {
            return beginBatchEditInternal();
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i8) {
        boolean z8 = this.isActive;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z8 = this.isActive;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        boolean z8 = this.isActive;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z8 = this.isActive;
        if (z8) {
            return this.autoCorrect;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i8) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i8));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i8, int i9) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new DeleteSurroundingTextCommand(i8, i9));
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i8, int i9) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i8, i9));
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new FinishComposingTextCommand());
            return true;
        }
        return z8;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i8) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m4667getMinimpl(this.mTextFieldValue.m4906getSelectiond9O1mEE()), i8);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i8) {
        boolean z8 = true;
        int i9 = 0;
        if ((i8 & 1) == 0) {
            z8 = false;
        }
        this.extractedTextMonitorMode = z8;
        if (z8) {
            if (extractedTextRequest != null) {
                i9 = extractedTextRequest.token;
            }
            this.currentExtractedTextRequestToken = i9;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i8) {
        if (TextRange.m4663getCollapsedimpl(this.mTextFieldValue.m4906getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i8, int i9) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i8).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i8, int i9) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i8).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i8) {
        boolean z8 = this.isActive;
        if (z8) {
            z8 = false;
            switch (i8) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i8) {
        int m4844getDefaulteUduSuo;
        boolean z8 = this.isActive;
        if (z8) {
            if (i8 != 0) {
                switch (i8) {
                    case 2:
                        m4844getDefaulteUduSuo = ImeAction.Companion.m4846getGoeUduSuo();
                        break;
                    case 3:
                        m4844getDefaulteUduSuo = ImeAction.Companion.m4850getSearcheUduSuo();
                        break;
                    case 4:
                        m4844getDefaulteUduSuo = ImeAction.Companion.m4851getSendeUduSuo();
                        break;
                    case 5:
                        m4844getDefaulteUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
                        break;
                    case 6:
                        m4844getDefaulteUduSuo = ImeAction.Companion.m4845getDoneeUduSuo();
                        break;
                    case 7:
                        m4844getDefaulteUduSuo = ImeAction.Companion.m4849getPreviouseUduSuo();
                        break;
                    default:
                        Log.w(RecordingInputConnection_androidKt.TAG, "IME sends unsupported Editor Action: " + i8);
                        m4844getDefaulteUduSuo = ImeAction.Companion.m4844getDefaulteUduSuo();
                        break;
                }
            } else {
                m4844getDefaulteUduSuo = ImeAction.Companion.m4844getDefaulteUduSuo();
            }
            this.eventCallback.mo4860onImeActionKlQnJC8(m4844getDefaulteUduSuo);
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z8 = this.isActive;
        if (z8) {
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z8) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17 = this.isActive;
        if (z17) {
            boolean z18 = false;
            if ((i8 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i8 & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                if ((i8 & 16) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i8 & 8) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i8 & 4) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i9 >= 34 && (i8 & 32) != 0) {
                    z18 = true;
                }
                if (!z14 && !z15 && !z16 && !z18) {
                    if (i9 >= 34) {
                        z10 = true;
                        z11 = true;
                        z12 = true;
                        z13 = true;
                    } else {
                        z13 = z18;
                        z10 = true;
                        z11 = true;
                        z12 = true;
                    }
                } else {
                    z13 = z18;
                    z12 = z16;
                    z11 = z15;
                    z10 = z14;
                }
            } else {
                z10 = true;
                z11 = true;
                z12 = false;
                z13 = false;
            }
            this.eventCallback.onRequestCursorAnchorInfo(z8, z9, z10, z11, z12, z13);
            return true;
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.isActive;
        if (z8) {
            this.eventCallback.onKeyEvent(keyEvent);
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i8, int i9) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i8, i9));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i8) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i8));
        }
        return z8;
    }

    public final void setMTextFieldValue$ui_release(TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i8, int i9) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new SetSelectionCommand(i8, i9));
            return true;
        }
        return z8;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        int i8;
        if (!this.isActive) {
            return;
        }
        setMTextFieldValue$ui_release(textFieldValue);
        if (this.extractedTextMonitorMode) {
            inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
        }
        TextRange m4905getCompositionMzsxiRA = textFieldValue.m4905getCompositionMzsxiRA();
        int i9 = -1;
        if (m4905getCompositionMzsxiRA != null) {
            i8 = TextRange.m4667getMinimpl(m4905getCompositionMzsxiRA.m4673unboximpl());
        } else {
            i8 = -1;
        }
        TextRange m4905getCompositionMzsxiRA2 = textFieldValue.m4905getCompositionMzsxiRA();
        if (m4905getCompositionMzsxiRA2 != null) {
            i9 = TextRange.m4666getMaximpl(m4905getCompositionMzsxiRA2.m4673unboximpl());
        }
        inputMethodManager.updateSelection(TextRange.m4667getMinimpl(textFieldValue.m4906getSelectiond9O1mEE()), TextRange.m4666getMaximpl(textFieldValue.m4906getSelectiond9O1mEE()), i8, i9);
    }
}
