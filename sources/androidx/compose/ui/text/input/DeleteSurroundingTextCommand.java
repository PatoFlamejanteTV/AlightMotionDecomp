package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextCommand(int i8, int i9) {
        this.lengthBeforeCursor = i8;
        this.lengthAfterCursor = i9;
        if (i8 >= 0 && i9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i8 + " and " + i9 + " respectively.").toString());
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int selectionEnd$ui_text_release = editingBuffer.getSelectionEnd$ui_text_release();
        int i8 = this.lengthAfterCursor;
        int i9 = selectionEnd$ui_text_release + i8;
        if (((selectionEnd$ui_text_release ^ i9) & (i8 ^ i9)) < 0) {
            i9 = editingBuffer.getLength$ui_text_release();
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release(), Math.min(i9, editingBuffer.getLength$ui_text_release()));
        int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
        int i10 = this.lengthBeforeCursor;
        int i11 = selectionStart$ui_text_release - i10;
        if (((selectionStart$ui_text_release ^ i11) & (i10 ^ selectionStart$ui_text_release)) < 0) {
            i11 = 0;
        }
        editingBuffer.delete$ui_text_release(Math.max(0, i11), editingBuffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        if (this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor) {
            return true;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
