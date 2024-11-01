package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public MoveCursorCommand(int i8) {
        this.amount = i8;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.getCursor$ui_text_release() == -1) {
            editingBuffer.setCursor$ui_text_release(editingBuffer.getSelectionStart$ui_text_release());
        }
        int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
        String editingBuffer2 = editingBuffer.toString();
        int i8 = this.amount;
        int i9 = 0;
        if (i8 > 0) {
            while (i9 < i8) {
                int findFollowingBreak = JvmCharHelpers_androidKt.findFollowingBreak(editingBuffer2, selectionStart$ui_text_release);
                if (findFollowingBreak == -1) {
                    break;
                }
                i9++;
                selectionStart$ui_text_release = findFollowingBreak;
            }
        } else {
            int i10 = -i8;
            while (i9 < i10) {
                int findPrecedingBreak = JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer2, selectionStart$ui_text_release);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i9++;
                selectionStart$ui_text_release = findPrecedingBreak;
            }
        }
        editingBuffer.setCursor$ui_text_release(selectionStart$ui_text_release);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount) {
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
